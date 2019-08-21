package com.bosssoft.bes.user.permission.dao;

import com.bosssoft.bes.user.permission.entity.Resource;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface ResourceMapper extends Mapper<Resource> {
    @Select("<script>" +
            "SELECT * FROM t_resource WHERE 1=1 " +
            "<if test=\"name!=null\">" +
            "AND name LIKE CONCAT('%',#{name},'%')" +
            "</if>" +
            "</script>")
    List<Resource> queryResourceInfo(Resource resource);

}
