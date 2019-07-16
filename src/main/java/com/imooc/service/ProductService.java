package com.imooc.service;

import com.imooc.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author wwf
 * @date 2019/7/16 19:56
 */
public interface ProductService {

    ProductInfo findOne(String productId);

    /**
     * C端查询所有上架的商品
     * @return  List<ProductInfo>
     */
    List<ProductInfo> findUpAll();

    /**
     * 后端查询所有
     * @param pageable  分页
     * @return  List<ProductInfo>
     */
    Page<ProductInfo> findAll(Pageable pageable);

    /**
     * 保存
     * @param productInfo
     * @return
     */
    ProductInfo save(ProductInfo productInfo);

    //加库存

    //减库存

}
