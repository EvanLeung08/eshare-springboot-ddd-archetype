package com.eshare.infrastructure.repository;

import com.eshare.domain.model.user.User;
import com.eshare.domain.model.user.UserRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.DependsOn;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by liangyh on 2018/8/28.
 * Email:10856214@163.com
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserH2RepositoryTest {

    @Autowired
    UserRepository userRepository;

    @Before
    public void testSave() {
        User user = new User(10l,"老王",22,"4444411123");
       userRepository.save(user);
    }

    @Test
    public void testFindAll() {
        List<User> user=  userRepository.findAll();
        System.out.println(user);
    }

    @Test
    public void findByIdcard() {
        User user = userRepository.findByIdcard("4444411123");
        Assert.assertEquals("4444411123",user.getIdcard());
    }

    @Test
    public void findByName() {
        User user = userRepository.findByName("老王");
        Assert.assertEquals("4444411123",user.getIdcard());
    }

    @Test
    public void updateUser() {
        User user = new User(10l,"老梁",22,"4444411123");
        userRepository.updateUser(user);
    }

    @Test
    public void deleteUser() {
        userRepository.deleteUser("4444411123");
    }

}