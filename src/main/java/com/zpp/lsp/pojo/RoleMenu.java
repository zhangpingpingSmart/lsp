package com.zpp.lsp.pojo;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "zpp_role_menu")
public class RoleMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "rm_id")
    private Long rmId;

    @Column(name = "role_id")
    private Long roleId;

    @Column(name = "menu_id")
    private Long menuId;


}
