package com.ylb.controller;

import com.ylb.pojo.Menu;
import com.ylb.pojo.User;
import com.ylb.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;


@Controller
@SessionAttributes("user")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @RequestMapping("menuInfo")
    @ResponseBody
    private List<Menu> MenuInfo(Integer pid, Model m){
        User user = (User) m.getAttribute("user");
        Integer rid = user.getRid();

        List<Menu> menus = menuService.selMenuInfoService(pid, rid);
        return  menus;
    }
}
