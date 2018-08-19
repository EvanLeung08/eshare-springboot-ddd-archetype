package com.eshare.application.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

/**
 * 默认事件监听器
 * <a>
 *     不指定事件类型，默认监听所有事件
 * </a>
 * Created by liangyh on 2018/8/18.
 * Email:10856214@163.com
 */
@Configuration
public class DefaultEventListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println("接收到默认事件监听:"+applicationEvent);
    }
}
