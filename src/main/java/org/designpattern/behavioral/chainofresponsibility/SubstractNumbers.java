package org.designpattern.behavioral.chainofresponsibility;

public class SubstractNumbers implements Chain{

    private Chain chain;

    @Override
    public void SetNextChain(Chain nextChain) {
        this.chain =nextChain;

    }

    @Override
    public void Calculate(Numbers number) {
       if(number.calculationMethod() == "sub"){
           System.out.println( number.num1() - number.num2());
       }else {
           chain.Calculate(number);
       }
    }
}
