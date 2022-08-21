package com.github.hcsp.polymorphism;

public class 菜 {
    private String name;
    private String wok;

    public 菜(String name, String wok) {
        this.name = name;
        this.wok = wok;
    }

    public 菜(String name) {
        this.name = name;
        this.wok = "炒锅";
    }

    public void 做一个菜() {
        洗锅();
        倒油();
        开始烹饪();
        放佐料();
        出锅();
    }

    public void 洗锅() {
        System.out.println("洗" + wok);
    }

    public void 倒油() {
        System.out.println("倒一点点油");
    }

    public void 开始烹饪() {
        System.out.println("炒啊炒啊炒");
    }

    public void 放佐料() {
        System.out.println("放盐");
    }

    public void 出锅() {
        System.out.println("香喷喷的" + name + "出锅啦");
    }
}
