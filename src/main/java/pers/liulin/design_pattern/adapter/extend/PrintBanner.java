package pers.liulin.design_pattern.adapter.extend;

/**
 * Created by LiuLin on 2017/3/30 0030.
 */
public class PrintBanner extends Banner implements Print {

    public PrintBanner(String string) {
        super(string);
    }

    public void printWeak() {
        showWithParen();
    }

    public void printStrong() {
        showWithAster();
    }
}
