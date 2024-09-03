package org.designpattern.creational.factory;

public class CheesePizza implements Pizza{


    @Override
    public void prepare() {
        System.out.println("Cheese pizza is preparing ");
    }

    @Override
    public void bake() {
        System.out.println("Cheese pizza is baking ");
    }

    @Override
    public void cut() {
        System.out.println("Cheese pizza is cutting into slices");
    }
}
