package org.designpattern.singleton;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton threadSafeSingleton;

    private ThreadSafeSingleton(){

    }

    public static ThreadSafeSingleton getInstance(){

        if (threadSafeSingleton == null){
            synchronized (ThreadSafeSingleton.class){
                 if (threadSafeSingleton == null){
                     threadSafeSingleton = new ThreadSafeSingleton();
                 }
            }
        }

        // output without using synchronized
        //pool-1-thread-2  1377501410
        //pool-1-thread-2  1093588460
        //pool-1-thread-1  1093588460

        // output with using synchronized
//        pool-1-thread-2  2047056122
//        pool-1-thread-1  2047056122
//        pool-1-thread-2  2047056122


        /*
        his also method to make thread safe but it will synchronized all the method


        public static synchronized ThreadSafeSingleton getInstance(){
            if (threadSafeSingleton == null){
                threadSafeSingleton = new ThreadSafeSingleton();
            }

         */

        return threadSafeSingleton;
    }
}
