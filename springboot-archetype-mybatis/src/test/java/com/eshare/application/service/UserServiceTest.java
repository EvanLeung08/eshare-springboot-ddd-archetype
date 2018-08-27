package com.eshare.application.service;

import com.eshare.domain.model.user.User;
import com.eshare.domain.model.user.UserRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by liangyh on 2018/8/28.
 * Email:10856214@163.com
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
    @Autowired
    UserService userService;

    @Before
    public void tsetAddUser() {
        User user = new User(102l,"小华",18,"123456");
        userService.addUser(user);
    }

    @Test
    public void testFindByIdcard() {
        User user = userService.findByIdcard("123456");
        System.out.println(user);
        Assert.assertEquals("小华",user.getName());
    }

    @Test
    public void testUpdateUser() {
        User user = new User(102l,"小花",18,"123456");
        userService.updateUser(user);
    }

    @Test
    public void tsetDeleteUser() {
        userService.deleteUser("123456");
    }

}