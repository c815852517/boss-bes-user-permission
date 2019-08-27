package com.bosssoft.bes.user.permission.dao;

import com.bosssoft.bes.user.permission.entity.User;
import com.bosssoft.bes.user.permission.pojo.vo.UserInfo;
import com.bosssoft.bes.user.permission.pojo.vo.UserVO;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;
import utils.jwt.UserPermission;

import java.util.List;


@org.apache.ibatis.annotations.Mapper
public interface LoginMapper extends Mapper<User> {

    @Select("select a.id,a.code,a.name,b.role_id,org_id,company_id from t_user a,t_user_role b,t_role c " +
            "where a.code = #{code} and a.password = #{password} and a.id = b.user_id and b.role_id = c.id")
    UserPermission checkUser(UserVO userVO);

    @Select("select a.name,a.profile_picture,b.role_id from t_user a,t_user_role b where a.id = #{id} and a.id = b.user_id ")
    UserInfo getUserInfo(UserVO userVO);
}
