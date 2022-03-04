package p05;

/**
 * @author: ymm
 * @date: 2022/3/4
 * @version: 1.0.0
 * @description:
 */
// 表示将标签MyAnnotation贴在Person类的代码中，使用注解时，采用 成员参数名 = 成员参数值,成员参数名 = 成员参数值...
@MyAnnotation(value2 = "2", value = "1")
public class Person {
    /**
     * 姓名
     */
    private String name;
    // 年龄
    private int age;

    /**
     * 无参构造方法
     */
    public Person() {
    }

    /**
     * 有参构造方法
     * @param name
     * @param age
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取姓名
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
