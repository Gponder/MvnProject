package com.ponder.sql.service;

import com.ponder.sql.model.vo.UserVO;

/**
 * @auth ponder
 * @Email gponder.g@gmail.com
 * @create 2020/9/4 9:10
 */
public interface BeforeService {
    String info();

    String login(UserVO userVO);
}
