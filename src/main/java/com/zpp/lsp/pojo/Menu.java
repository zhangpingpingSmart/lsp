package com.zpp.lsp.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;


@Data
@TableName("zpp_menu")
@ApiModel(value = "Menu",description = "菜单表单")
public class Menu {

    @ApiModelProperty(value = "菜单id",name = "menuId",required = true)
    private Long menuId;

    @ApiModelProperty(value = "菜单名称",name = "menuName",required = true)
    private String menuName;

    @ApiModelProperty(value = "父菜单ID",name = "parentId",required = true)
    private Long parentId;

    @ApiModelProperty(value = "显示顺序",name = "orderNum",required = true)
    private Integer orderNum;

    @ApiModelProperty(value = "请求地址",name = "url",required = true)
    private String url;

    @ApiModelProperty(value = "类型:M目录,C菜单,F按钮",name = "menuType",required = true)
    private String menuType;

    @ApiModelProperty(value = "菜单状态:0显示,1隐藏",name = "visible",required = true)
    private Integer visible;

    @ApiModelProperty(value = "权限标识:0启用,1禁用",name = "perms",required = true)
    private String perms;

    @ApiModelProperty(value = "菜单图标",name = "icon",required = true)
    private String icon;

    @ApiModelProperty(value = "备注",name = "remark")
    private String remark;

    @ApiModelProperty(hidden = true)
    private List<Menu> childMenus;
}
