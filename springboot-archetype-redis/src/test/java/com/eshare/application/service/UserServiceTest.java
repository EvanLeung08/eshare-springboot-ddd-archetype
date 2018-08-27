package com.eshare.application.service;

import com.eshare.application.cache.CacheClient;
import com.eshare.domain.model.user.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Optional;

/**
 * Created by liangyh on 2018/8/19.
 * Email:10856214@163.com
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserServiceTest {
    @Autowired
    private CacheClient<String, User> cacheClient;
    @Autowired
    UserService userService;

    @Before
    public void testAddUser2Cache() {
        User user = new User("1234556", "王五", 18);
        cacheClient.put("1234556",user);
        //从缓存中查询
        Optional<User> user1 = cacheClient.get("1234556");
        Assert.assertEquals("1234556",user1.get().getId());

    }


    @Test
    public void testFindById() {
        User user = userService.findById("1234556");
        Assert.assertEquals("1234556", user.getId());
    }
}