package com.imooc.exception;

import com.imooc.enums.ResultEnum;

/**
 * @author wwf
 * @date 2019/7/18 22:37
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        //RuntimeException 有一个message构造方法
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }
}
