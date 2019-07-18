package com.imooc.utils;

import java.util.Random;

/**
 * @author wwf
 * @date 2019/7/18 23:09
 * 数据库索引 , 约束生成
 */
public class KeyUtil {

    /**
     * 生成唯一的主键
     * 时间戳 + 随机数
     * @return  随机6位数
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();

        //生成随机6位数
        Integer number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }
}
