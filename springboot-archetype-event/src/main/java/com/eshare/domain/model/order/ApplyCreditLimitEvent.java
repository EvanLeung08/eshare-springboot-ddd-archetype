package com.eshare.domain.model.order;

/**
 * 授信额度申请事件
 * Created by liangyh on 2018/8/19.
 * Email:10856214@163.com
 */
public class ApplyCreditLimitEvent extends OrderEvent {

    public static final Type eventType = Type.apply_credit_limit;

    public ApplyCreditLimitEvent(Object source) {
        super(source);
    }

    @Override
    public String toString() {
        return "ApplyCreditLimitEvent{" +
                "eventType=" + eventType +
                '}';
    }
}
