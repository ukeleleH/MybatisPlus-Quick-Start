package com.hlp.mp.simple.mapper;

import com.hlp.mp.simple.pojo.User;

import java.util.List;

public interface UserMapper {
    //  查询全部用户
    List<User> findAll();
}
