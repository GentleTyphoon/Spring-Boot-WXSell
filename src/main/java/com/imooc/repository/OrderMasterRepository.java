package com.imooc.repository;

import com.imooc.dataobject.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author wwf
 * @date 2019/7/17 19:33
 * 订单主表DAO JpaRepository<查询对象, 主键id类型>
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {

    /**
     * 根据买家的 Openid 分页查询
     * @param buyerOpenid   买家微信openId
     * @param pageable  分页对象接口
     * @return
     */
    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid, Pageable pageable);
}
