package com.eshare.interfaces.accessing;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liangyh on 2018/8/18.
 * Email:10856214@163.com
 */
@RestController
public class HelloController {
    @RequestMapping("/sayHello")
    public String sayHello(){
        return "Hello , springboot-scaffold!";
    }
}
