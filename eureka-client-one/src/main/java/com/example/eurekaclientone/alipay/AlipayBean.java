package com.example.eurekaclientone.alipay;

/**
 * @author 全
 * @date  Jul 31,2019
 */
public class AlipayBean {

    /**
     * 商户订单号，必填
     *
     */
    private String out_trade_no;
    /**
     * 订单名称，必填
     */
    private String subject;
    /**
     * 付款金额，必填
     * 根据支付宝接口协议，必须使用下划线
     */
    private String total_amount;
    /**
     * 商品描述，可空
     */
    private String body;
    /**
     * 超时时间参数
     */
    private String timeout_express= "10m";
    /**
     * 产品编号
     */
    private String product_code= "FAST_INSTANT_TRADE_PAY";

    /**
     * Gets out_trade_no
     *
     * @return value of out_trade_no
     */
    public String getOut_trade_no() {
        return out_trade_no;
    }

    /**
     * @param out_trade_no out_trade_no
     */
    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    /**
     * Gets subject
     *
     * @return value of subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject subject
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * Gets total_amount
     *
     * @return value of total_amount
     */
    public String getTotal_amount() {
        return total_amount;
    }

    /**
     * @param total_amount total_amount
     */
    public void setTotal_amount(String total_amount) {
        this.total_amount = total_amount;
    }

    /**
     * Gets body
     *
     * @return value of body
     */
    public String getBody() {
        return body;
    }

    /**
     * @param body body
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * Gets timeout_express
     *
     * @return value of timeout_express
     */
    public String getTimeout_express() {
        return timeout_express;
    }

    /**
     * @param timeout_express timeout_express
     */
    public void setTimeout_express(String timeout_express) {
        this.timeout_express = timeout_express;
    }

    /**
     * Gets product_code
     *
     * @return value of product_code
     */
    public String getProduct_code() {
        return product_code;
    }

    /**
     * @param product_code product_code
     */
    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }
}
