package com.zpp.lsp.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: 张平平
 * @Date: 2021/3/22 15:33
 */
@Data
@TableName("goods_format")
@ApiModel(value = "GoodsFormat",description = "商品规格表单")
public class GoodsFormat {

    @ApiModelProperty(value = "规格id",name = "formatId")
    private Long formatId;

    @ApiModelProperty(value = "商品id",name = "goodsId",required = true)
    private Long goodsId;

    @ApiModelProperty(value = "单位id",name = "unitId",required = true)
    private Integer unitId;

    @ApiModelProperty(value = "规格名称",name = "formatName",required = true)
    private String formatName;

    @ApiModelProperty(value = "价格",name = "formatPrice",required = true)
    private BigDecimal formatPrice;

    @ApiModelProperty(value = "数量",name = "formatNum",required = true)
    private Integer formatNum;

    @ApiModelProperty(value = "顺序号",name = "formatSeq",required = true)
    private Integer formatSeq;

    @ApiModelProperty(value = "状态：0启用，1禁用",name = "formatStatus",required = true)
    private Integer formatStatus;

    @ApiModelProperty(value = "创建时间",name = "createTime")
    private Date createTime;

    @ApiModelProperty(value = "平台价格",name = "platformPrice",required = true)
    private BigDecimal platformPrice;

    @ApiModelProperty(hidden = true)
    private Integer isDelete;
}
