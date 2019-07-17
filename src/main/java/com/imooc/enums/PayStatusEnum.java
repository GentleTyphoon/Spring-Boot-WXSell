package com.imooc.enums;

import lombok.Getter;

/**
 * @author wwf
 * @date 2019/7/17 19:19
 */
@Getter
public enum PayStatusEnum {
    /** */
    WAIT(0, "等待支付"),
    /** */
    SUCCESS(1, "支付成功")
    ;


    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
