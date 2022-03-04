package p05;

/**
 * @author: ymm
 * @date: 2022/3/4
 * @version: 1.0.0
 * @description:
 */
public class AnonymousInterfaceTest {

    // 假设已有下面的方法，请问如何调用下面的方法
    public static void test(AnonymousInterface ai){
        ai.show();
    }

    public static void main(String[] args) {

        // 匿名内部类
        AnonymousInterfaceTest.test(new AnonymousInterface() {
            @Override
            public void show() {
                System.out.println("new AnonymousInterface");
            }
        });

        // 从Java8开始提出新特色lambda表达式简化上述代码。格式为：(参数列表) -> {方法体}
        AnonymousInterfaceTest.test(()-> System.out.println("lambda表达式"));

        AnonymousInterfaceTest.test(new AnonymousInterfaceImpl());
    }
}
