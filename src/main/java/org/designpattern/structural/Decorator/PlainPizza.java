package org.designpattern.structural.Decorator;

public class PlainPizza implements Pizza{

    @Override
    public void bake() {
        System.out.println("This Plain Pizza");
    }
}
