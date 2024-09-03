package org.designpattern.factory;

public class VegPizza implements Pizza{


    @Override
    public void prepare() {
        System.out.println("Veg pizza is preparing ");
    }

    @Override
    public void bake() {
        System.out.println("Veg pizza is baking ");
    }

    @Override
    public void cut() {
        System.out.println("Veg pizza is cutting into slices");
    }
}
