package com.zxy.review.designpattern.structuremodel.facade;

public class Main {

    public static void main(String[] args) {
        System.out.println("门面模式-外观模式-facade模式 !");
        MyFacade myFacade = new MyFacade();
        myFacade.gonshangKaihu();
        myFacade.yinhangKaihu();
        myFacade.doOther();
    }
}
