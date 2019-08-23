package com.bosssoft.bes.user.permission.dao;

import com.bosssoft.bes.user.permission.entity.Company;
import com.bosssoft.bes.user.permission.entity.Organization;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author CJF
 * @version V1.0.0
 * @date 2019/8/23
 */
@org.apache.ibatis.annotations.Mapper
public interface OrganizationMapper extends Mapper<Organization> {
    @Select("<script>" +
            "SELECT * FROM t_organization WHERE 1=1 " +
            "<if test=\"name!=null\">" +
            "AND name LIKE CONCAT('%',#{name},'%')" +
            "</if>" +
            "</script>")
    List<Company> query(Organization organization);
}
