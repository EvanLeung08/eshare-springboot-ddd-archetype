package com.eshare.domain.model.order;

import org.springframework.context.ApplicationEvent;

/**
 * Created by liangyh on 2018/8/18.
 * Email:10856214@163.com
 */
public abstract class OrderEvent extends ApplicationEvent {

    protected  Type eventType;

    public OrderEvent(Object source) {
        super(source);
    }

    public static enum Type {
        apply_credit_limit(1,"申请授信"),
        loan(2,"申请借款"),
        adjust_credit_limit(3,"额度调整");

        private final int type;
        private final String description;

        Type(int type, String description) {
            this.type = type;
            this.description = description;
        }

        public int getType() {
            return type;
        }

        public String getDescription() {
            return description;
        }

        @Override
        public String toString() {
            return "Type{" +
                    "type=" + type +
                    ", description='" + description + '\'' +
                    '}';
        }
    }
}
