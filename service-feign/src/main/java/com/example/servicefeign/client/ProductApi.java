package com.example.servicefeign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 全
 */ //客戶端這樣寫
@FeignClient(name = "SERVICE-RIBBON")
public interface ProductApi{
    @GetMapping("/msg")
    String produceMsg();
}
