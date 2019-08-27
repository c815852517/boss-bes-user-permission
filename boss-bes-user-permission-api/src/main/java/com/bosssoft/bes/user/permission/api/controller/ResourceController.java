package com.bosssoft.bes.user.permission.api.controller;

import com.alibaba.fastjson.JSON;
import com.bosssoft.bes.user.permission.pojo.dto.ResourceDTO;
import com.bosssoft.bes.user.permission.pojo.vo.ResourceVO;
//import com.bosssoft.bes.user.permission.service.ResourceService;
import com.bosssoft.bes.user.permission.service.ResourceService;
import com.bosssoft.bes.user.permission.service.ResourceService1;
import common.AbstractBaseController;
import exception.BusinessException;
import exception.EnumException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import protocol.CommonRequest;
import protocol.CommonResponse;
import utils.Converter;

import java.util.*;

@RestController
@RequestMapping(value = "/boss/bes/user/resource")
public class ResourceController extends AbstractBaseController<ResourceVO> {
    @Autowired
    Converter converter;
    @Autowired
    ResourceService resourceService;

    @Override
    @PostMapping(value = "/saveResource")
    public CommonResponse save(@RequestBody CommonRequest<ResourceVO> commonRequest) {
        try {
            ResourceVO resourceVO = commonRequest.getBody();
            ResourceDTO resourceDTO = new ResourceDTO();
            converter.copyProperties(resourceVO,resourceDTO);
            resourceDTO.setToken(commonRequest.getHead().getToken());
            resourceService.save(resourceDTO);
            System.out.println(resourceDTO);
        }catch (Exception e){
            throw new BusinessException(EnumException.SYSTEM_PARAMETER_VALIDATION_ERROR);
        }
        return CommonResponse.create("","200","添加成功",true,null);
    }

    @Override
    @PutMapping(value = "/updateResource")
    public CommonResponse update(CommonRequest<ResourceVO> commonRequest) {
        try {
            ResourceVO resourceVO = commonRequest.getBody();
            ResourceDTO resourceDTO = new ResourceDTO();
            converter.copyProperties(resourceVO,resourceDTO);
            resourceDTO.setToken(commonRequest.getHead().getToken());
            resourceService.update(resourceDTO);
        } catch (Exception e){
            throw new BusinessException(EnumException.SYSTEM_PARAMETER_VALIDATION_ERROR);
        }
        return null;
    }

    @Override
    public CommonResponse delete(CommonRequest commonRequest) {
        return null;
    }

    @Override
    @PostMapping(value = "/queryResource")
    public CommonResponse query(@RequestBody CommonRequest commonRequest) {
        List<ResourceDTO> resourceDTOList = new ArrayList<ResourceDTO>();
        try {
            //ResourceVO resourceVO = (ResourceVO)converter.getVoFromCommonRequest(commonRequest,ResourceVO.class);
            ResourceVO resourceVO = new ResourceVO();
            ResourceDTO resourceDTO = new ResourceDTO();
            converter.copyProperties(resourceVO,resourceDTO);
            resourceDTOList = resourceService.query(resourceDTO);
        }catch (Exception e){
            throw new BusinessException(EnumException.SYSTEM_PARAMETER_VALIDATION_ERROR);
        }
        Map<String,Object> data = new HashMap<String, Object>();
        data.put("data",resourceDTOList);
        data.put("size",resourceDTOList.size());
        return CommonResponse.create("","200","",true,data);
    }
}
