package com.imooc.controller;

import com.imooc.VO.ProductVO;
import com.imooc.VO.ProductinfoVO;
import com.imooc.VO.ResultVO;
import com.imooc.dataobject.ProductInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * @author wwf
 * @date 2019/7/16 21:22
 * 买家商品
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @GetMapping("/list")
    public ResultVO list() {
        ResultVO resultVO = new ResultVO<>();
        ProductVO productVO = new ProductVO();
        ProductinfoVO productinfoVO = new ProductinfoVO();

        productVO.setProductinfoVOList(Arrays.asList(productinfoVO));
        resultVO.setData(Arrays.asList(productVO));

        resultVO.setCode(0);
        resultVO.setMsg("成功");

        return resultVO;
    }
}
