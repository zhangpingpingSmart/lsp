package com.zpp.lsp.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("zpp_role")
public class Role {

    private Long roleId;

    private Long parentRoleId;

    private String roleName;

    private Date createTime;

    private String description;

}
