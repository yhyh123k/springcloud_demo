package com.example.seata.order.service.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 订单
 * @author yh
 * @date 2022/7/17 23:44
 */
@Data
public class Order {

    private Long id;
    private Long userId;
    private Long productId;
    private Integer count;
    private BigDecimal money;
    private Integer status;
}
