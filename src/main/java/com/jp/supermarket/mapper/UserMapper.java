package com.jp.supermarket.mapper;

import com.jp.supermarket.pojo.User;

import java.util.List;

/**
 * @description:
 * @author: roshunu
 * @date: 2023-07-12 13:34
 */
public interface UserMapper {

    public List<User> getUserList(User user);
}
