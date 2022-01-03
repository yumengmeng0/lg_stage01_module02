package com.my.task08;

/**
 * @author: ymm
 * @date: 2021/12/27
 * @version: 1.0.0
 * @description:
 */
public class FinalMemberTest {
    // final修饰成员变量的初始化
//    private final int cnt = 0;  // 1. 显示初始化
    private final int cnt;
//    {
//        cnt = 1; // 2. 在构造块中进行初始化
//    }

    public FinalMemberTest(){
        cnt = 3; // 3. 在构造函数中初始化
    }

    public static void main(String[] args) {
        // 声明final
    }
}
