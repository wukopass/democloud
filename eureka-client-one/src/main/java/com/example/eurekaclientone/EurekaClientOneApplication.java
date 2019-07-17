package com.example.eurekaclientone;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@EnableEurekaClient
@SpringBootApplication
@RestController
@ComponentScan(basePackages = "com.example.eurekaclientone")
public class EurekaClientOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientOneApplication.class, args);
    }

    @Value("${server.port}")
    String port;


    @RequestMapping("/hello")
    public Object home(@RequestParam String name) {
        Map<String, Object> map = new HashMap<String, Object>();
        String s = "hello" + name + " ,ian  from port:" + port;
        map.put("srt", s);
        return map;
    }

    @RequestMapping("/msg")
    public String getMsg() {
        return "hello i am msg 2";
    }
    /*@RequestMapping("/mss")
    public String getMsgs() {
        return api.produceMsg();
    }*/

}
