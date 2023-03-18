package com.dbt.springboot.mapper;

import com.dbt.springboot.entity.User;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM T_USER")
    List<User> getAllUser();
}
