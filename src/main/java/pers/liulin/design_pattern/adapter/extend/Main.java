package pers.liulin.design_pattern.adapter.extend;

/**
 * Created by LiuLin on 2017/3/30 0030.
 */
public class Main {
    /**
     *  代理模式的继承方式.
     */
    public static void main(String[] args) {
        Print p = new PrintBanner("LiuLin");
        p.printStrong();
        p.printWeak();
    }
}
/**
 *
 *  我们将PrintBanner类的实例保存在了Print类型的变量中。
 *  在Main类中，使用的是Print接口来进行编程的。
 *  对Main类的代码而言，Banner类、showWithParten方法和showWithAster方法完全被隐藏起来了。
 *  Main类并不知道PrintBanner类是怎样实现的。这样就可以在不用对Main类进行修改的情况下改变PrintBanner类的具体实现。
 *
 */