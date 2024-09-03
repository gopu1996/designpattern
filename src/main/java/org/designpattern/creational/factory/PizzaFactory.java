package org.designpattern.creational.factory;

public class PizzaFactory {

    public static Pizza createPizza(String pizzaType){

        Pizza pizza  = null;

        if(pizzaType.equalsIgnoreCase("cheese")){
            pizza = new CheesePizza();
        } else if (pizzaType.equalsIgnoreCase("paneer")){
            pizza = new PaneerPizza();
        } else if(pizzaType.equalsIgnoreCase("veg")){
            pizza = new VegPizza();
        }

        return pizza;
    }
}
