package com.woniu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaiduiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaiduiExample() {
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

        public Criteria andPdIdIsNull() {
            addCriterion("pd_id is null");
            return (Criteria) this;
        }

        public Criteria andPdIdIsNotNull() {
            addCriterion("pd_id is not null");
            return (Criteria) this;
        }

        public Criteria andPdIdEqualTo(Integer value) {
            addCriterion("pd_id =", value, "pdId");
            return (Criteria) this;
        }

        public Criteria andPdIdNotEqualTo(Integer value) {
            addCriterion("pd_id <>", value, "pdId");
            return (Criteria) this;
        }

        public Criteria andPdIdGreaterThan(Integer value) {
            addCriterion("pd_id >", value, "pdId");
            return (Criteria) this;
        }

        public Criteria andPdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pd_id >=", value, "pdId");
            return (Criteria) this;
        }

        public Criteria andPdIdLessThan(Integer value) {
            addCriterion("pd_id <", value, "pdId");
            return (Criteria) this;
        }

        public Criteria andPdIdLessThanOrEqualTo(Integer value) {
            addCriterion("pd_id <=", value, "pdId");
            return (Criteria) this;
        }

        public Criteria andPdIdIn(List<Integer> values) {
            addCriterion("pd_id in", values, "pdId");
            return (Criteria) this;
        }

        public Criteria andPdIdNotIn(List<Integer> values) {
            addCriterion("pd_id not in", values, "pdId");
            return (Criteria) this;
        }

        public Criteria andPdIdBetween(Integer value1, Integer value2) {
            addCriterion("pd_id between", value1, value2, "pdId");
            return (Criteria) this;
        }

        public Criteria andPdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pd_id not between", value1, value2, "pdId");
            return (Criteria) this;
        }

        public Criteria andZhenshiIdIsNull() {
            addCriterion("zhenshi_id is null");
            return (Criteria) this;
        }

        public Criteria andZhenshiIdIsNotNull() {
            addCriterion("zhenshi_id is not null");
            return (Criteria) this;
        }

        public Criteria andZhenshiIdEqualTo(Integer value) {
            addCriterion("zhenshi_id =", value, "zhenshiId");
            return (Criteria) this;
        }

        public Criteria andZhenshiIdNotEqualTo(Integer value) {
            addCriterion("zhenshi_id <>", value, "zhenshiId");
            return (Criteria) this;
        }

        public Criteria andZhenshiIdGreaterThan(Integer value) {
            addCriterion("zhenshi_id >", value, "zhenshiId");
            return (Criteria) this;
        }

        public Criteria andZhenshiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("zhenshi_id >=", value, "zhenshiId");
            return (Criteria) this;
        }

        public Criteria andZhenshiIdLessThan(Integer value) {
            addCriterion("zhenshi_id <", value, "zhenshiId");
            return (Criteria) this;
        }

        public Criteria andZhenshiIdLessThanOrEqualTo(Integer value) {
            addCriterion("zhenshi_id <=", value, "zhenshiId");
            return (Criteria) this;
        }

        public Criteria andZhenshiIdIn(List<Integer> values) {
            addCriterion("zhenshi_id in", values, "zhenshiId");
            return (Criteria) this;
        }

        public Criteria andZhenshiIdNotIn(List<Integer> values) {
            addCriterion("zhenshi_id not in", values, "zhenshiId");
            return (Criteria) this;
        }

        public Criteria andZhenshiIdBetween(Integer value1, Integer value2) {
            addCriterion("zhenshi_id between", value1, value2, "zhenshiId");
            return (Criteria) this;
        }

        public Criteria andZhenshiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("zhenshi_id not between", value1, value2, "zhenshiId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdIsNull() {
            addCriterion("office_id is null");
            return (Criteria) this;
        }

        public Criteria andOfficeIdIsNotNull() {
            addCriterion("office_id is not null");
            return (Criteria) this;
        }

        public Criteria andOfficeIdEqualTo(Integer value) {
            addCriterion("office_id =", value, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdNotEqualTo(Integer value) {
            addCriterion("office_id <>", value, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdGreaterThan(Integer value) {
            addCriterion("office_id >", value, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("office_id >=", value, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdLessThan(Integer value) {
            addCriterion("office_id <", value, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdLessThanOrEqualTo(Integer value) {
            addCriterion("office_id <=", value, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdIn(List<Integer> values) {
            addCriterion("office_id in", values, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdNotIn(List<Integer> values) {
            addCriterion("office_id not in", values, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdBetween(Integer value1, Integer value2) {
            addCriterion("office_id between", value1, value2, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("office_id not between", value1, value2, "officeId");
            return (Criteria) this;
        }

        public Criteria andPdNoIsNull() {
            addCriterion("pd_no is null");
            return (Criteria) this;
        }

        public Criteria andPdNoIsNotNull() {
            addCriterion("pd_no is not null");
            return (Criteria) this;
        }

        public Criteria andPdNoEqualTo(Integer value) {
            addCriterion("pd_no =", value, "pdNo");
            return (Criteria) this;
        }

        public Criteria andPdNoNotEqualTo(Integer value) {
            addCriterion("pd_no <>", value, "pdNo");
            return (Criteria) this;
        }

        public Criteria andPdNoGreaterThan(Integer value) {
            addCriterion("pd_no >", value, "pdNo");
            return (Criteria) this;
        }

        public Criteria andPdNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("pd_no >=", value, "pdNo");
            return (Criteria) this;
        }

        public Criteria andPdNoLessThan(Integer value) {
            addCriterion("pd_no <", value, "pdNo");
            return (Criteria) this;
        }

        public Criteria andPdNoLessThanOrEqualTo(Integer value) {
            addCriterion("pd_no <=", value, "pdNo");
            return (Criteria) this;
        }

        public Criteria andPdNoIn(List<Integer> values) {
            addCriterion("pd_no in", values, "pdNo");
            return (Criteria) this;
        }

        public Criteria andPdNoNotIn(List<Integer> values) {
            addCriterion("pd_no not in", values, "pdNo");
            return (Criteria) this;
        }

        public Criteria andPdNoBetween(Integer value1, Integer value2) {
            addCriterion("pd_no between", value1, value2, "pdNo");
            return (Criteria) this;
        }

        public Criteria andPdNoNotBetween(Integer value1, Integer value2) {
            addCriterion("pd_no not between", value1, value2, "pdNo");
            return (Criteria) this;
        }

        public Criteria andPdTimeIsNull() {
            addCriterion("pd_time is null");
            return (Criteria) this;
        }

        public Criteria andPdTimeIsNotNull() {
            addCriterion("pd_time is not null");
            return (Criteria) this;
        }

        public Criteria andPdTimeEqualTo(Date value) {
            addCriterion("pd_time =", value, "pdTime");
            return (Criteria) this;
        }

        public Criteria andPdTimeNotEqualTo(Date value) {
            addCriterion("pd_time <>", value, "pdTime");
            return (Criteria) this;
        }

        public Criteria andPdTimeGreaterThan(Date value) {
            addCriterion("pd_time >", value, "pdTime");
            return (Criteria) this;
        }

        public Criteria andPdTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pd_time >=", value, "pdTime");
            return (Criteria) this;
        }

        public Criteria andPdTimeLessThan(Date value) {
            addCriterion("pd_time <", value, "pdTime");
            return (Criteria) this;
        }

        public Criteria andPdTimeLessThanOrEqualTo(Date value) {
            addCriterion("pd_time <=", value, "pdTime");
            return (Criteria) this;
        }

        public Criteria andPdTimeIn(List<Date> values) {
            addCriterion("pd_time in", values, "pdTime");
            return (Criteria) this;
        }

        public Criteria andPdTimeNotIn(List<Date> values) {
            addCriterion("pd_time not in", values, "pdTime");
            return (Criteria) this;
        }

        public Criteria andPdTimeBetween(Date value1, Date value2) {
            addCriterion("pd_time between", value1, value2, "pdTime");
            return (Criteria) this;
        }

        public Criteria andPdTimeNotBetween(Date value1, Date value2) {
            addCriterion("pd_time not between", value1, value2, "pdTime");
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