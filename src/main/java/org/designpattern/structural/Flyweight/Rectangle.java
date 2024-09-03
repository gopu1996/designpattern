package org.designpattern.structural.Flyweight;

public class Rectangle extends Shape{

    private String label;

    public Rectangle() {
       label = "Rectangle";
    }

    public String label() {
        return label;
    }

    public Rectangle setLabel(String label) {
        this.label = label;
        return this;
    }

    @Override
    public void draw(int length, int breadth , String color) {
        System.out.println("Drawing a "+label +" with length "+ length + " with breadth of "+breadth + " and color is "+color);
    }
}
