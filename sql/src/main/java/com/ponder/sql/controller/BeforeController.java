package com.ponder.sql.controller;

import com.ponder.sql.model.vo.UserVO;
import com.ponder.sql.service.BeforeService;
import com.ponder.sql.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auth ponder
 * @Email gponder.g@gmail.com
 * @create 2020/9/8 17:10
 */
@RequestMapping("before")
@RestController
public class BeforeController {

    @Autowired
    private BeforeService beforeService;

    @GetMapping("info")
    public String serviceInvoke(){
        return beforeService.info();
    }

    @GetMapping("login")
    public String login(UserVO userVO){
        System.out.println("login controller");
        return beforeService.login(userVO);
    }

    @GetMapping("log")
    public String log(String msg){
        LogService logService = (LogService) beforeService;
        return logService.log(msg);
    }
}
