package org.designpattern.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class CustomerProxyImpl implements Customer{

    CustomerImp customerImp = new CustomerImp();
    List<Order> order = new ArrayList<>();

    @Override
    public int getId() {
        return customerImp.getId();
    }

    @Override
    public List<Order> getOrder() {
        Order order1 =  new Order();
        order1.setId(1);
        order1.setProductName("Android");
        order1.setQuantity("100");
        order.add(order1);

        return order;
    }
}
