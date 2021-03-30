package com.zpp.lsp.service;

import com.zpp.lsp.pojo.ShopCart;

import java.util.List;

/**
 * @Author: 张平平
 * @Date: 2021/3/24 11:08
 */
public interface ShopCartService {
    ShopCart getShopCartById(String cartId);

    void saveShopCart(ShopCart shopCart);

    void updateShopCartById(ShopCart shopCart);

    void deleteShopCartById(String cartId);

    List<ShopCart> getListByUserId(String userId);
}
