package p04;

/**
 * @author: ymm
 * @date: 2022/2/10
 * @version: 1.0.0
 * @description:
 */
public interface InterfaceTest {
    /*public static final*/ int CNT = 1; // 常量

//    private void show(){} // 从jdk1.9开始允许接口中出现私有方法

//    public void show(){} //Interface abstract methods cannot have body  只能有抽象方法（新特性除外）

    /*public abstract*/ void show();
}
