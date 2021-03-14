package com.zpp.lsp.pojo;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "zpp_role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private Long roleId;

    @Column(name = "parent_role_id")
    private Long parentRoleId;

    @Column(name = "role_name")
    private String roleName;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "description")
    private String description;

}
