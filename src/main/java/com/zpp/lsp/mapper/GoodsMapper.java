package com.zpp.lsp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zpp.lsp.pojo.Goods;
import com.zpp.lsp.pojo.make.GoodsMake;

import java.util.List;
import java.util.Map;

/**
 * @Author: 张平平
 * @Date: 2021/3/22 16:13
 */
public interface GoodsMapper extends BaseMapper<Goods> {

    Goods getGoodsByGoodsId(String goodsId);

    void deleteGoodsById(String goodsId);

    List<Map> getGoodsByCategoryId(String categoryId);

    GoodsMake getGoodsDetailById(String goodsId);
}
