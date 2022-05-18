package com.miu.swa.microserviceapp.product.domain;

public class Product {
    private Integer productNumber;
    private String name;
    private Integer stockNumber;

    public Integer getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(Integer productNumber) {
        this.productNumber = productNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(Integer stockNumber) {
        this.stockNumber = stockNumber;
    }

    public Product(Integer productNumber, String name, Integer stockNumber) {
        this.productNumber = productNumber;
        this.name = name;
        this.stockNumber = stockNumber;
    }
}
