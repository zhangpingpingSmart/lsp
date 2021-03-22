package com.zpp.lsp.service;

import com.zpp.lsp.pojo.GoodsFormat;

/**
 * @Author: 张平平
 * @Date: 2021/3/22 17:56
 */
public interface GoodsFormatService {
    GoodsFormat getGoodsByGoodsFormatId(String goodsFormatId);

    void saveGoodsFormat(GoodsFormat goodsFormat);

    void updateGoodsFormatById(GoodsFormat goodsFormat);

    void deleteGoodsFormatById(String goodsFormatId);
}
