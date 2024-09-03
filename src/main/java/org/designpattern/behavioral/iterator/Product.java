package org.designpattern.behavioral.iterator;

public class Product {

    private String productName;

    public String productName() {
        return productName;
    }

    public Product setProductName(String productName) {
        this.productName = productName;
        return this;
    }
}
