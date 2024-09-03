package org.designpattern.structural.proxy;

import java.util.List;

public class CustomerImp implements Customer{

    private int id;
    private List<Order> orders;


    public CustomerImp() {
        this.id = 123;
    }

    public int getId() {
        return id;
    }

    public CustomerImp setId(int id) {
        this.id = id;
        return this;
    }

    public List<Order> getOrder() {
        return orders;
    }

    public CustomerImp setOrders(List<Order> orders) {
        this.orders = orders;
        return this;
    }
}
