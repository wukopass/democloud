package com.example.eurekaclientone.alipay;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import org.springframework.stereotype.Component;

/**
 *
 *初始化需要的参数和bean
 */
@Component
public class Alipay {

    public static String serverUrl = AlipayProperties.getGatewayUrl();
    public static String appId = AlipayProperties.getAppId();
    public static String privateKey = AlipayProperties.getPrivateKey();
    public static String publickey = AlipayProperties.getPublicKey();
    public static String format = "json";
    public static String charset = AlipayProperties.getCharset();
    public static String singType = AlipayProperties.getSignType();
    public static String  returnUrl =AlipayProperties.getReturnUrl();
    public static String  notifyUrl = AlipayProperties.getNotifyUrl();

    public AlipayClient getAlipayClient(){
        return new DefaultAlipayClient(serverUrl, appId, privateKey,
                format, charset, publickey, singType);
    }

}
