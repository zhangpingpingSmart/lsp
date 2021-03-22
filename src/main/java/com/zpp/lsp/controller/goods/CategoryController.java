package com.zpp.lsp.controller.goods;

import com.zpp.lsp.common.ResultData;
import com.zpp.lsp.config.login.Priv;
import com.zpp.lsp.pojo.Category;
import com.zpp.lsp.service.CategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: 张平平
 * @Date: 2021/3/22 17:46
 */
@RestController
@RequestMapping("/zpp/category")
@Api(tags = "分类相关接口")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @Priv(login = true)
    @PostMapping("/{categoryId}")
    @ApiOperation(value = "根据分类id获取分类信息",httpMethod = "POST")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "categoryId",value = "分类id",required = true,paramType = "path",dataType = "String")
    })
    public ResultData getCategoryByCategoryId(@PathVariable("categoryId") String categoryId){
        Category category=categoryService.getCategoryByCategoryId(categoryId);
        return ResultData.success(category);
    }

    @Priv(login = true)
    @PostMapping("/add")
    @ApiOperation(value = "新增分类")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "category", value = "分类表单", required = true, dataType = "Category")
    })
    public ResultData addCategory(@RequestBody Category category){
        categoryService.saveCategory(category);
        return ResultData.success("新增成功");
    }

    @Priv(login = true)
    @PutMapping("/update")
    @ApiOperation(value = "修改分类")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "category", value = "分类表单", required = true, dataType = "Category")
    })
    public ResultData updateCategoryById(@RequestBody Category category){
        categoryService.updateCategoryById(category);
        return ResultData.success("编辑成功");
    }
    @Priv(login = true)
    @DeleteMapping("/del/{categoryId}")
    @ApiOperation(value = "根据id删除分类")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "categoryId",value = "分类id",required = true,paramType = "path",dataType = "String")
    })
    public ResultData deleteCategoryById(@PathVariable("categoryId")String categoryId){
        categoryService.deleteCategoryById(categoryId);
        return ResultData.success("删除成功");
    }
}
