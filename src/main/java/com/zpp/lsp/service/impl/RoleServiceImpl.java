package com.zpp.lsp.service.impl;

import com.zpp.lsp.dao.RoleDao;
import com.zpp.lsp.dao.StoreDao;
import com.zpp.lsp.pojo.Role;
import com.zpp.lsp.pojo.Store;
import com.zpp.lsp.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 张平平
 * @Date: 2021/3/17 13:40
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleDao roleDao;

    @Autowired
    private StoreDao storeDao;

    /**
     * 根据商家查角色
     * @param storeId
     * @return
     */
    @Override
    public List<Role> getRolesByStoreId(String storeId) {
        return roleDao.getRolesByStoreId(storeId);
    }
    /**
     * 根据角色查询商家
     * @param roleId
     * @return
     */
    @Override
    public List<Store> getStoresByRoleId(String roleId) {
        return storeDao.getStoresByRoleId(roleId);
    }
}
