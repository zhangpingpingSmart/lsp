package com.zpp.lsp.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.*;

/**
 * @Author: 张平平
 * @Date: 2021/3/11 15:36
 */
@Data
@Entity
@Table(name = "zpp_user_role")
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "zur_id")
    private Long zurId;
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "role_id")
    private Long roleId;

}
