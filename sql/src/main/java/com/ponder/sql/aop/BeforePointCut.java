package com.ponder.sql.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @auth ponder
 * @Email gponder.g@gmail.com
 * @create 2020/9/8 16:59
 */
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface BeforePointCut {
    String value() default "";
    PointCutType type();
}
