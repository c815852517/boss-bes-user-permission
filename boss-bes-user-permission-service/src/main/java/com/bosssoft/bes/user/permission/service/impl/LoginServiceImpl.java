package com.bosssoft.bes.user.permission.service.impl;

import com.bosssoft.bes.user.permission.dao.LoginMapper;
import com.bosssoft.bes.user.permission.entity.User;
import com.bosssoft.bes.user.permission.pojo.vo.UserPermission;
import com.bosssoft.bes.user.permission.pojo.vo.UserVO;
import com.bosssoft.bes.user.permission.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import protocol.head.ResponseHead;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public List<User> checkUser1(UserVO userVO) {
        loginMapper.checkUser(userVO);
        return null;
    }

    @Override
    public UserPermission checkUser(UserVO userVO) {
        UserPermission userPermission = loginMapper.checkUser(userVO);
        return userPermission;
    }
}
