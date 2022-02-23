package p05;

/**
 * @author: ymm
 * @date: 2022/2/23
 * @version: 1.0.0
 * @description: 静态内部类的定义和使用
 */
public class StaticOuter {

    private int cnt = 1;
    private static int snt = 2;

    public void show() {
        System.out.println("外部类中的show方法");
    }

    // 定义静态内部类，有static关键字修饰，隶属于类层级
    public static class StaticInner {
        private int ia = 3;
        private static int snt = 4;

        public StaticInner() {
            System.out.println("静态内部类的构造方法");
        }

        public void show() {
            System.out.println("ia = " + ia);
            System.out.println("外部类中的snt = " + snt);
            // 静态上下文中不能访问非静态成员，因为此时可能还没有创建对象
            // Error:Non-static field 'cnt' cannot be referenced from a static context
//            System.out.println("外部类的cnt = " + cnt);
        }

        public void show2(int snt) {
            System.out.println("snt = " + snt);
            System.out.println("内部类StaticInner中的成员snt = " + StaticInner.snt);
            System.out.println("外部类StaticOuter中的成员snt = " + StaticOuter.snt);
        }
    }


}
