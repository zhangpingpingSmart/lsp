package com.zpp.lsp.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


@Data
@TableName("zpp_role_menu")
public class RoleMenu {
    private Long rmId;

    private Long roleId;

    private Long menuId;


}
