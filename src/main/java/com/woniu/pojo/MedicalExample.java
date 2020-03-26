package com.woniu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MedicalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MedicalExample() {
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

        public Criteria andMedicalIdIsNull() {
            addCriterion("medical_id is null");
            return (Criteria) this;
        }

        public Criteria andMedicalIdIsNotNull() {
            addCriterion("medical_id is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalIdEqualTo(Integer value) {
            addCriterion("medical_id =", value, "medicalId");
            return (Criteria) this;
        }

        public Criteria andMedicalIdNotEqualTo(Integer value) {
            addCriterion("medical_id <>", value, "medicalId");
            return (Criteria) this;
        }

        public Criteria andMedicalIdGreaterThan(Integer value) {
            addCriterion("medical_id >", value, "medicalId");
            return (Criteria) this;
        }

        public Criteria andMedicalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("medical_id >=", value, "medicalId");
            return (Criteria) this;
        }

        public Criteria andMedicalIdLessThan(Integer value) {
            addCriterion("medical_id <", value, "medicalId");
            return (Criteria) this;
        }

        public Criteria andMedicalIdLessThanOrEqualTo(Integer value) {
            addCriterion("medical_id <=", value, "medicalId");
            return (Criteria) this;
        }

        public Criteria andMedicalIdIn(List<Integer> values) {
            addCriterion("medical_id in", values, "medicalId");
            return (Criteria) this;
        }

        public Criteria andMedicalIdNotIn(List<Integer> values) {
            addCriterion("medical_id not in", values, "medicalId");
            return (Criteria) this;
        }

        public Criteria andMedicalIdBetween(Integer value1, Integer value2) {
            addCriterion("medical_id between", value1, value2, "medicalId");
            return (Criteria) this;
        }

        public Criteria andMedicalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("medical_id not between", value1, value2, "medicalId");
            return (Criteria) this;
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

        public Criteria andDoctorIdIsNull() {
            addCriterion("doctor_id is null");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIsNotNull() {
            addCriterion("doctor_id is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorIdEqualTo(Integer value) {
            addCriterion("doctor_id =", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotEqualTo(Integer value) {
            addCriterion("doctor_id <>", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdGreaterThan(Integer value) {
            addCriterion("doctor_id >", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("doctor_id >=", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLessThan(Integer value) {
            addCriterion("doctor_id <", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLessThanOrEqualTo(Integer value) {
            addCriterion("doctor_id <=", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIn(List<Integer> values) {
            addCriterion("doctor_id in", values, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotIn(List<Integer> values) {
            addCriterion("doctor_id not in", values, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdBetween(Integer value1, Integer value2) {
            addCriterion("doctor_id between", value1, value2, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("doctor_id not between", value1, value2, "doctorId");
            return (Criteria) this;
        }

        public Criteria andMedicalTimeIsNull() {
            addCriterion("medical_time is null");
            return (Criteria) this;
        }

        public Criteria andMedicalTimeIsNotNull() {
            addCriterion("medical_time is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalTimeEqualTo(Date value) {
            addCriterion("medical_time =", value, "medicalTime");
            return (Criteria) this;
        }

        public Criteria andMedicalTimeNotEqualTo(Date value) {
            addCriterion("medical_time <>", value, "medicalTime");
            return (Criteria) this;
        }

        public Criteria andMedicalTimeGreaterThan(Date value) {
            addCriterion("medical_time >", value, "medicalTime");
            return (Criteria) this;
        }

        public Criteria andMedicalTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("medical_time >=", value, "medicalTime");
            return (Criteria) this;
        }

        public Criteria andMedicalTimeLessThan(Date value) {
            addCriterion("medical_time <", value, "medicalTime");
            return (Criteria) this;
        }

        public Criteria andMedicalTimeLessThanOrEqualTo(Date value) {
            addCriterion("medical_time <=", value, "medicalTime");
            return (Criteria) this;
        }

        public Criteria andMedicalTimeIn(List<Date> values) {
            addCriterion("medical_time in", values, "medicalTime");
            return (Criteria) this;
        }

        public Criteria andMedicalTimeNotIn(List<Date> values) {
            addCriterion("medical_time not in", values, "medicalTime");
            return (Criteria) this;
        }

        public Criteria andMedicalTimeBetween(Date value1, Date value2) {
            addCriterion("medical_time between", value1, value2, "medicalTime");
            return (Criteria) this;
        }

        public Criteria andMedicalTimeNotBetween(Date value1, Date value2) {
            addCriterion("medical_time not between", value1, value2, "medicalTime");
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