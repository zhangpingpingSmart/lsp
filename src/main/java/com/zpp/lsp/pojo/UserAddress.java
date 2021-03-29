package com.zpp.lsp.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @Author: 张平平
 * @Date: 2021/3/25 17:42
 */
@Data
@TableName("user_address")
@ApiModel(value = "UserAddress",description = "收货地址表单")
public class UserAddress {

    @ApiModelProperty(value = "地址id",name = "addressId",required = true)
    private Long addressId;

    @ApiModelProperty(value = "用户id",name = "userId",required = true)
    private Long userId;

    @ApiModelProperty(value = "详细地址",name = "addressName",required = true)
    private String addressName;

    @ApiModelProperty(value = "省",name = "province",required = true)
    private String province;

    @ApiModelProperty(value = "市",name = "city",required = true)
    private String city;

    @ApiModelProperty(value = "区",name = "area",required = true)
    private String area;

    @ApiModelProperty(value = "街道",name = "street",required = true)
    private String street;

    @ApiModelProperty(value = "创建时间",name = "createTime")
    private Date createTime;

    @ApiModelProperty(hidden = true)
    private Integer isDelete;

    @ApiModelProperty(value = "是否默认",name = "isDefault",required = true)
    private Integer isDefault;

    @ApiModelProperty(value = "收货人",name = "receiverName",required = true)
    private Integer receiverName;

    @ApiModelProperty(value = "收货人手机号",name = "receiverphone",required = true)
    private Integer receiverphone;
}
