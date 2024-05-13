package com.example.service;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author <a href="mailto:liyuelian.ke@gmail.com">liyuelian</a>
 */
@Service
public class UserService
{

    @Resource
    private UserMapper userMapper;

    public User getUser(Long id)
    {
        return userMapper.getUser(id);
    }
}
