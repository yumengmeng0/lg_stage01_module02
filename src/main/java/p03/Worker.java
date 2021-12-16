package p03;

/**
 * @author: ymm
 * @date: 2021/12/16
 * @version: 1.0.0
 * @description: 自定义Worker类继承Person类
 */
public class Worker extends Person {

    public Worker() {
        super();// 表示调用父类的无参构造方法
//        super();// 表示调用父类的无参构造方法 // Call to 'super()' must be first statement in constructor body
        System.out.println("Worker()");
    }

    public Worker(String name, int age, int salary) {
        System.out.println("Worker(String name, int age, int salary)");
        setSalary(salary);
        setName(name);
        setAge(age);
    }

    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary >= 2200) {
            this.salary = salary;
        } else {
            System.out.println("薪水不合理");
        }
    }

    public void work() {
        System.out.println("working...");
    }

    // 自定义show方法覆盖从父类中继承的版本
    @Override // 注解，用于说明下面的方法是对父类方法的重写，若没有构成重写则编译报错
    public void show() {
        super.show(); // 调用父类的show方法
        System.out.println("salary = " + getSalary());
    }

}
