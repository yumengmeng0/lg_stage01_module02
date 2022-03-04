package p05;

/**
 * @author: ymm
 * @date: 2022/2/23
 * @version: 1.0.0
 * @description: 局部内部类的定义和使用
 */
public class AreaOuter {
    private int cnt = 1;

    public void show() {

        // 定义一个局部变量，从Java8开始默认理解为final关键字修饰的变量
        // 虽然可以省略final，但建议加上
        final int ic = 4;

        // 定义局部内部类，只在当前方法体内部使用 拷贝一份
        class AreaInner {
            private int ia = 2;

            public AreaInner() {
                System.out.println("局部内部类的构造方法");
            }

            public void show() {
                System.out.println("ia = " + ia);
                System.out.println("cnt = " + cnt);
                // Variable 'ic' is accessed from within inner class, needs to be final or effectively final
                // ic = 6;
                System.out.println("ic = " + ic);
            }
        }

        AreaInner areaInner = new AreaInner();
        areaInner.show();
    }


}
