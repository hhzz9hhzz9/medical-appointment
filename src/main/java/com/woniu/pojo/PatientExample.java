package com.woniu.pojo;

import java.util.ArrayList;
import java.util.List;

public class PatientExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PatientExample() {
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

        public Criteria andPatientIdIsNull() {
            addCriterion("patient_id is null");
            return (Criteria) this;
        }

        public Criteria andPatientIdIsNotNull() {
            addCriterion("patient_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatientIdEqualTo(Integer value) {
            addCriterion("patient_id =", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotEqualTo(Integer value) {
            addCriterion("patient_id <>", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdGreaterThan(Integer value) {
            addCriterion("patient_id >", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("patient_id >=", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdLessThan(Integer value) {
            addCriterion("patient_id <", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdLessThanOrEqualTo(Integer value) {
            addCriterion("patient_id <=", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdIn(List<Integer> values) {
            addCriterion("patient_id in", values, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotIn(List<Integer> values) {
            addCriterion("patient_id not in", values, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdBetween(Integer value1, Integer value2) {
            addCriterion("patient_id between", value1, value2, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotBetween(Integer value1, Integer value2) {
            addCriterion("patient_id not between", value1, value2, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientNameIsNull() {
            addCriterion("patient_name is null");
            return (Criteria) this;
        }

        public Criteria andPatientNameIsNotNull() {
            addCriterion("patient_name is not null");
            return (Criteria) this;
        }

        public Criteria andPatientNameEqualTo(String value) {
            addCriterion("patient_name =", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotEqualTo(String value) {
            addCriterion("patient_name <>", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameGreaterThan(String value) {
            addCriterion("patient_name >", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameGreaterThanOrEqualTo(String value) {
            addCriterion("patient_name >=", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLessThan(String value) {
            addCriterion("patient_name <", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLessThanOrEqualTo(String value) {
            addCriterion("patient_name <=", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLike(String value) {
            addCriterion("patient_name like", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotLike(String value) {
            addCriterion("patient_name not like", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameIn(List<String> values) {
            addCriterion("patient_name in", values, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotIn(List<String> values) {
            addCriterion("patient_name not in", values, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameBetween(String value1, String value2) {
            addCriterion("patient_name between", value1, value2, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotBetween(String value1, String value2) {
            addCriterion("patient_name not between", value1, value2, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientAgeIsNull() {
            addCriterion("patient_age is null");
            return (Criteria) this;
        }

        public Criteria andPatientAgeIsNotNull() {
            addCriterion("patient_age is not null");
            return (Criteria) this;
        }

        public Criteria andPatientAgeEqualTo(Integer value) {
            addCriterion("patient_age =", value, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeNotEqualTo(Integer value) {
            addCriterion("patient_age <>", value, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeGreaterThan(Integer value) {
            addCriterion("patient_age >", value, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("patient_age >=", value, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeLessThan(Integer value) {
            addCriterion("patient_age <", value, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeLessThanOrEqualTo(Integer value) {
            addCriterion("patient_age <=", value, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeIn(List<Integer> values) {
            addCriterion("patient_age in", values, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeNotIn(List<Integer> values) {
            addCriterion("patient_age not in", values, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeBetween(Integer value1, Integer value2) {
            addCriterion("patient_age between", value1, value2, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("patient_age not between", value1, value2, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAccountIsNull() {
            addCriterion("patient_account is null");
            return (Criteria) this;
        }

        public Criteria andPatientAccountIsNotNull() {
            addCriterion("patient_account is not null");
            return (Criteria) this;
        }

        public Criteria andPatientAccountEqualTo(String value) {
            addCriterion("patient_account =", value, "patientAccount");
            return (Criteria) this;
        }

        public Criteria andPatientAccountNotEqualTo(String value) {
            addCriterion("patient_account <>", value, "patientAccount");
            return (Criteria) this;
        }

        public Criteria andPatientAccountGreaterThan(String value) {
            addCriterion("patient_account >", value, "patientAccount");
            return (Criteria) this;
        }

        public Criteria andPatientAccountGreaterThanOrEqualTo(String value) {
            addCriterion("patient_account >=", value, "patientAccount");
            return (Criteria) this;
        }

        public Criteria andPatientAccountLessThan(String value) {
            addCriterion("patient_account <", value, "patientAccount");
            return (Criteria) this;
        }

        public Criteria andPatientAccountLessThanOrEqualTo(String value) {
            addCriterion("patient_account <=", value, "patientAccount");
            return (Criteria) this;
        }

        public Criteria andPatientAccountLike(String value) {
            addCriterion("patient_account like", value, "patientAccount");
            return (Criteria) this;
        }

        public Criteria andPatientAccountNotLike(String value) {
            addCriterion("patient_account not like", value, "patientAccount");
            return (Criteria) this;
        }

        public Criteria andPatientAccountIn(List<String> values) {
            addCriterion("patient_account in", values, "patientAccount");
            return (Criteria) this;
        }

        public Criteria andPatientAccountNotIn(List<String> values) {
            addCriterion("patient_account not in", values, "patientAccount");
            return (Criteria) this;
        }

        public Criteria andPatientAccountBetween(String value1, String value2) {
            addCriterion("patient_account between", value1, value2, "patientAccount");
            return (Criteria) this;
        }

        public Criteria andPatientAccountNotBetween(String value1, String value2) {
            addCriterion("patient_account not between", value1, value2, "patientAccount");
            return (Criteria) this;
        }

        public Criteria andPatientPwdIsNull() {
            addCriterion("patient_pwd is null");
            return (Criteria) this;
        }

        public Criteria andPatientPwdIsNotNull() {
            addCriterion("patient_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andPatientPwdEqualTo(String value) {
            addCriterion("patient_pwd =", value, "patientPwd");
            return (Criteria) this;
        }

        public Criteria andPatientPwdNotEqualTo(String value) {
            addCriterion("patient_pwd <>", value, "patientPwd");
            return (Criteria) this;
        }

        public Criteria andPatientPwdGreaterThan(String value) {
            addCriterion("patient_pwd >", value, "patientPwd");
            return (Criteria) this;
        }

        public Criteria andPatientPwdGreaterThanOrEqualTo(String value) {
            addCriterion("patient_pwd >=", value, "patientPwd");
            return (Criteria) this;
        }

        public Criteria andPatientPwdLessThan(String value) {
            addCriterion("patient_pwd <", value, "patientPwd");
            return (Criteria) this;
        }

        public Criteria andPatientPwdLessThanOrEqualTo(String value) {
            addCriterion("patient_pwd <=", value, "patientPwd");
            return (Criteria) this;
        }

        public Criteria andPatientPwdLike(String value) {
            addCriterion("patient_pwd like", value, "patientPwd");
            return (Criteria) this;
        }

        public Criteria andPatientPwdNotLike(String value) {
            addCriterion("patient_pwd not like", value, "patientPwd");
            return (Criteria) this;
        }

        public Criteria andPatientPwdIn(List<String> values) {
            addCriterion("patient_pwd in", values, "patientPwd");
            return (Criteria) this;
        }

        public Criteria andPatientPwdNotIn(List<String> values) {
            addCriterion("patient_pwd not in", values, "patientPwd");
            return (Criteria) this;
        }

        public Criteria andPatientPwdBetween(String value1, String value2) {
            addCriterion("patient_pwd between", value1, value2, "patientPwd");
            return (Criteria) this;
        }

        public Criteria andPatientPwdNotBetween(String value1, String value2) {
            addCriterion("patient_pwd not between", value1, value2, "patientPwd");
            return (Criteria) this;
        }

        public Criteria andPatientGenderIsNull() {
            addCriterion("patient_gender is null");
            return (Criteria) this;
        }

        public Criteria andPatientGenderIsNotNull() {
            addCriterion("patient_gender is not null");
            return (Criteria) this;
        }

        public Criteria andPatientGenderEqualTo(Integer value) {
            addCriterion("patient_gender =", value, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientGenderNotEqualTo(Integer value) {
            addCriterion("patient_gender <>", value, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientGenderGreaterThan(Integer value) {
            addCriterion("patient_gender >", value, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("patient_gender >=", value, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientGenderLessThan(Integer value) {
            addCriterion("patient_gender <", value, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientGenderLessThanOrEqualTo(Integer value) {
            addCriterion("patient_gender <=", value, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientGenderIn(List<Integer> values) {
            addCriterion("patient_gender in", values, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientGenderNotIn(List<Integer> values) {
            addCriterion("patient_gender not in", values, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientGenderBetween(Integer value1, Integer value2) {
            addCriterion("patient_gender between", value1, value2, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("patient_gender not between", value1, value2, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientStatusIsNull() {
            addCriterion("patient_status is null");
            return (Criteria) this;
        }

        public Criteria andPatientStatusIsNotNull() {
            addCriterion("patient_status is not null");
            return (Criteria) this;
        }

        public Criteria andPatientStatusEqualTo(Integer value) {
            addCriterion("patient_status =", value, "patientStatus");
            return (Criteria) this;
        }

        public Criteria andPatientStatusNotEqualTo(Integer value) {
            addCriterion("patient_status <>", value, "patientStatus");
            return (Criteria) this;
        }

        public Criteria andPatientStatusGreaterThan(Integer value) {
            addCriterion("patient_status >", value, "patientStatus");
            return (Criteria) this;
        }

        public Criteria andPatientStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("patient_status >=", value, "patientStatus");
            return (Criteria) this;
        }

        public Criteria andPatientStatusLessThan(Integer value) {
            addCriterion("patient_status <", value, "patientStatus");
            return (Criteria) this;
        }

        public Criteria andPatientStatusLessThanOrEqualTo(Integer value) {
            addCriterion("patient_status <=", value, "patientStatus");
            return (Criteria) this;
        }

        public Criteria andPatientStatusIn(List<Integer> values) {
            addCriterion("patient_status in", values, "patientStatus");
            return (Criteria) this;
        }

        public Criteria andPatientStatusNotIn(List<Integer> values) {
            addCriterion("patient_status not in", values, "patientStatus");
            return (Criteria) this;
        }

        public Criteria andPatientStatusBetween(Integer value1, Integer value2) {
            addCriterion("patient_status between", value1, value2, "patientStatus");
            return (Criteria) this;
        }

        public Criteria andPatientStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("patient_status not between", value1, value2, "patientStatus");
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