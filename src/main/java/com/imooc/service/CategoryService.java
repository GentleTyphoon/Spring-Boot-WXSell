package com.imooc.service;

import com.imooc.dataobject.ProductCategory;

import java.util.List;

/**
 * @author wwf
 * @date 2019/7/16 16:51
 */

/**
 * 类目服务层接口
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    /**
     * 查询所有 , 后台用
     * @return
     */
    List<ProductCategory> findAll();

    /**
     * 客户端使用 类目编号 来查询
     * @param categoryTypeList
     * @return
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    /**
     * 新增&更新
     * @param productCategory
     * @return
     */
    ProductCategory save(ProductCategory productCategory);

}
