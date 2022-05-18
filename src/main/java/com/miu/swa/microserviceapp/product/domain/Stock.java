package com.miu.swa.microserviceapp.product.domain;

public class Stock {
    private Integer stockNumber;
    private Integer productNumber;
    private Integer quantity;

    public Stock(Integer stockNumber, Integer productNumber, Integer quantity) {
        this.stockNumber = stockNumber;
        this.productNumber = productNumber;
        this.quantity = quantity;
    }

    public Integer getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(Integer stockNumber) {
        this.stockNumber = stockNumber;
    }

    public Integer getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(Integer productNumber) {
        this.productNumber = productNumber;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
