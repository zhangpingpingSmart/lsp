package com.zpp.lsp.service.impl;

import com.zpp.lsp.mapper.OrderMapper;
import com.zpp.lsp.pojo.OrderInfo;
import com.zpp.lsp.pojo.make.Order;
import com.zpp.lsp.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 张平平
 * @Date: 2021/3/29 11:32
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Order> getOrderList(OrderInfo orderInfo) {
        return orderMapper.getOrderList(orderInfo);
    }
}
