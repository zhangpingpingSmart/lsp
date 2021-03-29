package com.zpp.lsp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zpp.lsp.pojo.OrderInfo;
import com.zpp.lsp.pojo.make.Order;

import java.util.List;

/**
 * @Author: 张平平
 * @Date: 2021/3/29 10:47
 */
public interface OrderMapper extends BaseMapper<OrderInfo> {
    List<Order> getOrderList(String userId);
}
