package com.zpp.lsp.service;

import com.zpp.lsp.pojo.User;

import java.util.List;

/**
 * @Author: 张平平
 * @Date: 2021/3/10 11:35
 */
public interface UserService {

    User getUserByUserId(String userId);

    User getUserByUserNameAndPassword(User user);

    void saveUser(User user);

    void updateUserById(User user);

    void deleteUserById(String userId);

    List<User> getUserList();
}
