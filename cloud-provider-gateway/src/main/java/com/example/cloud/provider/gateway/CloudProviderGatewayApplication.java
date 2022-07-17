package com.example.cloud.provider.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudProviderGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderGatewayApplication.class, args);
    }

}
