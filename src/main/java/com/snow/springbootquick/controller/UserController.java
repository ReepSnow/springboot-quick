package com.snow.springbootquick.controller;

import com.snow.springbootquick.entity.User;
import com.snow.springbootquick.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author wangpengtao
 * @date 2019/1/5  16:31
 * @EMAIL wptxc@foxmail.com
 */

@Controller
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/queryUser")
    @ResponseBody
    public List<User> queryUser(){
        List<User> users = userMapper.queryUserList();
        return users;
    }

}