package com.xyj.test01.controller;

import com.xyj.test01.model.User;
import com.xyj.test01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestRestController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/test01.do",method = RequestMethod.GET)
    public List<User> test01() {
        List<User> list = userService.getAll();
        return list;
    }
}
