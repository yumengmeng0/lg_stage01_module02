package p03;

/**
 * @author: ymm
 * @date: 2021/12/16
 * @version: 1.0.0
 * @description: 实现Person类的封装
 */
public class Person {
    // 1.私有化成员变量
    private String name;
    private int age;

    public Person() {
        System.out.println("Person()");
    }

    public Person(String name, int age) {
        System.out.println("Person(String name, int age)");
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 150) {
            this.age = age;
        } else {
            System.out.println("年龄" + age + "不合理");
        }
    }
    
    public void show(){
        System.out.println("name = " + getName());
        System.out.println("age = " + getAge());
    }

    public void eat(String food){
        System.out.println("food = " + food);
    }

    public void play(String game){
        System.out.println("game = " + game);
    }
}
