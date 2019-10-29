package com.hdy.restful.entity;

/**
 * @program: restful
 * @description: 订单实体类
 * @author: Andy
 * @create: 2019-10-29 14:39
 **/

public class Order {
    private String id ;
    private String plat;
    private String orderId ;
    private String subOrderId;
    private String custName;
    private String custId;
    private String custType;
    private String orderStat;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlat() {
        return plat;
    }

    public void setPlat(String plat) {
        this.plat = plat;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getSubOrderId() {
        return subOrderId;
    }

    public void setSubOrderId(String subOrderId) {
        this.subOrderId = subOrderId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCustType() {
        return custType;
    }

    public void setCustType(String custType) {
        this.custType = custType;
    }

    public String getOrderStat() {
        return orderStat;
    }

    public void setOrderStat(String orderStat) {
        this.orderStat = orderStat;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", plat='" + plat + '\'' +
                ", orderId='" + orderId + '\'' +
                ", subOrderId='" + subOrderId + '\'' +
                ", custName='" + custName + '\'' +
                ", custId='" + custId + '\'' +
                ", custType='" + custType + '\'' +
                ", orderStat='" + orderStat + '\'' +
                '}';
    }
}
