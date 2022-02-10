package p04;

/**
 * @author: ymm
 * @date: 2022/2/9
 * @version: 1.0.0
 * @description:
 */
public abstract class AbstractTest {

    private int cnt;

    public AbstractTest() {
    }

    public AbstractTest(int cnt) {
        setCnt(cnt);
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    // 自定义抽象方法
    public abstract void show();

    public static void main(String[] args) {


//        AbstractTest at = new AbstractTest();
//        System.out.println("at.getCnt() = " + at.getCnt());
        // 1. 声明本类类型的引用指向本类类型的对象

        SubAbstractTest sat = new SubAbstractTest();
        sat.show();

        System.out.println("--------------");

        // 2. 声明Abstract类型的引用指向子类对象，形成多态
        // 多态使用场合二：直接在方法体中使用抽象类的引用指向子类类型的对象
//        AbstractTest at = new SubAbstractTest();
        AbstractTest at = new SubAbstractTest2();

        // 编译阶段调用父类版本，运行阶段调用子类版本
        at.show();

    }
}
