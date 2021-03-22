package com.zpp.lsp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zpp.lsp.pojo.GoodsPicture;

/**
 * @Author: 张平平
 * @Date: 2021/3/22 16:14
 */
public interface GoodsPictureMapper extends BaseMapper<GoodsPicture> {
    GoodsPicture getGoodsPictureById(String goodsPictureId);

    void deleteGoodsPictureById(String goodsPictureId);
}
