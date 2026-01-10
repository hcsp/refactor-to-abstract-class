package com.github.hcsp.polymorphism;

import java.security.PublicKey;

public class 西红柿炒鸡蛋 extends 菜 {
    String name = "西红柿炒鸡蛋";
    @Override
    public void 开始烹饪() {
        System.out.println("放鸡蛋");
        System.out.println("放西红柿");
        System.out.println("炒啊炒啊炒");
    }

    @Override
    public void 放佐料() {
        System.out.println("放盐");
    }

    public void 出锅() {
        System.out.println("香喷喷的"+name+"出锅啦");
    }
}
