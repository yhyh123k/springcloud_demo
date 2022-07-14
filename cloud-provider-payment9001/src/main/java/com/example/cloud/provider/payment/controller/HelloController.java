package com.example.cloud.provider.payment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kezhene
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/a")
    public String hello(@RequestParam("id") Integer id) {
        return "hello:" + id;
    }
}
