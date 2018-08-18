package com.eshare.application.listener;

import com.eshare.domain.model.order.Order;
import com.eshare.domain.model.order.OrderEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.PayloadApplicationEvent;
import org.springframework.context.annotation.Configuration;

/**
 * 申请授信额度事件监听器
 * Created by liangyh on 2018/8/18.
 * Email:10856214@163.com
 */
@Configuration
public class ApplyCreditLimitPlayloadApplicationEventListener implements ApplicationListener<PayloadApplicationEvent<Order>> {

    @Override
    public void onApplicationEvent(PayloadApplicationEvent<Order> orderEventPayloadApplicationEvent) {
        System.out.println("接收到PayloadApplicationEvent事件监听:"+orderEventPayloadApplicationEvent.getPayload());
    }
}
