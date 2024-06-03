package org.designpattern.singleton;

import java.io.Serializable;

public class SerializableSingleton implements Serializable {

    private static SerializableSingleton lazySingleton;

    private SerializableSingleton(){

    }

    public static SerializableSingleton getInstance(){
        if (lazySingleton == null)
            lazySingleton = new SerializableSingleton();

        return lazySingleton;
    }

    // Handle the serializable by using readResolve() method

    public Object readResolve(){
        return lazySingleton;
    }
}
