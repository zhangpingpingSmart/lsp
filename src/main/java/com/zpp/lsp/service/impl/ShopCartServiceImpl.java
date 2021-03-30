package com.zpp.lsp.service.impl;

import com.zpp.lsp.mapper.ShopCartMapper;
import com.zpp.lsp.pojo.ShopCart;
import com.zpp.lsp.service.ShopCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 张平平
 * @Date: 2021/3/24 11:13
 */
@Service
public class ShopCartServiceImpl implements ShopCartService {

    @Autowired
    private ShopCartMapper shopCartMapper;

    @Override
    public ShopCart getShopCartById(String cartId) {
        return shopCartMapper.selectById(cartId);
    }

    @Override
    public void saveShopCart(ShopCart shopCart) {
        shopCartMapper.insert(shopCart);
    }

    @Override
    public void updateShopCartById(ShopCart shopCart) {
        shopCartMapper.updateById(shopCart);
    }

    @Override
    public void deleteShopCartById(String cartId) {
        shopCartMapper.deleteById(cartId);
    }

    @Override
    public List<ShopCart> getListByUserId(String userId) {
        return shopCartMapper.getListByUserId(userId);
    }
}
