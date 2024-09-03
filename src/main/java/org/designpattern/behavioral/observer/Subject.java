package org.designpattern.behavioral.observer;

public interface Subject {

    void register();
    void unRegister(Observers observers);
    void notifyOther();
}
