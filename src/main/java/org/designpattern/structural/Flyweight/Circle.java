package org.designpattern.structural.Flyweight;

public class Circle extends Shape{

    private String label;

    public Circle() {
       label = "Circle";
    }

    public String label() {
        return label;
    }

    public Circle setLabel(String label) {
        this.label = label;
        return this;
    }



    @Override
    public void draw(int radius ,  String fillColor, String lineColor) {
        System.out.println("Drawing a "+label +" with radius "+ radius + " with fillColor of "+fillColor + " and line color is "+lineColor);
    }
}
