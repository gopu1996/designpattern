package org.designpattern.structural.Flyweight;

public class Circle extends Shape{

    private String label;

    public Circle() {
       label = "Circle";
    }

    public String label() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    @Override
    public void draw(double radius , String fillColor , String lineColor) {
        System.out.println("Drawing a "+ label +" with radius of "+ radius + " , fillColor " + fillColor + " and line color is "+ lineColor);
    }


}
