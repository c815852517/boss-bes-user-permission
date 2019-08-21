package com.bosssoft.bes.user.permission.dao;

import com.bosssoft.bes.user.permission.entity.Company;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface CompanyMapper extends Mapper<Company> {
    @Select("<script>" +
            "SELECT * FROM t_company WHERE 1=1 " +
            "<if test=\"name!=null\">" +
            "AND name LIKE CONCAT('%',#{name},'%')" +
            "</if>" +
            "</script>")
    List<Company> queryCompanyInfo(Company company);
}
