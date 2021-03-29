package com.zpp.lsp.service;

import com.zpp.lsp.pojo.OrderInfo;
import com.zpp.lsp.pojo.make.Order;

import java.util.List;

/**
 * @Author: 张平平
 * @Date: 2021/3/29 10:47
 */
public interface OrderService {

    List<Order> getOrderList(OrderInfo orderInfo);

    Order getOrderById(String orderId);

    void deleteOrderById(String orderId);
}
