package com.zpp.lsp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zpp.lsp.pojo.Store;

import java.util.List;

/**
 * @Author: 张平平
 * @Date: 2021/3/17 18:11
 */
public interface StoreMapper extends BaseMapper<Store> {
    List<Store> getStoresByRoleId(String roleId);
}