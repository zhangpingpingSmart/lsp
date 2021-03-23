package com.zpp.lsp.controller;

import com.zpp.lsp.common.ResultData;
import com.zpp.lsp.config.login.Priv;
import com.zpp.lsp.pojo.GoodsUnit;
import com.zpp.lsp.service.GoodsUnitService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: 张平平
 * @Date: 2021/3/22 17:51
 */
@RestController
@RequestMapping("/zpp/goodsUnit")
@Api(tags = "商品单位相关接口")
public class GoodsUnitController {

    @Autowired
    private GoodsUnitService goodsUnitService;

    @Priv(login = true)
    @PostMapping("/{goodsUnitId}")
    @ApiOperation(value = "根据商品单位id获取商品单位信息",httpMethod = "POST")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "goodsUnitId",value = "商品单位id",required = true,paramType = "path",dataType = "String")
    })
    public ResultData getGoodsUnitById(@PathVariable("goodsUnitId") String goodsUnitId){
        GoodsUnit goodsUnit=goodsUnitService.getGoodsUnitById(goodsUnitId);
        return ResultData.success(goodsUnit);
    }

    @Priv(login = true)
    @PostMapping("/add")
    @ApiOperation(value = "新增商品单位")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "goods", value = "商品单位表单", required = true, dataType = "Goods")
    })
    public ResultData addGoodsUnit(@RequestBody GoodsUnit goodsUnit){
        goodsUnitService.saveGoodsUnit(goodsUnit);
        return ResultData.success("新增成功");
    }

    @Priv(login = true)
    @PutMapping("/update")
    @ApiOperation(value = "修改商品单位")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "goods", value = "商品单位表单", required = true, dataType = "Goods")
    })
    public ResultData updateGoodsUnitById(@RequestBody GoodsUnit goodsUnit){
        goodsUnitService.updateGoodsUnitById(goodsUnit);
        return ResultData.success("编辑成功");
    }
    @Priv(login = true)
    @DeleteMapping("/del/{goodsUnitId}")
    @ApiOperation(value = "根据id删除商品单位")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "goodsUnitId",value = "商品单位id",required = true,paramType = "path",dataType = "String")
    })
    public ResultData deleteGoodsUnitById(@PathVariable("goodsUnitId")String goodsUnitId){
        goodsUnitService.deleteGoodsUnitById(goodsUnitId);
        return ResultData.success("删除成功");
    }
}
