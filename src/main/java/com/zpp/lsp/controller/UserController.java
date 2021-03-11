package com.zpp.lsp.controller;

import com.zpp.lsp.common.ResultData;
import com.zpp.lsp.config.login.Priv;
import com.zpp.lsp.pojo.User;
import com.zpp.lsp.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: 张平平
 * @Date: 2021/3/10 11:34
 */
@RestController
@RequestMapping("/zpp/user")
@Api(tags = "用户相关接口")
public class UserController {
    @Autowired
    private UserService userService;

    @Priv(login = true)
    @PostMapping("/{userId}")
    @ApiOperation(value = "根据用户id获取用户信息",httpMethod = "POST")
    @ApiImplicitParams(value = {
        @ApiImplicitParam(name = "userId",value = "用户id",required = true,paramType = "path",dataType = "String")
    })
    public Object getUserByUserId(@PathVariable("userId") String userId){
        User user=userService.getUserByUserId(userId);
        return ResultData.success(user);
    }
}
