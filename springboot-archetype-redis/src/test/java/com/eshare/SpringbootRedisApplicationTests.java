package com.eshare;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootRedisApplicationTests {

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Test
    public void saveString() {
        //保存字符串
        stringRedisTemplate.opsForValue().set("accountId","123456");
        Assert.assertEquals("123456",stringRedisTemplate.opsForValue().get("accountId"));
    }

}
