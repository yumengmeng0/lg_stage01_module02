package p04;

/**
 * @author: ymm
 * @date: 2022/1/3
 * @version: 1.0.0
 * @description:
 */
public class Rect extends Shape {
    private int length;
    private int width;

    public Rect() {
    }

    public Rect(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Rect(int x, int y, int length, int width) {
        super(x, y);
        setLength(length);
        setWidth(width);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("长度不合理");
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("宽度不合理");
        }
    }


    @Override
    public void show() {
        super.show();
        System.out.print("length = " + length);
        System.out.println(",width = " + width);
    }

    // 自定义静态方法
//    @Override // Method does not override method from its superclass
    public static void test() {
        System.out.println("Rect类中的静态方法");
    }
}
