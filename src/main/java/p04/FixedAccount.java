package p04;

/**
 * @author: ymm
 * @date: 2022/2/10
 * @version: 1.0.0
 * @description:
 */
public class FixedAccount extends Account {

    public FixedAccount() {
        super();
        System.out.println("FixedAccount");
    }

    public FixedAccount(int money) {
        super(money);
    }

    @Override
    public double getInterest() {
         // 利息 = 本金 * 利率 * 时间
        return getMoney() * 0.03 * 1;
    }

    public static void main(String[] args) {
        Account account = new FixedAccount(100);
        System.out.println("account.getInterest() = " + account.getInterest());

        FixedAccount fixedAccount = new FixedAccount();
        

    }

}
