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
 * @Date: 2021/3/24 10:42
 */
@Data
@TableName("shop_cart")
@ApiModel(value = "ShopCart",description = "购物车表单")
public class ShopCart {

    @ApiModelProperty(value = "购物车id",name = "cartId")
    private Long cartId;

    @ApiModelProperty(value = "用户id",name = "userId",required = true)
    private Long userId;

    @ApiModelProperty(value = "商品id",name = "goodsId",required = true)
    private Long goodsId;

    @ApiModelProperty(value = "规格id",name = "formatId",required = true)
    private String formatId;

    @ApiModelProperty(value = "商品数量",name = "goodsNum",required = true)
    private Integer goodsNum;

    @ApiModelProperty(value = "商家id",name = "storeId",required = true)
    private Long storeId;

    @ApiModelProperty(value = "加工方式id",name = "methodId",required = true)
    private Long methodId;

    @ApiModelProperty(value = "是否选择",name = "isSelected")
    private String isSelected;

    @ApiModelProperty(value = "创建时间",name = "createTime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

}
