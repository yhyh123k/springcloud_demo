package com.example.cloud.provider.payment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kezhene
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam("id") Integer id) {
        return "hello:" + id;
    }
}
