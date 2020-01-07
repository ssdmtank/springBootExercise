package com.test.redis;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 测试Redis配置是否正常
 *
 * @description: spring-boot-01-helloworld
 * @auther: wang
 * @time: 2020/1/7 下午10:16
 */
@Slf4j
@RestController
@RequestMapping("/redis")
public class RedisTest {
    private static int ExpireTime = 60;   // redis中存储的过期时间60s

    @Resource
    private RedisUtil redisUtil;

    @RequestMapping("/setValue")
    public String redisSetValue() {
        log.info("redis to setValue");
        return redisUtil.set("动物", "鸡") ? "成功" : "失败";
    }

    @RequestMapping("/getValue")
    public String redisGetValue() {
        String value = (String) redisUtil.get("动物");
        log.info("redis to getValue: " + value);
        return value;
    }
}
