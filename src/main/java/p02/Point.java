package p02;

/**
 * @author: ymm
 * @date: 2021/11/30
 * @version: 1.0.0
 * @description:
 */
public class Point {

    int x;
    int y;

    Point() {

    }

    Point(int i, int j) {
        x = i;
        y = j;
    }

    void show() {
        System.out.println("x = " + x + ",y = " + y);
    }

    public static void main(String[] args) {
        Point p = new Point();
        p.show();
        Point p2 = new Point(1, 1);
        p2.show();

    }
}
