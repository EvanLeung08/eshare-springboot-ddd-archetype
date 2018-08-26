package com.eshare.application.service;

import com.eshare.application.cache.CacheClient;
import com.eshare.domain.model.User.User;
import com.eshare.domain.model.User.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * 应用层用户服务类
 * Created by liangyh on 2018/8/19.
 * Email:10856214@163.com
 */
@Service
public class UserService {

    @Autowired
    private CacheClient<String,User> cacheClient;

    @Autowired
    private UserRepository userRepository;


    public void addUser(User user){
        cacheClient.put(user.getName(),user);
    }


    public User findById(String id) {
        Optional<User> cacheUser = cacheClient.get(id);
        if (cacheUser.isPresent()) {
            return cacheUser.get();
        }
        //在缓存不存在则从数据库读取
        User user = userRepository.findById(id);
        if (user!=null) {
            cacheClient.put(user.getName(), user);
        }
        return user;
    }


}
