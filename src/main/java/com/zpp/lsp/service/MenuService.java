package com.zpp.lsp.service;

import com.zpp.lsp.pojo.Menu;

import java.util.List;

/**
 * @Author: 张平平
 * @Date: 2021/3/18 13:43
 */
public interface MenuService {

    List<Menu> getMenusByStoreId(String storeId);
    Menu getMenuById(String menuId);
    void saveMenu(Menu menu);
    void updateMenuById(Menu menu);
    void deleteMenuById(String menuId);
}
