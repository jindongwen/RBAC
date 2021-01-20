package com.ylb.service;

import com.ylb.pojo.Menu;

import java.util.List;

public interface MenuService {

    List<Menu> selMenuInfoService(Integer pid, Integer rid);
}
