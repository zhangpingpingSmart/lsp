package com.zpp.lsp.controller;

import com.alibaba.fastjson.JSONObject;
import com.zpp.lsp.common.ResultData;
import com.zpp.lsp.config.redis.RedisKeyConfig;
import com.zpp.lsp.pojo.User;
import com.zpp.lsp.service.LoginService;
import com.zpp.lsp.service.UserService;
import com.zpp.lsp.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @Author: 张平平
 * @Date: 2021/3/10 17:30
 */
@RestController
@RequestMapping("/zpp/login")
public class LoginController {

    @Autowired
    private UserService userService;
    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    /**
     * 用户登录
     * @param user
     * @return
     */
    @PostMapping("/user")
    public ResultData userLogin(@RequestBody User user){
        user.setPassword(MD5Util.MD5(user.getPassword()));
        User u = userService.getUserByUserNameAndPassword(user);
        if (u!=null){
            //token生成规则：LOGIN_TOKEN+用户名 +密码+盐（md5加密）+时间戳
            String token= MD5Util.MD5(u.getUserName()+u.getPassword()+u.getSalt()+System.currentTimeMillis());
            redisTemplate.boundValueOps(RedisKeyConfig.LOGIN_TOKEN+token).set(JSONObject.toJSON(u).toString());
            redisTemplate.expire(RedisKeyConfig.LOGIN_TOKEN+token,1800, TimeUnit.SECONDS);
            JSONObject jo =new JSONObject();
            jo.put("token",token);
            jo.put("user",user);
            return ResultData.success("登录成功！", jo);
        }
        return ResultData.failure("用户名或密码错误！");
    }

}
