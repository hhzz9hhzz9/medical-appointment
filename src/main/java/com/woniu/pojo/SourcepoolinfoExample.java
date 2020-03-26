package com.woniu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SourcepoolinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SourcepoolinfoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andSpiIdIsNull() {
            addCriterion("spi_id is null");
            return (Criteria) this;
        }

        public Criteria andSpiIdIsNotNull() {
            addCriterion("spi_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpiIdEqualTo(Integer value) {
            addCriterion("spi_id =", value, "spiId");
            return (Criteria) this;
        }

        public Criteria andSpiIdNotEqualTo(Integer value) {
            addCriterion("spi_id <>", value, "spiId");
            return (Criteria) this;
        }

        public Criteria andSpiIdGreaterThan(Integer value) {
            addCriterion("spi_id >", value, "spiId");
            return (Criteria) this;
        }

        public Criteria andSpiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("spi_id >=", value, "spiId");
            return (Criteria) this;
        }

        public Criteria andSpiIdLessThan(Integer value) {
            addCriterion("spi_id <", value, "spiId");
            return (Criteria) this;
        }

        public Criteria andSpiIdLessThanOrEqualTo(Integer value) {
            addCriterion("spi_id <=", value, "spiId");
            return (Criteria) this;
        }

        public Criteria andSpiIdIn(List<Integer> values) {
            addCriterion("spi_id in", values, "spiId");
            return (Criteria) this;
        }

        public Criteria andSpiIdNotIn(List<Integer> values) {
            addCriterion("spi_id not in", values, "spiId");
            return (Criteria) this;
        }

        public Criteria andSpiIdBetween(Integer value1, Integer value2) {
            addCriterion("spi_id between", value1, value2, "spiId");
            return (Criteria) this;
        }

        public Criteria andSpiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("spi_id not between", value1, value2, "spiId");
            return (Criteria) this;
        }

        public Criteria andSourcePoolIdIsNull() {
            addCriterion("source_pool_id is null");
            return (Criteria) this;
        }

        public Criteria andSourcePoolIdIsNotNull() {
            addCriterion("source_pool_id is not null");
            return (Criteria) this;
        }

        public Criteria andSourcePoolIdEqualTo(Integer value) {
            addCriterion("source_pool_id =", value, "sourcePoolId");
            return (Criteria) this;
        }

        public Criteria andSourcePoolIdNotEqualTo(Integer value) {
            addCriterion("source_pool_id <>", value, "sourcePoolId");
            return (Criteria) this;
        }

        public Criteria andSourcePoolIdGreaterThan(Integer value) {
            addCriterion("source_pool_id >", value, "sourcePoolId");
            return (Criteria) this;
        }

        public Criteria andSourcePoolIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("source_pool_id >=", value, "sourcePoolId");
            return (Criteria) this;
        }

        public Criteria andSourcePoolIdLessThan(Integer value) {
            addCriterion("source_pool_id <", value, "sourcePoolId");
            return (Criteria) this;
        }

        public Criteria andSourcePoolIdLessThanOrEqualTo(Integer value) {
            addCriterion("source_pool_id <=", value, "sourcePoolId");
            return (Criteria) this;
        }

        public Criteria andSourcePoolIdIn(List<Integer> values) {
            addCriterion("source_pool_id in", values, "sourcePoolId");
            return (Criteria) this;
        }

        public Criteria andSourcePoolIdNotIn(List<Integer> values) {
            addCriterion("source_pool_id not in", values, "sourcePoolId");
            return (Criteria) this;
        }

        public Criteria andSourcePoolIdBetween(Integer value1, Integer value2) {
            addCriterion("source_pool_id between", value1, value2, "sourcePoolId");
            return (Criteria) this;
        }

        public Criteria andSourcePoolIdNotBetween(Integer value1, Integer value2) {
            addCriterion("source_pool_id not between", value1, value2, "sourcePoolId");
            return (Criteria) this;
        }

        public Criteria andSpTimeIsNull() {
            addCriterion("sp_time is null");
            return (Criteria) this;
        }

        public Criteria andSpTimeIsNotNull() {
            addCriterion("sp_time is not null");
            return (Criteria) this;
        }

        public Criteria andSpTimeEqualTo(Date value) {
            addCriterionForJDBCDate("sp_time =", value, "spTime");
            return (Criteria) this;
        }

        public Criteria andSpTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("sp_time <>", value, "spTime");
            return (Criteria) this;
        }

        public Criteria andSpTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("sp_time >", value, "spTime");
            return (Criteria) this;
        }

        public Criteria andSpTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sp_time >=", value, "spTime");
            return (Criteria) this;
        }

        public Criteria andSpTimeLessThan(Date value) {
            addCriterionForJDBCDate("sp_time <", value, "spTime");
            return (Criteria) this;
        }

        public Criteria andSpTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sp_time <=", value, "spTime");
            return (Criteria) this;
        }

        public Criteria andSpTimeIn(List<Date> values) {
            addCriterionForJDBCDate("sp_time in", values, "spTime");
            return (Criteria) this;
        }

        public Criteria andSpTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("sp_time not in", values, "spTime");
            return (Criteria) this;
        }

        public Criteria andSpTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sp_time between", value1, value2, "spTime");
            return (Criteria) this;
        }

        public Criteria andSpTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sp_time not between", value1, value2, "spTime");
            return (Criteria) this;
        }

        public Criteria andSpStockIsNull() {
            addCriterion("sp_stock is null");
            return (Criteria) this;
        }

        public Criteria andSpStockIsNotNull() {
            addCriterion("sp_stock is not null");
            return (Criteria) this;
        }

        public Criteria andSpStockEqualTo(Integer value) {
            addCriterion("sp_stock =", value, "spStock");
            return (Criteria) this;
        }

        public Criteria andSpStockNotEqualTo(Integer value) {
            addCriterion("sp_stock <>", value, "spStock");
            return (Criteria) this;
        }

        public Criteria andSpStockGreaterThan(Integer value) {
            addCriterion("sp_stock >", value, "spStock");
            return (Criteria) this;
        }

        public Criteria andSpStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_stock >=", value, "spStock");
            return (Criteria) this;
        }

        public Criteria andSpStockLessThan(Integer value) {
            addCriterion("sp_stock <", value, "spStock");
            return (Criteria) this;
        }

        public Criteria andSpStockLessThanOrEqualTo(Integer value) {
            addCriterion("sp_stock <=", value, "spStock");
            return (Criteria) this;
        }

        public Criteria andSpStockIn(List<Integer> values) {
            addCriterion("sp_stock in", values, "spStock");
            return (Criteria) this;
        }

        public Criteria andSpStockNotIn(List<Integer> values) {
            addCriterion("sp_stock not in", values, "spStock");
            return (Criteria) this;
        }

        public Criteria andSpStockBetween(Integer value1, Integer value2) {
            addCriterion("sp_stock between", value1, value2, "spStock");
            return (Criteria) this;
        }

        public Criteria andSpStockNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_stock not between", value1, value2, "spStock");
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