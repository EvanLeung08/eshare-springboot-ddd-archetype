package com.eshare.infrastructure.cache;

import com.eshare.application.cache.CacheClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * 缓存接口实现类
 * Created by liangyh on 2018/8/19.
 * Email:10856214@163.com
 */
@Service
public class RedisCacheClient<k,v> implements CacheClient<k,v> {

    @Autowired
    RedisTemplate<k,v> redisTemplate;

    @Override
    public Optional get(k key) {
        return Optional.of(redisTemplate.opsForValue().get(key));
    }

    @Override
    public void put(k key, v value) {
        redisTemplate.opsForValue().set(key,value);
    }
}
