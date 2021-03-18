package com.zpp.lsp.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Author: 张平平
 * @Date: 2021/3/17 13:32
 */
@Data
@TableName("zpp_store")
@ApiModel("商家表单")
public class Store {

    @ApiModelProperty(value = "商家id",name = "storeId",required = true)
    private Long storeId;

    @ApiModelProperty(value = "商家用户名称",name = "storeName",required = true)
    private String storeName;

    @ApiModelProperty(value = "商家地址",name = "storeAddr",required = true)
    private String storeAddr;

    @ApiModelProperty(value = "商家真实名称",name = "storeFullName",required = true)
    private String storeFullName;

    @ApiModelProperty(value = "商家密码",name = "storePassword",required = true)
    private String storePassword;

    @ApiModelProperty(value = "商家手机号",name = "storeMobile",required = true)
    private String storeMobile;

    @ApiModelProperty(value = "商家座机",name = "storePhone")
    private String storePhone;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "创建时间",name = "createTime")
    private Date createTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "修改时间",name = "updateTime")
    private Date updateTime;

    private String salt;


}
