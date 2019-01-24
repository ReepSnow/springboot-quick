package com.snow.springbootquick.mapper;

import com.snow.springbootquick.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author wangpengtao
 * @date 2019/1/5  16:26
 * @EMAIL wptxc@foxmail.com
 */
@Mapper
public interface UserMapper {
    public List<User> queryUserList();
}