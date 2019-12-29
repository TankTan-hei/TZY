package com.xyj.test01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class TestController {

    @RequestMapping(value = "/test02.do",method = RequestMethod.GET)
    public String test02() {
        return "/Hello";
    }
}
