package p05;

/**
 * @author: ymm
 * @date: 2022/2/23
 * @version: 1.0.0
 * @description:
 */
public class NormalOuterTest {

    public static void main(String[] args) {

        // 1.声明NormalOuter类型的引用指向该类型对象
        NormalOuter normalOuter = new NormalOuter();

        // 2.声明NormalOuter类中的内部类的引用指向内部类的对象
        NormalOuter.NormalInner normalInner = normalOuter.new NormalInner();

        // 调用内部类的show方法
        normalInner.show();
        normalInner.show2(55);

    }
}
