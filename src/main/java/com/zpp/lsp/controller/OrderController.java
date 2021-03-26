package com.zpp.lsp.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
