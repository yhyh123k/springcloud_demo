package com.example.cloud.consumer.order.controller;

import com.example.cloud.consumer.order.service.PaymentFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yh
 * @date 2022/7/17 15:27
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/hello")
    public String hello() {
        return paymentFeignService.test();
    }

    @GetMapping("/consumer/timeout")
    public String timeout() {
        return paymentFeignService.timeout();
    }
}
