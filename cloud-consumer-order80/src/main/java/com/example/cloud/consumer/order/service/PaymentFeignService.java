package com.example.cloud.consumer.order.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author yh
 * @date 2022/7/17 15:26
 */
@FeignClient("nacos-config")
public interface PaymentFeignService {

    @GetMapping("/hello/b")
    public String test();

    @GetMapping("/hello/timeout")
    public String timeout();
}
