package com.zpp.lsp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zpp.lsp.pojo.User;

/**
 * @Author: 张平平
 * @Date: 2021/3/17 17:57
 */
public interface UserMapper extends BaseMapper<User> {

    User getUserByUserNameAndPassword(String userName,String password);

    User getUserByUserId(String userId);

    void deleteUserById(String userId);
}
