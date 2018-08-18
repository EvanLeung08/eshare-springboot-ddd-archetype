package com.eshare;

import com.eshare.domain.model.order.Order;
import com.eshare.domain.model.order.OrderEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.PayloadApplicationEvent;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationEventPublisher publisher = SpringApplication.run(Application.class, args);
        //发布申请额度事件
        publisher.publishEvent(new OrderEvent(OrderEvent.Type.apply_credit_limit));
        publisher.publishEvent(new PayloadApplicationEvent<Order>(OrderEvent.Type.apply_credit_limit,new Order(1l,1,1000.0d,1)));
    }
}
