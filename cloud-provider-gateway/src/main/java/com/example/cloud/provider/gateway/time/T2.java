package com.example.cloud.provider.gateway.time;

import java.time.ZonedDateTime;

/**
 * @author yh
 * @date 2022/7/16 23:00
 */
public class T2 {
    public static void main(String[] args) {
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);
        Integer integer1 = new Integer(1);
        Integer integer2 = new Integer(1);
        System.out.println(integer1 == integer2);
    }
}
