package com.eshare.infrastructure.repository;

import com.eshare.domain.model.user.User;
import com.eshare.domain.model.user.UserRepository;
import com.eshare.infrastructure.repository.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 访问h2数据库的User存储实现类
 * Created by liangyh on 2018/8/19.
 * Email:10856214@163.com
 */
@Repository
public class UserH2Repository implements UserRepository {

    @Autowired
    UserMapper userMapper;



    @Override
    public User findById(Long id) {
        return userMapper.getOneById(id);
    }

    @Override
    public User findByIdcard(String idcard) {
        return userMapper.getOneByIdcard(idcard);
    }


    @Override
    public User findByName(String name) {
        return null;
    }

    @Override
    public void save(User user) {
        userMapper.insert(user);
    }

    @Override
    public Long deleteUser(String id) {
        return null;
    }

    @Override
    public boolean updateUser(User user) {
        return false;
    }

    @Override
    public List<User> findAll() {
        return userMapper.getAll();
    }
}
