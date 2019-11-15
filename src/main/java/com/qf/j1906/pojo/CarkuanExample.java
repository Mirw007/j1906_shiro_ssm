package com.qf.j1906.pojo;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

public class CarkuanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarkuanExample() {
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

        public Criteria andCarkuanIdIsNull() {
            addCriterion("carkuan_id is null");
            return (Criteria) this;
        }

        public Criteria andCarkuanIdIsNotNull() {
            addCriterion("carkuan_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarkuanIdEqualTo(Integer value) {
            addCriterion("carkuan_id =", value, "carkuanId");
            return (Criteria) this;
        }

        public Criteria andCarkuanIdNotEqualTo(Integer value) {
            addCriterion("carkuan_id <>", value, "carkuanId");
            return (Criteria) this;
        }

        public Criteria andCarkuanIdGreaterThan(Integer value) {
            addCriterion("carkuan_id >", value, "carkuanId");
            return (Criteria) this;
        }

        public Criteria andCarkuanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("carkuan_id >=", value, "carkuanId");
            return (Criteria) this;
        }

        public Criteria andCarkuanIdLessThan(Integer value) {
            addCriterion("carkuan_id <", value, "carkuanId");
            return (Criteria) this;
        }

        public Criteria andCarkuanIdLessThanOrEqualTo(Integer value) {
            addCriterion("carkuan_id <=", value, "carkuanId");
            return (Criteria) this;
        }

        public Criteria andCarkuanIdIn(List<Integer> values) {
            addCriterion("carkuan_id in", values, "carkuanId");
            return (Criteria) this;
        }

        public Criteria andCarkuanIdNotIn(List<Integer> values) {
            addCriterion("carkuan_id not in", values, "carkuanId");
            return (Criteria) this;
        }

        public Criteria andCarkuanIdBetween(Integer value1, Integer value2) {
            addCriterion("carkuan_id between", value1, value2, "carkuanId");
            return (Criteria) this;
        }

