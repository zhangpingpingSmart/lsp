package com.zpp.lsp.controller;

import com.zpp.lsp.common.ResultData;
import com.zpp.lsp.pojo.Role;
import com.zpp.lsp.pojo.Store;
import com.zpp.lsp.service.RoleService;
import io.swagger.annotations.Api;
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
    @PostMapping("/storeRoles/{storeId}")
    public ResultData getRolesByStoreId(@PathVariable("storeId")String storeId){
        List<Role> roles = roleService.getRolesByStoreId(storeId);
        return ResultData.success(roles);
    }

    /**
     * 根据角色查询商家
     * @param roleId
     * @return
     */
    @PostMapping("/roleStores/{roleId}")
    public ResultData getStoresByRoleId(@PathVariable("roleId")String roleId){
        List<Store> stores = roleService.getStoresByRoleId(roleId);
        return ResultData.success(stores);
    }


}
