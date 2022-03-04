package p05;

/**
 * @author: ymm
 * @date: 2022/3/4
 * @version: 1.0.0
 * @description:
 * 枚举类的测试，调用从Enum类中继承的方法
 */
public class DirectionEnumTest {

    public static void main(String[] args) {
        // 1. 获取DirectionEnum类型中所有的枚举对象
        DirectionEnum[] values = DirectionEnum.values();
        // 2. 打印每个枚举对象在枚举类型中的名称和索引位置
        for (DirectionEnum value : values) {
            System.out.println("value.ordinal() = " + value.ordinal());
            System.out.println("value = " + value);
        }

        System.out.println("-------------------------");
        // 3.根据参数指定的字符串得到枚举类型的对象，也就是将字符串转换为对象
//        DirectionEnum up1 = DirectionEnum.valueOf("上"); // IllegalArgumentException: No enum constant p05.DirectionEnum.上
        DirectionEnum up = DirectionEnum.valueOf("UP"); // 字符串名称必须是枚举中存在的

        System.out.println("up = " + up);
        System.out.println("-------------------------");

        // 4.使用获取到的枚举对象与枚举类中已有的对象比较先后顺序
        for (int i = 0; i < values.length; i++) {
            System.out.println("up.compareTo(values[i]) = " + up.compareTo(values[i]));
        }
        System.out.println("-------------------------");

        // 5.使用数组中每个DirectionEnum对象都去调用show方法测试
        for (int i = 0; i < values.length; i++) {
            values[i].show();

        }
    }
}
