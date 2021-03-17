package com.zpp.lsp.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Role {

    private Long roleId;

    private Long parentRoleId;

    private String roleName;

    private Date createTime;

    private String description;

}
