package com.example.eurekaclientone.alipay.service;

import com.alipay.api.AlipayApiException;
import com.example.eurekaclientone.alipay.AlipayBean;

public interface  Payservice {

    String  aliPay(AlipayBean alipayBean) throws AlipayApiException;
}
