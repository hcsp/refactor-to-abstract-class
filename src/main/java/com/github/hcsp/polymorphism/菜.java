package com.github.hcsp.polymorphism;

public class 菜 {
    private String verb;
    private String[] ingredients;
    public void 做一个菜() {
        洗锅();
        倒油();
        开始烹饪();
        放佐料();
        出锅();
    }
    public void 洗锅() {
        print("洗"+this.verb+"锅");
    }
    public void 倒油() {
        print("倒油");
        for(material x:this.ingredients){
            print("放"+x);
        }
    }
    public void 开始烹饪() {
        print(this.verb+"啊"+this.verb+"啊"+this.verb);
    }
    public void 放佐料() {
        print("放盐");
    }
    public void 出锅() {
        print("香喷喷的"+this.getClass().getName()+"出锅啦");
    }
}
