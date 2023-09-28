package com.iflytek.mapper;

import com.iflytek.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface UserMapper {
    //@Select("select * from sys_user")
    List<User> selectUserList();
    void add(User user);
}
