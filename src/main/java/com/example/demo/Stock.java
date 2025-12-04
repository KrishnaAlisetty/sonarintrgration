package com.example.demo;

import java.util.Map;

public class Stock {
    public Map<Product, Long> getProductStock() {
        return productStock;
    }

    public void setProductStock(Map<Product, Long> productStock) {
        this.productStock = productStock;
    }

    private Map<Product, Long> productStock;

}
