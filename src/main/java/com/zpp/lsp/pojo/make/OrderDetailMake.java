package com.zpp.lsp.pojo.make;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author: 张平平
 * @Date: 2021/3/29 16:27
 */
@Data
public class OrderDetailMake {

    /**
     * 订单明细id
     */
    private Long odetailId;
    /**
     * 订单编号
     */
    private String orderNumber;
    /**
     * 规格id
     */
    private Long formatId;
    /**
     * 规格商品名称
     */
    private String formatName;
    /**
     * 规格商品单价
     */
    private BigDecimal formatPrice;
    /**
     * 计量单位
     */
    private String unitName;
    /**
     * 加工方式id
     */
    private Long methodId;
    /**
     * 订单商品数量
     */
    private Integer goodsNum;
    /**
     * 订单商品价格
     */
    private BigDecimal goodsPrice;
    /**
     * 商品图片地址
     */
    private String picUrl;
    /**
     * 收货人姓名
     */
    private String receiverName;
    /**
     * 收货人手机号
     */
    private String receiverPhone;
    /**
     * 详细地址
     */
    private String addressName;
    /**
     * 商品名称
     */
    private String goodsName;
}
