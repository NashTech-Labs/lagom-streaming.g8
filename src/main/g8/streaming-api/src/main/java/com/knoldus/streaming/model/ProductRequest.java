package com.knoldus.streaming.model;

import java.util.List;

public class ProductRequest {
    private String category = null;
    private List<String> products = null;

    public ProductRequest() {
    }

    public ProductRequest(String category, List<String> products) {
        this.category = category;
        this.products = products;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }
}
