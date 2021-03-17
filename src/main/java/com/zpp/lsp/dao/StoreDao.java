package com.zpp.lsp.dao;

import com.zpp.lsp.pojo.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @Author: 张平平
 * @Date: 2021/3/17 14:17
 */
public interface StoreDao extends JpaRepository<Store,Long> {

    /**
     * 根据角色查询商家
     * @param roleId
     * @return
     */
    @Query(nativeQuery = true,
            value = "SELECT " +
                    "zs.store_id storeId,zs.store_name storeName " +
                    "FROM " +
                    "zpp_store zs " +
                    "LEFT JOIN " +
                    "zpp_store_role zsr " +
                    "ON " +
                    "zs.store_id=zsr.store_id " +
                    "WHERE " +
                    "zsr.role_id=:roleId")
    List<Store> getStoresByRoleId(String roleId);
}
