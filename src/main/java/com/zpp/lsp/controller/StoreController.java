package com.zpp.lsp.controller;

import com.zpp.lsp.common.ResultData;
import com.zpp.lsp.config.login.Priv;
import com.zpp.lsp.pojo.Store;
import com.zpp.lsp.pojo.User;
import com.zpp.lsp.service.StoreService;
import com.zpp.lsp.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: 张平平
 * @Date: 2021/3/18 9:31
 */
@RestController
@RequestMapping("/zpp/store")
public class StoreController {

    @Autowired
    private StoreService storeService;

    @Priv(login = true)
    @PostMapping("/{storeId}")
    @ApiOperation(value = "根据商户id获取商户信息",httpMethod = "POST")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "storeId",value = "商户id",required = true,paramType = "path",dataType = "String")
    })
    public ResultData getStoreById(@PathVariable("storeId") String storeId){
        Store store=storeService.getStoreById(storeId);
        return ResultData.success(store);
    }

    /**
     * 根据角色查询商家
     * @param roleId
     * @return
     */
    @Priv(login = true)
    @PostMapping("/roleStores/{roleId}")
    @ApiOperation(value = "根据角色id获取商户信息",httpMethod = "POST")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "roleId",value = "角色id",required = true,paramType = "path",dataType = "String")
    })
    public ResultData getStoresByRoleId(@PathVariable("roleId")String roleId){
        List<Store> stores = storeService.getStoresByRoleId(roleId);
        return ResultData.success(stores);
    }

    @Priv(login = true)
    @PostMapping("/add")
    @ApiOperation(value = "新增商家")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "role", value = "商家表单", required = true, dataType = "Role")
    })
    public ResultData saveStore(@RequestBody Store store){
        storeService.saveStore(store);
        return ResultData.success("新增成功");
    }

    @Priv(login = true)
    @PutMapping("/update")
    @ApiOperation(value = "修改菜单")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "role", value = "菜单表单", required = true, dataType = "Role")
    })
    public ResultData updateStoreById(@RequestBody Store store){
        storeService.updateStoreById(store);
        return ResultData.success("编辑成功");
    }
    @Priv(login = true)
    @DeleteMapping("/del/{storeId}")
    @ApiOperation(value = "根据id删除商家")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "storeId",value = "菜单id",required = true,paramType = "path",dataType = "String")
    })
    public ResultData deleteStoreById(@PathVariable("storeId")String storeId){
        storeService.deleteStoreById(storeId);
        return ResultData.success("删除成功");
    }

}
