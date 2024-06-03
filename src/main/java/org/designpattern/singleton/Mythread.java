package org.designpattern.singleton;

public class Mythread {

  Runnable runnable = () ->{
           ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
           System.out.println(Thread.currentThread().getName()+ "  "+ threadSafeSingleton.hashCode());
    };
}
