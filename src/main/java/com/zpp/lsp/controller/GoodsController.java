package com.zpp.lsp.controller;

import com.zpp.lsp.common.ResultData;
import com.zpp.lsp.config.login.Priv;
import com.zpp.lsp.pojo.Goods;
import com.zpp.lsp.pojo.make.GoodsMake;
import com.zpp.lsp.service.GoodsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @Author: 张平平
 * @Date: 2021/3/22 17:47
 */
@RestController
@RequestMapping("/zpp/goods")
@Api(tags = "商品相关接口")
public class GoodsController {
    
    @Autowired
    private GoodsService goodsService;

    @Priv(login = true)
    @PostMapping("/{goodsId}")
    @ApiOperation(value = "根据商品id获取商品信息",httpMethod = "POST")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "goodsId",value = "商品id",required = true,paramType = "path",dataType = "String")
    })
    public ResultData getGoodsByGoodsId(@PathVariable("goodsId") String goodsId){
        Goods goods=goodsService.getGoodsByGoodsId(goodsId);
        return ResultData.success(goods);
    }

    @Priv(login = true)
    @PostMapping("/add")
    @ApiOperation(value = "新增商品")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "goods", value = "商品表单", required = true, dataType = "Goods")
    })
    public ResultData addGoods(@RequestBody Goods goods){
        goodsService.saveGoods(goods);
        return ResultData.success("新增成功");
    }

    @Priv(login = true)
    @PutMapping("/update")
    @ApiOperation(value = "修改商品")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "goods", value = "商品表单", required = true, dataType = "Goods")
    })
    public ResultData updateGoodsById(@RequestBody Goods goods){
        goodsService.updateGoodsById(goods);
        return ResultData.success("编辑成功");
    }
    @Priv(login = true)
    @DeleteMapping("/del/{goodsId}")
    @ApiOperation(value = "根据id删除商品")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "goodsId",value = "商品id",required = true,paramType = "path",dataType = "String")
    })
    public ResultData deleteGoodsById(@PathVariable("goodsId")String goodsId){
        goodsService.deleteGoodsById(goodsId);
        return ResultData.success("删除成功");
    }

    @Priv(login = true)
    @PostMapping("/byCategory/{categoryId}")
    @ApiOperation(value = "根据分类id获取商品列表")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "categoryId",value = "分类id",required = true,paramType = "path",dataType = "String")
    })
    public ResultData getGoodsByCategoryId(@PathVariable("categoryId")String categoryId){
        List<Map> goods=goodsService.getGoodsByCategoryId(categoryId);
        return ResultData.success(goods);
    }

    @Priv(login = true)
    @PostMapping("/goodsDetail/{goodsId}")
    @ApiOperation(value = "根据商品id获取商品详情")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "goodsId",value = "商品id",required = true,paramType = "path",dataType = "String")
    })
    public ResultData getGoodsDetailById(String goodsId) {
        GoodsMake goodsMake = goodsService.getGoodsDetailById(goodsId);
        return ResultData.success(goodsMake);
    }
}
