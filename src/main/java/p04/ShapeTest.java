package p04;

import com.my.task08.SuperTest;

/**
 * @author: ymm
 * @date: 2022/2/9
 * @version: 1.0.0
 * @description:
 */
public class ShapeTest {

//    // 自定义成员方法实现将参数指定矩形对象特征打印出来的行为，也就是绘制图形
//    public static void draw(Rect r) {
//        r.show();
//    }
//
//    // 自定义成员方法实现将参数指定圆形对象特征打印出来的行为
//    public static void draw(Circle c) {
//        c.show();
//    }

    // 自定义成员方法实现既能打印矩形又能打印圆形对象的特征，对象由参数传入
    // Shape s = new Rect(1, 2, 3, 4); 父类类型的引用指向子类类型的对象，形成了多态
    // 多态的使用场合一：通过参数传递形成多态
    public static void draw(Shape s) {
        // 编译阶段调用父类版本，运行阶段调用子类重写版本
        s.show();
    }


    public static void main(String[] args) {
        ShapeTest.draw(new Rect(1, 2, 3, 4));
        ShapeTest.draw(new Circle(5, 6, 7));

    }
}
