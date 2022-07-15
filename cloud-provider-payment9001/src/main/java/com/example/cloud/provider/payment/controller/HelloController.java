package com.example.cloud.provider.payment.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kezhene
 */
@RestController
@RequestMapping("/hello")
@RefreshScope
public class HelloController {

    @Value("${user.name}")
    private String info;

    @GetMapping("/a")
    public String hello(@RequestParam("id") Integer id) {
        return "hello:" + info;
    }
}
