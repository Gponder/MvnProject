package com.ponder.sql.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @auth ponder
 * @Email gponder.g@gmail.com
 * @create 2020/9/7 9:12
 */
@Aspect
@Component
public class BeforeAdvice {

    /**
     * 方法可见性public 返回值* 方法所在类的全路径名com.ponder.sql.service.ApiService 方法名* 参数类型 异常类型
     * *通配符 匹配单个单词，或者是以某个词为前缀或后缀的单词
     * ..通配符，该通配符表示0个或多个项
     */
    @Before("execution(public * com.ponder.sql.service.BeforeService.*(..))")
    public void before1(){
        System.out.println("service 包下所有 public 方法 before");
    }

    @Before("@annotation(beforePointCut)")//@annotation指定注解标注的方法将会被匹配
    public void before2(BeforePointCut beforePointCut){
        System.out.println(beforePointCut.value()+"timeStamp before"+new Date(System.currentTimeMillis()));
    }

    @Before("@within(beforePointCut)")//@within表示匹配带有指定注解的类
    public void before3(BeforePointCut beforePointCut){
        System.out.println(beforePointCut.type()+"timeStamp before"+new Date(System.currentTimeMillis()));
    }

//    @Before("@target(classTimestamp)")//@within表示匹配带有指定注解的类
//    public void before4(ClassTimestamp classTimestamp){
//        System.out.println(classTimestamp.value()+"timeStamp before"+new Date(System.currentTimeMillis()));
//    }

//    @Before("@args(paramTimestamp)")//@args则表示使用指定注解标注的类作为某个方法的参数时该方法将会被匹配
//    public void before4(ParamTimestamp paramTimestamp){
//        System.out.println("paramTimestamp.value()"+"timeStamp before"+new Date(System.currentTimeMillis()));
//    }

//    @Pointcut("execution(* *(..)) && within(com.ponder.sql.service.*)")
//    private void pointCutMethod(){
//    }
//
//    @Before("pointCutMethod()")//@args则表示使用指定注解标注的类作为某个方法的参数时该方法将会被匹配
//    public void before5(){
//        System.out.println("timeStamp before"+new Date(System.currentTimeMillis()));
//    }

    //this perthis  target pertarget

}
