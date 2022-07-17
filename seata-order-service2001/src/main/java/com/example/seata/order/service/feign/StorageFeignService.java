package com.example.seata.order.service.feign;

import com.example.seata.order.service.util.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yh
 * @date 2022/7/17 23:55
 */
@FeignClient("seata-storage-service")
public interface StorageFeignService {

    @PutMapping("/storage/decr")
    CommonResult<Void> decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}
