package com.zpp.lsp.service.impl;

import com.zpp.lsp.mapper.RoleMapper;
import com.zpp.lsp.mapper.StoreMapper;
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
    private RoleMapper roleMapper;

    /**
     * 根据商家查角色
     * @param storeId
     * @return
     */
    @Override
    public List<Role> getRolesByStoreId(String storeId) {
        return roleMapper.getRolesByStoreId(storeId);
    }

    @Override
    public Role getRoleById(String roleId) {
        return roleMapper.getRoleById(roleId);
    }

    @Override
    public void saveRole(Role role) {
        roleMapper.insert(role);
    }

    @Override
    public void updateRoleById(Role role) {
        roleMapper.updateById(role);
    }

    @Override
    public void deleteRoleById(String roleId) {
        roleMapper.deleteRoleById(roleId);
    }

}
