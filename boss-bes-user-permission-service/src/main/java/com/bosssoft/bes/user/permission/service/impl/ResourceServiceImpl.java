package com.bosssoft.bes.user.permission.service.impl;

import com.bosssoft.bes.user.permission.dao.ResourceMapper;
import com.bosssoft.bes.user.permission.entity.Resource;
import com.bosssoft.bes.user.permission.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceServiceImpl implements ResourceService {

    @Autowired
    ResourceMapper resourceMapper;

    @Override
    public boolean saveResource(Resource resource) {
        int a = resourceMapper.insert(resource);
        return true;
    }

    @Override
    public boolean deleteResource(List<Resource> resource) {
        for(int i = 0;i<resource.size();i++){
            resourceMapper.delete(resource.get(i));
        }
        return true;
    }

    @Override
    public boolean updateResource(Resource resource) {
        resourceMapper.updateByPrimaryKeySelective(resource);
        return true;
    }

    @Override
    public List<Resource> queryResource(Resource resource) {
        return resourceMapper.queryResourceInfo(resource);
    }

    @Override
    public List<Resource> getResourceInfo() {
        System.out.println(resourceMapper.selectAll());
        return resourceMapper.selectAll();
    }
}
