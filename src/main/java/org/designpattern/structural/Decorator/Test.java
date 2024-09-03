package org.designpattern.structural.Decorator;

public class Test {

    public static void main(String[] args) {
         Pizza pizza = new PlainPizza();
//         pizza.bake();
         Pizza pizza1 = new CheezePizzaDecorator(new PlainPizza());
//         pizza1.bake();
         Pizza pizza2 = new VeggiePizzaDecorator(new CheezePizzaDecorator(new PlainPizza()));
         pizza2.bake();

    }
}
