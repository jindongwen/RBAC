package com.ylb.mapper;

import com.ylb.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select * from t_user where uname=#{uname} and pwd=#{pwd}")
    User userLogin(User user);
}
