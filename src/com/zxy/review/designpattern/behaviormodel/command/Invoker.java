package com.zxy.review.designpattern.behaviormodel.command;

/**
 * Created by zxy on 2017/3/17.
 */
public class Invoker {

    public enum CommandName {
        TURN_ON,
        TURN_OFF,
    }

    private AbstractCommand [] commands;

    public Invoker() {
        commands = new AbstractCommand[2];
        commands[0] = new TurnOnCommand(new TurnOnReceiver());
        commands[1] = new TurnOffCommand(new TurnOffReceiver());
    }

    public   void invoke(CommandName name) {
        switch (name.ordinal()) {
            case 0 :
                System.out.println("command TURN_ON");
                commands[0].execute();
                break;

            case 1:
                System.out.println("command TURN_OFF");
                commands[1].execute();
                break;

                default:
                    System.err.println("error command name !!! ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Invoker invoker = new Invoker();
        invoker.invoke(CommandName.TURN_ON);
        invoker.invoke(CommandName.TURN_OFF);
    }


}
