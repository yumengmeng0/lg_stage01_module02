package p05;

/**
 * @author: ymm
 * @date: 2022/2/23
 * @version: 1.0.0
 * @description:
 */
public class StaticOuterTest {

    public static void main(String[] args) {

        // 1.声明StaticInner的引用指向该类型的对象
        StaticOuter.StaticInner staticInner = new StaticOuter.StaticInner();
        // 2. 调用show方法
        staticInner.show();
        staticInner.show2(66);

    }

}
