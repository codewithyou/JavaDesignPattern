package com.zxy.review.designpattern.structuremodel.facade;

/**
 * Created by zxy on 2017/3/15.
 */
public class YinHang implements DoThings {
    @Override
    public void doThing1() {
        System.out.println("YinHang 核实信息");
    }

    @Override
    public void doThing2() {
        System.out.println("YinHang 开户");
    }
}
