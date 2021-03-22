package com.zpp.lsp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zpp.lsp.pojo.Category;

/**
 * @Author: 张平平
 * @Date: 2021/3/22 14:44
 */
public interface CategoryMapper extends BaseMapper<Category> {

    Category getCategoryByCategoryId(String categoryId);

    void deleteCategoryById(String categoryId);
}
