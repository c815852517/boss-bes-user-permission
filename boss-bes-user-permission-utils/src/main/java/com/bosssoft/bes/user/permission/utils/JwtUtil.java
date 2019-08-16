package com.bosssoft.bes.user.permission.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.apache.tomcat.util.codec.binary.Base64;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
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

    public static final String KEY = "022bdc63c3c5a45879ee6581508b9d03adfec4a4658c0ab3d722e50c91a351c42c231cf43bb8f86998202bd301ec52239a74fc0c9a9aeccce604743367c9646b";

    /**
     * @param UID 用户ID
     * @param CODE 工号
     * @param ISSUER 发布人
     */
    private static String ISSUER = "sys_user";
    private static String UID = "uid";
    private static String CODE = "code";
    /**
     * 由字符串生成加密key
     *
     * @return
     */
    public static SecretKey generalKey(){
        byte[] encodedKey = Base64.decodeBase64(KEY);
        SecretKeySpec key = new SecretKeySpec(encodedKey, 0, encodedKey.length, "AES");
        return key;
    }

    /**
     * 创建JWT
     * @param uid
     * @param code
     * @return
     * @throws Exception
     */
    public static String createJWT(String uid, String code) {

        // 生成JWT过期的时间
        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis);
        long ttlMillis = nowMillis + 24L * 60L * 3600L * 1000L;
        Date expTime = new Date(ttlMillis);
        try {
            // 创建payload的私有声明（根据特定的业务需要添加，如果要拿这个做验证，一般是需要和jwt的接收方提前沟通好验证方式的）
            Map<String, Object> claims = new HashMap<>();
            claims.put(UID, uid);
            claims.put(CODE, code);
            // 指定签名的时候使用的签名算法，也就是header那部分，jjwt已经将这部分内容封装好了。
            SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
            // 生成签名的时候使用的秘钥secret，切记这个秘钥不能外露哦。它就是你服务端的私钥，在任何场景都不应该流露出去。
            // 一旦客户端得知这个secret, 那就意味着客户端是可以自我签发jwt了。
            SecretKey key = generalKey();

            // 下面就是在为payload添加各种标准声明和私有声明了
            JwtBuilder builder = Jwts.builder() // 这里其实就是new一个JwtBuilder，设置jwt的body
                    .setClaims(claims)          // 如果有私有声明，一定要先设置这个自己创建的私有的声明，这个是给builder的claim赋值，一旦写在标准的声明赋值之后，就是覆盖了那些标准的声明的
                    .setIssuedAt(now)           // iat: jwt的签发时间
                    .setIssuer(ISSUER)          // issuer：jwt签发人
                    .setExpiration(expTime)     //过期时间
                    .signWith(signatureAlgorithm, key); // 设置签名使用的签名算法和签名使用的秘钥
            return builder.compact();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 解密jwt
     *
     * @param jwt
     * @return
     * @throws Exception
     */
    public static Claims parseJWT(String jwt) throws Exception {
        SecretKey key = generalKey();  //签名秘钥，和生成的签名的秘钥一模一样
        Claims claims = Jwts.parser()  //得到DefaultJwtParser
                .setSigningKey(key)                 //设置签名的秘钥
                .parseClaimsJws(jwt).getBody();     //设置需要解析的jwt
        return claims;
    }

    /**
     * 检查token
     * @return
     *//*
    public static boolean checkToken(String jwtToken, ObjectMapper objectMapper) throws Exception {
        //TODO 根据自己的业务修改
        Claims claims = JwtUtil.parseJWT(jwtToken);
        String subject = claims.getSubject();
        JwtModel jwtModel = objectMapper.readValue(subject, JwtModel.class);
        *//*
            TODO 对jwt里面的用户信息做判断
            根据自己的业务编写
         *//*

        *//*
            获取token的过期时间，和当前时间作比较，如果小于当前时间，则token过期
         *//*
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        Date expiration = claims.getExpiration();
        log.info("======== token的过期时间："+df.format(expiration));
        return true;
    }*/

}
