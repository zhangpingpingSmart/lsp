package com.zpp.lsp.controller;

import com.zpp.lsp.common.ResultData;
import com.zpp.lsp.config.login.Priv;
import com.zpp.lsp.pojo.Role;
import com.zpp.lsp.pojo.Store;
import com.zpp.lsp.service.RoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/zpp/role")
@Api(tags = "权限相关接口")
public class RoleController {

    @Autowired
    private RoleService roleService;

    //用户-会员  商家-角色

    /**
     * 根据商家查角色
     * @param storeId
     * @return
     */
    @Priv(login = true)
    @PostMapping("/storeRoles/{storeId}")
    @ApiOperation(value = "根据商户id获取角色")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "storeId",value = "商户id",required = true,paramType = "path",dataType = "String")
    })
    public ResultData getRolesByStoreId(@PathVariable("storeId")String storeId){
        List<Role> roles = roleService.getRolesByStoreId(storeId);
        return ResultData.success(roles);
    }



}
