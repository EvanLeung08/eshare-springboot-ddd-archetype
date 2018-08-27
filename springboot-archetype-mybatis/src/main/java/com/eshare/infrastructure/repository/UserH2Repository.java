package com.eshare.infrastructure.repository;

import com.eshare.domain.model.user.User;
import com.eshare.domain.model.user.UserRepository;
import org.springframework.stereotype.Repository;

/**
 * 访问h2数据库的User存储实现类
 * Created by liangyh on 2018/8/19.
 * Email:10856214@163.com
 */
@Repository
public class UserH2Repository implements UserRepository {


    @Override
    public User findById(String id) {
        return null;
    }

    @Override
    public User findByName(String name) {
        return null;
    }

    @Override
    public void save(User user) {

    }

    @Override
    public Long deleteUser(String id) {
        return null;
    }

    @Override
    public boolean updateUser(User user) {
        return false;
    }
}
