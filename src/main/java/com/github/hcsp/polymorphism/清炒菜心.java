package com.github.hcsp.polymorphism;

public class 清炒菜心 extends 菜 {
    @Override
    public void 倒油() {
        System.out.println("倒一丢丢油");
    }

    @Override
    public void 开始烹饪() {
        System.out.println("放青菜");
        System.out.println("炒啊炒啊炒");
    }

    @Override
    public void 出锅() {
        System.out.println("香喷喷的清炒青菜出锅啦");
    }
}
