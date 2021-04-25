package com.example.redisspringboot.demo.config;

import com.fasterxml.jackson.databind.ser.std.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

/**
 * @author Rosemary
 * @Description redisConfig
 * @date 2021/04/25 20:30:59
 */
@Configuration
public class RedisConfig {
    //编写自己的RedisTemplate
    @Bean
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(redisConnectionFactory);
//        //序列化方法
//        Jackson2JsonRedisSerializer<Object> objectJackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer<Object>(Object.class);
//        StringSerializer stringSerializer = new StringSerializer();
//        //因为序列化默认jdk，所以如果有需要需要自己去配置序列化方式
//        redisTemplate.setKeySerializer(objectJackson2JsonRedisSerializer);
//        redisTemplate.setValueSerializer(stringSerializer);
//        //`````以下不再示范，看具体项目需求
        return redisTemplate;
    }
}
