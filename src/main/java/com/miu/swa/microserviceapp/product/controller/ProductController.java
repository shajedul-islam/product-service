package com.miu.swa.microserviceapp.product.controller;

import com.miu.swa.microserviceapp.product.domain.Product;
import com.miu.swa.microserviceapp.product.domain.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    StockFeignClient stockFeignClient;

    @Value("${greeting}")
    private String message;

    @RequestMapping("/")
    public String greeting() {
        return message;
    }

    @RequestMapping("/products/{product-number}")
    public Product getProductByNumber(@PathVariable("product-number") Integer productNumber) {
        return new Product(
                productNumber,
                "ProductXyz",
                stockFeignClient.getStockByProductNumber(productNumber).getStockNumber());
    }

    @FeignClient("stock-service")
    interface StockFeignClient {
        @RequestMapping("/stocks/{product-number}")
        public Stock getStockByProductNumber(@PathVariable("product-number") Integer productNumber);
    }
}
