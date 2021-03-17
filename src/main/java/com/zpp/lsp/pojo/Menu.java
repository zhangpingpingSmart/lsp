package com.zpp.lsp.pojo;

import lombok.Data;


@Data
public class Menu {

    private Long menuId;

    private String menuName;

    private Long parentId;

    private Integer orderNum;

    private String url;

    private String menuType;

    private Integer visible;

    private String perms;

    private String icon;

    private String remark;

}
