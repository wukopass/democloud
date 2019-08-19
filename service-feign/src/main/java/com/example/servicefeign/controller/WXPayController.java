package com.example.servicefeign.controller;

import com.quan.peak.dto.PayDTO;
import com.quan.peak.dto.RefundDTO;
import com.quan.peak.service.IAliPayService;
import com.quan.peak.service.IWPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
/**
 * \* @Author: Quan
 * \* @Date: 2019/8/2 0002
 * \
 */
@RestController
@RequestMapping("/wxpay")
public class WXPayController {

     @Autowired
     private IWPayService iwPayService;

     @Autowired
     private IAliPayService iAliPayService;

     @PostMapping(value = "/pay")
     public String  wxpay(PayDTO alipayDto,String tradeType) {
          return iwPayService.pay( alipayDto, tradeType);
     }

     @PostMapping(value = "/refund")
     public String  refund(RefundDTO refundDTO) {
          return iwPayService.refund(refundDTO);
     }

     @PostMapping(value = "/netpay")
     public String  alipay(PayDTO alipayDto,String tradeType) {
          return  iAliPayService.pay(alipayDto,tradeType);
     }

     /*@PostMapping(value = "/wappay")
     public  String  wappay(PayDTO alipayDto alipayDto) {
          return iAliPayService.wapPay(alipayDto);
     }*/


}
