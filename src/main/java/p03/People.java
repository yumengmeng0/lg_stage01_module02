package p03;

/**
 * @author: ymm
 * @date: 2021/12/10
 * @version: 1.0.0
 * @description: 编程实现People类的封装
 */
public class People {

    // 1.私有化成员变量，使用private关键字修饰
    private String name;
    private int age;
    //    private String country; // 隶属于对象层级
    public static String country; // 隶属于类层级

    // 3.在构造方法中调用get和set方法，并在方法体中进行合理值的判断


    public People() {
    }

    public People(String name, int age, String country) {
        setAge(age);
        setName(name);
        setCountry(country);
    }

    // 2. 提供公有的get和set方法，并在方法体中进行合理值的判断
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
            System.out.println("年龄不合理");
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void show() {
        System.out.println("我是" + name + ",今年" + age +
                "岁,来自" + country);
    }
}
