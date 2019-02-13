package com.snow.springbootquick.controller;

import com.snow.springbootquick.entity.UnicodeUtil;
import com.snow.springbootquick.entity.User;
import com.snow.springbootquick.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import sun.nio.cs.UnicodeEncoder;

import java.net.URLEncoder;
import java.util.List;

/**
 * @author wangpengtao
 * @date 2019/1/5  16:31
 * @EMAIL wptxc@foxmail.com
 */

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/queryUser")
    public List<User> queryUser(){

        List<User> users = userMapper.queryUserList();
        /*for(User user : users){
            user.setName(UnicodeUtil.decode(user.getName()));
        }*/
        return users;
    }

    @PostMapping("/insert")
    public int insertUser(User user){
        /*try {
            user.setName(UnicodeUtil.encode(user.getName()));
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        int result = userMapper.insert(user);
        return result;
    }
}