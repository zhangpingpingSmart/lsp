package com.zpp.lsp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zpp.lsp.pojo.Menu;

import java.util.List;

/**
 * @Author: 张平平
 * @Date: 2021/3/18 13:44
 */
public interface MenuMapper extends BaseMapper<Menu> {

    List<Menu> getMenusByRoleId(Long roleId);

    Menu getMenuById(String menuId);

    void deleteMenuById(String menuId);
}
