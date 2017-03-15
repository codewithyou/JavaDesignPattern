package com.zxy.review.designpattern.structuremodel.facade;

/**
 * Created by zxy on 2017/3/15.
 */
public class GongShang implements DoThings {
    @Override
    public void doThing1() {
        System.out.println("GongShang 核名");
    }

    @Override
    public void doThing2() {
        System.out.println("GongShang 填写资料");
    }
}
