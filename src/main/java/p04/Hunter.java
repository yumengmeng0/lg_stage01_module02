package p04;

/**
 * @author: ymm
 * @date: 2022/2/10
 * @version: 1.0.0
 * @description:
 */
public interface Hunter extends Runner {

    // 捕猎
    public abstract void hunt();


    // Java9开始增加新特性，接口中允许出现私有方法
    // 接口内重复的代码
    private void show(){
        System.out.println("重复的代码");
    }

    // 在接口中增加非抽象方法，需要default修饰
    public default void show1(){
//        System.out.println("重复的代码");
        System.out.println("接口中的默认实现show1()");
    };

    public default void show2(){
//        System.out.println("重复的代码");
        System.out.println("接口中的默认实现show2()");
    };

    // 增加静态方法，隶属于类层级，也就是接口层级
    public static void test(){
        System.out.println("接口中的静态方法");
    }


}
