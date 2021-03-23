package com.zpp.lsp.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

/**
 * @Author: 张平平
 * @Date: 2021/3/22 14:45
 */
@Data
@TableName("category")
@ApiModel(value = "Category",description = "分类表单")
public class Category {

    @ApiModelProperty(value = "分类id",name = "categoryId")
    private Long categoryId;

    @ApiModelProperty(value = "分类编码",name = "categoryCode")
    private String categoryCode;

    @ApiModelProperty(value = "分类名称",name = "categoryName",required = true)
    private String categoryName;

    @ApiModelProperty(value = "分类父id",name = "parentId",required = true)
    private Long parentId;

    @ApiModelProperty(value = "层级",name = "categoryLevel",required = true)
    private Integer categoryLevel;

    @ApiModelProperty(value = "顺序号",name = "categorySeq",required = true)
    private Integer categorySeq;

    @ApiModelProperty(value = "是否末级：0非末级，1末级",name = "isEnd",required = true)
    private Integer isEnd;

    @ApiModelProperty(value = "状态：0启用，1停用",name = "categoryStatus",required = true)
    private Integer categoryStatus;

    @ApiModelProperty(value = "创建时间",name = "createTime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @ApiModelProperty(value = "修改时间",name = "updateTime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    @ApiModelProperty(value = "分类图标地址",name = "categoryLogo",required = true)
    private String categoryLogo;
    
    @ApiModelProperty(hidden = true)
    private Integer isDelete;

    @ApiModelProperty(hidden = true)
    List<Category> childCategorys;
}
