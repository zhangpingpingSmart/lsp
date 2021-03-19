package com.zpp.lsp.service;

import com.zpp.lsp.pojo.Store;

import java.util.List;

/**
 * @Author: 张平平
 * @Date: 2021/3/18 9:32
 */
public interface StoreService {
    Store getStoreById(String storeId);
    Store getStoreByStoreNameAndPassword(Store store);
    /**
     * 根据角色查询商家
     * @param roleId
     * @return
     */
    List<Store> getStoresByRoleId(String roleId);

    void saveStore(Store store);

    void updateStoreById(Store store);

    void deleteStoreById(String storeId);
}
