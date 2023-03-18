package com.dbt.springboot.service;

import com.dbt.springboot.entity.User;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface UserService {
   PageInfo<User> getAllUser(Integer pageNum, Integer pageSize);
}
