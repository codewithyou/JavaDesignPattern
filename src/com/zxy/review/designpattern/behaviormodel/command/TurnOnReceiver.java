package com.zxy.review.designpattern.behaviormodel.command;

/**
 * Created by zxy on 2017/3/17.
 */
public class TurnOnReceiver implements AbstractReceiver {
    @Override
    public void doJob() {
        System.out.println(" do  turn on tv command !");
    }
}
