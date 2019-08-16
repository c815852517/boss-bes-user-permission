package com.bosssoft.bes.user.permission.dao;

import com.bosssoft.bes.user.permission.entity.User;
import com.bosssoft.bes.user.permission.pojo.vo.UserVO;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface LoginMapper extends Mapper<User> {

    @Select("select password from t_user where code = #{code}")
    String checkUser(UserVO userVO);

    @Select("select password from t_user where code = #{code}")
    List<User> checkUser1(UserVO userVO);
}
