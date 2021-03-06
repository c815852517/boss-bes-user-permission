package com.bosssoft.bes.user.permission.api.controller;


import com.alibaba.fastjson.JSON;
import com.bosssoft.bes.user.permission.pojo.vo.UserVO;
import com.bosssoft.bes.user.permission.service.LoginService;
import common.CommonField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utils.jwt.*;
import protocol.CommonRequest;
import protocol.CommonResponse;
import protocol.RequestHead;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/boss/bes/user/login")
//@CrossOrigin(allowedHeaders = "*",allowCredentials = "true" ,methods = {})
public class LoginController {

    /**
     *
     */


    @Autowired
    private LoginService loginService;

    @PostMapping(value = "/check")
    public CommonResponse check(@RequestBody Object user){
        System.out.println(user);
        UserVO userVO = JSON.parseObject( JSON.toJSONString(user),UserVO.class);
        UserPermission userPermission = loginService.checkUser(userVO);
        System.out.println(userPermission);
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
        System.out.println(userPermission);
        UserVO userVO = new UserVO();
        userVO.setId(userPermission.getId());
        return CommonResponse.create(null,"200",null,true,loginService.getUserInfo(userVO));
    }

    @PostMapping(value = "/logout")
    public CommonResponse logout(){
        return CommonResponse.create(null,"200","success",true,null);
    }
}
