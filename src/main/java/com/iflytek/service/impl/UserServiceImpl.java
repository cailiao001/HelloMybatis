package com.iflytek.service.impl;

import com.iflytek.mapper.UserMapper;
import com.iflytek.pojo.User;
import com.iflytek.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> selectUserList() {
        return userMapper.selectUserList();
    }

    @Override
    public void add(User user) {
        userMapper.add(user);
    }
}
