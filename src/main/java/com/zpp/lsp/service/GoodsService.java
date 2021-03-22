package com.zpp.lsp.service;

import com.zpp.lsp.pojo.Goods;

/**
 * @Author: 张平平
 * @Date: 2021/3/22 17:56
 */
public interface GoodsService {
    Goods getGoodsByGoodsId(String goodsId);

    void saveGoods(Goods goods);

    void updateGoodsById(Goods goods);

    void deleteGoodsById(String goodsId);
}
