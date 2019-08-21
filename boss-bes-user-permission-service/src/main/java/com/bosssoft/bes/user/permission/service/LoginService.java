package com.bosssoft.bes.user.permission.service;


import com.bosssoft.bes.user.permission.pojo.vo.UserInfo;
import com.bosssoft.bes.user.permission.pojo.vo.UserPermission;
import com.bosssoft.bes.user.permission.pojo.vo.UserVO;


public interface LoginService {
    UserPermission checkUser(UserVO userVO);
    UserInfo getUserInfo(UserVO userVO);
}
