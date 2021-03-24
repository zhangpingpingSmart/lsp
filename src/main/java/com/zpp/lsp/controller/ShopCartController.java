package com.zpp.lsp.controller;

import com.zpp.lsp.common.ResultData;
import com.zpp.lsp.config.login.Priv;
import com.zpp.lsp.pojo.ShopCart;
import com.zpp.lsp.service.ShopCartService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: 张平平
 * @Date: 2021/3/24 10:48
 */
@RestController
@RequestMapping("/zpp/shopCart")
@Api(tags = "购物车相关接口")
public class ShopCartController {
    @Autowired
    private ShopCartService shopCartService;

    @Priv(login = true)
    @PostMapping("/{cartId}")
    @ApiOperation(value = "根据购物车id获取购物车信息",httpMethod = "POST")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "cartId",value = "购物车id",required = true,paramType = "path",dataType = "String")
    })
    public ResultData getShopCartById(@PathVariable("cartId") String cartId){
        ShopCart shopCart=shopCartService.getShopCartById(cartId);
        return ResultData.success(shopCart);
    }

    @Priv(login = true)
    @PostMapping("/add")
    @ApiOperation(value = "新增购物车")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "shopCart", value = "购物车表单", required = true, dataType = "ShopCart")
    })
    public ResultData addShopCart(@RequestBody ShopCart shopCart){
        shopCartService.saveShopCart(shopCart);
        return ResultData.success("新增成功");
    }

    @Priv(login = true)
    @PutMapping("/update")
    @ApiOperation(value = "修改购物车")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "shopCart", value = "购物车表单", required = true, dataType = "ShopCart")
    })
    public ResultData updateShopCartById(@RequestBody ShopCart shopCart){
        shopCartService.updateShopCartById(shopCart);
        return ResultData.success("编辑成功");
    }
    @Priv(login = true)
    @DeleteMapping("/del/{cartId}")
    @ApiOperation(value = "根据id删除购物车")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "cartId",value = "购物车id",required = true,paramType = "path",dataType = "String")
    })
    public ResultData deleteShopCartById(@PathVariable("cartId")String cartId){
        shopCartService.deleteShopCartById(cartId);
        return ResultData.success("删除成功");
    }
}
