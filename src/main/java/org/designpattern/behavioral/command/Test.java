package org.designpattern.behavioral.command;

public class Test {

    public static void main(String[] args) {

        Television television = new Television();
        RemoteControl remoteControl = new RemoteControl();
//        OnCommand on = new OnCommand(television);
//        remoteControl.setCommand(on);
//        remoteControl.pressButton();

        OffCommand offCommand = new OffCommand(television);
        remoteControl.setCommand(offCommand);
        remoteControl.pressButton();



    }
}
