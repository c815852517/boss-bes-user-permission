package com.bosssoft.bes.user.permission.dao;

import com.bosssoft.bes.user.permission.entity.User;
import com.bosssoft.bes.user.permission.pojo.vo.UserPermission;
import com.bosssoft.bes.user.permission.pojo.vo.UserVO;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;


@org.apache.ibatis.annotations.Mapper
public interface LoginMapper extends Mapper<User> {

    @Select("select a.user_id,a.code,a.name,b.role_id,org_id,company_id from t_user a,t_user_role b,t_role c " +
            "where a.code = #{code} and a.password = #{password} and a.user_id = b.user_id and b.role_id = c.role_id")
    UserPermission checkUser(UserVO userVO);

    @Select("select password from t_user where code = #{code}")
    List<User> checkUser1(UserVO userVO);
}
