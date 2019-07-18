package com.imooc.dto;

import com.imooc.dataobject.OrderDetail;
import com.imooc.enums.OrderStatusEnum;
import com.imooc.enums.PayStatusEnum;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author wwf
 * @date 2019/7/18 21:15
 * OrderMaster 订单主表
 * data transfer object 数据传输对象
 */
@Data
public class OrderDTO {

    /** 订单id */
    private String orderId;

    /** 买家名字 */
    private String buyerName;

    /** 买家手机号 */
    private String buyerPhone;

    /** 买家地址 */
    private String buyerAddress;

    /** 买家微信openId */
    private String buyerOpenid;

    /** 订单总金额 */
    private BigDecimal orderAmount;

    /** 订单状态 , 默认为新下单 , code = 0 */
    private Integer orderStatus;

    /** 支付状态, 默认未支付 , code = 0 */
    private Integer payStatus;

    /** 创建时间 */
    private Date createTime;

    /** 更新时间 @DynamicUpdate */
    private Date updateTime;

    /** 一个订单主表可能对应多个订单详细表 */
    private List<OrderDetail> orderDetailList;
}
