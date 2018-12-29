package com.sl.service.impl;

import com.sl.dao.UserMapper;
import com.sl.entity.User;
import com.sl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @author shulu
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getUser(){
        return userMapper.selectAllUsers();
    }
}
