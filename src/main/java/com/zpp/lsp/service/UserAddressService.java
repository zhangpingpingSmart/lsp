package com.zpp.lsp.service;

import com.zpp.lsp.pojo.UserAddress;

import java.util.List;

/**
 * @Author: 张平平
 * @Date: 2021/3/26 14:25
 */
public interface UserAddressService {
    UserAddress getUserAddressById(String addressId);

    void saveUserAddress(UserAddress userAddress);

    void updateUserAddressById(UserAddress userAddress);

    void deleteUserAddressById(String addressId);

    List<UserAddress> getAddressList(String userId);
}
