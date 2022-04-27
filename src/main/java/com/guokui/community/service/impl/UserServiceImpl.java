package com.guokui.community.service.impl;

import com.guokui.community.dao.UserMapper;
import com.guokui.community.entity.User;
import com.guokui.community.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User queryUserById(int id) {
        return userMapper.selectUserById(id);
    }
}
