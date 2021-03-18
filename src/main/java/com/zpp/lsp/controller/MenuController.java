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
import org.springframework.web.bind.annotation.*;

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
    @ApiOperation(value = "根据商户id获取菜单信息")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "storeId",value = "商户id",required = true,paramType = "path",dataType = "String")
    })
    public ResultData getUserByUserId(@PathVariable("storeId") String storeId){
        List<Menu> menus=menuService.getMenusByStoreId(storeId);
        return ResultData.success(menus);
    }

    @Priv(login = true)
    @PostMapping("/add")
    @ApiOperation(value = "新增商家")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "menu", value = "菜单表单", required = true, dataType = "Menu")
    })
    public ResultData addMenu(@RequestBody Menu menu){
        menuService.saveMenu(menu);
        return ResultData.success("新增成功");
    }

    @Priv(login = true)
    @PutMapping("/update")
    @ApiOperation(value = "新增商家")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "menu", value = "菜单表单", required = true, dataType = "Menu")
    })
    public ResultData updateMenuById(@RequestBody Menu menu){
        menuService.updateMenuById(menu);
        return ResultData.success("编辑成功");
    }
    @Priv(login = true)
    @DeleteMapping("/del/{menuId}")
    @ApiOperation(value = "根据id删除菜单")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "menuId",value = "菜单id",required = true,paramType = "path",dataType = "String")
    })
   public ResultData deleteMenuById(@PathVariable("menuId")String menuId){
        menuService.deleteMenuById(menuId);
       return ResultData.success("删除成功");
   }

}
