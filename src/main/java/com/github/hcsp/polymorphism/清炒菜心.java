package com.github.hcsp.polymorphism;

public class 清炒菜心 extends 菜 {
    public 清炒菜心() {
        super("清炒菜心");
    }
    @Override
    public void 倒油() {
        System.out.println("倒一点点油");
    }
    @Override
    public void 放佐料() {
        System.out.println("酱油");
        System.out.println("放盐");
    }
}
