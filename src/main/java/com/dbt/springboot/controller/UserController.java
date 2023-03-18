package com.dbt.springboot.controller;
import com.alibaba.fastjson.JSONObject;
import com.dbt.springboot.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/getAllUser")
    public JSONObject getAllUser(@RequestBody PageInfo pageInfo){
        Integer pageNum = pageInfo.getPageNum();
        int size = pageInfo.getSize();
        JSONObject json = new JSONObject();
        try{
            PageInfo pageInfo1 = userService.getAllUser(pageNum,size);
            if(pageInfo1!=null){
                json.put("code","200");
                json.put("msg","操作成功");
                json.put("data",pageInfo1);
            }else{
                json.put("code","400");
                json.put("msg","查询为空");
                json.put("data",null);
            }
        }catch (Exception e){
            e.printStackTrace();
            json.put("code","500");
            json.put("msg","服务器错误");
            json.put("data",null);
        }
        return json;
    }
}
