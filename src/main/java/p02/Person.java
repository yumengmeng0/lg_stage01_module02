package p02;

/**
 * @author: ymm
 * @date: 2021/11/30
 * @version: 1.0.0
 * @description:
 */
public class Person {

    String name;
    int age;

    Person() {
        System.out.println("构造方法");
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void show() {
        System.out.println("name = " + name + ",age = " + age);
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.show();
        Person p1 = new Person("张飞", 30);
        p1.show();
    }

}
