package com.murong.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.Map;

/**
 * @ClassName HelloWorldController
 * @Description HelloWorld Controller
 * @Author xdy
 * @Date 2020/11/2 10:39 下午
 */
@Controller
public class HelloWorldController {
    @RequestMapping(path = "/hello")
    @ResponseBody
    public String hello(){
        return "Hello, Now is : " + new Date();
    }

    @RequestMapping(path = "/success")
    public String success(Map<String, Object> map) {
        map.put("hello", "你好");
        return "success";
    }
}
