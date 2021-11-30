package p01;

/**
 * @author: ymm
 * @date: 2021/11/30
 * @version: 1.0.0
 * @description:
 */
public class Point {
    int x;
    int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    void showArgument(String... args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("args = " + args[i]);
        }
    }

    public static void main(String[] args) {
        Point point = new Point();
        System.out.println("point.x = " + point.x);
        System.out.println("point.y = " + point.y);

        point.showArgument();
        point.showArgument("参数1");
        point.showArgument("参数1", "参数2");
    }
}
