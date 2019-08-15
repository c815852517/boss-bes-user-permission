package com.bosssoft.bes.user.permission.api.controller;

import com.bosssoft.bes.user.permission.entity.Dictionary;
import com.bosssoft.bes.user.permission.service.DictionaryService;
import com.bosssoft.hr.train.bossbescommonlogging.annotation.Log;
import exception.BusinessException;
import exception.EnumError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;

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
       /* Dictionary dictionary=new Dictionary();
        dictionary.setCatagory("test1");
        dictionary.setCreatedBy(1L);
        dictionary.setCreatedTime(Calendar.getInstance().getTime());
        dictionary.setDictionaryId(2L);
        dictionary.setName("test");
        dictionary.setRemark("test");
        dictionary.setStatus(1);
        dictionary.setValue("ddd");
        dictionary.setUpdatedBy(1L);
        dictionary.setUpdatedTime(Calendar.getInstance().getTime());
       // dictionary.setVersion(Calendar.getInstance().getTime());
        dictionaryService.save(dictionary);*/
//       Dictionary dictionary= null;
//       if (dictionary==null){
//           throw new BusinessException(EnumError.SERVICE_PARAMETER_VALIDATION_ERROR.getErrorCode());
//       }
        return "hello world";

    }
}
