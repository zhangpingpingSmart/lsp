package com.zpp.lsp.service.impl;

import com.zpp.lsp.mapper.StoreMapper;
import com.zpp.lsp.pojo.Store;
import com.zpp.lsp.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: 张平平
 * @Date: 2021/3/18 9:32
 */
@Service
public class StoreServiceImpl implements StoreService {

    @Autowired
    private StoreMapper storeMapper;

    @Override
    public Store getUserByUserId(String storeId) {
        return storeMapper.selectById(storeId);
    }
}
