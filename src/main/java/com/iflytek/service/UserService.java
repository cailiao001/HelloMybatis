package com.iflytek.service;

import com.iflytek.pojo.User;

import java.util.List;

public interface UserService {
    List<User> selectUserList();
    void add(User user);
}
