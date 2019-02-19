package com.sunflower.model;

import java.io.Serializable;

/**
 * sun_order
 * @author 
 */
public class SunOrder implements Serializable {
    private Integer orderId;

    private String orderName;

    private String orderPrice;

    private String orderType;

    private String orderUserName;

    private String orderStartTime;

    private String orderEndTime;

    private String orderHouseNo;

    private String orderNextPayTime;

    private String createTime;

    private String createAccount;

    private String updateTime;

    private String updateAccount;

    private String extendOne;

    private String extendTwo;

    private String extendThree;

    private static final long serialVersionUID = 1L;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(String orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderUserName() {
        return orderUserName;
    }

    public void setOrderUserName(String orderUserName) {
        this.orderUserName = orderUserName;
    }

    public String getOrderStartTime() {
        return orderStartTime;
    }

    public void setOrderStartTime(String orderStartTime) {
        this.orderStartTime = orderStartTime;
    }

    public String getOrderEndTime() {
        return orderEndTime;
    }

    public void setOrderEndTime(String orderEndTime) {
        this.orderEndTime = orderEndTime;
    }

    public String getOrderHouseNo() {
        return orderHouseNo;
    }

    public void setOrderHouseNo(String orderHouseNo) {
        this.orderHouseNo = orderHouseNo;
    }

    public String getOrderNextPayTime() {
        return orderNextPayTime;
    }

    public void setOrderNextPayTime(String orderNextPayTime) {
        this.orderNextPayTime = orderNextPayTime;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreateAccount() {
        return createAccount;
    }

    public void setCreateAccount(String createAccount) {
        this.createAccount = createAccount;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateAccount() {
        return updateAccount;
    }

    public void setUpdateAccount(String updateAccount) {
        this.updateAccount = updateAccount;
    }

    public String getExtendOne() {
        return extendOne;
    }

    public void setExtendOne(String extendOne) {
        this.extendOne = extendOne;
    }

    public String getExtendTwo() {
        return extendTwo;
    }

    public void setExtendTwo(String extendTwo) {
        this.extendTwo = extendTwo;
    }

    public String getExtendThree() {
        return extendThree;
    }

    public void setExtendThree(String extendThree) {
        this.extendThree = extendThree;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SunOrder other = (SunOrder) that;
        return (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getOrderName() == null ? other.getOrderName() == null : this.getOrderName().equals(other.getOrderName()))
            && (this.getOrderPrice() == null ? other.getOrderPrice() == null : this.getOrderPrice().equals(other.getOrderPrice()))
            && (this.getOrderType() == null ? other.getOrderType() == null : this.getOrderType().equals(other.getOrderType()))
            && (this.getOrderUserName() == null ? other.getOrderUserName() == null : this.getOrderUserName().equals(other.getOrderUserName()))
            && (this.getOrderStartTime() == null ? other.getOrderStartTime() == null : this.getOrderStartTime().equals(other.getOrderStartTime()))
            && (this.getOrderEndTime() == null ? other.getOrderEndTime() == null : this.getOrderEndTime().equals(other.getOrderEndTime()))
            && (this.getOrderHouseNo() == null ? other.getOrderHouseNo() == null : this.getOrderHouseNo().equals(other.getOrderHouseNo()))
            && (this.getOrderNextPayTime() == null ? other.getOrderNextPayTime() == null : this.getOrderNextPayTime().equals(other.getOrderNextPayTime()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreateAccount() == null ? other.getCreateAccount() == null : this.getCreateAccount().equals(other.getCreateAccount()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getUpdateAccount() == null ? other.getUpdateAccount() == null : this.getUpdateAccount().equals(other.getUpdateAccount()))
            && (this.getExtendOne() == null ? other.getExtendOne() == null : this.getExtendOne().equals(other.getExtendOne()))
            && (this.getExtendTwo() == null ? other.getExtendTwo() == null : this.getExtendTwo().equals(other.getExtendTwo()))
            && (this.getExtendThree() == null ? other.getExtendThree() == null : this.getExtendThree().equals(other.getExtendThree()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getOrderName() == null) ? 0 : getOrderName().hashCode());
        result = prime * result + ((getOrderPrice() == null) ? 0 : getOrderPrice().hashCode());
        result = prime * result + ((getOrderType() == null) ? 0 : getOrderType().hashCode());
        result = prime * result + ((getOrderUserName() == null) ? 0 : getOrderUserName().hashCode());
        result = prime * result + ((getOrderStartTime() == null) ? 0 : getOrderStartTime().hashCode());
        result = prime * result + ((getOrderEndTime() == null) ? 0 : getOrderEndTime().hashCode());
        result = prime * result + ((getOrderHouseNo() == null) ? 0 : getOrderHouseNo().hashCode());
        result = prime * result + ((getOrderNextPayTime() == null) ? 0 : getOrderNextPayTime().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreateAccount() == null) ? 0 : getCreateAccount().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getUpdateAccount() == null) ? 0 : getUpdateAccount().hashCode());
        result = prime * result + ((getExtendOne() == null) ? 0 : getExtendOne().hashCode());
        result = prime * result + ((getExtendTwo() == null) ? 0 : getExtendTwo().hashCode());
        result = prime * result + ((getExtendThree() == null) ? 0 : getExtendThree().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", orderName=").append(orderName);
        sb.append(", orderPrice=").append(orderPrice);
        sb.append(", orderType=").append(orderType);
        sb.append(", orderUserName=").append(orderUserName);
        sb.append(", orderStartTime=").append(orderStartTime);
        sb.append(", orderEndTime=").append(orderEndTime);
        sb.append(", orderHouseNo=").append(orderHouseNo);
        sb.append(", orderNextPayTime=").append(orderNextPayTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", createAccount=").append(createAccount);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateAccount=").append(updateAccount);
        sb.append(", extendOne=").append(extendOne);
        sb.append(", extendTwo=").append(extendTwo);
        sb.append(", extendThree=").append(extendThree);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}