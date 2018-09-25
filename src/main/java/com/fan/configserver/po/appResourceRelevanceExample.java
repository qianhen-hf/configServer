package com.fan.configserver.po;

import java.util.ArrayList;
import java.util.List;

public class appResourceRelevanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public appResourceRelevanceExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andApplicationIdIsNull() {
            addCriterion("application_id is null");
            return (Criteria) this;
        }

        public Criteria andApplicationIdIsNotNull() {
            addCriterion("application_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationIdEqualTo(Long value) {
            addCriterion("application_id =", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNotEqualTo(Long value) {
            addCriterion("application_id <>", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdGreaterThan(Long value) {
            addCriterion("application_id >", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdGreaterThanOrEqualTo(Long value) {
            addCriterion("application_id >=", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdLessThan(Long value) {
            addCriterion("application_id <", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdLessThanOrEqualTo(Long value) {
            addCriterion("application_id <=", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdIn(List<Long> values) {
            addCriterion("application_id in", values, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNotIn(List<Long> values) {
            addCriterion("application_id not in", values, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdBetween(Long value1, Long value2) {
            addCriterion("application_id between", value1, value2, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNotBetween(Long value1, Long value2) {
            addCriterion("application_id not between", value1, value2, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationEnvIdIsNull() {
            addCriterion("application_env_id is null");
            return (Criteria) this;
        }

        public Criteria andApplicationEnvIdIsNotNull() {
            addCriterion("application_env_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationEnvIdEqualTo(Long value) {
            addCriterion("application_env_id =", value, "applicationEnvId");
            return (Criteria) this;
        }

        public Criteria andApplicationEnvIdNotEqualTo(Long value) {
            addCriterion("application_env_id <>", value, "applicationEnvId");
            return (Criteria) this;
        }

        public Criteria andApplicationEnvIdGreaterThan(Long value) {
            addCriterion("application_env_id >", value, "applicationEnvId");
            return (Criteria) this;
        }

        public Criteria andApplicationEnvIdGreaterThanOrEqualTo(Long value) {
            addCriterion("application_env_id >=", value, "applicationEnvId");
            return (Criteria) this;
        }

        public Criteria andApplicationEnvIdLessThan(Long value) {
            addCriterion("application_env_id <", value, "applicationEnvId");
            return (Criteria) this;
        }

        public Criteria andApplicationEnvIdLessThanOrEqualTo(Long value) {
            addCriterion("application_env_id <=", value, "applicationEnvId");
            return (Criteria) this;
        }

        public Criteria andApplicationEnvIdIn(List<Long> values) {
            addCriterion("application_env_id in", values, "applicationEnvId");
            return (Criteria) this;
        }

        public Criteria andApplicationEnvIdNotIn(List<Long> values) {
            addCriterion("application_env_id not in", values, "applicationEnvId");
            return (Criteria) this;
        }

        public Criteria andApplicationEnvIdBetween(Long value1, Long value2) {
            addCriterion("application_env_id between", value1, value2, "applicationEnvId");
            return (Criteria) this;
        }

        public Criteria andApplicationEnvIdNotBetween(Long value1, Long value2) {
            addCriterion("application_env_id not between", value1, value2, "applicationEnvId");
            return (Criteria) this;
        }

        public Criteria andResourceIdIsNull() {
            addCriterion("resource_id is null");
            return (Criteria) this;
        }

        public Criteria andResourceIdIsNotNull() {
            addCriterion("resource_id is not null");
            return (Criteria) this;
        }

        public Criteria andResourceIdEqualTo(Long value) {
            addCriterion("resource_id =", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotEqualTo(Long value) {
            addCriterion("resource_id <>", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThan(Long value) {
            addCriterion("resource_id >", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("resource_id >=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThan(Long value) {
            addCriterion("resource_id <", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThanOrEqualTo(Long value) {
            addCriterion("resource_id <=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdIn(List<Long> values) {
            addCriterion("resource_id in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotIn(List<Long> values) {
            addCriterion("resource_id not in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdBetween(Long value1, Long value2) {
            addCriterion("resource_id between", value1, value2, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotBetween(Long value1, Long value2) {
            addCriterion("resource_id not between", value1, value2, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceEnvIdIsNull() {
            addCriterion("resource_env_id is null");
            return (Criteria) this;
        }

        public Criteria andResourceEnvIdIsNotNull() {
            addCriterion("resource_env_id is not null");
            return (Criteria) this;
        }

        public Criteria andResourceEnvIdEqualTo(Long value) {
            addCriterion("resource_env_id =", value, "resourceEnvId");
            return (Criteria) this;
        }

        public Criteria andResourceEnvIdNotEqualTo(Long value) {
            addCriterion("resource_env_id <>", value, "resourceEnvId");
            return (Criteria) this;
        }

        public Criteria andResourceEnvIdGreaterThan(Long value) {
            addCriterion("resource_env_id >", value, "resourceEnvId");
            return (Criteria) this;
        }

        public Criteria andResourceEnvIdGreaterThanOrEqualTo(Long value) {
            addCriterion("resource_env_id >=", value, "resourceEnvId");
            return (Criteria) this;
        }

        public Criteria andResourceEnvIdLessThan(Long value) {
            addCriterion("resource_env_id <", value, "resourceEnvId");
            return (Criteria) this;
        }

        public Criteria andResourceEnvIdLessThanOrEqualTo(Long value) {
            addCriterion("resource_env_id <=", value, "resourceEnvId");
            return (Criteria) this;
        }

        public Criteria andResourceEnvIdIn(List<Long> values) {
            addCriterion("resource_env_id in", values, "resourceEnvId");
            return (Criteria) this;
        }

        public Criteria andResourceEnvIdNotIn(List<Long> values) {
            addCriterion("resource_env_id not in", values, "resourceEnvId");
            return (Criteria) this;
        }

        public Criteria andResourceEnvIdBetween(Long value1, Long value2) {
            addCriterion("resource_env_id between", value1, value2, "resourceEnvId");
            return (Criteria) this;
        }

        public Criteria andResourceEnvIdNotBetween(Long value1, Long value2) {
            addCriterion("resource_env_id not between", value1, value2, "resourceEnvId");
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