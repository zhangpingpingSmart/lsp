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
 * @Date: 2021/3/22 16:01
 */
@Data
@TableName("goods_unit")
@ApiModel(value = "GoodsUnit",description = "商品单位表单")
public class GoodsUnit {

    @ApiModelProperty(value = "单位id",name = "unitId")
    private Long unitId;

    @ApiModelProperty(value = "单位名称",name = "unitName",required = true)
    private String unitName;

    @ApiModelProperty(value = "创建时间",name = "createTime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
}
