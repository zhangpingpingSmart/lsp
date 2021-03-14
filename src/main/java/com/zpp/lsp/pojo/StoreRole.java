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
@Table(name = "zpp_store_role")
public class StoreRole {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "zsr_id")
    private Long zsrId;
    @Column(name = "store_id")
    private Long storeId;
    @Column(name = "role_id")
    private Long roleId;

}
