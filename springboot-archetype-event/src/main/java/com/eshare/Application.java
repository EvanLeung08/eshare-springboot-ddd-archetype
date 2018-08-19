package com.eshare;

import com.eshare.domain.model.order.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.PayloadApplicationEvent;

@SpringBootApplication
public class Application {

    public static void main(String[] args) throws InterruptedException {
        ApplicationEventPublisher publisher = SpringApplication.run(Application.class, args);

        //发布授信额度申请事件
        Thread thread1 = new Thread(() -> {
            publisher.publishEvent(new ApplyCreditLimitEvent(ApplyCreditLimitEvent.eventType));
            publisher.publishEvent(new PayloadApplicationEvent<Order>(OrderEvent.Type.apply_credit_limit, new Order(1l, 1, 1000.0d, 1)));
        });
        //发布授信额度申请事件
        Thread thread2 = new Thread(() -> {
            publisher.publishEvent(new AdjustCreditLimitEvent(AdjustCreditLimitEvent.eventType));
            publisher.publishEvent(new PayloadApplicationEvent<Order>(AdjustCreditLimitEvent.eventType, new Order(1l, 1, 1000.0d, 1)));
        });

        //发布借款申请事件
        Thread thread3 = new Thread(() -> {
            publisher.publishEvent(new LoanEvent(LoanEvent.eventType));
            publisher.publishEvent(new PayloadApplicationEvent<Order>(LoanEvent.eventType, new Order(1l, 1, 1000.0d, 1)));
        });

        //延迟3秒
        thread1.sleep(3000);
        thread1.start();
        thread2.sleep(3000);
        thread2.start();
        thread3.sleep(3000);
        thread3.start();

    }
}
