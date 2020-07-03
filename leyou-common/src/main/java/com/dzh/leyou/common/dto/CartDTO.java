package com.dzh.leyou.common.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author kueoneko
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartDTO {
    private Long skuId; //商品skuId
    private Integer num; //购买数量
}
