package p03;

/**
 * @author: ymm
 * @date: 2021/12/14
 * @version: 1.0.0
 * @description:
 */
public class BlockTest {

    // 当需要在执行构造方法体之前做一些准备工作时，将准备工作相关代码写在构造块中
    // 比如：对成员变量进行统一的初始化
    {
        System.out.println("构造块");
    }

    // 静态代码块会随着类的加载而准备就绪，会先于构造块执行
    // 当需要在执行代码块之前随着类的加载做一些准备工作时，则编写到静态代码块中，
    // 比如：加载数据库的驱动包等
    static {
        System.out.println("静态代码块");
    }


    // 自定义构造方法
    public BlockTest(){
        System.out.println("构造方法体");
    }

    public static void main(String[] args) {
        BlockTest blockTest = new BlockTest();
        BlockTest blockTest2 = new BlockTest();

    }
}

