package com.zpp.lsp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zpp.lsp.pojo.ShopCart;

import java.util.List;

/**
 * @Author: 张平平
 * @Date: 2021/3/24 11:14
 */
public interface ShopCartMapper extends BaseMapper<ShopCart> {
    List<ShopCart> getListByUserId(String userId);
}
