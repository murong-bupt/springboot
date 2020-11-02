package com.murong.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * @ClassName HelloWorldController
 * @Description TODO
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
}
