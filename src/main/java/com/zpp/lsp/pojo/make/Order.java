package com.zpp.lsp.pojo.make;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.zpp.lsp.pojo.OrderDetail;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Author: 张平平
 * @Date: 2021/3/29 11:26
 */
@Data
public class Order {

    private Long orderId;

    private String orderNumber;

    private Long buyerId;

    private Long addressId;

    private String addressName;

    private Integer orderStatus;

    private Integer payStatus;

    private BigDecimal orderAmout;

    private BigDecimal payAmout;

    private BigDecimal totalAmout;

    private Date payTime;

    private String payNo;

    private Date createTime;

    private Integer deliveryType;

    private Integer deliveryStatus;

    private Integer sellerStatus;

    private String remark;

    private Integer buyerStatus;

    private BigDecimal deliveryMoney;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date deliveryReceiveTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date deliveryFinishTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date sellerFinishTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date buyerFinishTime;

    private List<OrderDetailMake> orderDetailList;
}
