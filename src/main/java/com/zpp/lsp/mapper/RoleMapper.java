package com.zpp.lsp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zpp.lsp.pojo.Role;
import com.zpp.lsp.pojo.Store;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @Author: 张平平
 * @Date: 2021/3/17 18:06
 */
public interface RoleMapper extends BaseMapper<Role> {

    List<Role> getRolesByStoreId(String storeId);

    Store getStoreByStoreNameAndPassword(String store);

    Role getRoleById(String roleId);
}
