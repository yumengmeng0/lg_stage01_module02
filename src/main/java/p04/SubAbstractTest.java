package p04;

/**
 * @author: ymm
 * @date: 2022/2/9
 * @version: 1.0.0
 * @description:
 */
public class SubAbstractTest extends AbstractTest {

    @Override
    public void show() {
        System.out.println("抽象方法的重写");
    }

    public static void main(String[] args) {
        SubAbstractTest sat = new SubAbstractTest();
        sat.show();
    }

}
