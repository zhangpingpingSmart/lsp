package com.zpp.lsp.pojo;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "zpp_menu")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "menu_id")
    private Long menuId;

    @Column(name = "menu_name")
    private String menuName;

    @Column(name = "parent_id")
    private Long parentId;

    @Column(name = "order_num")
    private Integer orderNum;

    @Column(name = "url")
    private String url;

    @Column(name = "menu_type")
    private String menuType;

    @Column(name = "visible")
    private Integer visible;

    @Column(name = "perms")
    private String perms;

    @Column(name = "icon")
    private String icon;

    @Column(name = "remark")
    private String remark;

}
