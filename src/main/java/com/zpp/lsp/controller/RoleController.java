package com.zpp.lsp.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/zpp/role")
@Api(tags = "权限相关接口")
public class RoleController {

    //用户-会员  商家-角色
    //根据角色查询商家
    //根据商家查角色

}
