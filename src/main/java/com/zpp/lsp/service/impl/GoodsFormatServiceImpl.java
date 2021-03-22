package com.zpp.lsp.service.impl;

import com.zpp.lsp.mapper.GoodsFormatMpper;
import com.zpp.lsp.pojo.GoodsFormat;
import com.zpp.lsp.service.GoodsFormatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: 张平平
 * @Date: 2021/3/22 18:43
 */
@Service
public class GoodsFormatServiceImpl implements GoodsFormatService {

    @Autowired
    private GoodsFormatMpper goodsFormatMpper;

    @Override
    public GoodsFormat getGoodsByGoodsFormatId(String goodsFormatId) {
        return goodsFormatMpper.getGoodsByGoodsFormatId(goodsFormatId);
    }

    @Override
    public void saveGoodsFormat(GoodsFormat goodsFormat) {
        goodsFormatMpper.insert(goodsFormat);
    }

    @Override
    public void updateGoodsFormatById(GoodsFormat goodsFormat) {
        goodsFormatMpper.updateById(goodsFormat);
    }

    @Override
    public void deleteGoodsFormatById(String goodsFormatId) {
        goodsFormatMpper.deleteGoodsFormatById(goodsFormatId);
    }
}
