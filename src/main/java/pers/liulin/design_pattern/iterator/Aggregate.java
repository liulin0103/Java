package pers.liulin.design_pattern.iterator;

/**
 * Created by LiuLin on 2017/3/27 0027.
 *
 */

public interface Aggregate {
    public abstract Iterator iterator();
     // 在Aggregate接口中声明的方法只有一个--iterator方法。该方法会生成一个用于遍历集合的迭代器。
     // 想要遍历集合中的元素时，可以调用iterator方法来生成一个实现了Iterator接口的实例。

}
