package com.zpp.lsp.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Author: 张平平
 * @Date: 2021/3/10 11:37
 */
@Data
@TableName("zpp_user")
@ApiModel("用户表单")
public class User {
    @ApiModelProperty(value = "用户id",name = "userId",required = true)
    private Long userId;

    @ApiModelProperty(value = "用户名",name = "userName",required = true)
    private String userName;

    @ApiModelProperty(value = "密码",name = "password",required = true)
    private String password;

    @ApiModelProperty(value = "真实姓名",name = "fullName",required = true)
    private String fullName;

    @ApiModelProperty(value = "手机号",name = "mobile",required = true)
    private String mobile;

    @ApiModelProperty(value = "邮箱",name = "email",required = true)
    private String email;

    @ApiModelProperty(value = "创建时间",name = "createTime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @ApiModelProperty(value = "登录时间",name = "loginTime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date loginTime;

    @ApiModelProperty(value = "最后一次登录时间",name = "lastLoginTime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastLoginTime;

    @ApiModelProperty(value = "登录次数",name = "loginCount")
    private Long loginCount;

    private String salt;
}
