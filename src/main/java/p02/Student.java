package p02;

/**
 * @author: ymm
 * @date: 2021/11/30
 * @version: 1.0.0
 * @description:
 */
public class Student {

    private int id;
    private String name;

    public void show() {
        System.out.println("id = " + id + "name = " + name);
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
