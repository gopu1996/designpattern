package org.designpattern.behavioral.observer;

public class StockObserver implements Observers{

    private double ibmPrice;
    private double applePrice;
    private double googlePrice;

    private  static int observerTrack = 0;
    private int observerId;
    private Subject subject;

    public StockObserver(Subject subject){
        this.subject = subject;
        this.observerId = ++observerTrack;
        System.out.println("New Observer "+ this.observerId);
        subject.register();
    }

    @Override
    public void update(double ibmPrice, double applePrice, double googlePrice) {
        this.ibmPrice = ibmPrice;
        this.applePrice = applePrice;
        this.googlePrice = googlePrice;

    }
}
