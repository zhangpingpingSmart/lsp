package com.zpp.lsp.service;

import com.zpp.lsp.pojo.GoodsPicture;

/**
 * @Author: 张平平
 * @Date: 2021/3/22 17:56
 */
public interface GoodsPictureService {
    GoodsPicture getGoodsPictureById(String goodsPictureId);

    void saveGoodsPicture(GoodsPicture goodsPicture);

    void updateGoodsPictureById(GoodsPicture goodsPicture);

    void deleteGoodsPictureById(String goodsPictureId);
}
