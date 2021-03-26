package com.zpp.lsp.controller;

import com.zpp.lsp.common.ResultData;
import com.zpp.lsp.config.login.Priv;
import com.zpp.lsp.pojo.UserAddress;
import com.zpp.lsp.service.UserAddressService;
import com.zpp.lsp.service.UserAddressService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: 张平平
 * @Date: 2021/3/26 14:23
 */
@RestController
@RequestMapping("/zpp/userAddr")
@Api(tags = "收货地址相关接口")
public class UserAddressController {

    @Autowired
    private UserAddressService userAddressService;

    @Priv(login = true)
    @PostMapping("/{addressId}")
    @ApiOperation(value = "根据收货地址id获取收货地址信息",httpMethod = "POST")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "addressId",value = "收货地址id",required = true,paramType = "path",dataType = "String")
    })
    public ResultData getUserAddressById(@PathVariable("addressId") String addressId){
        UserAddress userAddress=userAddressService.getUserAddressById(addressId);
        return ResultData.success(userAddress);
    }

    @Priv(login = true)
    @PostMapping("/add")
    @ApiOperation(value = "新增收货地址")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "userAddress", value = "收货地址表单", required = true, dataType = "UserAddress")
    })
    public ResultData addUserAddress(@RequestBody UserAddress userAddress){
        userAddressService.saveUserAddress(userAddress);
        return ResultData.success("新增成功");
    }

    @Priv(login = true)
    @PutMapping("/update")
    @ApiOperation(value = "修改收货地址")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "userAddress", value = "收货地址表单", required = true, dataType = "UserAddress")
    })
    public ResultData updateUserAddressById(@RequestBody UserAddress userAddress){
        userAddressService.updateUserAddressById(userAddress);
        return ResultData.success("编辑成功");
    }
    @Priv(login = true)
    @DeleteMapping("/del/{addressId}")
    @ApiOperation(value = "根据id删除收货地址")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "addressId",value = "收货地址id",required = true,paramType = "path",dataType = "String")
    })
    public ResultData deleteUserAddressById(@PathVariable("addressId")String addressId){
        userAddressService.deleteUserAddressById(addressId);
        return ResultData.success("删除成功");
    }
}
