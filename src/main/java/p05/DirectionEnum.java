package p05;

/**
 * @author: ymm
 * @date: 2022/3/4
 * @version: 1.0.0
 * @description:
 *  实现所有方向的枚举：上下左右
 */
public enum DirectionEnum implements DirectionInterface{

    // 枚举类型要求所有的枚举值必须放在枚举值的最前面
    // 2.声明本类类型的引用，指向本类类型的对象
    UP("上"){
        @Override
        public void show() {
            System.out.println("up show");
        }
    },
    DOWN("下"){
        @Override
        public void show() {
            System.out.println("DOWN show");
        }
    },
    RIGHT("左"){
        @Override
        public void show() {
            System.out.println("RIGHT show");
        }
    },
    LEFT("右"){
        @Override
        public void show() {
            System.out.println("LEFT show");
        }
    };

    private final String desc; // 用于描述放行字符串的成员变量

    // 1.私有化构造方法，此时构造方法只能在本类的内部使用
    private DirectionEnum(String desc) {
        this.desc = desc;
    }

    // 通过公有的get方法可以在本类的外部访问该类成员变量的数值
    public String getDesc() {
        return desc;
    }

    // 整个枚举类型只重写一次，所有对象调用同一个
//    @Override
//    public void show() {
//        System.out.println("接口中抽象方法的重写");
//
//    }
}
