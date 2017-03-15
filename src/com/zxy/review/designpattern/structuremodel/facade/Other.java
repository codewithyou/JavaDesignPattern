package com.zxy.review.designpattern.structuremodel.facade;

/**
 * Created by zxy on 2017/3/15.
 */
public class Other implements DoThings {
    @Override
    public void doThing1() {
        System.out.println("注册社保账号");
    }

    @Override
    public void doThing2() {
        System.out.println("注册公积金账号");
    }
}
