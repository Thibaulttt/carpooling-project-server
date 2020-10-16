package com.carpoolingproject.carpoolingserver.controller;

import com.carpoolingproject.carpoolingserver.model.User;
import com.carpoolingproject.carpoolingserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public List<User> getAll() {
        return userService.getAll();
    }
}
