package com.imooc.dto;

import lombok.Data;

/**
 * @author wwf
 * @date 2019/7/20 17:04
 * 购物车 数据传输对象
 * items: [{
 * productId: "1423113435324",
 * productQuantity: 2 //购买数量
 * }]
 */
@Data
public class CartDTO {

    /**
     * 商品id
     */
    private String productId;

    /**
     * 购买数量
     */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
