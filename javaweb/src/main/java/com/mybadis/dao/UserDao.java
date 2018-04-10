package com.mybadis.dao;

import com.mybadis.pojo.User;

import java.util.List;

public interface UserDao {
    int addUser(User user);
    int updateUser(User user);
    int deleteUser(int id);
    User findById(int id);

    List<User> findAll();

}
