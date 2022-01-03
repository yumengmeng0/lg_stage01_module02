package com.my.task08;

/**
 * @author: ymm
 * @date: 2021/12/16
 * @version: 1.0.0
 * @description:
 */
public class SuperTest {
    {
        System.out.println("SuperTest类中构造块"); // 2
    }

    static {
        System.out.println("SuperTest类中静态代码块"); // 1
    }

    public SuperTest() {
        System.out.println("SuperTest类中构造方法体"); // 3
    }


    public static void main(String[] args) {
        SuperTest superTest = new SuperTest();

    }
}
