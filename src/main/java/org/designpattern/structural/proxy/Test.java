package org.designpattern.structural.proxy;

public class Test {
    public static void main(String[] args) {
        Customer customer = new CustomerProxyImpl();
        System.out.println(customer.getId());
        System.out.println(  customer.getOrder().get(0).id());
        System.out.println(  customer.getOrder().get(0).productName());
        System.out.println(  customer.getOrder().get(0).quantity());



    }

}
