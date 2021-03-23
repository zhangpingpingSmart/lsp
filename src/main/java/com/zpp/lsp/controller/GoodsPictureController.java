package com.zpp.lsp.controller;

import com.zpp.lsp.common.ResultData;
import com.zpp.lsp.config.login.Priv;
import com.zpp.lsp.pojo.GoodsPicture;
import com.zpp.lsp.service.GoodsPictureService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: 张平平
 * @Date: 2021/3/22 17:49
 */
@RestController
@RequestMapping("/zpp/goodsPicture")
@Api(tags = "商品图片相关接口")
public class GoodsPictureController {
    @Autowired
    private GoodsPictureService goodsPictureService;

    @Priv(login = true)
    @PostMapping("/{goodsPictureId}")
    @ApiOperation(value = "根据商品图片id获取商品图片信息",httpMethod = "POST")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "goodsPictureId",value = "商品图片id",required = true,paramType = "path",dataType = "String")
    })
    public ResultData getGoodsPictureById(@PathVariable("goodsPictureId") String goodsPictureId){
        GoodsPicture goodsPicture=goodsPictureService.getGoodsPictureById(goodsPictureId);
        return ResultData.success(goodsPicture);
    }

    @Priv(login = true)
    @PostMapping("/add")
    @ApiOperation(value = "新增商品图片")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "goods", value = "商品图片表单", required = true, dataType = "Goods")
    })
    public ResultData addGoodsPicture(@RequestBody GoodsPicture goodsPicture){
        goodsPictureService.saveGoodsPicture(goodsPicture);
        return ResultData.success("新增成功");
    }

    @Priv(login = true)
    @PutMapping("/update")
    @ApiOperation(value = "修改商品图片")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "goods", value = "商品图片表单", required = true, dataType = "Goods")
    })
    public ResultData updateGoodsPictureById(@RequestBody GoodsPicture goodsPicture){
        goodsPictureService.updateGoodsPictureById(goodsPicture);
        return ResultData.success("编辑成功");
    }
    @Priv(login = true)
    @DeleteMapping("/del/{goodsPictureId}")
    @ApiOperation(value = "根据id删除商品图片")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "goodsPictureId",value = "商品图片id",required = true,paramType = "path",dataType = "String")
    })
    public ResultData deleteGoodsPictureById(@PathVariable("goodsPictureId")String goodsPictureId){
        goodsPictureService.deleteGoodsPictureById(goodsPictureId);
        return ResultData.success("删除成功");
    }
}
