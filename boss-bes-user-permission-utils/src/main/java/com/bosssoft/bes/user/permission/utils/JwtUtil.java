package com.bosssoft.bes.user.permission.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.bosssoft.bes.user.permission.pojo.vo.UserPermission;
import exception.BusinessException;
import exception.EnumException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


/**
 * 描述: jwt 工具类
 *
 * @author CJF
 * @version V1.0.0
 * @date 2019/8/12
 */
public class JwtUtil {

    private static Logger log = LoggerFactory.getLogger(JwtUtil.class);
    private static final String KEY = "022bdc63c3c5a45879ee6581508b9d03adfec4a4658c0ab3d722e50c91a351c42c231cf43bb8f86998202bd301ec52239a74fc0c9a9aeccce604743367c9646b";
    private static String ISSUER = "sys_user";
    private static String ID = "id";
    private static String NAME = "name";
    private static String COMPANY_ID = "companyId";
    private static String ORGANIZATION_ID = "orgId";
    private static String ROLE_ID = "roleId";
    /**
     * 创建token
     * @param userPermission token中私有声明实体
     * @return token
     */
    public static String createJwt(UserPermission userPermission) {
        //发布时间
        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis);
        // 生成JWT过期的时间
        long ttlMillis = nowMillis + 24L * 60L * 3600L * 1000L;
        Date expTime = new Date(ttlMillis);
        try {
            // 创建payload的私有声明（根据特定的业务需要添加，如果要拿这个做验证，一般是需要和jwt的接收方提前沟通好验证方式的）
            Map<String, String> claims = new HashMap<String, String>();
            claims.put(ID, userPermission.getId().toString());
            claims.put(ORGANIZATION_ID, userPermission.getOrgId().toString());
            claims.put(COMPANY_ID,userPermission.getCompanyId().toString());
            claims.put(NAME,userPermission.getName());
            claims.put(ROLE_ID,userPermission.getRoleId().toString());
            // 指定签名的时候使用的签名算法，也就是header那部分，jjwt已经将这部分内容封装好了。
            Algorithm algorithm = Algorithm.HMAC256(KEY);
            //创建jwt,添加发行人,发布的时间点
            JWTCreator.Builder builder = JWT.create()
                    .withIssuer(ISSUER)
                    .withIssuedAt(now)
                    .withExpiresAt(expTime);
            //传入参数
            claims.forEach((key,value)-> {
                builder.withClaim(key, value);
            });
            //签名加密
            String token = builder.sign(algorithm);
            return token;
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 解密JWT
     * @param token
     * @return
     * @throws Exception
     */
    public static UserPermission parseJwt(String token) throws Exception {
        Algorithm algorithm = Algorithm.HMAC256(KEY);
        JWTVerifier verifier = JWT.require(algorithm).withIssuer(ISSUER).build();
        DecodedJWT jwt =  verifier.verify(token);
        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis);
        Date expireTime = jwt.getExpiresAt();
        int result = expireTime.compareTo(now);
        if(result < 0){
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            log.info("token已过期 ======= token的过期时间："+df.format(expireTime));
            throw new BusinessException(EnumException.SERVICE_TOKEN_EXPIRED);
        }
        UserPermission userPermission = new UserPermission();
        Map<String, Claim> map = jwt.getClaims();
        Map<String, String> resultMap = new HashMap<>();
        map.forEach((k,v) -> resultMap.put(k, v.asString()));
        System.out.println(resultMap);
        userPermission.setId(Long.valueOf(resultMap.get(ID)));
        userPermission.setName(resultMap.get(NAME));
        userPermission.setCompanyId(Long.valueOf(resultMap.get(COMPANY_ID)));
        userPermission.setOrgId(Long.valueOf(resultMap.get(ORGANIZATION_ID)));
        userPermission.setRoleId(Long.valueOf(resultMap.get(ROLE_ID)));
        return userPermission;
    }

}
