package com.bosssoft.bes.user.permission.api.controller;

import com.alibaba.fastjson.JSON;
import com.bosssoft.bes.user.permission.entity.Resource;
import com.bosssoft.bes.user.permission.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import protocol.CommonRequest;
import protocol.CommonResponse;

import java.util.List;

@RestController
@RequestMapping(value = "/boss/bes/user/resource")
public class ResourceController {

    @Autowired
    ResourceService resourceService;

    @PostMapping(value = "/saveResource")
    public CommonResponse saveResource(@RequestBody CommonRequest commonRequest){
        Resource resource = JSON.parseObject( JSON.toJSONString(commonRequest.getBody().getData()),Resource.class);
        resourceService.saveResource(resource);
        return CommonResponse.create(null,"200",null,true,null);
    }
    @DeleteMapping(value = "/deleteResource")
    public CommonResponse deleteResource(@RequestBody CommonRequest commonRequest){
        List<Resource> resourceList = (List<Resource>) JSON.parseObject( JSON.toJSONString(commonRequest.getBody().getData()),Resource.class);
        resourceService.deleteResource(resourceList);
        return CommonResponse.create(null,"200",null,true,null);
    }
    @PutMapping(value = "/updateResource")
    public CommonResponse updateResource(@RequestBody CommonRequest commonRequest){
        Resource resource = JSON.parseObject( JSON.toJSONString(commonRequest.getBody().getData()),Resource.class);
        resourceService.updateResource(resource);
        return CommonResponse.create(null,"200",null,true,null);
    }
    @PostMapping(value = "/queryResource")
    public CommonResponse queryResource(@RequestBody CommonRequest commonRequest){
        Resource resource = JSON.parseObject( JSON.toJSONString(commonRequest.getBody().getData()),Resource.class);
        resourceService.queryResource(resource);
        return CommonResponse.create(null,"200",null,true,null);
    }

    @PostMapping(value = "/getResourceInfo")
    public CommonResponse getResourceInfo(@RequestBody CommonRequest commonRequest){
        System.out.println("aaa");
        return CommonResponse.create(null,"200",null,true,resourceService.getResourceInfo());
    }

}
