package com.ponder.sql.controller;

import com.ponder.sql.service.BeforeService;
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

    @GetMapping("service")
    public String serviceInvoke(){
        return beforeService.apiInfo();
    }

    @GetMapping("login")
    public String login(){
        return beforeService.login();
    }
}
