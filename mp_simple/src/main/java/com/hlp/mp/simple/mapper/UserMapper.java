package com.hlp.mp.simple.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hlp.mp.simple.pojo.User;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {
    //  查询全部用户
    List<User> findAll();
}
