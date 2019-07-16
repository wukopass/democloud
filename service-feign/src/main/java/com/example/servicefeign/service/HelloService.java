package com.example.servicefeign.service;



import org.springframework.stereotype.Service;


@Service
public class HelloService {

   /* @Autowired
    RestTemplate restTemplate;

   public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name, String.class);
    }

   public  String helloService(String name) {
       ResponseEntity<Object> forEntuty = restTemplate.getForEntity("http://SERVICE-HI/hello?name=" + name, Object.class);
       Object forObject  = restTemplate.getForObject("http://SERVICE-HI/hello?name=" + name, Object.class);
       return  "";
   }*/
}
