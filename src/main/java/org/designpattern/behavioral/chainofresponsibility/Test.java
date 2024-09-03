package org.designpattern.behavioral.chainofresponsibility;

public class Test {

    public static void main(String[] args) {
        Chain addChain =  new AddNumbers();
        Chain subChain = new SubstractNumbers();
        Chain mulChain =  new MultiplyNumbers();

        addChain.SetNextChain(subChain);
        subChain.SetNextChain(mulChain);

        Numbers number = new  Numbers(4,5,"add");
        addChain.Calculate(number);
    }
}
