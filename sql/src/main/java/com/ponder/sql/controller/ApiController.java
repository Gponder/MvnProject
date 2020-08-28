package com.ponder.sql.controller;

import com.ponder.sql.third.DoneTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ApiController {
	
	@GetMapping("info")
	@DoneTime(param = "IndexController")
	public String info() {
		return "info";
	}
}
