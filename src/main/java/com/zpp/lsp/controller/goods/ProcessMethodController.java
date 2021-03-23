package com.zpp.lsp.controller.ProcessMethod;

import com.zpp.lsp.common.ResultData;
import com.zpp.lsp.config.login.Priv;
import com.zpp.lsp.pojo.ProcessMethod;
import com.zpp.lsp.service.ProcessMethodService;
import com.zpp.lsp.service.ProcessMethodService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: 张平平
 * @Date: 2021/3/22 17:51
 */
@RestController
@RequestMapping("/zpp/processMethod")
@Api(tags = "加工方式相关接口")
public class ProcessMethodController {
    @Autowired
    private ProcessMethodService processMethodService;

    @Priv(login = true)
    @PostMapping("/{methodId}")
    @ApiOperation(value = "根据加工方式id获取加工方式信息",httpMethod = "POST")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "methodId",value = "加工方式id",required = true,paramType = "path",dataType = "String")
    })
    public ResultData getProcessMethodById(@PathVariable("methodId") String methodId){
        ProcessMethod processMethod=processMethodService.getProcessMethodById(methodId);
        return ResultData.success(processMethod);
    }

    @Priv(login = true)
    @PostMapping("/add")
    @ApiOperation(value = "新增加工方式")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "processMethod", value = "加工方式表单", required = true, dataType = "ProcessMethod")
    })
    public ResultData addProcessMethod(@RequestBody ProcessMethod processMethod){
        processMethodService.saveProcessMethod(processMethod);
        return ResultData.success("新增成功");
    }

    @Priv(login = true)
    @PutMapping("/update")
    @ApiOperation(value = "修改加工方式")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "processMethod", value = "加工方式表单", required = true, dataType = "ProcessMethod")
    })
    public ResultData updateProcessMethodById(@RequestBody ProcessMethod processMethod){
        processMethodService.updateProcessMethodById(processMethod);
        return ResultData.success("编辑成功");
    }
    @Priv(login = true)
    @DeleteMapping("/del/{methodId}")
    @ApiOperation(value = "根据id删除加工方式")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "methodId",value = "加工方式id",required = true,paramType = "path",dataType = "String")
    })
    public ResultData deleteProcessMethodById(@PathVariable("methodId")String methodId){
        processMethodService.deleteProcessMethodById(methodId);
        return ResultData.success("删除成功");
    }
}
