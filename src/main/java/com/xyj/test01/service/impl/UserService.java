package com.xyj.test01.service.impl;

import com.xyj.test01.mapper.UserMapper;
import com.xyj.test01.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService implements com.xyj.test01.service.UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional
    public List<User> getAll() {
        return userMapper.getAll();
    }
}