        public Criteria andCarkuanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("carkuan_id not between", value1, value2, "carkuanId");
            return (Criteria) this;
        }

        public Criteria andCarxinNameIsNull() {
            addCriterion("carxin_name is null");
            return (Criteria) this;
        }

        public Criteria andCarxinNameIsNotNull() {
            addCriterion("carxin_name is not null");
            return (Criteria) this;
        }

        public Criteria andCarxinNameEqualTo(String value) {
            addCriterion("carxin_name =", value, "carxinName");
            return (Criteria) this;
        }

        public Criteria andCarxinNameNotEqualTo(String value) {
            addCriterion("carxin_name <>", value, "carxinName");
            return (Criteria) this;
        }

        public Criteria andCarxinNameGreaterThan(String value) {
            addCriterion("carxin_name >", value, "carxinName");
            return (Criteria) this;
        }

        public Criteria andCarxinNameGreaterThanOrEqualTo(String value) {
            addCriterion("carxin_name >=", value, "carxinName");
            return (Criteria) this;
        }

        public Criteria andCarxinNameLessThan(String value) {
            addCriterion("carxin_name <", value, "carxinName");
            return (Criteria) this;
        }

        public Criteria andCarxinNameLessThanOrEqualTo(String value) {
            addCriterion("carxin_name <=", value, "carxinName");
            return (Criteria) this;
        }

        public Criteria andCarxinNameLike(String value) {
            addCriterion("carxin_name like", value, "carxinName");
            return (Criteria) this;
        }

        public Criteria andCarxinNameNotLike(String value) {
            addCriterion("carxin_name not like", value, "carxinName");
            return (Criteria) this;
        }

        public Criteria andCarxinNameIn(List<String> values) {
            addCriterion("carxin_name in", values, "carxinName");
            return (Criteria) this;
        }

        public Criteria andCarxinNameNotIn(List<String> values) {
            addCriterion("carxin_name not in", values, "carxinName");
            return (Criteria) this;
        }

        public Criteria andCarxinNameBetween(String value1, String value2) {
            addCriterion("carxin_name between", value1, value2, "carxinName");
            return (Criteria) this;
        }

        public Criteria andCarxinNameNotBetween(String value1, String value2) {
            addCriterion("carxin_name not between", value1, value2, "carxinName");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNull() {
            addCriterion("brand_name is null");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNotNull() {
            addCriterion("brand_name is not null");
            return (Criteria) this;
        }

        public Criteria andBrandNameEqualTo(String value) {
            addCriterion("brand_name =", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotEqualTo(String value) {
            addCriterion("brand_name <>", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThan(String value) {
            addCriterion("brand_name >", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThanOrEqualTo(String value) {
            addCriterion("brand_name >=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThan(String value) {
            addCriterion("brand_name <", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThanOrEqualTo(String value) {
            addCriterion("brand_name <=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLike(String value) {
            addCriterion("brand_name like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotLike(String value) {
            addCriterion("brand_name not like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameIn(List<String> values) {
            addCriterion("brand_name in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotIn(List<String> values) {
            addCriterion("brand_name not in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameBetween(String value1, String value2) {
            addCriterion("brand_name between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotBetween(String value1, String value2) {
            addCriterion("brand_name not between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andCarkuanTimeIsNull() {
            addCriterion("carkuan_time is null");
            return (Criteria) this;
        }

        public Criteria andCarkuanTimeIsNotNull() {
            addCriterion("carkuan_time is not null");
            return (Criteria) this;
        }

        public Criteria andCarkuanTimeEqualTo(Integer value) {
            addCriterion("carkuan_time =", value, "carkuanTime");
            return (Criteria) this;
        }

        public Criteria andCarkuanTimeNotEqualTo(Integer value) {
            addCriterion("carkuan_time <>", value, "carkuanTime");
            return (Criteria) this;
        }

        public Criteria andCarkuanTimeGreaterThan(Integer value) {
            addCriterion("carkuan_time >", value, "carkuanTime");
            return (Criteria) this;
        }

        public Criteria andCarkuanTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("carkuan_time >=", value, "carkuanTime");
            return (Criteria) this;
        }

        public Criteria andCarkuanTimeLessThan(Integer value) {
            addCriterion("carkuan_time <", value, "carkuanTime");
            return (Criteria) this;
        }

        public Criteria andCarkuanTimeLessThanOrEqualTo(Integer value) {
            addCriterion("carkuan_time <=", value, "carkuanTime");
            return (Criteria) this;
        }

        public Criteria andCarkuanTimeIn(List<Integer> values) {
            addCriterion("carkuan_time in", values, "carkuanTime");
            return (Criteria) this;
        }

        public Criteria andCarkuanTimeNotIn(List<Integer> values) {
            addCriterion("carkuan_time not in", values, "carkuanTime");
            return (Criteria) this;
        }

        public Criteria andCarkuanTimeBetween(Integer value1, Integer value2) {
            addCriterion("carkuan_time between", value1, value2, "carkuanTime");
            return (Criteria) this;
        }

        public Criteria andCarkuanTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("carkuan_time not between", value1, value2, "carkuanTime");
            return (Criteria) this;
        }

        public Criteria andCarxiNameIsNull() {
            addCriterion("carxi_name is null");
            return (Criteria) this;
        }

        public Criteria andCarxiNameIsNotNull() {
            addCriterion("carxi_name is not null");
            return (Criteria) this;
        }

        public Criteria andCarxiNameEqualTo(String value) {
            addCriterion("carxi_name =", value, "carxiName");
            return (Criteria) this;
        }

        public Criteria andCarxiNameNotEqualTo(String value) {
            addCriterion("carxi_name <>", value, "carxiName");
            return (Criteria) this;
        }

        public Criteria andCarxiNameGreaterThan(String value) {
            addCriterion("carxi_name >", value, "carxiName");
            return (Criteria) this;
        }

        public Criteria andCarxiNameGreaterThanOrEqualTo(String value) {
            addCriterion("carxi_name >=", value, "carxiName");
            return (Criteria) this;
        }

        public Criteria andCarxiNameLessThan(String value) {
            addCriterion("carxi_name <", value, "carxiName");
            return (Criteria) this;
        }

        public Criteria andCarxiNameLessThanOrEqualTo(String value) {
            addCriterion("carxi_name <=", value, "carxiName");
            return (Criteria) this;
        }

        public Criteria andCarxiNameLike(String value) {
            addCriterion("carxi_name like", value, "carxiName");
            return (Criteria) this;
        }

        public Criteria andCarxiNameNotLike(String value) {
            addCriterion("carxi_name not like", value, "carxiName");
            return (Criteria) this;
        }

        public Criteria andCarxiNameIn(List<String> values) {
            addCriterion("carxi_name in", values, "carxiName");
            return (Criteria) this;
        }

        public Criteria andCarxiNameNotIn(List<String> values) {
            addCriterion("carxi_name not in", values, "carxiName");
            return (Criteria) this;
        }

        public Criteria andCarxiNameBetween(String value1, String value2) {
            addCriterion("carxi_name between", value1, value2, "carxiName");
            return (Criteria) this;
        }

        public Criteria andCarxiNameNotBetween(String value1, String value2) {
            addCriterion("carxi_name not between", value1, value2, "carxiName");
            return (Criteria) this;
        }

        public Criteria andCarTypeIsNull() {
            addCriterion("car_type is null");
            return (Criteria) this;
        }

        public Criteria andCarTypeIsNotNull() {
            addCriterion("car_type is not null");
            return (Criteria) this;
        }

        public Criteria andCarTypeEqualTo(String value) {
            addCriterion("car_type =", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotEqualTo(String value) {
            addCriterion("car_type <>", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThan(String value) {
            addCriterion("car_type >", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThanOrEqualTo(String value) {
            addCriterion("car_type >=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThan(String value) {
            addCriterion("car_type <", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThanOrEqualTo(String value) {
            addCriterion("car_type <=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLike(String value) {
            addCriterion("car_type like", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotLike(String value) {
            addCriterion("car_type not like", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeIn(List<String> values) {
            addCriterion("car_type in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotIn(List<String> values) {
            addCriterion("car_type not in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeBetween(String value1, String value2) {
            addCriterion("car_type between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotBetween(String value1, String value2) {
            addCriterion("car_type not between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andCarPriceIsNull() {
            addCriterion("car_price is null");
            return (Criteria) this;
        }

        public Criteria andCarPriceIsNotNull() {
            addCriterion("car_price is not null");
            return (Criteria) this;
        }

        public Criteria andCarPriceEqualTo(Double value) {
            addCriterion("car_price =", value, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceNotEqualTo(Double value) {
            addCriterion("car_price <>", value, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceGreaterThan(Double value) {
            addCriterion("car_price >", value, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("car_price >=", value, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceLessThan(Double value) {
            addCriterion("car_price <", value, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceLessThanOrEqualTo(Double value) {
            addCriterion("car_price <=", value, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceIn(List<Double> values) {
            addCriterion("car_price in", values, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceNotIn(List<Double> values) {
            addCriterion("car_price not in", values, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceBetween(Double value1, Double value2) {
            addCriterion("car_price between", value1, value2, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceNotBetween(Double value1, Double value2) {
            addCriterion("car_price not between", value1, value2, "carPrice");
            return (Criteria) this;
        }
    }

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