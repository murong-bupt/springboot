package com.murong.jedis;

import redis.clients.jedis.Jedis;

/**
 * @ClassName JedisDemo1
 * @Description TODO
 * @Author xdy 221521
 * @Date 2021/6/28 7:54 下午
 */
public class JedisDemo1 {
    public static void main(String[] args) {
        // 创建jedis对象
        Jedis jedis = new Jedis("127.0.0.1",6379);
        String ping = jedis.ping();
        System.out.println(ping);
    }
}
