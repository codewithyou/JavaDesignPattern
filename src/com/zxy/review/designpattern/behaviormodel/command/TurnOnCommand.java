package com.zxy.review.designpattern.behaviormodel.command;

/**
 * Created by zxy on 2017/3/17.
 */
public class TurnOnCommand extends AbstractCommand {


    public TurnOnCommand(TurnOnReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println(" 分发执行打开电视命令 !");
        this.receiver.doJob();
    }
}
