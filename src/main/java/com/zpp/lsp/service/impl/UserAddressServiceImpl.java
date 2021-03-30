package com.zpp.lsp.service.impl;

import com.zpp.lsp.mapper.UserAddressMapper;
import com.zpp.lsp.pojo.UserAddress;
import com.zpp.lsp.service.UserAddressService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 张平平
 * @Date: 2021/3/26 14:28
 */
@Service
public class UserAddressServiceImpl implements UserAddressService {

    private UserAddressMapper userAddressMapper;
    @Override
    public UserAddress getUserAddressById(String addressId) {
        return userAddressMapper.getUserAddressById(addressId);
    }

    @Override
    public void saveUserAddress(UserAddress userAddress) {
        userAddressMapper.insert(userAddress);
    }

    @Override
    public void updateUserAddressById(UserAddress userAddress) {
        userAddressMapper.updateById(userAddress);
    }

    @Override
    public void deleteUserAddressById(String addressId) {
        userAddressMapper.deleteUserAddressById(addressId);
    }

    @Override
    public List<UserAddress> getAddressList(String userId) {
        return userAddressMapper.getAddressList(userId);
    }
}
