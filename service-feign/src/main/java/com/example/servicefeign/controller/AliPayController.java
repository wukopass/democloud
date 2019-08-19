package com.example.servicefeign.controller;

import com.netflix.discovery.converters.Auto;
import com.quan.peak.dto.PayDTO;
import com.quan.peak.service.IAliPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * \* @Author: Quan
 * \* @Date: 2019/8/19 0019
 * \
 */
@RestController
@RequestMapping("/alipay")
public class AliPayController {

    @Autowired
    private IAliPayService aliPayService;

    @PostMapping(value = "/netpay")
    public String  wxpay( PayDTO alipayDto, String tradeType) {
        return  aliPayService.pay( alipayDto, tradeType);
    }


}
