package com.zpp.lsp.controller.goods;

import com.zpp.lsp.common.ResultData;
import com.zpp.lsp.config.login.Priv;
import com.zpp.lsp.pojo.Goods;
import com.zpp.lsp.pojo.GoodsFormat;
import com.zpp.lsp.service.GoodsFormatService;
import com.zpp.lsp.service.GoodsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: 张平平
 * @Date: 2021/3/22 17:48
 */
@RestController
@RequestMapping("/zpp/goodsFormat")
@Api(tags = "商品规格规格相关接口")
public class GoodsFormatController {

    @Autowired
    private GoodsFormatService goodsFormatService;

    @Priv(login = true)
    @PostMapping("/{goodsFormatId}")
    @ApiOperation(value = "根据商品规格id获取商品规格信息",httpMethod = "POST")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "goodsFormatId",value = "商品规格id",required = true,paramType = "path",dataType = "String")
    })
    public ResultData getGoodsByGoodsFormatId(@PathVariable("goodsFormatId") String goodsFormatId){
        GoodsFormat goodsFormat=goodsFormatService.getGoodsByGoodsFormatId(goodsFormatId);
        return ResultData.success(goodsFormat);
    }

    @Priv(login = true)
    @PostMapping("/add")
    @ApiOperation(value = "新增商品规格")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "goodsFormat", value = "商品规格表单", required = true, dataType = "GoodsFormat")
    })
    public ResultData addGoods(@RequestBody GoodsFormat goodsFormat){
        goodsFormatService.saveGoodsFormat(goodsFormat);
        return ResultData.success("新增成功");
    }

    @Priv(login = true)
    @PutMapping("/update")
    @ApiOperation(value = "修改商品规格")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "goodsFormat", value = "商品规格表单", required = true, dataType = "GoodsFormat")
    })
    public ResultData updateGoodsFormatById(@RequestBody GoodsFormat goodsFormat){
        goodsFormatService.updateGoodsFormatById(goodsFormat);
        return ResultData.success("编辑成功");
    }
    @Priv(login = true)
    @DeleteMapping("/del/{goodsFormatId}")
    @ApiOperation(value = "根据id删除商品规格")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "goodsFormatId",value = "商品规格id",required = true,paramType = "path",dataType = "String")
    })
    public ResultData deleteGoodsFormatById(@PathVariable("goodsFormatId")String goodsFormatId){
        goodsFormatService.deleteGoodsFormatById(goodsFormatId);
        return ResultData.success("删除成功");
    }
}
