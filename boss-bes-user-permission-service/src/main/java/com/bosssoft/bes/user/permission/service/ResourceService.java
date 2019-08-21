package com.bosssoft.bes.user.permission.service;

import com.bosssoft.bes.user.permission.entity.Resource;

import java.util.List;

public interface ResourceService {
    boolean saveResource(Resource resource);
    boolean deleteResource(List<Resource> resource);
    boolean updateResource(Resource resource);
    List<Resource> queryResource(Resource resource);
    List<Resource> getResourceInfo();

}
