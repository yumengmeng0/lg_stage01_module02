package p05;

import java.lang.annotation.*;

/**
 * @author: ymm
 * @date: 2022/3/4
 * @version: 1.0.0
 * @description:
 */
//@Retention(RetentionPolicy.SOURCE)
//@Retention(RetentionPolicy.CLASS)
@Retention(RetentionPolicy.RUNTIME)
@Documented // 表示下面的注解信息可以被Javadoc工具提取到工具生成的api文档中。很少使用
@Target(ElementType.TYPE) // 表示下面的注解信息可以用于类型的修饰
@Inherited // 表示下面注解所修饰的类中的注解可以被子类继承
// 注解中没有任何成员，称标记注解/标识注解
public @interface MyAnnotation {
    // 声明一个String类型的成员变量，名字为value
    // 类型有要求
    public String value() default "默认值";
    public String value2();

}
