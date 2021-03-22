package com.zpp.lsp.service.impl;

import com.zpp.lsp.mapper.GoodsUnitMapper;
import com.zpp.lsp.pojo.GoodsUnit;
import com.zpp.lsp.service.GoodsUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: 张平平
 * @Date: 2021/3/22 18:59
 */
@Service
public class GoodsUnitServiceImpl implements GoodsUnitService {

    @Autowired
    private GoodsUnitMapper goodsUnitMapper;
    @Override
    public GoodsUnit getGoodsUnitById(String goodsUnitId) {
        return goodsUnitMapper.getGoodsUnitById(goodsUnitId);
    }

    @Override
    public void saveGoodsUnit(GoodsUnit goodsUnit) {
        goodsUnitMapper.insert(goodsUnit);
    }

    @Override
    public void updateGoodsUnitById(GoodsUnit goodsUnit) {
        goodsUnitMapper.updateById(goodsUnit);
    }

    @Override
    public void deleteGoodsUnitById(String goodsUnitId) {
        goodsUnitMapper.deleteById(goodsUnitId);
    }
}
