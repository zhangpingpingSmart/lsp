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
 * @Date: 2021/3/22 15:15
 */
@Data
@TableName("goods_picture")
@ApiModel(value = "GoodsPicture",description = "商品图片表单")
public class GoodsPicture {

    @ApiModelProperty(value = "图片id",name = "picId")
    private Long picId;

    @ApiModelProperty(value = "商品id",name = "goodsId",required = true)
    private Long goodsId;

    @ApiModelProperty(value = "图片url",name = "picUrl",required = true)
    private String picUrl;

    @ApiModelProperty(value = "顺序号",name = "picSeq",required = true)
    private Integer picSeq;

    @ApiModelProperty(value = "是否主图",name = "isMain",required = true)
    private Integer isMain;

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
