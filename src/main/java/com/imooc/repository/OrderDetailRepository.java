package com.imooc.repository;

import com.imooc.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author wwf
 * @date 2019/7/17 19:39
 * 订单详细表 DAO
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {
    /**
     * oder_master表 -> order_id字段 ==> order_id字段 -> order_detail表
     * 一对多(可能)
     */
    List<OrderDetail> findByOrderId(String orderID);
}
