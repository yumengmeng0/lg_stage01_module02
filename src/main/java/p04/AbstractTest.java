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

    }
}
