package com.github.hcsp.polymorphism;

public class 菜 {
    String name;

    public 菜(String name) {
        this.name = name;
    }

    public void 做一个菜() {
        洗锅(name);
        倒油(name);
        开始烹饪();
        放佐料();
        出锅();
    }

    public void 洗锅(String name) {
        if (name.contains("炒")) {
            System.out.println("洗炒锅");
        } else if (name.contains("煎")) {
            System.out.println("洗煎锅");
        }
        ;
    }

    public void 倒油(String name) {
        if (name.contains("清炒")) {
            System.out.println("倒一点点油");
        } else {
            System.out.println("倒油");
        }
    }

    public void 开始烹饪() {
//        烹饪由每个菜单独覆写
    }

    public void 放佐料() {
//      放的佐料由每个菜的类覆写
    }

    public void 出锅() {
        System.out.println("香喷喷的" + name + "出锅啦");
    }
}
