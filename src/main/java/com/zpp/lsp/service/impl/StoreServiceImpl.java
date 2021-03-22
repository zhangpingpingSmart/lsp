package com.zpp.lsp.service.impl;

import com.zpp.lsp.mapper.StoreMapper;
import com.zpp.lsp.pojo.Store;
import com.zpp.lsp.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 张平平
 * @Date: 2021/3/18 9:32
 */
@Service
public class StoreServiceImpl implements StoreService {

    @Autowired
    private StoreMapper storeMapper;

    @Override
    public Store getStoreById(String storeId) {
        return storeMapper.getStoreById(storeId);
    }

    @Override
    public Store getStoreByStoreNameAndPassword(Store store) {
        return storeMapper.getStoreByStoreNameAndPassword(store);
    }

    /**
     * 根据角色查询商家
     * @param roleId
     * @return
     */
    @Override
    public List<Store> getStoresByRoleId(String roleId) {
        return storeMapper.getStoresByRoleId(roleId);
    }

    @Override
    public void saveStore(Store store) {
        storeMapper.insert(store);
    }

    @Override
    public void updateStoreById(Store store) {
        storeMapper.updateById(store);
    }

    @Override
    public void deleteStoreById(String storeId) {
        storeMapper.deleteStoreById(storeId);
    }
}
