package com.zjy.springbootmybatisplus.redis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
public class RedisCase {
    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Test
    void reset(){
        ValueOperations valueOperations = redisTemplate.opsForValue();
        valueOperations.set("a", 1);

    }

    @Test
    void stringRedis(){
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        ops.set("zhao","jin1");
    }

    @Test
    void getStringRedis(){
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        String zhao = ops.get("zhao");
        System.out.println(zhao);
    }


    @Test
    void getRedis(){
        ValueOperations valueOperations = redisTemplate.opsForValue();
        Object a = valueOperations.get("a");
        System.out.println(a);
    }
}
