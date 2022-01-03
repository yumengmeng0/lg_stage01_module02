package com.my.task08;

// 导入Java目录中lang目录中System类中的静态成员out
import static java.lang.System.out;

/**
 * @author: ymm
 * @date: 2021/12/16
 * @version: 1.0.0
 * @description:
 */
public class SubSuperTest extends SuperTest{

    {
        System.out.println("==SubSuperTest类中构造块"); // 2
    }

    static {
        System.out.println("==SubSuperTest类中静态代码块"); // 1
    }

    public SubSuperTest() {
//        System.out.println("==SubSuperTest类中构造方法体"); // 3
       out.println("==SubSuperTest类中构造方法体"); // 3
    }

    public static void main(String[] args) {
        SubSuperTest subSuperTest = new SubSuperTest();
        /**
         * 构造块和静态代码块执行顺序：
         * 父类静态代码块
         * 子类静态代码块
         * 父类构造块
         * 父类构造方法
         * 子类构造块
         * 子类构造方法体
         */
        /**
         SuperTest类中静态代码块
         ==SubSuperTest类中静态代码块
         SuperTest类中构造块
         SuperTest类中构造方法体
         ==SubSuperTest类中构造块
         ==SubSuperTest类中构造方法体
         */

    }
}
