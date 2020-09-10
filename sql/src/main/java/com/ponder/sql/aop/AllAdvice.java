package com.ponder.sql.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @auth ponder
 * @Email gponder.g@gmail.com
 * @create 2020/9/7 15:17
 */
@Aspect
@Component
@Order(1)
public class AllAdvice {

    @Pointcut("execution(* com.ponder.sql.controller.ApiController.*(..))")
    public void jointPoint(){
    }

    @Around("jointPoint()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("All around 1");
        Object res = proceedingJoinPoint.proceed();
        System.out.println("All around 2");
        return res;
    }

    @Before("jointPoint()")
    public void before(){
        System.out.println("All before");
    }

    @After("jointPoint()")
    public void after(){
        System.out.println("All after");
    }

    @AfterReturning("jointPoint()")
    public void afterReturning(){
        System.out.println("All after returning");
    }

    @AfterThrowing("jointPoint()")
    public void afterThrows(){
        System.out.println("All after throws");
    }

}
