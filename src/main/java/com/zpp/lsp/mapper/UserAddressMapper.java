package com.zpp.lsp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zpp.lsp.pojo.UserAddress;

/**
 * @Author: 张平平
 * @Date: 2021/3/26 14:37
 */
public interface UserAddressMapper extends BaseMapper<UserAddress> {
    UserAddress getUserAddressById(String addressId);

    void deleteUserAddressById(String addressId);
}
