package com.example.eurekaclientone.alipay.controller;

import com.alipay.api.AlipayApiException;
import com.example.eurekaclientone.alipay.AlipayBean;
import com.example.eurekaclientone.alipay.service.Payservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private Payservice payservice;

    @PostMapping(value = "/alipay")
    public  String alipay(String outTradeNo,String subject,String totalAmout,String body)throws AlipayApiException {

        AlipayBean alipayBean = new AlipayBean();
        alipayBean.setOut_trade_no(outTradeNo);
        alipayBean.setSubject(subject);
        alipayBean.setTotal_amount(totalAmout);
        alipayBean.setBody(body);
        return payservice.aliPay(alipayBean);
    }

}
