package com.eshare.infrastructure.repository;

import com.eshare.domain.model.user.User;
import com.eshare.domain.model.user.UserRepository;
import com.eshare.infrastructure.repository.mapper.AnnotationUserMapper;
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
    AnnotationUserMapper annotationUserMapper;


    @Override
    public User findById(Long id) {
        return annotationUserMapper.getOneById(id);
    }

    @Override
    public User findByIdcard(String idcard) {
        return annotationUserMapper.getOneByIdcard(idcard);
    }


    @Override
    public User findByName(String name) {
        return annotationUserMapper.getOneByName(name);
    }

    @Override
    public void save(User user) {
        annotationUserMapper.insert(user);
    }

    @Override
    public void deleteUser(String idcard) {
        annotationUserMapper.deleteUser(idcard);
    }

    @Override
    public void updateUser(User user) {
        annotationUserMapper.modifyUser(user);
    }

    @Override
    public List<User> findAll() {
        return annotationUserMapper.getAll();
    }
}
