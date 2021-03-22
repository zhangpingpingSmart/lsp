package com.zpp.lsp.service;

import com.zpp.lsp.pojo.Category;

/**
 * @Author: 张平平
 * @Date: 2021/3/22 17:56
 */
public interface CategoryService {
    Category getCategoryByCategoryId(String categoryId);

    void saveCategory(Category category);

    void updateCategoryById(Category category);

    void deleteCategoryById(String categoryId);
}
