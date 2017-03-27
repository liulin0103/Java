package pers.liulin.design_pattern.iterator;

/**
 * Created by LiuLin on 2017/3/27 0027.
 */
public interface Iterator {

    public abstract boolean hasNext();

    public abstract Object next();
    /**
     *  这里有必要说明以下next方法。
     *  该方法的返回类型是Object，这表明该方法返回的是集合中的一个元素。
     *  但是，为了能够在下次调用next方法时返回正确的下一个元素，该方法中还隐含着将迭代器移动至下一个元素的处理。
     *
     */
}
