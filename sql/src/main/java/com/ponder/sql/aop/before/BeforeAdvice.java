package com.ponder.sql.aop.before;

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
        System.out.println(beforePointCut.type()+":timeStamp before"+new Date(System.currentTimeMillis()));
    }

    @Before("@within(beforePointCut)")//@within表示匹配带有指定注解的类
    public void before3(BeforePointCut beforePointCut){
        System.out.println(beforePointCut.type()+":timeStamp before"+new Date(System.currentTimeMillis()));
    }

    //@args则表示使用指定注解标注的类作为某个方法的参数时该方法将会被匹配  @args必须加其他条件限制范围
    @Before("@args(beforePointCut) && execution(public * com.ponder.sql.service.BeforeService.*(..))")
    public void before4(BeforePointCut beforePointCut){
        System.out.println(beforePointCut.type()+":timeStamp before"+new Date(System.currentTimeMillis()));
    }

    //target 匹配业务对象为指定类型的类 (指定类型的代理对象)  BeforeService即目标对象也叫业务对象  通过jdk或者cglib生成的对象叫代理对象
    @Before("target(com.ponder.sql.service.BeforeService)")//@within表示匹配带有指定注解的类
    public void before5(){
        System.out.println("target timeStamp before"+new Date(System.currentTimeMillis()));
    }

    // this 如果当前对象生成的代理对象符合this指定的类型，那么就为其织入切面逻辑
    // 指定匹配目标为实现接口的对象时使用jdk代理 此时代为接口对象this无法匹配target可以匹配
    @Before("this(com.ponder.sql.service.BeforeService)")
    public void before6(){
        System.out.println("this timeStamp before"+new Date(System.currentTimeMillis()));
    }

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
