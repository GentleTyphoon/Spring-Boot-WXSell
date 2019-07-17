package com.imooc.VO;

import lombok.Data;

/**
 * @author wwf
 * @date 2019/7/16 21:31
 * http请求返回的最外层对象 view object
 */

/**
 * "code": 0,
 * "msg": "成功",
 * "data": [
 *
 * @param <T>
 */
@Data
public class ResultVO<T> {
    /**
     * 错误码
     */
    private Integer code;

    private String msg;

    private T data;
}