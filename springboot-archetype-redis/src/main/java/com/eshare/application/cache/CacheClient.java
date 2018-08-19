package com.eshare.application.cache;

import java.util.Optional;

/**
 * 与基础设施层交互的缓存接口
 * Created by liangyh on 2018/8/19.
 * Email:10856214@163.com
 */
public interface CacheClient<k, v> {

    Optional<v> get(k key);

    void put(k key, v value);
}
