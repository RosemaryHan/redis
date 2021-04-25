package com.example.redisspringboot.demo;

import com.example.redisspringboot.demo.util.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Rosemary
 * @Description redis相关操作
 * @date 2021/04/25 19:49:23
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisSpringTest {
    @Autowired
    @Qualifier("redisTemplate")
    private RedisTemplate redisTemplate;

    @Autowired
    private RedisUtil redisUtil;

    @Test
    public void contextLoads() {
        //对象进行操作 opsFor数据类型
        redisTemplate.opsForValue().set("testBySpring", "hello");
        System.out.println(redisTemplate.opsForValue().get("testBySpring"));
    }

    @Test
    public void testUtil() {

    }

}
