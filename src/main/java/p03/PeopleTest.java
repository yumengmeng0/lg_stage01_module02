package p03;

/**
 * @author: ymm
 * @date: 2021/12/10
 * @version: 1.0.0
 * @description: People测试类
 */
public class PeopleTest {
    public static void main(String[] args) {
        
        
        // 验证static关键字修饰的静态成员是否与创建对象无关：类名.
        System.out.println("People.country = " + People.country);
        People p1 = new People("zhangsan", 30, "China");
        p1.show();
        People p2 = new People("lisi", 35, "China");
        p2.show();
     
        // 验证static关键字修饰的静态成员是否被所有对象共享
        p1.country = "蜀国";
        p1.show();
        p2.show();
    }
}
