package com.eshare.application.service;

import com.eshare.domain.model.user.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by liangyh on 2018/8/27.
 * Email:10856214@163.com
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Before
    public void addUser() {
        User user = new User("123","小华",18);
        userService.addUser(user);
    }

    @Test
    public void findById() {
        User user = userService.findById("123");
        System.out.println(user);
        Assert.assertEquals("小华",user.getName());
    }

    @Test
    public void updateUser() {
        User user = new User("123","小花",18);
        userService.updateUser(user);
    }

    @Test
    public void deleteUser() {
        userService.deleteUser("123");
    }

}