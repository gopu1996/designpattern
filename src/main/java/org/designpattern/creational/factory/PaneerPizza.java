package org.designpattern.factory;

public class PaneerPizza implements Pizza{


    @Override
    public void prepare() {
        System.out.println("Paneer pizza is preparing ");
    }

    @Override
    public void bake() {
        System.out.println("Paneer pizza is baking ");
    }

    @Override
    public void cut() {
        System.out.println("Paneer pizza is cutting into slices");
    }
}
