package pers.liulin.design_pattern.adapter.extend;

/**
 * Created by LiuLin on 2017/3/30 0030.
 */
public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}
