package com.sunflower.model;

import java.util.ArrayList;
import java.util.List;

public class SunHouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public SunHouseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andHouseIdIsNull() {
            addCriterion("house_id is null");
            return (Criteria) this;
        }

        public Criteria andHouseIdIsNotNull() {
            addCriterion("house_id is not null");
            return (Criteria) this;
        }

        public Criteria andHouseIdEqualTo(Integer value) {
            addCriterion("house_id =", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotEqualTo(Integer value) {
            addCriterion("house_id <>", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdGreaterThan(Integer value) {
            addCriterion("house_id >", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("house_id >=", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdLessThan(Integer value) {
            addCriterion("house_id <", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdLessThanOrEqualTo(Integer value) {
            addCriterion("house_id <=", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdIn(List<Integer> values) {
            addCriterion("house_id in", values, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotIn(List<Integer> values) {
            addCriterion("house_id not in", values, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdBetween(Integer value1, Integer value2) {
            addCriterion("house_id between", value1, value2, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("house_id not between", value1, value2, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseNoIsNull() {
            addCriterion("house_no is null");
            return (Criteria) this;
        }

        public Criteria andHouseNoIsNotNull() {
            addCriterion("house_no is not null");
            return (Criteria) this;
        }

        public Criteria andHouseNoEqualTo(String value) {
            addCriterion("house_no =", value, "houseNo");
            return (Criteria) this;
        }

        public Criteria andHouseNoNotEqualTo(String value) {
            addCriterion("house_no <>", value, "houseNo");
            return (Criteria) this;
        }

        public Criteria andHouseNoGreaterThan(String value) {
            addCriterion("house_no >", value, "houseNo");
            return (Criteria) this;
        }

        public Criteria andHouseNoGreaterThanOrEqualTo(String value) {
            addCriterion("house_no >=", value, "houseNo");
            return (Criteria) this;
        }

        public Criteria andHouseNoLessThan(String value) {
            addCriterion("house_no <", value, "houseNo");
            return (Criteria) this;
        }

        public Criteria andHouseNoLessThanOrEqualTo(String value) {
            addCriterion("house_no <=", value, "houseNo");
            return (Criteria) this;
        }

        public Criteria andHouseNoLike(String value) {
            addCriterion("house_no like", value, "houseNo");
            return (Criteria) this;
        }

        public Criteria andHouseNoNotLike(String value) {
            addCriterion("house_no not like", value, "houseNo");
            return (Criteria) this;
        }

        public Criteria andHouseNoIn(List<String> values) {
            addCriterion("house_no in", values, "houseNo");
            return (Criteria) this;
        }

        public Criteria andHouseNoNotIn(List<String> values) {
            addCriterion("house_no not in", values, "houseNo");
            return (Criteria) this;
        }

        public Criteria andHouseNoBetween(String value1, String value2) {
            addCriterion("house_no between", value1, value2, "houseNo");
            return (Criteria) this;
        }

        public Criteria andHouseNoNotBetween(String value1, String value2) {
            addCriterion("house_no not between", value1, value2, "houseNo");
            return (Criteria) this;
        }

        public Criteria andHouseNameIsNull() {
            addCriterion("house_name is null");
            return (Criteria) this;
        }

        public Criteria andHouseNameIsNotNull() {
            addCriterion("house_name is not null");
            return (Criteria) this;
        }

        public Criteria andHouseNameEqualTo(String value) {
            addCriterion("house_name =", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameNotEqualTo(String value) {
            addCriterion("house_name <>", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameGreaterThan(String value) {
            addCriterion("house_name >", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameGreaterThanOrEqualTo(String value) {
            addCriterion("house_name >=", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameLessThan(String value) {
            addCriterion("house_name <", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameLessThanOrEqualTo(String value) {
            addCriterion("house_name <=", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameLike(String value) {
            addCriterion("house_name like", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameNotLike(String value) {
            addCriterion("house_name not like", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameIn(List<String> values) {
            addCriterion("house_name in", values, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameNotIn(List<String> values) {
            addCriterion("house_name not in", values, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameBetween(String value1, String value2) {
            addCriterion("house_name between", value1, value2, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameNotBetween(String value1, String value2) {
            addCriterion("house_name not between", value1, value2, "houseName");
            return (Criteria) this;
        }

        public Criteria andHousePictureIsNull() {
            addCriterion("house_picture is null");
            return (Criteria) this;
        }

        public Criteria andHousePictureIsNotNull() {
            addCriterion("house_picture is not null");
            return (Criteria) this;
        }

        public Criteria andHousePictureEqualTo(String value) {
            addCriterion("house_picture =", value, "housePicture");
            return (Criteria) this;
        }

        public Criteria andHousePictureNotEqualTo(String value) {
            addCriterion("house_picture <>", value, "housePicture");
            return (Criteria) this;
        }

        public Criteria andHousePictureGreaterThan(String value) {
            addCriterion("house_picture >", value, "housePicture");
            return (Criteria) this;
        }

        public Criteria andHousePictureGreaterThanOrEqualTo(String value) {
            addCriterion("house_picture >=", value, "housePicture");
            return (Criteria) this;
        }

        public Criteria andHousePictureLessThan(String value) {
            addCriterion("house_picture <", value, "housePicture");
            return (Criteria) this;
        }

        public Criteria andHousePictureLessThanOrEqualTo(String value) {
            addCriterion("house_picture <=", value, "housePicture");
            return (Criteria) this;
        }

        public Criteria andHousePictureLike(String value) {
            addCriterion("house_picture like", value, "housePicture");
            return (Criteria) this;
        }

        public Criteria andHousePictureNotLike(String value) {
            addCriterion("house_picture not like", value, "housePicture");
            return (Criteria) this;
        }

        public Criteria andHousePictureIn(List<String> values) {
            addCriterion("house_picture in", values, "housePicture");
            return (Criteria) this;
        }

        public Criteria andHousePictureNotIn(List<String> values) {
            addCriterion("house_picture not in", values, "housePicture");
            return (Criteria) this;
        }

        public Criteria andHousePictureBetween(String value1, String value2) {
            addCriterion("house_picture between", value1, value2, "housePicture");
            return (Criteria) this;
        }

        public Criteria andHousePictureNotBetween(String value1, String value2) {
            addCriterion("house_picture not between", value1, value2, "housePicture");
            return (Criteria) this;
        }

        public Criteria andHouseIsRentIsNull() {
            addCriterion("house_is_rent is null");
            return (Criteria) this;
        }

        public Criteria andHouseIsRentIsNotNull() {
            addCriterion("house_is_rent is not null");
            return (Criteria) this;
        }

        public Criteria andHouseIsRentEqualTo(String value) {
            addCriterion("house_is_rent =", value, "houseIsRent");
            return (Criteria) this;
        }

        public Criteria andHouseIsRentNotEqualTo(String value) {
            addCriterion("house_is_rent <>", value, "houseIsRent");
            return (Criteria) this;
        }

        public Criteria andHouseIsRentGreaterThan(String value) {
            addCriterion("house_is_rent >", value, "houseIsRent");
            return (Criteria) this;
        }

        public Criteria andHouseIsRentGreaterThanOrEqualTo(String value) {
            addCriterion("house_is_rent >=", value, "houseIsRent");
            return (Criteria) this;
        }

        public Criteria andHouseIsRentLessThan(String value) {
            addCriterion("house_is_rent <", value, "houseIsRent");
            return (Criteria) this;
        }

        public Criteria andHouseIsRentLessThanOrEqualTo(String value) {
            addCriterion("house_is_rent <=", value, "houseIsRent");
            return (Criteria) this;
        }

        public Criteria andHouseIsRentLike(String value) {
            addCriterion("house_is_rent like", value, "houseIsRent");
            return (Criteria) this;
        }

        public Criteria andHouseIsRentNotLike(String value) {
            addCriterion("house_is_rent not like", value, "houseIsRent");
            return (Criteria) this;
        }

        public Criteria andHouseIsRentIn(List<String> values) {
            addCriterion("house_is_rent in", values, "houseIsRent");
            return (Criteria) this;
        }

        public Criteria andHouseIsRentNotIn(List<String> values) {
            addCriterion("house_is_rent not in", values, "houseIsRent");
            return (Criteria) this;
        }

        public Criteria andHouseIsRentBetween(String value1, String value2) {
            addCriterion("house_is_rent between", value1, value2, "houseIsRent");
            return (Criteria) this;
        }

        public Criteria andHouseIsRentNotBetween(String value1, String value2) {
            addCriterion("house_is_rent not between", value1, value2, "houseIsRent");
            return (Criteria) this;
        }

        public Criteria andHouseMonthPriceIsNull() {
            addCriterion("house_month_price is null");
            return (Criteria) this;
        }

        public Criteria andHouseMonthPriceIsNotNull() {
            addCriterion("house_month_price is not null");
            return (Criteria) this;
        }

        public Criteria andHouseMonthPriceEqualTo(String value) {
            addCriterion("house_month_price =", value, "houseMonthPrice");
            return (Criteria) this;
        }

        public Criteria andHouseMonthPriceNotEqualTo(String value) {
            addCriterion("house_month_price <>", value, "houseMonthPrice");
            return (Criteria) this;
        }

        public Criteria andHouseMonthPriceGreaterThan(String value) {
            addCriterion("house_month_price >", value, "houseMonthPrice");
            return (Criteria) this;
        }

        public Criteria andHouseMonthPriceGreaterThanOrEqualTo(String value) {
            addCriterion("house_month_price >=", value, "houseMonthPrice");
            return (Criteria) this;
        }

        public Criteria andHouseMonthPriceLessThan(String value) {
            addCriterion("house_month_price <", value, "houseMonthPrice");
            return (Criteria) this;
        }

        public Criteria andHouseMonthPriceLessThanOrEqualTo(String value) {
            addCriterion("house_month_price <=", value, "houseMonthPrice");
            return (Criteria) this;
        }

        public Criteria andHouseMonthPriceLike(String value) {
            addCriterion("house_month_price like", value, "houseMonthPrice");
            return (Criteria) this;
        }

        public Criteria andHouseMonthPriceNotLike(String value) {
            addCriterion("house_month_price not like", value, "houseMonthPrice");
            return (Criteria) this;
        }

        public Criteria andHouseMonthPriceIn(List<String> values) {
            addCriterion("house_month_price in", values, "houseMonthPrice");
            return (Criteria) this;
        }

        public Criteria andHouseMonthPriceNotIn(List<String> values) {
            addCriterion("house_month_price not in", values, "houseMonthPrice");
            return (Criteria) this;
        }

        public Criteria andHouseMonthPriceBetween(String value1, String value2) {
            addCriterion("house_month_price between", value1, value2, "houseMonthPrice");
            return (Criteria) this;
        }

        public Criteria andHouseMonthPriceNotBetween(String value1, String value2) {
            addCriterion("house_month_price not between", value1, value2, "houseMonthPrice");
            return (Criteria) this;
        }

        public Criteria andHouseYearPriceIsNull() {
            addCriterion("house_year_price is null");
            return (Criteria) this;
        }

        public Criteria andHouseYearPriceIsNotNull() {
            addCriterion("house_year_price is not null");
            return (Criteria) this;
        }

        public Criteria andHouseYearPriceEqualTo(String value) {
            addCriterion("house_year_price =", value, "houseYearPrice");
            return (Criteria) this;
        }

        public Criteria andHouseYearPriceNotEqualTo(String value) {
            addCriterion("house_year_price <>", value, "houseYearPrice");
            return (Criteria) this;
        }

        public Criteria andHouseYearPriceGreaterThan(String value) {
            addCriterion("house_year_price >", value, "houseYearPrice");
            return (Criteria) this;
        }

        public Criteria andHouseYearPriceGreaterThanOrEqualTo(String value) {
            addCriterion("house_year_price >=", value, "houseYearPrice");
            return (Criteria) this;
        }

        public Criteria andHouseYearPriceLessThan(String value) {
            addCriterion("house_year_price <", value, "houseYearPrice");
            return (Criteria) this;
        }

        public Criteria andHouseYearPriceLessThanOrEqualTo(String value) {
            addCriterion("house_year_price <=", value, "houseYearPrice");
            return (Criteria) this;
        }

        public Criteria andHouseYearPriceLike(String value) {
            addCriterion("house_year_price like", value, "houseYearPrice");
            return (Criteria) this;
        }

        public Criteria andHouseYearPriceNotLike(String value) {
            addCriterion("house_year_price not like", value, "houseYearPrice");
            return (Criteria) this;
        }

        public Criteria andHouseYearPriceIn(List<String> values) {
            addCriterion("house_year_price in", values, "houseYearPrice");
            return (Criteria) this;
        }

        public Criteria andHouseYearPriceNotIn(List<String> values) {
            addCriterion("house_year_price not in", values, "houseYearPrice");
            return (Criteria) this;
        }

        public Criteria andHouseYearPriceBetween(String value1, String value2) {
            addCriterion("house_year_price between", value1, value2, "houseYearPrice");
            return (Criteria) this;
        }

        public Criteria andHouseYearPriceNotBetween(String value1, String value2) {
            addCriterion("house_year_price not between", value1, value2, "houseYearPrice");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("create_time like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("create_time not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateAccountIsNull() {
            addCriterion("create_account is null");
            return (Criteria) this;
        }

        public Criteria andCreateAccountIsNotNull() {
            addCriterion("create_account is not null");
            return (Criteria) this;
        }

        public Criteria andCreateAccountEqualTo(String value) {
            addCriterion("create_account =", value, "createAccount");
            return (Criteria) this;
        }

        public Criteria andCreateAccountNotEqualTo(String value) {
            addCriterion("create_account <>", value, "createAccount");
            return (Criteria) this;
        }

        public Criteria andCreateAccountGreaterThan(String value) {
            addCriterion("create_account >", value, "createAccount");
            return (Criteria) this;
        }

        public Criteria andCreateAccountGreaterThanOrEqualTo(String value) {
            addCriterion("create_account >=", value, "createAccount");
            return (Criteria) this;
        }

        public Criteria andCreateAccountLessThan(String value) {
            addCriterion("create_account <", value, "createAccount");
            return (Criteria) this;
        }

        public Criteria andCreateAccountLessThanOrEqualTo(String value) {
            addCriterion("create_account <=", value, "createAccount");
            return (Criteria) this;
        }

        public Criteria andCreateAccountLike(String value) {
            addCriterion("create_account like", value, "createAccount");
            return (Criteria) this;
        }

        public Criteria andCreateAccountNotLike(String value) {
            addCriterion("create_account not like", value, "createAccount");
            return (Criteria) this;
        }

        public Criteria andCreateAccountIn(List<String> values) {
            addCriterion("create_account in", values, "createAccount");
            return (Criteria) this;
        }

        public Criteria andCreateAccountNotIn(List<String> values) {
            addCriterion("create_account not in", values, "createAccount");
            return (Criteria) this;
        }

        public Criteria andCreateAccountBetween(String value1, String value2) {
            addCriterion("create_account between", value1, value2, "createAccount");
            return (Criteria) this;
        }

        public Criteria andCreateAccountNotBetween(String value1, String value2) {
            addCriterion("create_account not between", value1, value2, "createAccount");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(String value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(String value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(String value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(String value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(String value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLike(String value) {
            addCriterion("update_time like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotLike(String value) {
            addCriterion("update_time not like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<String> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<String> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(String value1, String value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(String value1, String value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateAccountIsNull() {
            addCriterion("update_account is null");
            return (Criteria) this;
        }

        public Criteria andUpdateAccountIsNotNull() {
            addCriterion("update_account is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateAccountEqualTo(String value) {
            addCriterion("update_account =", value, "updateAccount");
            return (Criteria) this;
        }

        public Criteria andUpdateAccountNotEqualTo(String value) {
            addCriterion("update_account <>", value, "updateAccount");
            return (Criteria) this;
        }

        public Criteria andUpdateAccountGreaterThan(String value) {
            addCriterion("update_account >", value, "updateAccount");
            return (Criteria) this;
        }

        public Criteria andUpdateAccountGreaterThanOrEqualTo(String value) {
            addCriterion("update_account >=", value, "updateAccount");
            return (Criteria) this;
        }

        public Criteria andUpdateAccountLessThan(String value) {
            addCriterion("update_account <", value, "updateAccount");
            return (Criteria) this;
        }

        public Criteria andUpdateAccountLessThanOrEqualTo(String value) {
            addCriterion("update_account <=", value, "updateAccount");
            return (Criteria) this;
        }

        public Criteria andUpdateAccountLike(String value) {
            addCriterion("update_account like", value, "updateAccount");
            return (Criteria) this;
        }

        public Criteria andUpdateAccountNotLike(String value) {
            addCriterion("update_account not like", value, "updateAccount");
            return (Criteria) this;
        }

        public Criteria andUpdateAccountIn(List<String> values) {
            addCriterion("update_account in", values, "updateAccount");
            return (Criteria) this;
        }

        public Criteria andUpdateAccountNotIn(List<String> values) {
            addCriterion("update_account not in", values, "updateAccount");
            return (Criteria) this;
        }

        public Criteria andUpdateAccountBetween(String value1, String value2) {
            addCriterion("update_account between", value1, value2, "updateAccount");
            return (Criteria) this;
        }

        public Criteria andUpdateAccountNotBetween(String value1, String value2) {
            addCriterion("update_account not between", value1, value2, "updateAccount");
            return (Criteria) this;
        }

        public Criteria andExtendOneIsNull() {
            addCriterion("extend_one is null");
            return (Criteria) this;
        }

        public Criteria andExtendOneIsNotNull() {
            addCriterion("extend_one is not null");
            return (Criteria) this;
        }

        public Criteria andExtendOneEqualTo(String value) {
            addCriterion("extend_one =", value, "extendOne");
            return (Criteria) this;
        }

        public Criteria andExtendOneNotEqualTo(String value) {
            addCriterion("extend_one <>", value, "extendOne");
            return (Criteria) this;
        }

        public Criteria andExtendOneGreaterThan(String value) {
            addCriterion("extend_one >", value, "extendOne");
            return (Criteria) this;
        }

        public Criteria andExtendOneGreaterThanOrEqualTo(String value) {
            addCriterion("extend_one >=", value, "extendOne");
            return (Criteria) this;
        }

        public Criteria andExtendOneLessThan(String value) {
            addCriterion("extend_one <", value, "extendOne");
            return (Criteria) this;
        }

        public Criteria andExtendOneLessThanOrEqualTo(String value) {
            addCriterion("extend_one <=", value, "extendOne");
            return (Criteria) this;
        }

        public Criteria andExtendOneLike(String value) {
            addCriterion("extend_one like", value, "extendOne");
            return (Criteria) this;
        }

        public Criteria andExtendOneNotLike(String value) {
            addCriterion("extend_one not like", value, "extendOne");
            return (Criteria) this;
        }

        public Criteria andExtendOneIn(List<String> values) {
            addCriterion("extend_one in", values, "extendOne");
            return (Criteria) this;
        }

        public Criteria andExtendOneNotIn(List<String> values) {
            addCriterion("extend_one not in", values, "extendOne");
            return (Criteria) this;
        }

        public Criteria andExtendOneBetween(String value1, String value2) {
            addCriterion("extend_one between", value1, value2, "extendOne");
            return (Criteria) this;
        }

        public Criteria andExtendOneNotBetween(String value1, String value2) {
            addCriterion("extend_one not between", value1, value2, "extendOne");
            return (Criteria) this;
        }

        public Criteria andExtendTwoIsNull() {
            addCriterion("extend_two is null");
            return (Criteria) this;
        }

        public Criteria andExtendTwoIsNotNull() {
            addCriterion("extend_two is not null");
            return (Criteria) this;
        }

        public Criteria andExtendTwoEqualTo(String value) {
            addCriterion("extend_two =", value, "extendTwo");
            return (Criteria) this;
        }

        public Criteria andExtendTwoNotEqualTo(String value) {
            addCriterion("extend_two <>", value, "extendTwo");
            return (Criteria) this;
        }

        public Criteria andExtendTwoGreaterThan(String value) {
            addCriterion("extend_two >", value, "extendTwo");
            return (Criteria) this;
        }

        public Criteria andExtendTwoGreaterThanOrEqualTo(String value) {
            addCriterion("extend_two >=", value, "extendTwo");
            return (Criteria) this;
        }

        public Criteria andExtendTwoLessThan(String value) {
            addCriterion("extend_two <", value, "extendTwo");
            return (Criteria) this;
        }

        public Criteria andExtendTwoLessThanOrEqualTo(String value) {
            addCriterion("extend_two <=", value, "extendTwo");
            return (Criteria) this;
        }

        public Criteria andExtendTwoLike(String value) {
            addCriterion("extend_two like", value, "extendTwo");
            return (Criteria) this;
        }

        public Criteria andExtendTwoNotLike(String value) {
            addCriterion("extend_two not like", value, "extendTwo");
            return (Criteria) this;
        }

        public Criteria andExtendTwoIn(List<String> values) {
            addCriterion("extend_two in", values, "extendTwo");
            return (Criteria) this;
        }

        public Criteria andExtendTwoNotIn(List<String> values) {
            addCriterion("extend_two not in", values, "extendTwo");
            return (Criteria) this;
        }

        public Criteria andExtendTwoBetween(String value1, String value2) {
            addCriterion("extend_two between", value1, value2, "extendTwo");
            return (Criteria) this;
        }

        public Criteria andExtendTwoNotBetween(String value1, String value2) {
            addCriterion("extend_two not between", value1, value2, "extendTwo");
            return (Criteria) this;
        }

        public Criteria andExtendThreeIsNull() {
            addCriterion("extend_three is null");
            return (Criteria) this;
        }

        public Criteria andExtendThreeIsNotNull() {
            addCriterion("extend_three is not null");
            return (Criteria) this;
        }

        public Criteria andExtendThreeEqualTo(String value) {
            addCriterion("extend_three =", value, "extendThree");
            return (Criteria) this;
        }

        public Criteria andExtendThreeNotEqualTo(String value) {
            addCriterion("extend_three <>", value, "extendThree");
            return (Criteria) this;
        }

        public Criteria andExtendThreeGreaterThan(String value) {
            addCriterion("extend_three >", value, "extendThree");
            return (Criteria) this;
        }

        public Criteria andExtendThreeGreaterThanOrEqualTo(String value) {
            addCriterion("extend_three >=", value, "extendThree");
            return (Criteria) this;
        }

        public Criteria andExtendThreeLessThan(String value) {
            addCriterion("extend_three <", value, "extendThree");
            return (Criteria) this;
        }

        public Criteria andExtendThreeLessThanOrEqualTo(String value) {
            addCriterion("extend_three <=", value, "extendThree");
            return (Criteria) this;
        }

        public Criteria andExtendThreeLike(String value) {
            addCriterion("extend_three like", value, "extendThree");
            return (Criteria) this;
        }

        public Criteria andExtendThreeNotLike(String value) {
            addCriterion("extend_three not like", value, "extendThree");
            return (Criteria) this;
        }

        public Criteria andExtendThreeIn(List<String> values) {
            addCriterion("extend_three in", values, "extendThree");
            return (Criteria) this;
        }

        public Criteria andExtendThreeNotIn(List<String> values) {
            addCriterion("extend_three not in", values, "extendThree");
            return (Criteria) this;
        }

        public Criteria andExtendThreeBetween(String value1, String value2) {
            addCriterion("extend_three between", value1, value2, "extendThree");
            return (Criteria) this;
        }

        public Criteria andExtendThreeNotBetween(String value1, String value2) {
            addCriterion("extend_three not between", value1, value2, "extendThree");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}