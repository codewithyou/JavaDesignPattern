package com.zxy.review.designpattern.structuremodel.facade;

/**
 * Created by zxy on 2017/3/15.
 */
public class MyFacade  {

    private GongShang gongShang;
    private YinHang yinHang;
    private Other other;

    public MyFacade() {
        this.gongShang = new GongShang();
        this.yinHang = new YinHang();
        this.other = new Other();
    }

    public void gonshangKaihu() {
        this.gongShang.doThing1();
        this.gongShang.doThing2();
    }

    public void yinhangKaihu() {
        this.yinHang.doThing1();
        this.yinHang.doThing2();
    }

    public void doOther() {
        this.other.doThing1();
        this.other.doThing2();
    }

}
