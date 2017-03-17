package com.zxy.review.designpattern.structuremodel.adapter;

/**
 * Created by zxy on 2017/3/16.
 */
//public class Adapter  extends Adaptee implements Target  { //这个是类模式
public class Adapter implements Target  {//这个是对象模式的适配
    Adaptee adaptee;

    public Adapter( Adaptee adaptee ) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        //适配
        this.adaptee.specialRequest();
    }



}
