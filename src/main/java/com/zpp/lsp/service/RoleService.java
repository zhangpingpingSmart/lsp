package com.zpp.lsp.service;

import com.zpp.lsp.pojo.Role;
import com.zpp.lsp.pojo.Store;

import java.util.List;

/**
 * @Author: 张平平
 * @Date: 2021/3/17 13:40
 */
public interface RoleService {
    /**
     * 根据商家查角色
     * @param storeId
     * @return
     */
    List<Role> getRolesByStoreId(String storeId);
    /**
     * 根据角色查询商家
     * @param roleId
     * @return
     */
    List<Store> getStoresByRoleId(String roleId);
}
