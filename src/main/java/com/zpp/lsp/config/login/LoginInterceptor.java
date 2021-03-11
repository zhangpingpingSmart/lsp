package com.zpp.lsp.config.login;

import com.alibaba.fastjson.JSONObject;
import com.zpp.lsp.common.ResultData;
import com.zpp.lsp.config.redis.RedisKeyConfig;
import com.zpp.lsp.config.system.SystemConfig;
import com.zpp.lsp.pojo.User;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.concurrent.TimeUnit;

/**
 * @Author: 张平平
 * @Date: 2021/3/10 14:52
 */
@Component
public class LoginInterceptor implements HandlerInterceptor {

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        response.setCharacterEncoding("UTF-8");
        //1.判断是否存在注解
        if (!(handler instanceof HandlerMethod)) {
            return true;
        }
        HandlerMethod method = (HandlerMethod) handler;
        boolean hasLoginAnnotation = method.getMethod().isAnnotationPresent(Priv.class);
        if (!hasLoginAnnotation) {
            //不存在Priv注解，则直接通过
            return true;
        }
        Priv Priv = method.getMethod().getAnnotation(Priv.class);
        //2.required=false,则无需检查是否登录
        if (!Priv.login()) {
            return true;
        }
        String token = null;
        try {
            token = request.getHeader(SystemConfig.TOKEN_HEADER);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        JSONObject jo=new JSONObject();
        jo.put("code",0);
        if (StringUtils.isNotBlank(token)) {
            //获取redis中token的key
            String key = RedisKeyConfig.LOGIN_TOKEN + token;
            //获取redis中token的key储存的value
            String user = redisTemplate.boundValueOps(key).get();

            if (user != null) {
                //请求进来就刷新一次token的有效期
                redisTemplate.expire(key,RedisKeyConfig.LOGIN_TIME , TimeUnit.MILLISECONDS);
                return true;
            } else {
                jo.put("message","登录有效期已过，请重新登陆");
                response.getWriter().print(jo);
                return false;
            }
        } else {
            jo.put("message","您还没有登录，请登陆");
            response.getWriter().print(jo);
            return false;
        }
    }
}