package com.imooc.repository;

import com.imooc.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author wwf
 * @date 2019/7/16 19:34
 * DAO(Data Access Object) 数据访问对象是一个面向对象的数据库接口
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

    /**
     * 通常商品状态查询 productInfo
     * @param productStatus 商品状态,0正常1下架
     * @return List<ProductInfo>
     */
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
