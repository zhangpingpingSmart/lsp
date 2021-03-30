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

import java.util.List;

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
    @DeleteMapping("/list")
    @ApiOperation(value = "用户列表")
    public ResultData getUserList(){
        List<User> list=userService.getUserList();
        return ResultData.success(list);
    }

    @Priv(login = true)
    @PostMapping("/{userId}")
    @ApiOperation(value = "根据用户id获取用户信息",httpMethod = "POST")
    @ApiImplicitParams(value = {
        @ApiImplicitParam(name = "userId",value = "用户id",required = true,paramType = "path",dataType = "String")
    })
    public ResultData getUserByUserId(@PathVariable("userId") String userId){
        User user=userService.getUserByUserId(userId);
        return ResultData.success(user);
    }

    @Priv(login = true)
    @PostMapping("/add")
    @ApiOperation(value = "新增用户")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "user", value = "用户表单", required = true, dataType = "User")
    })
    public ResultData addUser(@RequestBody User user){
        userService.saveUser(user);
        return ResultData.success("新增成功");
    }

    @Priv(login = true)
    @PutMapping("/update")
    @ApiOperation(value = "修改用户")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "user", value = "用户表单", required = true, dataType = "User")
    })
    public ResultData updateUserById(@RequestBody User user){
        userService.updateUserById(user);
        return ResultData.success("编辑成功");
    }
    @Priv(login = true)
    @DeleteMapping("/del/{userId}")
    @ApiOperation(value = "根据id删除用户")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "userId",value = "用户id",required = true,paramType = "path",dataType = "String")
    })
    public ResultData deleteUserById(@PathVariable("userId")String userId){
        userService.deleteUserById(userId);
        return ResultData.success("删除成功");
    }

}
