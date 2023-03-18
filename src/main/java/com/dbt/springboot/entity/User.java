package com.dbt.springboot.entity;
import lombok.Data;

@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private Integer age;
    private Integer is_delete;
    private Integer version;
}
