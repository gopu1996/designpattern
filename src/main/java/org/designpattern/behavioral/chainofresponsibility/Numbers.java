package org.designpattern.behavioral.chainofresponsibility;

public class Numbers {

    private int num1;
    private  int num2;
    private String calculationMethod;

    public Numbers(int num1, int num2, String calculationMethod) {
        this.num1 = num1;
        this.num2 = num2;
        this.calculationMethod = calculationMethod;
    }

    public int num1() {
        return num1;
    }

    public Numbers setNum1(int num1) {
        this.num1 = num1;
        return this;
    }

    public int num2() {
        return num2;
    }

    public Numbers setNum2(int num2) {
        this.num2 = num2;
        return this;
    }

    public String calculationMethod() {
        return calculationMethod;
    }

    public Numbers setCalculationMethod(String calculationMethod) {
        this.calculationMethod = calculationMethod;
        return this;
    }
}
