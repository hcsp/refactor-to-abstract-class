package com.github.hcsp.polymorphism;

public class 煎牛排 extends 菜{

    //public void 煎个牛排() {

        //System.out.println("倒油");

       // System.out.println("放盐");
        //System.out.println("香喷喷的煎牛排出锅啦");
    //}

    @Override
    public void 洗锅() {
        System.out.println("洗煎锅");
    }

    @Override
    public void 开始烹饪() {
        System.out.println("放牛排");
        System.out.println("煎啊煎啊煎");
        System.out.println("放胡椒粉");
    }

    @Override
    public void 出锅() {
        System.out.println("香喷喷的煎牛排出锅啦");
    }
}
