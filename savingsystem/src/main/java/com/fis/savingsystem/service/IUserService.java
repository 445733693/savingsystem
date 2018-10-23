package com.fis.savingsystem.service;

import com.fis.savingsystem.pojo.User;

import java.util.List;

public interface IUserService {
    void add(User u);

    void delete(Integer id);

    void update(User user);

    User get(Integer id);

    List<User> list();
}
