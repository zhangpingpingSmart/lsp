package com.zpp.lsp.service.impl;

import com.zpp.lsp.mapper.CategoryMapper;
import com.zpp.lsp.pojo.Category;
import com.zpp.lsp.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: 张平平
 * @Date: 2021/3/22 18:10
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public Category getCategoryByCategoryId(String categoryId) {
        return categoryMapper.getCategoryByCategoryId(categoryId);
    }

    @Override
    public void saveCategory(Category category) {
        categoryMapper.insert(category);
    }

    @Override
    public void updateCategoryById(Category category) {
        categoryMapper.updateById(category);
    }

    @Override
    public void deleteCategoryById(String categoryId) {
        categoryMapper.deleteCategoryById(categoryId);
    }
}
