package com.example.servicefeign.client.impl;
import com.example.servicefeign.client.ProductApi;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductClient  implements ProductApi {

    @Override
    public String produceMsg() {
        return "this is my TestApi";
    }
}
