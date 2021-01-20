package com.ylb.controller;

import com.ylb.pojo.User;
import com.ylb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("userLogin")
    @ResponseBody
    public boolean userLogin(User user, Model m) {
        User login = userService.selLogin(user);
        m.addAttribute("user",login);
        return login != null;
    }
    @RequestMapping("welCome")
    @ResponseBody
    public User userWelcome(Model m){

        User user = (User) m.getAttribute("user");
        System.out.println(user);
        return user;
    }
}
