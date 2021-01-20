package com.ylb.service.Imp;

import com.ylb.mapper.UserMapper;
import com.ylb.pojo.User;
import com.ylb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp  implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User selLogin(User user) {
        return userMapper.userLogin(user);
    }
}
