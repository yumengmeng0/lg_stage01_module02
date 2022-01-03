package com.my.task08;

/**
 * @author: ymm
 * @date: 2021/12/16
 * @version: 1.0.0
 * @description:
 */
public class DogTest {

    public static void main(String[] args) {
        // 1.使用无参方式构造
        Dog dog = new Dog();
        dog.show();

        Dog dog1 = new Dog("旺财", "灰色", 10);
        dog1.show();

    }
}
