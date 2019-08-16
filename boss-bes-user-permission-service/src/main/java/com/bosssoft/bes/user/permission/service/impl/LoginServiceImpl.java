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
    public ResponseHead checkUser(UserVO userVO) {
        List<UserPermission> userPermission = loginMapper.checkUser(userVO);
        ResponseHead responseHead = new ResponseHead();
        if(userPermission.size()==0){
            responseHead.setCode("404");
        }else {
            if(userPermission.size()>0){
                responseHead.setCode("200");
            }
        }
        return responseHead;
    }
}
