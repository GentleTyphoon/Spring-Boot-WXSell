package com.imooc.repository;

import com.imooc.dataobject.OrderDetail;
import org.aspectj.weaver.ast.Or;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author wwf
 * @date 2019/7/17 20:31
 * 订单详情表测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository repository;

    @Test
    public void saveTest() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("264123556");
        orderDetail.setOrderId("15798956");
        orderDetail.setProductIcon("http://xxx.jpg");
        orderDetail.setProductId("16545454");
        orderDetail.setProductName("炸鸡腿");
        orderDetail.setProductPrice(new BigDecimal(16.8));
        orderDetail.setProductQuantity(6);

        OrderDetail result = repository.save(orderDetail);
        Assert.assertNotNull(result);

    }

    @Test
    public void findByOrderId() {
        /** 一个 order_id 可能对应多个 order_detail */
        List<OrderDetail> result = repository.findByOrderId("15454545");
        Assert.assertNotEquals(0, result.size());


    }
}