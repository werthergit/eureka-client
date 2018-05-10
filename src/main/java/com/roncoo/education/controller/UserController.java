package com.roncoo.education.controller;

import com.roncoo.education.bean.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/getUser")
    public User getUser() {
        User user = new User();
        user.setId(11);
        user.setName("dingjianglei");
        return user;
    }
}
