package p05;

/**
 * @author: ymm
 * @date: 2022/2/23
 * @version: 1.0.0
 * @description: 普通内部类的定义和使用
 */
public class NormalOuter {

    private int cnt = 1;

    // 定义普通内部类，隶属于外部类的成员，并且是对象层级
    public class NormalInner {

        private int ia = 2;
        private int cnt = 3;

        public NormalInner() {
            System.out.println("普通内部类的构造方法");
        }

        public void show() {
            System.out.println("外部类中变量 cnt = " + cnt);
            System.out.println("ia = " + ia);
        }

        public void show2(int cnt){
            System.out.println("形参变量cnt = " + cnt);
            System.out.println("内部类中cnt = " + this.cnt);
            System.out.println("外部类中cnt = " + NormalOuter.this.cnt);
        }
    }


}
