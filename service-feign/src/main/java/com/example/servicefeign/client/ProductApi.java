package com.example.servicefeign.client;

import com.example.servicefeign.hystrix.ProductHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 全
 */ //客戶端這樣寫
@FeignClient(name = "SERVICE-RIBBON",value = "quan", fallback = ProductHystrix.class )
public interface ProductApi{
    @GetMapping("/msg")
    String produceMsg();


    @GetMapping("/newMsg")
    String newProductMsg();
}
