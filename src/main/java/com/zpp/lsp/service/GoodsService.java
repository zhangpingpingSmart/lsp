package com.zpp.lsp.service;

import com.zpp.lsp.pojo.Goods;
import com.zpp.lsp.pojo.make.GoodsMake;

import java.util.List;
import java.util.Map;

/**
 * @Author: 张平平
 * @Date: 2021/3/22 17:56
 */
public interface GoodsService {
    Goods getGoodsByGoodsId(String goodsId);

    void saveGoods(GoodsMake goodsMake);

    void updateGoodsById(Goods goods);

    void deleteGoodsById(String goodsId);

    List<Map> getGoodsByCategoryId(String categoryId);

    GoodsMake getGoodsDetailById(String goodsId);

    List<Goods> getGoodsList(String storeId);
}
