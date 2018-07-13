package com.briup.app02.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//http://127.0.0.1:8080可以访问到当前项目
//http://127.0.0.1:8080/test可以访问到当前项目的test类
//http://127.0.0.1:8080/test/hello可以访问到当前项目的test类下的hello方法
@RestController
@RequestMapping("/test")
public class TestController {
	@GetMapping("hello")
	public String hello(){
		return "hello world";
	}
}
