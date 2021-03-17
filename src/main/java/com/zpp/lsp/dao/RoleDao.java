package com.zpp.lsp.dao;

import com.zpp.lsp.pojo.Role;
import com.zpp.lsp.pojo.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @Author: 张平平
 * @Date: 2021/3/17 13:43
 */
public interface RoleDao extends JpaRepository<Role,Long> {

    /**
     * sql写法    nativeQuery = true 使用sql
     * 根据商家查角色
     * @param storeId
     * @return
     */
    @Query(nativeQuery = true,
            value = "SELECT " +
                    "zr.role_id roleId,zr.role_name roleName " +
                    "FROM " +
                    "zpp_role zr " +
                    "LEFT JOIN " +
                    "zpp_store_role zsr " +
                    "ON " +
                    "zr.role_id=zsr.role_id " +
                    "WHERE " +
                    "zsr.store_id=:storeId")
    List<Role> getRolesByStoreId(@Param("storeId") String storeId);

}
