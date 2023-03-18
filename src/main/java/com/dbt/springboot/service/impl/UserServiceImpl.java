package com.dbt.springboot.service.impl;

import com.dbt.springboot.entity.User;
import com.dbt.springboot.mapper.UserMapper;
import com.dbt.springboot.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public PageInfo getAllUser(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<User> allUser = userMapper.getAllUser();
        PageInfo<User> pageInfo = new PageInfo<>(allUser);
        return pageInfo;
    }
}
