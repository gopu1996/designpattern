package org.designpattern.behavioral.chainofresponsibility;

public class AddNumbers implements Chain{

    private Chain chain;

    @Override
    public void SetNextChain(Chain nextChain) {
        this.chain =nextChain;

    }

    @Override
    public void Calculate(Numbers number) {
       if(number.calculationMethod() == "add"){
           System.out.println( number.num1() + number.num2() );
       } else {
           chain.Calculate(number);
       }
    }
}
