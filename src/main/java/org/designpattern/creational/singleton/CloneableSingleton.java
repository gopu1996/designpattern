package org.designpattern.creational.singleton;
import java.lang.Cloneable;

public class CloneableSingleton implements Cloneable{


    private static CloneableSingleton lazySingleton;

    private CloneableSingleton(){

    }

    public static CloneableSingleton getInstance(){
        if (lazySingleton == null)
            lazySingleton = new CloneableSingleton();

        return lazySingleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Here we have throw the exception
//        return super.clone();
        throw new CloneNotSupportedException("Can't not clone the Singleton Class ");
    }


}
