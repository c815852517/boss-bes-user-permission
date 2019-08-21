package com.bosssoft.bes.user.permission.api.controller;


import com.alibaba.fastjson.JSON;
import com.bosssoft.bes.user.permission.pojo.vo.UserPermission;
import com.bosssoft.bes.user.permission.pojo.vo.UserVO;
import com.bosssoft.bes.user.permission.service.LoginService;
import com.bosssoft.bes.user.permission.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import protocol.CommonRequest;
import protocol.CommonResponse;
import protocol.RequestHead;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/boss/bes/user/login")
public class LoginController {

    /**
     *
     */
    @Autowired
    private LoginService loginService;

    @PostMapping(value = "/check")
    public CommonResponse check(@RequestBody CommonRequest commonRequest){
        UserVO userVO = JSON.parseObject( JSON.toJSONString(commonRequest.getBody().getData()),UserVO.class);
        UserPermission userPermission = loginService.checkUser(userVO);
        String token = JwtUtil.createJwt(userPermission);
        Map<String,Object> data = new HashMap<String, Object>();
        data.put("token",token);
        System.out.println(data);
        return CommonResponse.create(null,"200",null,true,data);
    }

    @PostMapping(value = "/getInfo")
    public CommonResponse getInfo(@RequestBody CommonRequest commonRequest) throws Exception {
        RequestHead head = JSON.parseObject( JSON.toJSONString(commonRequest.getHead()),RequestHead.class);
        String token = head.getToken();
        UserPermission userPermission = JwtUtil.parseJwt(token);
        UserVO userVO = new UserVO();
        userVO.setUserId(userPermission.getUserId());
        return CommonResponse.create(null,"200",null,true,loginService.getUserInfo(userVO));
    }

    @PostMapping(value = "/logout")
    public CommonResponse logout(){
        return CommonResponse.create(null,"200",null,true,null);
    }
}
