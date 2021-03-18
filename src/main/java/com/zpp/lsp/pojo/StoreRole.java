package com.zpp.lsp.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


/**
 * @Author: 张平平
 * @Date: 2021/3/11 15:36
 */
@Data
@TableName("zpp_store_role")
public class StoreRole {
    private Long zsrId;
    private Long storeId;
    private Long roleId;

}
