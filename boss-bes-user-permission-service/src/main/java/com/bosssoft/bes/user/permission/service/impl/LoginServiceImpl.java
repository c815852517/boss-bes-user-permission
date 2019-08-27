package com.bosssoft.bes.user.permission.service.impl;

import com.bosssoft.bes.user.permission.dao.LoginMapper;
import com.bosssoft.bes.user.permission.entity.User;
import com.bosssoft.bes.user.permission.pojo.vo.UserInfo;
import com.bosssoft.bes.user.permission.pojo.vo.UserVO;
import com.bosssoft.bes.user.permission.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.jwt.UserPermission;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public UserPermission checkUser(UserVO userVO) {
        return loginMapper.checkUser(userVO);
    }

    @Override
    public UserInfo getUserInfo(UserVO userVO) {
        return loginMapper.getUserInfo(userVO);
    }
}
