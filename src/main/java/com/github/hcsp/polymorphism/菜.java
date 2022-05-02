package com.github.hcsp.polymorphism;

public class 菜 {


    private String guoname;
    private String youliang;

    public 菜(String guoname, String youliang, String cainame) {
        this.guoname = guoname;
        this.youliang = youliang;
        this.cainame = cainame;
    }

    private String cainame;

    public void 做一个菜() {
        洗锅();
        倒油();
        开始烹饪();
        放佐料();
        出锅();
    }

    public void 洗锅() {
        System.out.println("洗" + guoname + "锅");
    }

    public void 倒油() {
        System.out.println("倒" + youliang + "油");

    }

    public void 开始烹饪() {
    }

    public void 放佐料() {
        System.out.println("放盐");
    }

    public void 出锅() {
        System.out.println("香喷喷的" + cainame + "出锅啦");
    }
}
