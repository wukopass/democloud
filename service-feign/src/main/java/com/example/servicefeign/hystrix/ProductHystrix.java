package com.example.servicefeign.hystrix;

import com.example.servicefeign.client.ProductApi;
import com.example.servicefeign.util.QuanException;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ProductHystrix  implements FallbackFactory<ProductApi> {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductHystrix.class);

    @Override
    public ProductApi create(Throwable throwable) {
      return new ProductApi() {
          @Override
          public String produceMsg() {
              LOGGER.error("調用 productHystrix 失敗");
              throw new QuanException("调用 productHystrix失败");
          }

          @Override
          public String newProductMsg() {
              return null;
          }
      };
    }
}
