package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * @author wwf
 * @date 2019/7/16 15:22
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest() {
        ProductCategory productCategory = repository.findOne(1);
        System.out.println(productCategory.toString());
    }

    @Test
    @Transactional //测试完直接回滚 保持数据库干净
    public void saveTest() {
/*        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("hello spring boot");
        productCategory.setCategoryType(3);
        repository.save(productCategory);*/
        ProductCategory productCategory = new ProductCategory("hello world", 6);
        ProductCategory result = repository.save(productCategory);
        Assert.assertNotNull(result);

        //Assert.assertNotEquals(null, result);
    }

    //更新还是调用 save() 方法 , 要先设置主键id
    @Test
    public void updateTest() {
/*        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryId(3);
        productCategory.setCategoryName("hi spring boot");
        productCategory.setCategoryType(3);
        repository.save(productCategory);*/
    }

    @Test
    public void findByCategoryTypeIn() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0, result);
    }

}