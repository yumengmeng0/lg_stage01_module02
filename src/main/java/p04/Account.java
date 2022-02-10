package p04;

/**
 * @author: ymm
 * @date: 2022/2/9
 * @version: 1.0.0
 * @description:
 */
public abstract class Account {

    private int money;

    public Account() {
        System.out.println("Account");
    }

    public Account(int money) {
        this.money = money;
    }


    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        if (money>=0) {
            this.money = money;
        }else {
            System.out.println("金额不合理");
        }
    }

    // 自定义抽象方法，实现计算利息并返回的功能
    public abstract double getInterest();

    // Illegal combination of modifiers: 'abstract' and 'private'
    // abstract 和 private或final或static 不能共同修饰一个方法
    // private abstract double getInterest();

}
