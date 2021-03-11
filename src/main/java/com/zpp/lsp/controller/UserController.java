package com.zpp.lsp.controller;

import com.zpp.lsp.common.ResultData;
import com.zpp.lsp.config.login.Priv;
import com.zpp.lsp.pojo.User;
import com.zpp.lsp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: 张平平
 * @Date: 2021/3/10 11:34
 */
@RestController
@RequestMapping("/zpp/user")
public class UserController {
    @Autowired
    private UserService userService;

    @Priv(login = true)
    @PostMapping("/{userId}")
    public Object getUserByUserId(@PathVariable("userId") String userId){
        User user=userService.getUserByUserId(userId);
        return ResultData.success(user);
    }
}
