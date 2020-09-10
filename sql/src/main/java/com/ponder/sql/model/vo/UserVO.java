package com.ponder.sql.model.vo;

import com.ponder.sql.aop.before.BeforePointCut;
import com.ponder.sql.aop.before.PointCutType;

/**
 * @auth ponder
 * @Email gponder.g@gmail.com
 * @create 2020/9/9 10:19
 */
@BeforePointCut(type = PointCutType.args)
public class UserVO {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
