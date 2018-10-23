package com.fis.savingsystem.service.impl;

import com.fis.savingsystem.mapper.UserMapper;
import com.fis.savingsystem.pojo.User;
import com.fis.savingsystem.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public void add(User u) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public User get(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> list() {
        return userMapper.selectAll();
    }
}
