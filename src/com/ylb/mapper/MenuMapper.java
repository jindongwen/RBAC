package com.ylb.mapper;

import com.ylb.pojo.Menu;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MenuMapper {

    @Select("\n" +
            "SELECT * FROM t_menu WHERE mid in(SELECT mid FROM r_menu WHERE rid=#{rid}) and parentid=#{pid}")
    List<Menu> selMenuInfoMapper(@Param("pid") Integer pid,@Param("rid") Integer rid);
}
