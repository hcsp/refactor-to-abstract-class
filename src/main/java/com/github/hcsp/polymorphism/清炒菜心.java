package com.github.hcsp.polymorphism;

public class 清炒菜心 extends 菜{
    public 清炒菜心() {
        super("清炒菜心");
    }

    @Override
    public void 开始烹饪() {
        System.out.println("放菜心");
        System.out.println("炒啊炒啊炒");
    }
}
