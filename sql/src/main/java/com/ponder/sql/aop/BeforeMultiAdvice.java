package com.ponder.sql.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @auth ponder
 * @Email gponder.g@gmail.com
 * @create 2020/9/9 16:37
 */
//@Aspect("perthis(this(com.ponder.sql.service.BeforeService))")
@Aspect("pertarget(this(com.ponder.sql.service.BeforeService))")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class BeforeMultiAdvice {

    public BeforeMultiAdvice() {
        System.out.println("constructor"+toString());
    }

    @Before("this(com.ponder.sql.service.BeforeService)")
    public void before1(){
        System.out.println("per this target");
    }
}
