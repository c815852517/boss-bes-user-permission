package com.bosssoft.bes.user.permission.service;

import com.bosssoft.bes.user.permission.entity.User;
import com.bosssoft.bes.user.permission.pojo.vo.UserVO;
import protocol.head.ResponseHead;

import java.util.List;

public interface LoginService {
    public List<User> checkUser1(UserVO userVO);
    public ResponseHead checkUser(UserVO userVO);
}
