package com.example.servicefeign.controller;

import com.quan.peak.model.dto.AlipayDto;
import com.quan.peak.service.IpayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * \* @Author: Quan
 * \* @Date: 2019/8/2 0002
 * \
 */
@RestController
@RequestMapping("alipay")
public class Hello {

     @Autowired
     private IpayService ipayService;


     @PostMapping(value = "netpay")
     public String  alipay(AlipayDto alipayDto) {
         return  ipayService.netPay(alipayDto);
     }

     @PostMapping(value = "wappay")
     public  String  wappay(AlipayDto alipayDto) {
          return ipayService.wapPay(alipayDto);
     }


}
