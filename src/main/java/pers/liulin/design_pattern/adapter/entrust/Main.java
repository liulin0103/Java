package pers.liulin.design_pattern.adapter.entrust;

/**
 * Created by LiuLin on 2017/3/30 0030.
 */
public class Main {
    /**
     * 代理模式的委托方式
     * 在Java中,委托就是指将某个方法中的实际处理交给其他实例的方法.
     */
    public static void main(String[] args) {
        Print p = new PrintBanner("LiuLin");
        p.printStrong();
        p.printWeak();
    }
}
/**
 * Adapter 模式中登场的角色：
 * --target（对象）
 *      负责定义所需方法。在示例程序中： print接口（继承方式）和Print类（委托方式）
 * --Client（请求者）
 *      负责使用Target角色定义的方法进行具体处理。在示例程序中：Main类
 * --Adaptee（被适配）
 *      在示例程序中： Banner类
 * --Adapter（适配）
 *      使用Adapter角色的方法来满足Target角色的需求，这是Adapter模式的目的。在示例程序中： PrintBanner类
 *  在类适配器模式中：    Adapter 角色 通过继承来使用 Adaptee 角色。
 *  在对象适配器模式中：  Adapter 角色 通过委托来使用 Adaptee 角色。
 *
 * 什么时候使用Adapter模式：
 *      很多时候我们并非从零开始编程，经常会用到现有的类，
 *      Adapter模式会对现有的类进行适配，生成新的类，通过该方式我们可以很方便地创建我们需要的方法群。
 *
 * 如果没有现成的代码：
 *      使用Adapter模式可以在完全不改变现有代码的前提下使现有代码适配于新的接口。
 *      在Adapter模式中，并非一定要有现成的代码。只要知道现有类的功能，就可以编写出新的类。
 *
 * 版本升级与兼容性：
 *      可以使用Adapter模式使新旧版本兼容。
 *      加入今后只想维护新版本，可以让新版本扮演Adaptee角色，旧版本扮演Target角色。
 *      编写一个Adapter角色的类，让它使用新版本的类来实现旧版本类中的方法。
 *
 */