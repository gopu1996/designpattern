package org.designpattern.behavioral.chainofresponsibility;

public interface Chain {

    void SetNextChain(Chain nextChain);
    void Calculate(Numbers number);
}
