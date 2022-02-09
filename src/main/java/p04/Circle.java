package p04;

/**
 * @author: ymm
 * @date: 2022/1/10
 * @version: 1.0.0
 * @description:
 */
public class Circle extends Shape {

    private int r;

    public Circle() {
    }

    public Circle(int r) {
        this.r = r;
    }

    public Circle(int x, int y, int r) {
        super(x, y);
        setR(r);
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        if (r >0) {
            this.r = r;
        }else {
            System.out.println("半径不合理：" + r);
        }
    }

    @Override
    public void show() {
        super.show();
        System.out.println("半径 = " + getR());
    }
}
