package com.zpp.lsp.pojo;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @Author: 张平平
 * @Date: 2021/3/17 13:32
 */
@Data
@Entity
@Table(name = "zpp_store")
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "storeId")
    private Long storeId;

    @Column(name = "store_name")
    private String storeName;

    @Column(name = "store_addr")
    private String storeAddr;

    @Column(name = "store_full_name")
    private String storeFullName;

    @Column(name = "store_password")
    private String storePassword;

    @Column(name = "store_mobile")
    private String storeMobile;

    @Column(name = "store_phone")
    private String storePhone;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "salt")
    private String salt;


}
