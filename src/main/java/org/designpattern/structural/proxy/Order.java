package org.designpattern.structural.proxy;

public class Order {

    private int id;
    private String productName;
    private String  quantity;

    public int id() {
        return id;
    }

    public Order setId(int id) {
        this.id = id;
        return this;
    }

    public String productName() {
        return productName;
    }

    public Order setProductName(String productName) {
        this.productName = productName;
        return this;
    }

    public String quantity() {
        return quantity;
    }

    public Order setQuantity(String quantity) {
        this.quantity = quantity;
        return this;
    }

}
