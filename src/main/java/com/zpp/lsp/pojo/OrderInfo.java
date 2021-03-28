package com.zpp.lsp.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: 张平平
 * @Date: 2021/3/26 16:37
 */
@Data
@TableName("order_info")
@ApiModel(value = "OrderInfo",description = "订单表单")
public class OrderInfo {

    @ApiModelProperty(value = "订单id",name = "orderId")
    private Long orderId;

    @ApiModelProperty(value = "订单号",name = "orderNumber",required = true)
    private String orderNumber;

    @ApiModelProperty(value = "买家id",name = "buyerId",required = true)
    private Long buyerId;

    @ApiModelProperty(value = "地址id",name = "addressId",required = true)
    private Long addressId;

    @ApiModelProperty(value = "订单状态：0进行中，1已完成，2取消交易",name = "orderStatus",required = true)
    private Integer orderStatus;

    @ApiModelProperty(value = "支付状态：0未付款，1已付款，2线下付款，3线下付款已收款",name = "payStatus",required = true)
    private Integer payStatus;

    @ApiModelProperty(value = "订单金额",name = "orderAmout",required = true)
    private BigDecimal orderAmout;

    @ApiModelProperty(value = "支付金额",name = "payAmout",required = true)
    private BigDecimal payAmout;

    @ApiModelProperty(value = "商品最终总金额",name = "totalAmout",required = true)
    private BigDecimal totalAmout;

    @ApiModelProperty(value = "支付时间",name = "payTime",required = true)
    private Date payTime;

    @ApiModelProperty(value = "支付订单号",name = "payNo",required = true)
    private String payNo;

    @ApiModelProperty(value = "创建时间",name = "createTime",required = true)
    private Date createTime;

    @ApiModelProperty(value = "配送方式",name = "deliveryType",required = true)
    private Integer deliveryType;

    @ApiModelProperty(value = "配送状态：0未收货，1送货中，2已送货",name = "deliveryStatus",required = true)
    private Integer deliveryStatus;

    @ApiModelProperty(value = "商家状态：0备货中，1备货完成，2缺货",name = "sellerStatus",required = true)
    private Integer sellerStatus;

    @ApiModelProperty(value = "备注",name = "remark",required = true)
    private String remark;

    @ApiModelProperty(value = "卖家状态：0待收货，1已收货，2换货，3退货",name = "buyerStatus",required = true)
    private Integer buyerStatus;

    @ApiModelProperty(value = "配送费",name = "deliveryMoney",required = true)
    private BigDecimal deliveryMoney;

    @ApiModelProperty(value = "配送收货时间",name = "deliveryReceiveTime",required = true)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date deliveryReceiveTime;

    @ApiModelProperty(value = "配送完成时间",name = "deliveryFinishTime",required = true)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date deliveryFinishTime;

    @ApiModelProperty(value = "卖家完成时间",name = "sellerFinishTime",required = true)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date sellerFinishTime;

    @ApiModelProperty(value = "买家完成时间",name = "buyerFinishTime",required = true)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date buyerFinishTime;

    @ApiModelProperty(hidden = true)
    private Integer isDelete;
}
