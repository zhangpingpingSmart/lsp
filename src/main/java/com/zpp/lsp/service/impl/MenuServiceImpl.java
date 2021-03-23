package com.zpp.lsp.service.impl;

import com.zpp.lsp.mapper.MenuMapper;
import com.zpp.lsp.mapper.RoleMapper;
import com.zpp.lsp.pojo.Menu;
import com.zpp.lsp.pojo.Role;
import com.zpp.lsp.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 张平平
 * @Date: 2021/3/18 13:44
 */
@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuMapper menuMapper;
    @Autowired
    private RoleMapper roleMapper;
    @Override
    public List<Menu> getMenusByStoreId(String storeId) {
        //根据第一个角色查询
        List<Role> roles = roleMapper.getRolesByStoreId(storeId);
        List<Menu> menus = menuMapper.getMenusByRoleId(roles.get(0).getRoleId());
        return buildMenuTree(menus,0L);
    }

    @Override
    public Menu getMenuById(String menuId) {
        return menuMapper.getMenuById(menuId);
    }

    @Override
    public void saveMenu(Menu menu) {
        menuMapper.insert(menu);
    }

    @Override
    public void updateMenuById(Menu menu) {
        menuMapper.updateById(menu);
    }

    @Override
    public void deleteMenuById(String menuId) {
        menuMapper.deleteMenuById(menuId);
    }

    /**
     * 构建菜单树
     *
     * @param menuList
     * @param pid
     * @return
     */
    private List<Menu> buildMenuTree(List<Menu> menuList, Long pid) {
        List<Menu> treeList = new ArrayList<>();
        menuList.forEach(menu -> {
            if (pid.equals(menu.getParentId())) {
                menu.setChildMenus(buildMenuTree(menuList, menu.getMenuId()));
                treeList.add(menu);
            }
        });
        return treeList;
    }
}
