package com.hdy.restful.entity;

/**
 * @program: restful
 * @description: 订单实体类
 * @author: Andy
 * @create: 2019-10-29 14:39
 **/

public class Resource {
    private String id ;
    private String resName;
    private String reColomun ;
    private String isWritable;
    private String tableName;
    private String condition;
    private String resv1;
    private String resv2;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getResName() {
        return resName;
    }

    public void setResName(String resName) {
        this.resName = resName;
    }

    public String getReColomun() {
        return reColomun;
    }

    public void setReColomun(String reColomun) {
        this.reColomun = reColomun;
    }

    public String getIsWritable() {
        return isWritable;
    }

    public void setIsWritable(String isWritable) {
        this.isWritable = isWritable;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getResv1() {
        return resv1;
    }

    public void setResv1(String resv1) {
        this.resv1 = resv1;
    }

    public String getResv2() {
        return resv2;
    }

    public void setResv2(String resv2) {
        this.resv2 = resv2;
    }

    @Override
    public String toString() {
        return "Resource{" +
                "id='" + id + '\'' +
                ", resName='" + resName + '\'' +
                ", reColomun='" + reColomun + '\'' +
                ", isWritable='" + isWritable + '\'' +
                ", tableName='" + tableName + '\'' +
                ", condition='" + condition + '\'' +
                ", resv1='" + resv1 + '\'' +
                ", resv2='" + resv2 + '\'' +
                '}';
    }
}
