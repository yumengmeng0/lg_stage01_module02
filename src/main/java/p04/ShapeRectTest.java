package p04;

/**
 * @author: ymm
 * @date: 2022/1/3
 * @version: 1.0.0
 * @description:
 */
public class ShapeRectTest {

    public static void main(String[] args) {
        // 1.声明Shape类型的引用，指向Shape类型的对象并打印
        Shape s1 = new Shape(1, 2);
        s1.show();
        System.out.println("-----------------");
        // 2.声明Rect类型的引用，指向Rect类型的对象并打印
        Rect r1 = new Rect(3, 4, 5, 6);
        r1.show();

        System.out.println("-----------------");

        // 3.声明Shape类型的引用，指向Rect类型的对象并打印
        Shape s2 = new Rect(7, 8, 9, 10);
        // 当Rect类中没有重写show方法时，下面调用Shape类的show方法
        // 当Rect类中重写show方法后，下面调用Rect类中的show方法
        // 下面代码在编译阶段调用Shape类的方法，在运行阶段调用Rect类中的show方法
        s2.show();


        // 4.测试Shape类型的引用能否直接调用父类和子类独有的方法？
        int x = s2.getX();
        System.out.println("x = " + x);
//   s2.getLength(); // Cannot resolve method 'getLength' in 'Shape'
        // 调用静态方法
        // 提示不建议用引用.的方式访问静态方法
        // Static member 'p04.Shape.test()' accessed via instance reference
        s2.test();   // Shape类中的静态方法

        Shape.test(); // Shape类中的静态方法
    }
}
