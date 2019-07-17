package com.imooc.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author wwf
 * @date 2019/7/17 12:39
 * 商品详情
 */

/**
 * {
 * "id": "123456",
 * "name": "皮蛋粥",
 * "price": 1.2,
 * "description": "好吃的皮蛋粥",
 * "icon": "http://xxx.com",
 * }
 */
@Data
public class ProductInfoVO {

    @JsonProperty("id")
    private String productId;

    @JsonProperty("name")
    private String productName;

    @JsonProperty("price")
    private BigDecimal productPrice;

    @JsonProperty("description")
    private String productDescription;

    @JsonProperty("icon")
    private String productIcon;
}
