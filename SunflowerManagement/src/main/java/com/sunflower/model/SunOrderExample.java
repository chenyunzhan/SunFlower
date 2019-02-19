package com.sunflower.model;

import java.util.ArrayList;
import java.util.List;

public class SunOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public SunOrderExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderNameIsNull() {
            addCriterion("order_name is null");
            return (Criteria) this;
        }

        public Criteria andOrderNameIsNotNull() {
            addCriterion("order_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNameEqualTo(String value) {
            addCriterion("order_name =", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameNotEqualTo(String value) {
            addCriterion("order_name <>", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameGreaterThan(String value) {
            addCriterion("order_name >", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameGreaterThanOrEqualTo(String value) {
            addCriterion("order_name >=", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameLessThan(String value) {
            addCriterion("order_name <", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameLessThanOrEqualTo(String value) {
            addCriterion("order_name <=", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameLike(String value) {
            addCriterion("order_name like", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameNotLike(String value) {
            addCriterion("order_name not like", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameIn(List<String> values) {
            addCriterion("order_name in", values, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameNotIn(List<String> values) {
            addCriterion("order_name not in", values, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameBetween(String value1, String value2) {
            addCriterion("order_name between", value1, value2, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameNotBetween(String value1, String value2) {
            addCriterion("order_name not between", value1, value2, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNull() {
            addCriterion("order_price is null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNotNull() {
            addCriterion("order_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceEqualTo(String value) {
            addCriterion("order_price =", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotEqualTo(String value) {
            addCriterion("order_price <>", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThan(String value) {
            addCriterion("order_price >", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThanOrEqualTo(String value) {
            addCriterion("order_price >=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThan(String value) {
            addCriterion("order_price <", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThanOrEqualTo(String value) {
            addCriterion("order_price <=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLike(String value) {
            addCriterion("order_price like", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotLike(String value) {
            addCriterion("order_price not like", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIn(List<String> values) {
            addCriterion("order_price in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotIn(List<String> values) {
            addCriterion("order_price not in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceBetween(String value1, String value2) {
            addCriterion("order_price between", value1, value2, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotBetween(String value1, String value2) {
            addCriterion("order_price not between", value1, value2, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(String value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(String value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(String value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(String value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(String value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLike(String value) {
            addCriterion("order_type like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotLike(String value) {
            addCriterion("order_type not like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<String> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<String> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(String value1, String value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(String value1, String value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderUserNameIsNull() {
            addCriterion("order_user_name is null");
            return (Criteria) this;
        }

        public Criteria andOrderUserNameIsNotNull() {
            addCriterion("order_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrderUserNameEqualTo(String value) {
            addCriterion("order_user_name =", value, "orderUserName");
            return (Criteria) this;
        }

        public Criteria andOrderUserNameNotEqualTo(String value) {
            addCriterion("order_user_name <>", value, "orderUserName");
            return (Criteria) this;
        }

        public Criteria andOrderUserNameGreaterThan(String value) {
            addCriterion("order_user_name >", value, "orderUserName");
            return (Criteria) this;
        }

        public Criteria andOrderUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("order_user_name >=", value, "orderUserName");
            return (Criteria) this;
        }

        public Criteria andOrderUserNameLessThan(String value) {
            addCriterion("order_user_name <", value, "orderUserName");
            return (Criteria) this;
        }

        public Criteria andOrderUserNameLessThanOrEqualTo(String value) {
            addCriterion("order_user_name <=", value, "orderUserName");
            return (Criteria) this;
        }

        public Criteria andOrderUserNameLike(String value) {
            addCriterion("order_user_name like", value, "orderUserName");
            return (Criteria) this;
        }

        public Criteria andOrderUserNameNotLike(String value) {
            addCriterion("order_user_name not like", value, "orderUserName");
            return (Criteria) this;
        }

        public Criteria andOrderUserNameIn(List<String> values) {
            addCriterion("order_user_name in", values, "orderUserName");
            return (Criteria) this;
        }

        public Criteria andOrderUserNameNotIn(List<String> values) {
            addCriterion("order_user_name not in", values, "orderUserName");
            return (Criteria) this;
        }

        public Criteria andOrderUserNameBetween(String value1, String value2) {
            addCriterion("order_user_name between", value1, value2, "orderUserName");
            return (Criteria) this;
        }

        public Criteria andOrderUserNameNotBetween(String value1, String value2) {
            addCriterion("order_user_name not between", value1, value2, "orderUserName");
            return (Criteria) this;
        }

        public Criteria andOrderStartTimeIsNull() {
            addCriterion("order_start_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderStartTimeIsNotNull() {
            addCriterion("order_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStartTimeEqualTo(String value) {
            addCriterion("order_start_time =", value, "orderStartTime");
            return (Criteria) this;
        }

        public Criteria andOrderStartTimeNotEqualTo(String value) {
            addCriterion("order_start_time <>", value, "orderStartTime");
            return (Criteria) this;
        }

        public Criteria andOrderStartTimeGreaterThan(String value) {
            addCriterion("order_start_time >", value, "orderStartTime");
            return (Criteria) this;
        }

        public Criteria andOrderStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("order_start_time >=", value, "orderStartTime");
            return (Criteria) this;
        }

        public Criteria andOrderStartTimeLessThan(String value) {
            addCriterion("order_start_time <", value, "orderStartTime");
            return (Criteria) this;
        }

        public Criteria andOrderStartTimeLessThanOrEqualTo(String value) {
            addCriterion("order_start_time <=", value, "orderStartTime");
            return (Criteria) this;
        }

        public Criteria andOrderStartTimeLike(String value) {
            addCriterion("order_start_time like", value, "orderStartTime");
            return (Criteria) this;
        }

        public Criteria andOrderStartTimeNotLike(String value) {
            addCriterion("order_start_time not like", value, "orderStartTime");
            return (Criteria) this;
        }

        public Criteria andOrderStartTimeIn(List<String> values) {
            addCriterion("order_start_time in", values, "orderStartTime");
            return (Criteria) this;
        }

        public Criteria andOrderStartTimeNotIn(List<String> values) {
            addCriterion("order_start_time not in", values, "orderStartTime");
            return (Criteria) this;
        }

        public Criteria andOrderStartTimeBetween(String value1, String value2) {
            addCriterion("order_start_time between", value1, value2, "orderStartTime");
            return (Criteria) this;
        }

        public Criteria andOrderStartTimeNotBetween(String value1, String value2) {
            addCriterion("order_start_time not between", value1, value2, "orderStartTime");
            return (Criteria) this;
        }

        public Criteria andOrderEndTimeIsNull() {
            addCriterion("order_end_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderEndTimeIsNotNull() {
            addCriterion("order_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderEndTimeEqualTo(String value) {
            addCriterion("order_end_time =", value, "orderEndTime");
            return (Criteria) this;
        }

        public Criteria andOrderEndTimeNotEqualTo(String value) {
            addCriterion("order_end_time <>", value, "orderEndTime");
            return (Criteria) this;
        }

        public Criteria andOrderEndTimeGreaterThan(String value) {
            addCriterion("order_end_time >", value, "orderEndTime");
            return (Criteria) this;
        }

        public Criteria andOrderEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("order_end_time >=", value, "orderEndTime");
            return (Criteria) this;
        }

        public Criteria andOrderEndTimeLessThan(String value) {
            addCriterion("order_end_time <", value, "orderEndTime");
            return (Criteria) this;
        }

        public Criteria andOrderEndTimeLessThanOrEqualTo(String value) {
            addCriterion("order_end_time <=", value, "orderEndTime");
            return (Criteria) this;
        }

        public Criteria andOrderEndTimeLike(String value) {
            addCriterion("order_end_time like", value, "orderEndTime");
            return (Criteria) this;
        }

        public Criteria andOrderEndTimeNotLike(String value) {
            addCriterion("order_end_time not like", value, "orderEndTime");
            return (Criteria) this;
        }

        public Criteria andOrderEndTimeIn(List<String> values) {
            addCriterion("order_end_time in", values, "orderEndTime");
            return (Criteria) this;
        }

        public Criteria andOrderEndTimeNotIn(List<String> values) {
            addCriterion("order_end_time not in", values, "orderEndTime");
            return (Criteria) this;
        }

        public Criteria andOrderEndTimeBetween(String value1, String value2) {
            addCriterion("order_end_time between", value1, value2, "orderEndTime");
            return (Criteria) this;
        }

        public Criteria andOrderEndTimeNotBetween(String value1, String value2) {
            addCriterion("order_end_time not between", value1, value2, "orderEndTime");
            return (Criteria) this;
        }

        public Criteria andOrderHouseNoIsNull() {
            addCriterion("order_house_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderHouseNoIsNotNull() {
            addCriterion("order_house_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderHouseNoEqualTo(String value) {
            addCriterion("order_house_no =", value, "orderHouseNo");
            return (Criteria) this;
        }

        public Criteria andOrderHouseNoNotEqualTo(String value) {
            addCriterion("order_house_no <>", value, "orderHouseNo");
            return (Criteria) this;
        }

        public Criteria andOrderHouseNoGreaterThan(String value) {
            addCriterion("order_house_no >", value, "orderHouseNo");
            return (Criteria) this;
        }

        public Criteria andOrderHouseNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_house_no >=", value, "orderHouseNo");
            return (Criteria) this;
        }

        public Criteria andOrderHouseNoLessThan(String value) {
            addCriterion("order_house_no <", value, "orderHouseNo");
            return (Criteria) this;
        }

        public Criteria andOrderHouseNoLessThanOrEqualTo(String value) {
            addCriterion("order_house_no <=", value, "orderHouseNo");
            return (Criteria) this;
        }

        public Criteria andOrderHouseNoLike(String value) {
            addCriterion("order_house_no like", value, "orderHouseNo");
            return (Criteria) this;
        }

        public Criteria andOrderHouseNoNotLike(String value) {
            addCriterion("order_house_no not like", value, "orderHouseNo");
            return (Criteria) this;
        }

        public Criteria andOrderHouseNoIn(List<String> values) {
            addCriterion("order_house_no in", values, "orderHouseNo");
            return (Criteria) this;
        }

        public Criteria andOrderHouseNoNotIn(List<String> values) {
            addCriterion("order_house_no not in", values, "orderHouseNo");
            return (Criteria) this;
        }

        public Criteria andOrderHouseNoBetween(String value1, String value2) {
            addCriterion("order_house_no between", value1, value2, "orderHouseNo");
            return (Criteria) this;
        }

        public Criteria andOrderHouseNoNotBetween(String value1, String value2) {
            addCriterion("order_house_no not between", value1, value2, "orderHouseNo");
            return (Criteria) this;
        }

        public Criteria andOrderNextPayTimeIsNull() {
            addCriterion("order_next_pay_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderNextPayTimeIsNotNull() {
            addCriterion("order_next_pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNextPayTimeEqualTo(String value) {
            addCriterion("order_next_pay_time =", value, "orderNextPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderNextPayTimeNotEqualTo(String value) {
            addCriterion("order_next_pay_time <>", value, "orderNextPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderNextPayTimeGreaterThan(String value) {
            addCriterion("order_next_pay_time >", value, "orderNextPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderNextPayTimeGreaterThanOrEqualTo(String value) {
            addCriterion("order_next_pay_time >=", value, "orderNextPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderNextPayTimeLessThan(String value) {
            addCriterion("order_next_pay_time <", value, "orderNextPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderNextPayTimeLessThanOrEqualTo(String value) {
            addCriterion("order_next_pay_time <=", value, "orderNextPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderNextPayTimeLike(String value) {
            addCriterion("order_next_pay_time like", value, "orderNextPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderNextPayTimeNotLike(String value) {
            addCriterion("order_next_pay_time not like", value, "orderNextPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderNextPayTimeIn(List<String> values) {
            addCriterion("order_next_pay_time in", values, "orderNextPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderNextPayTimeNotIn(List<String> values) {
            addCriterion("order_next_pay_time not in", values, "orderNextPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderNextPayTimeBetween(String value1, String value2) {
            addCriterion("order_next_pay_time between", value1, value2, "orderNextPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderNextPayTimeNotBetween(String value1, String value2) {
            addCriterion("order_next_pay_time not between", value1, value2, "orderNextPayTime");
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