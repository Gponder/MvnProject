package com.ponder.sql.aop;

import com.ponder.sql.service.BeforeService;
import com.ponder.sql.service.LogService;
import com.ponder.sql.service.impl.LogServiceImpl;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * 植入方法
 * @auth ponder
 * @Email gponder.g@gmail.com
 * @create 2020/9/10 9:22
 */
@Aspect
@Component
public class Introduction {

    //要植入对象LogService 植入接口的实现LogServiceImpl
    @DeclareParents(value = "com.ponder.sql.service.impl.BeforeServiceImpl",defaultImpl = LogServiceImpl.class)
    private LogService logService;

}
