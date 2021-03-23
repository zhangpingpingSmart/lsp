package com.zpp.lsp.service.impl;

import com.zpp.lsp.mapper.GoodsMapper;
import com.zpp.lsp.pojo.Goods;
import com.zpp.lsp.pojo.make.GoodsMake;
import com.zpp.lsp.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: 张平平
 * @Date: 2021/3/22 18:26
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public Goods getGoodsByGoodsId(String goodsId) {
        return goodsMapper.getGoodsByGoodsId(goodsId);
    }

    @Override
    public void saveGoods(Goods goods) {
        goodsMapper.insert(goods);
    }

    @Override
    public void updateGoodsById(Goods goods) {
        goodsMapper.updateById(goods);
    }

    @Override
    public void deleteGoodsById(String goodsId) {
        goodsMapper.deleteGoodsById(goodsId);
    }

    @Override
    public List<Map> getGoodsByCategoryId(String categoryId) {

        return goodsMapper.getGoodsByCategoryId(categoryId);
    }

    @Override
    public GoodsMake getGoodsDetailById(String goodsId) {
        return goodsMapper.getGoodsDetailById(goodsId);
    }
}
