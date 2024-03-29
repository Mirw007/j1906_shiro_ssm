package com.qf.j1906.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarbrandExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarbrandExample() {
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

        public Criteria andBrandIdIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(Integer value) {
            addCriterion("brand_id =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(Integer value) {
            addCriterion("brand_id <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(Integer value) {
            addCriterion("brand_id >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("brand_id >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(Integer value) {
            addCriterion("brand_id <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(Integer value) {
            addCriterion("brand_id <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<Integer> values) {
            addCriterion("brand_id in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<Integer> values) {
            addCriterion("brand_id not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(Integer value1, Integer value2) {
            addCriterion("brand_id between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(Integer value1, Integer value2) {
            addCriterion("brand_id not between", value1, value2, "brandId");
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

        public Criteria andBrandLogIsNull() {
            addCriterion("brand_log is null");
            return (Criteria) this;
        }

        public Criteria andBrandLogIsNotNull() {
            addCriterion("brand_log is not null");
            return (Criteria) this;
        }

        public Criteria andBrandLogEqualTo(String value) {
            addCriterion("brand_log =", value, "brandLog");
            return (Criteria) this;
        }

        public Criteria andBrandLogNotEqualTo(String value) {
            addCriterion("brand_log <>", value, "brandLog");
            return (Criteria) this;
        }

        public Criteria andBrandLogGreaterThan(String value) {
            addCriterion("brand_log >", value, "brandLog");
            return (Criteria) this;
        }

        public Criteria andBrandLogGreaterThanOrEqualTo(String value) {
            addCriterion("brand_log >=", value, "brandLog");
            return (Criteria) this;
        }

        public Criteria andBrandLogLessThan(String value) {
            addCriterion("brand_log <", value, "brandLog");
            return (Criteria) this;
        }

        public Criteria andBrandLogLessThanOrEqualTo(String value) {
            addCriterion("brand_log <=", value, "brandLog");
            return (Criteria) this;
        }

        public Criteria andBrandLogLike(String value) {
            addCriterion("brand_log like", value, "brandLog");
            return (Criteria) this;
        }

        public Criteria andBrandLogNotLike(String value) {
            addCriterion("brand_log not like", value, "brandLog");
            return (Criteria) this;
        }

        public Criteria andBrandLogIn(List<String> values) {
            addCriterion("brand_log in", values, "brandLog");
            return (Criteria) this;
        }

        public Criteria andBrandLogNotIn(List<String> values) {
            addCriterion("brand_log not in", values, "brandLog");
            return (Criteria) this;
        }

        public Criteria andBrandLogBetween(String value1, String value2) {
            addCriterion("brand_log between", value1, value2, "brandLog");
            return (Criteria) this;
        }

        public Criteria andBrandLogNotBetween(String value1, String value2) {
            addCriterion("brand_log not between", value1, value2, "brandLog");
            return (Criteria) this;
        }

        public Criteria andBrandTimeIsNull() {
            addCriterion("brand_time is null");
            return (Criteria) this;
        }

        public Criteria andBrandTimeIsNotNull() {
            addCriterion("brand_time is not null");
            return (Criteria) this;
        }

        public Criteria andBrandTimeEqualTo(Date value) {
            addCriterion("brand_time =", value, "brandTime");
            return (Criteria) this;
        }

        public Criteria andBrandTimeNotEqualTo(Date value) {
            addCriterion("brand_time <>", value, "brandTime");
            return (Criteria) this;
        }

        public Criteria andBrandTimeGreaterThan(Date value) {
            addCriterion("brand_time >", value, "brandTime");
            return (Criteria) this;
        }

        public Criteria andBrandTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("brand_time >=", value, "brandTime");
            return (Criteria) this;
        }

        public Criteria andBrandTimeLessThan(Date value) {
            addCriterion("brand_time <", value, "brandTime");
            return (Criteria) this;
        }

        public Criteria andBrandTimeLessThanOrEqualTo(Date value) {
            addCriterion("brand_time <=", value, "brandTime");
            return (Criteria) this;
        }

        public Criteria andBrandTimeIn(List<Date> values) {
            addCriterion("brand_time in", values, "brandTime");
            return (Criteria) this;
        }

        public Criteria andBrandTimeNotIn(List<Date> values) {
            addCriterion("brand_time not in", values, "brandTime");
            return (Criteria) this;
        }

        public Criteria andBrandTimeBetween(Date value1, Date value2) {
            addCriterion("brand_time between", value1, value2, "brandTime");
            return (Criteria) this;
        }

        public Criteria andBrandTimeNotBetween(Date value1, Date value2) {
            addCriterion("brand_time not between", value1, value2, "brandTime");
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