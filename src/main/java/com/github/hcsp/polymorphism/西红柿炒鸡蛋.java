package com.github.hcsp.polymorphism;

public class 西红柿炒鸡蛋 extends 菜{
    @Override
    public void 开始烹饪(){
        System.out.println("放鸡蛋");
        System.out.println("放西红柿");
       super.开始烹饪();
    }
    public 西红柿炒鸡蛋() {
        super("西红柿炒鸡蛋");
    }
}
