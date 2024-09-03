package org.designpattern.structural.Flyweight;

public class Circle implements Shape{

    private String label;
    private String radius;
    private String fillColor;
    private String lineColor;

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

    public String radius() {
        return radius;
    }

    public Circle setRadius(String radius) {
        this.radius = radius;
        return this;
    }

    public String fillColor() {
        return fillColor;
    }

    public Circle setFillColor(String fillColor) {
        this.fillColor = fillColor;
        return this;
    }

    public String lineColor() {
        return lineColor;
    }

    public Circle setLineColor(String lineColor) {
        this.lineColor = lineColor;
        return this;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a "+label +" with radius "+ radius + " with fillColor of "+fillColor + " and line color is "+lineColor);
    }
}
