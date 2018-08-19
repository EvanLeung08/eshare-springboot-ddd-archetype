package com.eshare.domain.model.order;

/**
 * 借款申请事件
 * Created by liangyh on 2018/8/19.
 * Email:10856214@163.com
 */
public class LoanEvent extends OrderEvent {
    public static final Type eventType = Type.loan;

    public LoanEvent(Object source) {
        super(source);
    }

    @Override
    public String toString() {
        return "LoanEvent{" +
                "eventType=" + eventType +
                '}';
    }
}
