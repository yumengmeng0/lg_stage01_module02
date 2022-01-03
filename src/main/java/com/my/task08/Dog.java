package com.my.task08;

/**
 * @author: ymm
 * @date: 2021/12/16
 * @version: 1.0.0
 * @description:
 */
public class Dog extends Animal {

    private int tooth;

    // 父类必须有无参构造。There is no default constructor available in 'com.my.task08.Animal'
    public Dog() {
        super();
    }

    public Dog(String name, String color, int tooth) {
        super(name, color);
        setTooth(tooth);
    }

    public int getTooth() {
        return tooth;
    }

    public void setTooth(int tooth) {
        if (tooth > 0) {
            this.tooth = tooth;
        } else {
            System.out.println("牙齿数量不合理");
        }
    }

    @Override
    public void show() {
        super.show();
        System.out.println("tooth = " + getTooth());
    }
}
