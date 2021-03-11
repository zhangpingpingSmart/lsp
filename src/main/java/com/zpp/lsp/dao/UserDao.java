package com.zpp.lsp.dao;

import com.zpp.lsp.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: 张平平
 * @Date: 2021/3/10 11:48
 */
public interface UserDao extends JpaRepository<User,Long> {

    User getUserByUserId(Long userId);

    User getUserByUserNameAndPassword(String userName,String password);
}
