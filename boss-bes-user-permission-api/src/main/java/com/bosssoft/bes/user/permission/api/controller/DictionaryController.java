package com.bosssoft.bes.user.permission.api.controller;

import com.bosssoft.bes.user.permission.entity.Dictionary;
import com.bosssoft.bes.user.permission.utils.DictionaryService;
import com.bosssoft.bes.user.permission.utils.JwtUtil;
import com.bosssoft.hr.train.bossbescommonlogging.annotation.Log;
//import exception.EnumError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/dict")
public class DictionaryController {
    @Autowired
    private DictionaryService<Dictionary> dictionaryService;

    /*@RequestMapping(value ="/add")
    public CommonResponse save(@RequestBody CommonRequest request){
        CommonResponse commonResponse=new CommonResponse();
        return commonResponse;
    }*/
    @Log
    @RequestMapping(value ="/index")
    public String index(){
        JwtUtil.createJWT("test","123");
        return "hello world";
    }
}
