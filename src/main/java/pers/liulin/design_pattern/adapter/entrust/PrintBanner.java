package pers.liulin.design_pattern.adapter.entrust;

/**
 * Created by LiuLin on 2017/3/30 0030.
 */
public class PrintBanner extends Print {
    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    public void printWeak() {
        banner.showWithParen();
    }

    public void printStrong() {
        banner.showWithAster();
    }
}
