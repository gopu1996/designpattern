package org.designpattern.factory;

public class PizzaStore {

    public static void orderPizza(String pizzaType){
        Pizza p = PizzaFactory.createPizza(pizzaType);
        p.prepare();
        p.bake();
        p.cut();


    }
}
