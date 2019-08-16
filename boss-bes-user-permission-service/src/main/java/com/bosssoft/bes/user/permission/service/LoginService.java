package com.bosssoft.bes.user.permission.service;

import com.bosssoft.bes.user.permission.entity.User;
import com.bosssoft.bes.user.permission.pojo.vo.UserInfo;
import com.bosssoft.bes.user.permission.pojo.vo.UserPermission;
import com.bosssoft.bes.user.permission.pojo.vo.UserVO;
import protocol.head.ResponseHead;

import java.util.List;

public interface LoginService {
    public UserPermission checkUser(UserVO userVO);
    public UserInfo getUserInfo(UserVO userVO);
}
