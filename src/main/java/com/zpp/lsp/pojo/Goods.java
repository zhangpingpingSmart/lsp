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
 * @Date: 2021/3/22 14:57
 */
@Data
@TableName("goods")
@ApiModel(value = "Goods",description = "商品表单")
public class Goods {

    @ApiModelProperty(value = "商品id",name = "goodsId")
    private Long goodsId;

    @ApiModelProperty(value = "分类id",name = "categoryId",required = true)
    private Integer categoryId;

    @ApiModelProperty(value = "商品名称",name = "goodsName",required = true)
    private String goodsName;

    @ApiModelProperty(value = "别名",name = "goodsAs")
    private String goodsAs;

    @ApiModelProperty(value = "商品标签",name = "goods_label",required = true)
    private String goodsLabel;

    @ApiModelProperty(value = "商品品牌",name = "categorySeq",required = true)
    private String goodsBrand;

    @ApiModelProperty(value = "商品详情",name = "goods_desc")
    private String goodsDesc;

    @ApiModelProperty(value = "商家id",name = "storeId",required = true)
    private Long storeId;

    @ApiModelProperty(value = "顺序号",name = "goodsSeq",required = true)
    private Integer goodsSeq;

    @ApiModelProperty(value = "商品状态：0上架，1下架",name = "goodsStatus",required = true)
    private Integer goodsStatus;

    @ApiModelProperty(value = "商品备注",name = "goodsRemark")
    private String goodsRemark;

    @ApiModelProperty(value = "创建时间",name = "createTime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @ApiModelProperty(value = "修改时间",name = "updateTime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    @ApiModelProperty(hidden = true)
    private Integer isDelete;
}
