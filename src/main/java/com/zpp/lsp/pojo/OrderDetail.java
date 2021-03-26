package com.zpp.lsp.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author: 张平平
 * @Date: 2021/3/26 16:54
 */
@Data
@TableName("order_detail")
@ApiModel(value = "OrderDetail",description = "订单详情表单")
public class OrderDetail {

    @ApiModelProperty(value = "订单商品主键",name = "odetailId")
    private Long odetailId;

    @ApiModelProperty(value = "订单号",name = "orderNumber",required = true)
    private String orderNumber;

    @ApiModelProperty(value = "规格id",name = "formatId",required = true)
    private Long formatId;

    @ApiModelProperty(value = "加工方式id",name = "methodId",required = true)
    private Long methodId;

    @ApiModelProperty(value = "商品数量",name = "goodsNum",required = true)
    private Integer goodsNum;

    @ApiModelProperty(value = "商品价格",name = "goodsPrice",required = true)
    private BigDecimal goodsPrice;

}
