package p03;

/**
 * @author: ymm
 * @date: 2021/12/16
 * @version: 1.0.0
 * @description:
 */
public class WorkerTest {

    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.show();

        Worker worker1 = new Worker();
        worker1.setName("张飞");
        worker1.setAge(33);
        worker1.setSalary(3333);
        worker1.work();
        worker1.show();
    }

}
