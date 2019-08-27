package com.bosssoft.bes.user.permission.service.impl;


import annotations.EnumOperation;
import annotations.FullCommonField;
import com.bosssoft.bes.user.permission.dao.ResourceMapper;
import com.bosssoft.bes.user.permission.pojo.dto.ResourceDTO;
import com.bosssoft.bes.user.permission.entity.Resource;
import com.bosssoft.bes.user.permission.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.Converter;

import java.util.ArrayList;
import java.util.List;

@Service
public class ResourceServiceImpl implements ResourceService<ResourceDTO> {

    @Autowired
    ResourceMapper resourceMapper;
    @Autowired
    Converter converter;

    @Override
    @FullCommonField(dataCenterId = 2,machineId = 1,operation = EnumOperation.INSERT)
    public boolean save(ResourceDTO resourceDTO) {
        Resource resource = new Resource();
        converter.copyProperties(resourceDTO,resource);
        try {
            System.out.println(resourceMapper.insert(resource));
        } catch (Exception e) {

        }
        return false;
    }

    @Override
    public ResourceDTO queryById(Long aLong) {
        return null;
    }

    @Override
    public List<ResourceDTO> query(ResourceDTO resourceDTO) {
        Resource resource = new Resource();
        converter.copyProperties(resourceDTO,resource);
        List<Resource> resourceList = resourceMapper.selectAll();
        List<ResourceDTO> resourceDTOList = new ArrayList<ResourceDTO>();
        for (Resource newResource : resourceList) {
            ResourceDTO newResourceDTO = new ResourceDTO();
            converter.copyProperties(newResource,newResourceDTO);
            resourceDTOList.add(newResourceDTO);
        }
        System.out.println(resourceDTO);
        return resourceDTOList;
    }

    @Override
    @FullCommonField(dataCenterId = 2,machineId = 1,operation = EnumOperation.UPDATE)
    public boolean update(ResourceDTO resourceDTO) {
        Resource resource = new Resource();
        converter.copyProperties(resourceDTO,resource);
        try {
            System.out.println(resourceMapper.updateByPrimaryKey(resource));
        } catch (Exception e) {

        }
        return false;
    }

    @Override
    public boolean deleteById(Long aLong) {
        return false;
    }
}