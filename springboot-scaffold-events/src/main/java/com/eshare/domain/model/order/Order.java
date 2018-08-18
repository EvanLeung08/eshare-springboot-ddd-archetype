package com.eshare.domain.model.order;

/**
 * Created by liangyh on 2018/8/18.
 * Email:10856214@163.com
 */
public class Order {

    private Long id;
    /**
     * 产品类型
     */
    private Integer productType;
    /**
     * 金额
     */
    private Double amount;
    /**
     * 订单类型
     */
    private Integer orderType;

    public Order(Long Long, Integer productType, Double amount, Integer orderType) {
        this.id = id;
        this.productType = productType;
        this.amount = amount;
        this.orderType = orderType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", productType=" + productType +
                ", amount=" + amount +
                ", orderType=" + orderType +
                '}';
    }
}
