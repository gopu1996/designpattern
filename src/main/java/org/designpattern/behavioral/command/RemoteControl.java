package org.designpattern.behavioral.command;

public class RemoteControl {

    private  Command command;

    public Command command() {
        return command;
    }

    public RemoteControl setCommand(Command command) {
        this.command = command;
        return this;
    }

    public void pressButton(){
        command.execute();
    }
}

