package p04;

/**
 * @author: ymm
 * @date: 2022/2/10
 * @version: 1.0.0
 * @description:
 */
public class Man implements Hunter {
    @Override
    public void hunt() {
        System.out.println("捕猎");
    }

    @Override
    public void run() {
        System.out.println("奔跑");
    }

    public static void main(String[] args) {
        Runner runner = new Man();
        runner.run();

        Hunter hunter = new Man();
        hunter.hunt();

    }
}
