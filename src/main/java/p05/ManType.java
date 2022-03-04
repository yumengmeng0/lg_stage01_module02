package p05;

import java.lang.annotation.Repeatable;

/**
 * 自定义注解用于描述任务的角色
 */
@Repeatable(value = ManTypes.class)
public @interface ManType {
    String value() default "";
}
