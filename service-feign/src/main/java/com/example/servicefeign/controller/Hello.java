package com.example.servicefeign.controller;

import com.quan.peak.dto.PayDTO;
import com.quan.peak.dto.RefundDTO;
import com.quan.peak.service.IWPayService;
import feign.Headers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

/**
 * \* @Author: Quan
 * \* @Date: 2019/8/2 0002
 * \
 */
@RestController
@RequestMapping("/wxpay")
public class Hello {

     @Autowired
     private IWPayService iwPayService;

     @PostMapping(value = "/pay")
     public String  alipay(PayDTO alipayDto,String tradeType) {
          return iwPayService.pay( alipayDto, tradeType);
     }

     @PostMapping(value = "/refund")
     public String  refund(RefundDTO refundDTO) {
          return iwPayService.refund(refundDTO);
     }


}
