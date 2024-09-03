package org.designpattern.creational.singleton;

public class EagerSingleton {

//    private  static  EagerSingleton eagerSingleton =  new EagerSingleton();


// Using static block
    private  static  EagerSingleton eagerSingleton;

    static {
        eagerSingleton = new EagerSingleton();
    }

   private  EagerSingleton() {

    }

    public static EagerSingleton getInstance(){
       return  eagerSingleton;
    }

}
