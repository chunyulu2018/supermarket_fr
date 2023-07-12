package com.jp.supermarket.service.impl;

import com.jp.supermarket.mapper.UserMapper;
import com.jp.supermarket.pojo.User;
import com.jp.supermarket.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> getUserList(User user) {
        return userMapper.getUserList(user);
    }
}
