package com.zpp.lsp.mapper;

import com.zpp.lsp.pojo.Menu;

import java.util.List;

/**
 * @Author: 张平平
 * @Date: 2021/3/18 13:44
 */
public interface MenuMapper {
    List<Menu> getMenusByRoleId(Long roleId);
}
