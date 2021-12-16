package p03;

/**
 * @author: ymm
 * @date: 2021/12/14
 * @version: 1.0.0
 * @description: Singleton类的封装
 */
public class Singleton {

    // 2.声明本类类型的引用， 指向本类类型的对象
    private static Singleton sin = new Singleton();

    // 1.私有化构造方法

    private Singleton() {

    }

    // 提供公有的get方法，负责将对象返回出去
    public static Singleton getInstance() {
        return sin;
    }

}
