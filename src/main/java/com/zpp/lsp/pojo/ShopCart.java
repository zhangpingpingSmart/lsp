package com.zpp.lsp.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

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

    @ApiModelProperty(value = "商品规格",name = "goodsAttrUnique",required = true)
    private String goodsAttrUnique;

    @ApiModelProperty(value = "商品数量",name = "goodsNum",required = true)
    private Integer goodsNum;

    @ApiModelProperty(value = "商家id",name = "storeId",required = true)
    private Long storeId;

    @ApiModelProperty(value = "类型",name = "type")
    private String type;

}
