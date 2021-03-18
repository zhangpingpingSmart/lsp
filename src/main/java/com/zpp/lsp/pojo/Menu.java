package com.zpp.lsp.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.List;


@Data
@TableName("zpp_menu")
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

    private List<Menu> childMenus;
}
