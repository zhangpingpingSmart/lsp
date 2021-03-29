package com.zpp.lsp.controller;

import com.zpp.lsp.common.ResultData;
import com.zpp.lsp.config.login.Priv;
import com.zpp.lsp.pojo.make.Order;
import com.zpp.lsp.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: 张平平
 * @Date: 2021/3/26 16:59
 */
@RestController
@RequestMapping("/zpp/order")
@Api(tags = "订单相关接口")
public class OrderController {
    /*
    * 1.查询订单列表
    * 2.根据订单号查询订单
    * 3.取消订单
    * 4.删除订单
    * */

    @Autowired
    private OrderService orderService;

    @Priv(login = true)
    @GetMapping("/listBy/{userId}")
    @ApiOperation(value = "获取订单列表")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "userId",value = "用户",required = true,paramType = "path",dataType = "String")
    })
    public ResultData getOrderList(@PathVariable("userId")String userId){
        List<Order> list=orderService.getOrderList(userId);
        return ResultData.success(list);
    }

}
