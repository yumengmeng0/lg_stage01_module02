package p01;

/**
 * @author: ymm
 * @date: 2021/11/30
 * @version: 1.0.0
 * @description:
 */
public class Person {

    String name;
    int age;

    void show() {
        System.out.println("p.name = " + name);
        System.out.println("p.age = " + age);
    }

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    void setNameAndAge(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person p = new Person();
        System.out.println("p.name = " + p.name);
        System.out.println("p.age = " + p.age);

        p.setName("小明");
        p.setAge(11);
        p.show();
    }

}
