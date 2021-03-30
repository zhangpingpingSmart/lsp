package com.zpp.lsp.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @Author: 张平平
 * @Date: 2021/3/30 9:22
 */
@Data
public class GoodsMethod {
    private Long gmId;
    private Long goodsId;
    private Integer methodId;
    private Date createTime;
}
