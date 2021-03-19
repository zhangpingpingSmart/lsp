package com.zpp.lsp.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@TableName("zpp_role")
@ApiModel(value = "Role",description = "角色表单")
public class Role {
    @ApiModelProperty(value = "角色id",name = "roleId",required = true)
    private Long roleId;

    @ApiModelProperty(value = "角色父id",name = "parentRoleId",required = true)
    private Long parentRoleId;

    @ApiModelProperty(value = "角色名称",name = "roleName",required = true)
    private String roleName;

    @ApiModelProperty(value = "创建时间",name = "createTime")
    private Date createTime;

    @ApiModelProperty(value = "角色描述",name = "description")
    private String description;

    @ApiModelProperty(hidden = true)
    private Integer isDelete;
}
