package com.example.servicefeign.controller;


import com.example.servicefeign.service.HelloService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;
  /*  @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService(name);
    }

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam String name) {
        return helloService.helloService(name);
    }*/

    /**
     * loadBalancerClicent选择服务名通过restTemplate调用其他应用
     * @return
     */
    @RequestMapping(value = "/ribbon")
    public String getProductMsg(){
       /* //
        RestTemplate restTemplate = new RestTemplate();
        ServiceInstance serviceInstance = loadBalancerClient.choose("SERVICE-HI");
        String url = String.format("http://%s:%s",serviceInstance.getHost(),serviceInstance.getPort()+"/msg");
        return  restTemplate.getForObject(url,String.class);*/
        //2 用注解的方式
        String responde = restTemplate.getForObject("http://SERVICE-HI/msg", String.class);
        return responde;
    }

    /*@Autowired
    private ProdectClient prodectClient;

    @GetMapping("/getProductMsg")
    public String getProductMsg2() {
        String responce = prodectClient.produceMsg();
        return responce;
    }*/
}
