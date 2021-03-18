package com.zpp.lsp.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @Author: 张平平
 * @Date: 2021/3/17 13:32
 */
@Data
@TableName("zpp_store")
public class Store {

    private Long storeId;

    private String storeName;

    private String storeAddr;

    private String storeFullName;

    private String storePassword;

    private String storeMobile;

    private String storePhone;

    private Date createTime;

    private Date updateTime;

    private String salt;


}
