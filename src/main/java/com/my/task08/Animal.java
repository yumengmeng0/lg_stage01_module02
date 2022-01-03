package com.my.task08;

/**
 * @author: ymm
 * @date: 2021/12/16
 * @version: 1.0.0
 * @description:
 */
public class Animal {
    private String name;
    private String color;

    public Animal() {
    }

    public Animal(String name, String color) {
        setName(name);
        setColor(color);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void show() {
        System.out.print("name = " + getName());
        System.out.println(", color = " + getColor());
    }
}
