package com.sl.dao;

import com.sl.entity.User;

import java.util.List;

/**
 * @author shulu
 */
public interface UserMapper {
    List<User> selectAllUsers();
}
