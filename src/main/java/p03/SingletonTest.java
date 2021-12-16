package p03;

/**
 * @author: ymm
 * @date: 2021/12/14
 * @version: 1.0.0
 * @description: Singleton类的测试
 */
public class SingletonTest {

    public static void main(String[] args) {
//        Singleton s1 = new Singleton();
//        Singleton s2 = new Singleton();
//        System.out.println("s1 == s2 = " + (s1 == s2));

        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println("(instance == instance1) = " + (instance == instance1));
    }
}
