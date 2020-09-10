package com.ponder.sql.service.impl;

import com.ponder.sql.aop.before.BeforePointCut;
import com.ponder.sql.aop.before.PointCutType;
import com.ponder.sql.model.vo.UserVO;
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

    @BeforePointCut(type = PointCutType.annotation)
    @Override
    public String info() {
        System.out.println("service info method");
        return "service is running";
    }

    @Override
    public String login(UserVO userVO) {
        System.out.println(userVO.getUsername()+userVO.getPassword()+"method");
        return userVO.getUsername()+" login success";
    }
}
