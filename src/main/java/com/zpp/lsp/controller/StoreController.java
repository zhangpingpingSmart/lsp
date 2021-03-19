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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public ResultData getUserByUserId(@PathVariable("storeId") String storeId){
        Store store=storeService.getUserByUserId(storeId);
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
}
