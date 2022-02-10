package p04;

/**
 * @author: ymm
 * @date: 2022/2/10
 * @version: 1.0.0
 * @description:
 */
public class Gold implements Metal, Money {

    @Override
    public void shine() {
        System.out.println("发出金黄色的光芒");
    }

    @Override
    public void buy() {
        System.out.println("买东西");
    }

    public static void main(String[] args) {
        Metal mt = new Gold();
        mt.shine();

        Money mn = new Gold();
        mn.buy();
    }
}
