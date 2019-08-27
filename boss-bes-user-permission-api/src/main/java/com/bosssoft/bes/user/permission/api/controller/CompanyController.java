package com.bosssoft.bes.user.permission.api.controller;

import com.alibaba.fastjson.JSON;
import com.bosssoft.bes.user.permission.entity.Company;
import com.bosssoft.bes.user.permission.pojo.vo.CompanyVO;
import com.bosssoft.bes.user.permission.service.CompanyService;
import common.AbstractBaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import protocol.CommonRequest;
import protocol.CommonResponse;
import utils.Converter;

import java.util.List;

@RestController
@RequestMapping(value = "/boss/bes/user/company")
//@CrossOrigin(allowedHeaders = "*",allowCredentials = "true" )
public class CompanyController{

    @Autowired
    CompanyService companyService;
    @Autowired
    Converter converter;

    @PostMapping(value = "/saveCompany")
    public CommonResponse saveCompany(@RequestBody CommonRequest commonRequest){
        Company company = JSON.parseObject( JSON.toJSONString(commonRequest.getBody()),Company.class);
        companyService.saveCompany(company);
        return CommonResponse.create(null,"200",null,true,null);
    }
    @DeleteMapping(value = "/deleteCompany")
    public CommonResponse deleteCompany(@RequestBody CommonRequest commonRequest){
        List<Company> companyList = (List<Company>) JSON.parseObject( JSON.toJSONString(commonRequest.getBody()),Company.class);
        companyService.deleteCompany(companyList);
        return CommonResponse.create(null,"200",null,true,null);
    }
    @PutMapping(value = "/updateCompany")
    public CommonResponse updateCompany(@RequestBody CommonRequest commonRequest){
        Company company = JSON.parseObject( JSON.toJSONString(commonRequest.getBody()),Company.class);
        companyService.updateCompany(company);
        return CommonResponse.create(null,"200",null,true,null);
    }
    @PostMapping(value = "/queryCompany")
    public CommonResponse queryCompany(@RequestBody CommonRequest commonRequest){
        Company company = JSON.parseObject( JSON.toJSONString(commonRequest.getBody()),Company.class);
        companyService.queryCompany(company);
        return CommonResponse.create(null,"200",null,true,null);
    }

    @PostMapping(value = "/getCompanyInfo")
    public CommonResponse getCompanyInfo(@RequestBody CommonRequest commonRequest){
        System.out.println("aaa");
        return CommonResponse.create(null,"200",null,true,companyService.getCompanyInfo());
    }

}
