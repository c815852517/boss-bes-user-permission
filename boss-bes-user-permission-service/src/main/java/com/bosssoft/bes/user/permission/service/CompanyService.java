package com.bosssoft.bes.user.permission.service;

import com.bosssoft.bes.user.permission.entity.Company;
import com.bosssoft.bes.user.permission.pojo.vo.CompanyVO;

import java.util.List;

public interface CompanyService {
    boolean saveCompany(Company company);
    boolean deleteCompany(List<Company> company);
    boolean updateCompany(Company company);
    List<Company> queryCompany(Company company);
    List<Company> getCompanyInfo();

}
