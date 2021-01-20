package com.ylb.service.Imp;

import com.ylb.mapper.MenuMapper;
import com.ylb.pojo.Menu;
import com.ylb.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImp implements MenuService {

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<Menu> selMenuInfoService(Integer pid, Integer rid) {
        return menuMapper.selMenuInfoMapper(pid,rid);
    }
}
