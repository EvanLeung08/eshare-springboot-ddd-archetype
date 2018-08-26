package com.eshare.application.service;

import com.eshare.domain.model.User.User;
import com.eshare.domain.model.User.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 应用层用户服务类
 * Created by liangyh on 2018/8/19.
 * Email:10856214@163.com
 */
@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;


    public void addUser(User user) {
        userRepository.save(user);
    }

    public User findById(String id) {
        return userRepository.findById(id);
    }

    public void deleteUser(String id) {
        userRepository.deleteUser(id);
    }

    public void updateUser(User user) {
        userRepository.updateUser(user);
    }

}
