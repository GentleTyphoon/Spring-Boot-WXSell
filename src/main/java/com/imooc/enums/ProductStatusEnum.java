package com.imooc.enums;

/**
 * @author wwf
 * @date 2019/7/16 20:14
 */

import lombok.Getter;

/**
 * 商品状态枚举类 0上架, 1下架
 */
@Getter
public enum ProductStatusEnum {

    /**
     * 0上架
     */
    UP(0, "在架"),

    /**
     *  1下架
     */
    DOWN(1, "下架")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
