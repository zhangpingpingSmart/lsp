package com.zpp.lsp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zpp.lsp.pojo.Goods;

/**
 * @Author: 张平平
 * @Date: 2021/3/22 16:13
 */
public interface GoodsMapper extends BaseMapper<Goods> {

    Goods getGoodsByGoodsId(String goodsId);

    void deleteGoodsById(String goodsId);
}
