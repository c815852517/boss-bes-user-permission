package com.bosssoft.bes.user.permission.service;


import com.bosssoft.bes.user.permission.pojo.vo.UserInfo;
import com.bosssoft.bes.user.permission.pojo.vo.UserVO;
import utils.jwt.UserPermission;


public interface LoginService {
    UserPermission checkUser(UserVO userVO);
    UserInfo getUserInfo(UserVO userVO);
}
