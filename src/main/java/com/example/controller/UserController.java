package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author <a href="mailto:liyuelian.ke@gmail.com">liyuelian</a>
 */
@Controller
public class UserController
{
    @Resource
    private UserService userService;

    @RequestMapping(value = "/getUser/{id}", method = RequestMethod.GET)
    @ResponseBody
    public User getUser(@PathVariable("id") Long id)
    {
        return userService.getUser(id);
    }

}
