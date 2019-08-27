package com.bosssoft.bes.user.permission.api.controller;

import com.alibaba.fastjson.JSON;
import com.bosssoft.bes.user.permission.entity.Resource;
import com.bosssoft.bes.user.permission.service.ResourceService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import protocol.CommonRequest;
import protocol.CommonResponse;

import java.util.List;

//@RestController
//@RequestMapping(value = "/boss/bes/user/resource")
public class Resource1Controller {

    @Autowired
    ResourceService1 resourceService1;

//    @PostMapping(value = "/saveResource")
//    public CommonResponse saveResource(@RequestBody CommonRequest commonRequest){
//        System.out.println(commonRequest);
//        Resource resource = JSON.parseObject( JSON.toJSONString(commonRequest.getBody().getData()),Resource.class);
//        System.out.println(resource);
//        resourceService1.saveResource(resource);
//        return CommonResponse.create(null,"200",null,true,null);
//    }
//    @DeleteMapping(value = "/deleteResource")
//    public CommonResponse deleteResource(@RequestBody CommonRequest commonRequest){
//        List<Resource> resourceList = (List<Resource>) JSON.parseObject( JSON.toJSONString(commonRequest.getBody().getData()),Resource.class);
//        resourceService1.deleteResource(resourceList);
//        return CommonResponse.create(null,"200",null,true,null);
//    }
//
//    public CommonResponse updateResource(@RequestBody CommonRequest commonRequest){
//        Resource resource = JSON.parseObject( JSON.toJSONString(commonRequest.getBody().getData()),Resource.class);
//        resourceService1.updateResource(resource);
//        return CommonResponse.create(null,"200",null,true,null);
//    }
//    @PostMapping(value = "/queryResource")
//    public CommonResponse queryResource(@RequestBody CommonRequest commonRequest){
//        Resource resource = JSON.parseObject( JSON.toJSONString(commonRequest.getBody().getData()),Resource.class);
//        resourceService1.queryResource(resource);
//        return CommonResponse.create(null,"200",null,true,null);
//    }
//
//    @PostMapping(value = "/getResourceInfo")
//    public CommonResponse getResourceInfo(@RequestBody CommonRequest commonRequest){
//        return CommonResponse.create(null,"200",null,true, resourceService1.getResourceInfo());
//    }

}
