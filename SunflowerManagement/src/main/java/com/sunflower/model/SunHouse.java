package com.sunflower.model;

import java.io.Serializable;

/**
 * sun_house
 * @author 
 */
public class SunHouse implements Serializable {
    private Integer houseId;

    private String houseNo;

    private String houseName;

    private String housePicture;

    private String houseIsRent;

    private String houseMonthPrice;

    private String houseYearPrice;

    private String createTime;

    private String createAccount;

    private String updateTime;

    private String updateAccount;

    private String extendOne;

    private String extendTwo;

    private String extendThree;

    private static final long serialVersionUID = 1L;

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getHousePicture() {
        return housePicture;
    }

    public void setHousePicture(String housePicture) {
        this.housePicture = housePicture;
    }

    public String getHouseIsRent() {
        return houseIsRent;
    }

    public void setHouseIsRent(String houseIsRent) {
        this.houseIsRent = houseIsRent;
    }

    public String getHouseMonthPrice() {
        return houseMonthPrice;
    }

    public void setHouseMonthPrice(String houseMonthPrice) {
        this.houseMonthPrice = houseMonthPrice;
    }

    public String getHouseYearPrice() {
        return houseYearPrice;
    }

    public void setHouseYearPrice(String houseYearPrice) {
        this.houseYearPrice = houseYearPrice;
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
        SunHouse other = (SunHouse) that;
        return (this.getHouseId() == null ? other.getHouseId() == null : this.getHouseId().equals(other.getHouseId()))
            && (this.getHouseNo() == null ? other.getHouseNo() == null : this.getHouseNo().equals(other.getHouseNo()))
            && (this.getHouseName() == null ? other.getHouseName() == null : this.getHouseName().equals(other.getHouseName()))
            && (this.getHousePicture() == null ? other.getHousePicture() == null : this.getHousePicture().equals(other.getHousePicture()))
            && (this.getHouseIsRent() == null ? other.getHouseIsRent() == null : this.getHouseIsRent().equals(other.getHouseIsRent()))
            && (this.getHouseMonthPrice() == null ? other.getHouseMonthPrice() == null : this.getHouseMonthPrice().equals(other.getHouseMonthPrice()))
            && (this.getHouseYearPrice() == null ? other.getHouseYearPrice() == null : this.getHouseYearPrice().equals(other.getHouseYearPrice()))
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
        result = prime * result + ((getHouseId() == null) ? 0 : getHouseId().hashCode());
        result = prime * result + ((getHouseNo() == null) ? 0 : getHouseNo().hashCode());
        result = prime * result + ((getHouseName() == null) ? 0 : getHouseName().hashCode());
        result = prime * result + ((getHousePicture() == null) ? 0 : getHousePicture().hashCode());
        result = prime * result + ((getHouseIsRent() == null) ? 0 : getHouseIsRent().hashCode());
        result = prime * result + ((getHouseMonthPrice() == null) ? 0 : getHouseMonthPrice().hashCode());
        result = prime * result + ((getHouseYearPrice() == null) ? 0 : getHouseYearPrice().hashCode());
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
        sb.append(", houseId=").append(houseId);
        sb.append(", houseNo=").append(houseNo);
        sb.append(", houseName=").append(houseName);
        sb.append(", housePicture=").append(housePicture);
        sb.append(", houseIsRent=").append(houseIsRent);
        sb.append(", houseMonthPrice=").append(houseMonthPrice);
        sb.append(", houseYearPrice=").append(houseYearPrice);
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