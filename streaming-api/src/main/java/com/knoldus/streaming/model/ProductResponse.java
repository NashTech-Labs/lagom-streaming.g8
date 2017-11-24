package com.knoldus.streaming.model;

public class ProductResponse {
    private String category = null;
    private String product = null;

    public ProductResponse(){}

    public ProductResponse(String category, String product) {
        this.category = category;
        this.product = product;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
}
