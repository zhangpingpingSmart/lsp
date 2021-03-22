package com.zpp.lsp.service.impl;

import com.zpp.lsp.mapper.UserMapper;
import com.zpp.lsp.pojo.User;
import com.zpp.lsp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: 张平平
 * @Date: 2021/3/10 11:35
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserByUserId(String userId) {
        return userMapper.getUserByUserId(userId);
    }

    /**
     * 用户登录
     * @param user
     * @return
     */
    @Override
    public User getUserByUserNameAndPassword(User user) {

        //校验用户名密码，用户信息写入redis
        return userMapper.getUserByUserNameAndPassword(user.getUserName(),user.getPassword());
    }

    @Override
    public void saveUser(User user) {
        userMapper.insert(user);
    }

    @Override
    public void updateUserById(User user) {
        userMapper.updateById(user);
    }

    @Override
    public void deleteUserById(String userId) {
        userMapper.deleteUserById(userId);
    }
}
