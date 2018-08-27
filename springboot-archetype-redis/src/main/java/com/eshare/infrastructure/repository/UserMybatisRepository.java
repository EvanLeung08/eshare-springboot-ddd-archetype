package com.eshare.infrastructure.repository;

import com.eshare.domain.model.user.User;
import com.eshare.domain.model.user.UserRepository;
import org.springframework.stereotype.Repository;

/**
 * 访问Mybatis数据库的User存储实现类
 * Created by liangyh on 2018/8/19.
 * Email:10856214@163.com
 */
@Repository
public class UserMybatisRepository implements UserRepository {

    @Override
    public User findById(String id) {
        //模拟从数据库读取数据
        return new User(id,"王五", 18);
    }
}
