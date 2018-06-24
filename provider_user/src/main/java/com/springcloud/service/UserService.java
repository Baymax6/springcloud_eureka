package com.springcloud.service;

import com.springcloud.dao.UserDao;
import com.springcloud.entity.ChatUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService
{
    @Autowired
    private UserDao userDao;

    public ChatUser findUserById(Integer id)
    {
        return userDao.selectUserById(id);
    }
}
