package com.iflytek.controller;

import com.iflytek.pojo.User;
import com.iflytek.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@AllArgsConstructor
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/list")
    private List<User> selectUserList(){
        return userService.selectUserList();
    }


  /*  @RequestMapping("add")
    public void add(String username, String email,String password,String phoneNum){
        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);
        user.setPhoneNum(phoneNum);
        userService.add(user);
    }*/
}
