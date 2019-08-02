package com.example.eurekaclientone.alipay.service.impl;

import com.alibaba.fastjson.JSON;
import com.alipay.api.AlipayApiException;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.example.eurekaclientone.alipay.Alipay;
import com.example.eurekaclientone.alipay.AlipayBean;
import com.example.eurekaclientone.alipay.service.Payservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayServiceImpl implements Payservice {

    @Autowired
    private Alipay  alipay;
    @Override
    public String aliPay(AlipayBean alipayBean) throws AlipayApiException {
        /**
         * 初始化AlipayClient对象
         */
        //设置请求参数
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl(Alipay.returnUrl);
        alipayRequest.setNotifyUrl(Alipay.notifyUrl);
        //封装参数
        alipayRequest.setBizContent(JSON.toJSONString(alipayBean));
        //请求支付宝进行付款，获取支付结果
        String result =alipay.getAlipayClient().pageExecute(alipayRequest).getBody();
        return result;

    }
}
