package p03;

/**
 * @author: ymm
 * @date: 2021/12/10
 * @version: 1.0.0
 * @description: static关键字是使用
 */
public class StaticTest {

    private int cnt = 1;
    public static int snt = 2;

    // 自定义非静态成员方法，需要引用.的方式访问
    public void show() {
        System.out.println("cnt = " + cnt);
        System.out.println("snt = " + snt);
    }

    // 自定义静态成员方法推荐使用类名.的方式访问
    public static void test() {
//        System.out.println("cnt = " + cnt); // 静态方法中，不能访问非静态成员
        System.out.println("snt = " + snt);
    }

    public static void main(String[] args) {

    }
}
