package org.designpattern.structural.Decorator;

public class CheezePizzaDecorator extends PizzaDecorator{

    public CheezePizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void bake() {
        super.bake();
        System.out.println("Adding Cheese Topping ");
    }
}
