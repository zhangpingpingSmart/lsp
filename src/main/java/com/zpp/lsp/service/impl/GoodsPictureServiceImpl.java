package com.zpp.lsp.service.impl;

import com.zpp.lsp.mapper.GoodsPictureMapper;
import com.zpp.lsp.pojo.GoodsPicture;
import com.zpp.lsp.service.GoodsPictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: 张平平
 * @Date: 2021/3/22 18:53
 */
@Service
public class GoodsPictureServiceImpl implements GoodsPictureService {

    @Autowired
    private GoodsPictureMapper goodsPictureMapper;

    @Override
    public GoodsPicture getGoodsPictureById(String goodsPictureId) {
        return goodsPictureMapper.getGoodsPictureById(goodsPictureId);
    }

    @Override
    public void saveGoodsPicture(GoodsPicture goodsPicture) {
        goodsPictureMapper.insert(goodsPicture);
    }

    @Override
    public void updateGoodsPictureById(GoodsPicture goodsPicture) {
        goodsPictureMapper.updateById(goodsPicture);
    }

    @Override
    public void deleteGoodsPictureById(String goodsPictureId) {
        goodsPictureMapper.deleteGoodsPictureById(goodsPictureId);
    }
}
