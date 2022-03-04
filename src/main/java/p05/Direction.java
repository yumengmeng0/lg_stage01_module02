package p05;

/**
 * @author: ymm
 * @date: 2022/3/4
 * @version: 1.0.0
 * @description:
 *  实现所有方向的枚举：上下左右
 */
public class Direction {
    private final String desc; // 用于描述放行字符串的成员变量

    // 通过构造方法十四案变量的初始化，更加灵活

    // 2.声明本类类型的引用，指向本类类型的对象
    public static Direction UP = new Direction("上");
    public static Direction DOWN = new Direction("下");
    public static Direction RIGHT = new Direction("左");
    public static Direction LEFT = new Direction("右");

    // 1.私有化构造方法，此时构造方法只能在本类的内部使用
    private Direction(String desc) {
        this.desc = desc;
    }

    // 通过公有的get方法可以在本类的外部访问该类成员变量的数值
    public String getDesc() {
        return desc;
    }
}
