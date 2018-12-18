package com.wuicelone.smd.controller;

import com.wuicelone.smd.entity.User;
import com.wuicelone.smd.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/")
    public ModelAndView index() {
        User user = new User();
        user.setAge(18);
        user.setName("Admin");
        user.setPwd("123456");
        userMapper.insert(user);
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("count", userMapper.findAll().size());
        return modelAndView;
    }

}