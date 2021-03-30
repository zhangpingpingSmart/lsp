package com.zpp.lsp.service.impl;

import com.zpp.lsp.mapper.*;
import com.zpp.lsp.pojo.*;
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
    @Autowired
    private GoodsFormatMpper goodsFormatMpper;
    @Autowired
    private GoodsPictureMapper goodsPictureMapper;
    @Autowired
    private ProcessMethodMapper processMethodMapper;
    @Autowired
    private GoodsMethodMapper goodsMethodMapper;

    @Override
    public Goods getGoodsByGoodsId(String goodsId) {
        return goodsMapper.getGoodsByGoodsId(goodsId);
    }

    @Override
    public void saveGoods(GoodsMake goodsMake) {
        Goods goods=new Goods();
        goods.setGoodsName(goodsMake.getGoodsName());
        goods.setCategoryId(goodsMake.getCategoryId());
        goods.setGoodsAs(goodsMake.getGoodsAs());
        goods.setGoodsLabel(goodsMake.getGoodsLabel());
        goods.setGoodsBrand(goodsMake.getGoodsBrand());
        goods.setGoodsDesc(goodsMake.getGoodsDesc());
        goods.setGoodsSeq(goodsMake.getGoodsSeq());
        goods.setGoodsRemark(goodsMake.getGoodsRremark());
        goodsMapper.insert(goods);

        for (GoodsFormat goodsFormat : goodsMake.getGoodsFormatList()) {
            goodsFormat.setGoodsId(goodsMake.getGoodsId());
            goodsFormatMpper.insert(goodsFormat);
        }
        for (GoodsPicture goodsPicture : goodsMake.getGoodsPictureList()) {
            goodsPicture.setGoodsId(goodsMake.getGoodsId());
            goodsPictureMapper.insert(goodsPicture);
        }
        //保存加工方式
        for (ProcessMethod processMethod : goodsMake.getProcessMethodList()) {
            processMethodMapper.insert(processMethod);
            //中间表增删改查
            GoodsMethod goodsMethod=new GoodsMethod();
            goodsMethod.setGoodsId(goodsMake.getGoodsId());
            goodsMethod.setMethodId(processMethod.getMethodId());
            goodsMethodMapper.insert(goodsMethod);
        }

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

    @Override
    public List<Goods> getGoodsList(String storeId) {
        return goodsMapper.getGoodsList(storeId);
    }
}
