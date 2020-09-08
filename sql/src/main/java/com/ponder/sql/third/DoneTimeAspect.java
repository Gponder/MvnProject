package com.ponder.sql.third;

import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect//切面类
@Component//ioc 注册
public class DoneTimeAspect {


    @Before("execution(public * com.ponder.sql.controller.ApiController.*())")//切点 切点表达式
    public void before1() throws Throwable {
        System.out.println("before1");
    }

    @Before("bean(*ApiController)")
    public void before2() throws Throwable {
        System.out.println("before2");
    }

    @Around("@annotation(doneTime)")
    public Object around(ProceedingJoinPoint joinPoint, DoneTime doneTime) throws Throwable {
        System.out.println("方法开始时间是:"+new Date());
        Object o = joinPoint.proceed();
        System.out.println("方法结束时间是:"+new Date()) ;
        return o;
    }

    @After("@within(doneTime)")
    public void After1(DoneTime doneTime) throws Throwable {
        System.out.println("with in after");
    }

    @After("@target(doneTime)")
    public void After2(DoneTime doneTime) throws Throwable {
        System.out.println("target after");
    }

    @After("@args(doneTime)")
    public void After(DoneTime doneTime) throws Throwable {
        System.out.println("target after");
    }
}
