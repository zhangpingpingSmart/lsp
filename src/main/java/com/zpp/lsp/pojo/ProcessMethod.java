package com.zpp.lsp.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @Author: 张平平
 * @Date: 2021/3/22 16:04
 */
@Data
@TableName("process_method")
@ApiModel(value = "ProcessMethod",description = "商品加工方式表单")
public class ProcessMethod {

    @ApiModelProperty(value = "加工方式id",name = "categoryId",required = true)
    private Integer methodId;

    @ApiModelProperty(value = "加工方式名称",name = "categoryId",required = true)
    private String methodName;

    @ApiModelProperty(value = "状态：0启用，1停用",name = "categoryId",required = true)
    private Integer methodStatus;

    @ApiModelProperty(value = "创建时间",name = "categoryId",required = true)
    private Date createTime;

    @ApiModelProperty(hidden = true)
    private Integer isDelete;
}
