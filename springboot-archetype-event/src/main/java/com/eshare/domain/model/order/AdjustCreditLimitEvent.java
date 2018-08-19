package com.eshare.domain.model.order;

/**
 * 额度调整申请事件
 * Created by liangyh on 2018/8/19.
 * Email:10856214@163.com
 */
public class AdjustCreditLimitEvent extends OrderEvent {

    public static final Type eventType = Type.adjust_credit_limit;

    public AdjustCreditLimitEvent(Object source) {
        super(source);
    }

    @Override
    public String toString() {
        return "AdjustCreditLimitEvent{" +
                "eventType=" + eventType +
                '}';
    }
}
