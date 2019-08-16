package com.bosssoft.bes.user.permission.api.controller;


import com.alibaba.fastjson.JSON;
import com.bosssoft.bes.user.permission.pojo.vo.UserVO;
import com.bosssoft.bes.user.permission.service.LoginService;
import com.bosssoft.bes.user.permission.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import protocol.CommonRequest;
import protocol.CommonResponse;
import protocol.body.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/login")
public class LoginController {

    /**
     *
     */
    @Autowired
    private LoginService loginService;

    @PostMapping(value = "/check")
    public CommonResponse check(@RequestBody CommonRequest commonRequest){
        UserVO userVO = JSON.parseObject( JSON.toJSONString(commonRequest.getBody().getData()),UserVO.class);
        System.out.println(userVO.toString());
        ResponseBody responseBody = new ResponseBody();
        Map<String, Object> data = new HashMap<String, Object>();
        JwtUtil.createJwt(userVO.getUserId(),userVO.getPositionId(),userVO.get);
        data.put("token","111");
        responseBody.setData(data);
        return CommonResponse.create(loginService.checkUser(userVO),responseBody);
    }

    @PostMapping(value = "/getInfo")
    public CommonResponse getInfo(@RequestBody String token){

        return null;
    }

}
