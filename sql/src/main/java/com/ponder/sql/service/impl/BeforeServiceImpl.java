package com.ponder.sql.service.impl;

import com.ponder.sql.aop.*;
import com.ponder.sql.service.BeforeService;
import org.springframework.stereotype.Service;

/**
 * @auth ponder
 * @Email gponder.g@gmail.com
 * @create 2020/9/4 9:11
 */
@BeforePointCut(type = PointCutType.within)
@Service
public class BeforeServiceImpl implements BeforeService {

    @BeforePointCut(type = PointCutType.within)
    @Override
    public String apiInfo() {
        return "service is running";
    }

    @Override
    public String login() {
        return "login";
    }
}
