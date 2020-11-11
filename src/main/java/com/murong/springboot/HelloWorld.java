package com.murong.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName HelloWorld
 * @Description TODO
 * @Author xdy
 * @Date 2020/11/7 11:43 下午
 */
public class HelloWorld {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(HelloWorld.class);
        logger.info("Hello World");
    }
}
