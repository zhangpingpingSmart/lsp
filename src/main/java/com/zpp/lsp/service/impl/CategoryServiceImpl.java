package com.zpp.lsp.service.impl;

import com.zpp.lsp.mapper.CategoryMapper;
import com.zpp.lsp.pojo.Category;
import com.zpp.lsp.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<Category> getTree() {
        List<Category> categories = categoryMapper.selectList(null);
        return buildTreeList(categories,0L);
    }

    /**
     * 构建树
     *
     * @param menuList
     * @param pid
     * @return
     */
    private List<Category> buildTreeList(List<Category> menuList, Long pid) {
        List<Category> treeList = new ArrayList<>();
        menuList.forEach(category -> {
            if (pid.equals(category.getParentId())) {
                category.setChildCategorys(buildTreeList(menuList, category.getCategoryId()));
                treeList.add(category);
            }
        });
        return treeList;
    }
}
