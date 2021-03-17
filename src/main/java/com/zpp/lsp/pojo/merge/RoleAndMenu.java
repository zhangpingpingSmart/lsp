package com.zpp.lsp.pojo.merge;

import com.zpp.lsp.pojo.Menu;
import com.zpp.lsp.pojo.Role;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @Author: 张平平
 * @Date: 2021/3/17 17:03
 */
@Data
public class RoleAndMenu {
    private Long roleId;

    private Long parentRoleId;

    private String roleName;

    private Date createTime;

    private String description;

    private List<Menu> menus;
}
