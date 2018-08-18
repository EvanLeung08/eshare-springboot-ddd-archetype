package com.eshare.application.listener;

import com.eshare.domain.model.order.OrderEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

/**
 * 申请授信额度事件监听器
 * Created by liangyh on 2018/8/18.
 * Email:10856214@163.com
 */
@Configuration
public class ApplyCreditLimitCustomizedEventListener implements ApplicationListener<OrderEvent> {
    @Override
    public void onApplicationEvent(OrderEvent orderEvent) {
        System.out.println("接收到自定义OrderEvent事件监听:"+orderEvent);
    }
}
