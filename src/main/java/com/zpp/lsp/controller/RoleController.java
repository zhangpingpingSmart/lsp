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

    @Priv(login = true)
    @DeleteMapping("/list")
    @ApiOperation(value = "角色列表")
    public ResultData getRoleList(){
        List<Role> list=roleService.getRoleList();
        return ResultData.success(list);
    }

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

    @Priv(login = true)
    @PostMapping("/{roleId}")
    @ApiOperation(value = "根据id查询菜单")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "roleId",value = "角色id",required = true,paramType = "path",dataType = "String")
    })
    public ResultData getRoleById(@PathVariable("roleId")String roleId){
        Role Role=roleService.getRoleById(roleId);
        return ResultData.success(Role);
    }

    @Priv(login = true)
    @PostMapping("/add")
    @ApiOperation(value = "新增菜单")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "role", value = "角色表单", required = true, dataType = "Role")
    })
    public ResultData addRole(@RequestBody Role role){
        roleService.saveRole(role);
        return ResultData.success("新增成功");
    }

    @Priv(login = true)
    @PutMapping("/update")
    @ApiOperation(value = "修改菜单")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "role", value = "菜单表单", required = true, dataType = "Role")
    })
    public ResultData updateRoleById(@RequestBody Role role){
        roleService.updateRoleById(role);
        return ResultData.success("编辑成功");
    }
    @Priv(login = true)
    @DeleteMapping("/del/{roleId}")
    @ApiOperation(value = "根据id删除菜单")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "roleId",value = "菜单id",required = true,paramType = "path",dataType = "String")
    })
    public ResultData deleteRoleById(@PathVariable("roleId")String roleId){
        roleService.deleteRoleById(roleId);
        return ResultData.success("删除成功");
    }

}
