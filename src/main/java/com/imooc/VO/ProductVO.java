package com.imooc.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @author wwf
 * @date 2019/7/17 12:27
 * 商品(包含类目)
 */

/**
 * "name": "热榜",
 * "type": 1,
 * "foods": [
 */
@Data
public class ProductVO {

    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductinfoVO> productinfoVOList;
}
