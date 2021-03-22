package com.zpp.lsp.service;

import com.zpp.lsp.pojo.GoodsUnit;

/**
 * @Author: 张平平
 * @Date: 2021/3/22 17:56
 */
public interface GoodsUnitService {
    GoodsUnit getGoodsUnitById(String goodsUnitId);

    void saveGoodsUnit(GoodsUnit goodsUnit);

    void updateGoodsUnitById(GoodsUnit goodsUnit);

    void deleteGoodsUnitById(String goodsUnitId);
}
