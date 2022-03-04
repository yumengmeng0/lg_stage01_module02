package p05;

/**
 * @author: ymm
 * @date: 2022/3/4
 * @version: 1.0.0
 * @description:
 */
public class DirectionEnumUseTest {

    // 自定义静态方法，实现根据参数指定的字符串内容来打印具体的方向信息
    public static void test1(String s){
        switch (s){
            case "上":System.out.println("up = ");break;
            case "下":System.out.println("down = ");break;
            case "左":System.out.println("right = ");break;
            case "右":System.out.println("left = ");break;
            default:
                System.out.println("error");

        }
    }

    // 自定义静态方法，实现根据参数指定枚举类型来打印具体的方向信息
    public static void test2(DirectionEnum de){
        switch (de){
            case UP:System.out.println("up = ");break;
            case DOWN:System.out.println("down = ");break;
            case RIGHT:System.out.println("right = ");break;
            case LEFT:System.out.println("left = ");break;
            default:
                System.out.println("error");

        }
    }

    public static void main(String[] args) {
        DirectionEnumUseTest.test1(Direction.UP.getDesc());
        DirectionEnumUseTest.test2(DirectionEnum.DOWN);
    }

}
