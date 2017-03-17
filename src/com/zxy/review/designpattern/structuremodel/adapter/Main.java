package com.zxy.review.designpattern.structuremodel.adapter;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Target target = new Adapter(new Adaptee());
        target.request();
    }
}
