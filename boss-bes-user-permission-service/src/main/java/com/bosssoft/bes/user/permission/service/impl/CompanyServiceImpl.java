package com.bosssoft.bes.user.permission.service.impl;

import annotations.FullCommonField;
import com.bosssoft.bes.user.permission.dao.CompanyMapper;
import com.bosssoft.bes.user.permission.entity.Company;
import com.bosssoft.bes.user.permission.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService{

    @Autowired
    CompanyMapper companyMapper;
    @FullCommonField
    @Override
    public boolean saveCompany(Company company) {
        int a = companyMapper.insert(company);
        return true;
    }

    @Override
    public boolean deleteCompany(List<Company> company) {
        for(int i = 0;i<company.size();i++){
            companyMapper.delete(company.get(i));
        }
        return true;
    }

    @Override
    public boolean updateCompany(Company company) {
        companyMapper.updateByPrimaryKeySelective(company);
        return true;
    }

    @Override
    public List<Company> queryCompany(Company company) {
        return companyMapper.queryCompanyInfo(company);
    }

    @Override
    public List<Company> getCompanyInfo() {
        System.out.println(companyMapper.selectAll());
        return companyMapper.selectAll();
    }
}
