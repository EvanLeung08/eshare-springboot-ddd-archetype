package com.eshare.application.service;

import com.eshare.domain.model.User.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by liangyh on 2018/8/19.
 * Email:10856214@163.com
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    UserService userService;

    @Test
    public void testAddUser(){
        User user = new User("王五",18);
        userService.addUser(user);
    }


    @Test
    public void testFindByName() {
        User user = userService.findByName("王五");
        System.out.println(user);
    }
}