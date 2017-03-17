package com.zxy.review.designpattern.behaviormodel.command;

/**
 * Created by zxy on 2017/3/17.
 */
public abstract class  AbstractCommand {
         AbstractReceiver receiver;
         abstract  void execute() ;
}
