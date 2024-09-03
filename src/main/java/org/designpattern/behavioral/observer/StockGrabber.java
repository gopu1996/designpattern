package org.designpattern.behavioral.observer;

import java.util.ArrayList;

public class StockGrabber implements Subject{

    private ArrayList<Observers> observers;
    private double ibmPrice;
    private double applePrice;
    private double googlePrice;

    public  StockGrabber(){
        observers =  new ArrayList<Observers>();
    }




    @Override
    public void register() {
       observers.add(observer);
    }

    @Override
    public void unRegister(Observers observer) {
        int indexToDelete = observers.indexOf(observer);
        System.out.println("Observer " + (indexToDelete + 1 ) +" is deleted" );
        observers.remove(indexToDelete);
    }

    @Override
    public void notifyOther() {
        for (Observers observers1 : observers){
            observers1.update(ibmPrice,applePrice,googlePrice);
        }
    }

    public double ibmPrice() {
        return ibmPrice;
    }

    public StockGrabber setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyOther();
        return this;
    }

    public double applePrice() {
        return applePrice;
    }

    public StockGrabber setApplePrice(double applePrice) {
        this.applePrice = applePrice;
        notifyOther();

        return this;
    }

    public double googlePrice() {
        return googlePrice;
    }

    public StockGrabber setGooglePrice(double googlePrice) {
        this.googlePrice = googlePrice;
        notifyOther();

        return this;
    }

}
