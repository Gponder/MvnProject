package com.ponder.sql.service.impl;

import com.ponder.sql.service.LogService;
import org.springframework.stereotype.Service;

/**
 * @auth ponder
 * @Email gponder.g@gmail.com
 * @create 2020/9/10 9:33
 */
@Service
public class LogServiceImpl implements LogService {
    @Override
    public String log(String msg) {
        System.out.println("log service "+msg);
        return "log service "+msg;
    }
}
