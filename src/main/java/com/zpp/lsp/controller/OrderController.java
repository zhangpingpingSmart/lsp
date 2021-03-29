package com.zpp.lsp.controller;

import com.zpp.lsp.common.ResultData;
import com.zpp.lsp.config.login.Priv;
import com.zpp.lsp.pojo.OrderInfo;
import com.zpp.lsp.pojo.make.Order;
import com.zpp.lsp.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/list")
    @ApiOperation(value = "获取订单列表")
    public ResultData getOrderList(@RequestBody OrderInfo orderInfo){
        List<Order> list=orderService.getOrderList(orderInfo);
        return ResultData.success(list);
    }

    @Priv(login = true)
    @PostMapping("/{orderId}")
    @ApiOperation(value = "根据订单id获取订单信息",httpMethod = "POST")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "orderId",value = "订单id",required = true,paramType = "path",dataType = "String")
    })
    public ResultData getOrderById(@PathVariable("orderId") String orderId){
        Order goods=orderService.getOrderById(orderId);
        return ResultData.success(goods);
    }

    @Priv(login = true)
    @DeleteMapping("/del/{orderId}")
    @ApiOperation(value = "根据id删除订单")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "orderId",value = "订单id",required = true,paramType = "path",dataType = "String")
    })
    public ResultData deleteOrderById(@PathVariable("orderId")String orderId){
        orderService.deleteOrderById(orderId);
        return ResultData.success("删除成功");
    }
}
