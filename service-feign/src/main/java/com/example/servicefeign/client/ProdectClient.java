package com.example.servicefeign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//客戶端這樣寫
@FeignClient(name = "SERVICE-HI")
public interface ProdectClient {
    @GetMapping("/msg")
    String produceMsg();
}
