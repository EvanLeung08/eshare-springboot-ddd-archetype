package com.eshare.domain.model.order;

import org.springframework.context.ApplicationEvent;

/**
 * Created by liangyh on 2018/8/18.
 * Email:10856214@163.com
 */
public class OrderEvent extends ApplicationEvent {

    public OrderEvent(Object source) {
        super(source);
    }

    public enum Type {
        apply_credit_limit("申请授信"),
        loan("申请借款"),
        adjust_credit_limit("额度调整");

        private final String type;

        Type(final String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "Type{" +
                    "type='" + type + '\'' +
                    '}';
        }
    }
}
