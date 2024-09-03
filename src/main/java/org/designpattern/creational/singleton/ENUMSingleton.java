package org.designpattern.creational.singleton;

public enum ENUMSingleton {

    INSTANCE;
    String name;


    public String getName() {
        return name;
    }

    public ENUMSingleton setName(String name) {
        this.name = name;
        return this;
    }
}
