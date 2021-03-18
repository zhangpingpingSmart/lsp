package com.zpp.lsp.controller;

import com.zpp.lsp.common.ResultData;
import com.zpp.lsp.config.login.Priv;
import com.zpp.lsp.pojo.Menu;
import com.zpp.lsp.pojo.Store;
import com.zpp.lsp.service.MenuService;
import com.zpp.lsp.service.StoreService;
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
 * @Date: 2021/3/18 13:40
 */
@RestController
@RequestMapping("/zpp/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @Priv(login = true)
    @PostMapping("/storeMenus/{storeId}")
    @ApiOperation(value = "根据商户id获取菜单信息",httpMethod = "POST")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "storeId",value = "商户id",required = true,paramType = "path",dataType = "String")
    })
    public Object getUserByUserId(@PathVariable("storeId") String storeId){
        List<Menu> menus=menuService.getMenusByStoreId(storeId);
        return ResultData.success(menus);
    }
}
