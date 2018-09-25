package com.fan.configserver.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApplicationEnvExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApplicationEnvExample() {
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

        public Criteria andApplicationEnvNameIsNull() {
            addCriterion("application_env_name is null");
            return (Criteria) this;
        }

        public Criteria andApplicationEnvNameIsNotNull() {
            addCriterion("application_env_name is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationEnvNameEqualTo(String value) {
            addCriterion("application_env_name =", value, "applicationEnvName");
            return (Criteria) this;
        }

        public Criteria andApplicationEnvNameNotEqualTo(String value) {
            addCriterion("application_env_name <>", value, "applicationEnvName");
            return (Criteria) this;
        }

        public Criteria andApplicationEnvNameGreaterThan(String value) {
            addCriterion("application_env_name >", value, "applicationEnvName");
            return (Criteria) this;
        }

        public Criteria andApplicationEnvNameGreaterThanOrEqualTo(String value) {
            addCriterion("application_env_name >=", value, "applicationEnvName");
            return (Criteria) this;
        }

        public Criteria andApplicationEnvNameLessThan(String value) {
            addCriterion("application_env_name <", value, "applicationEnvName");
            return (Criteria) this;
        }

        public Criteria andApplicationEnvNameLessThanOrEqualTo(String value) {
            addCriterion("application_env_name <=", value, "applicationEnvName");
            return (Criteria) this;
        }

        public Criteria andApplicationEnvNameLike(String value) {
            addCriterion("application_env_name like", value, "applicationEnvName");
            return (Criteria) this;
        }

        public Criteria andApplicationEnvNameNotLike(String value) {
            addCriterion("application_env_name not like", value, "applicationEnvName");
            return (Criteria) this;
        }

        public Criteria andApplicationEnvNameIn(List<String> values) {
            addCriterion("application_env_name in", values, "applicationEnvName");
            return (Criteria) this;
        }

        public Criteria andApplicationEnvNameNotIn(List<String> values) {
            addCriterion("application_env_name not in", values, "applicationEnvName");
            return (Criteria) this;
        }

        public Criteria andApplicationEnvNameBetween(String value1, String value2) {
            addCriterion("application_env_name between", value1, value2, "applicationEnvName");
            return (Criteria) this;
        }

        public Criteria andApplicationEnvNameNotBetween(String value1, String value2) {
            addCriterion("application_env_name not between", value1, value2, "applicationEnvName");
            return (Criteria) this;
        }

        public Criteria andApplicationEnvDescIsNull() {
            addCriterion("application_env_desc is null");
            return (Criteria) this;
        }

        public Criteria andApplicationEnvDescIsNotNull() {
            addCriterion("application_env_desc is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationEnvDescEqualTo(String value) {
            addCriterion("application_env_desc =", value, "applicationEnvDesc");
            return (Criteria) this;
        }

        public Criteria andApplicationEnvDescNotEqualTo(String value) {
            addCriterion("application_env_desc <>", value, "applicationEnvDesc");
            return (Criteria) this;
        }

        public Criteria andApplicationEnvDescGreaterThan(String value) {
            addCriterion("application_env_desc >", value, "applicationEnvDesc");
            return (Criteria) this;
        }

        public Criteria andApplicationEnvDescGreaterThanOrEqualTo(String value) {
            addCriterion("application_env_desc >=", value, "applicationEnvDesc");
            return (Criteria) this;
        }

        public Criteria andApplicationEnvDescLessThan(String value) {
            addCriterion("application_env_desc <", value, "applicationEnvDesc");
            return (Criteria) this;
        }

        public Criteria andApplicationEnvDescLessThanOrEqualTo(String value) {
            addCriterion("application_env_desc <=", value, "applicationEnvDesc");
            return (Criteria) this;
        }

        public Criteria andApplicationEnvDescLike(String value) {
            addCriterion("application_env_desc like", value, "applicationEnvDesc");
            return (Criteria) this;
        }

        public Criteria andApplicationEnvDescNotLike(String value) {
            addCriterion("application_env_desc not like", value, "applicationEnvDesc");
            return (Criteria) this;
        }

        public Criteria andApplicationEnvDescIn(List<String> values) {
            addCriterion("application_env_desc in", values, "applicationEnvDesc");
            return (Criteria) this;
        }

        public Criteria andApplicationEnvDescNotIn(List<String> values) {
            addCriterion("application_env_desc not in", values, "applicationEnvDesc");
            return (Criteria) this;
        }

        public Criteria andApplicationEnvDescBetween(String value1, String value2) {
            addCriterion("application_env_desc between", value1, value2, "applicationEnvDesc");
            return (Criteria) this;
        }

        public Criteria andApplicationEnvDescNotBetween(String value1, String value2) {
            addCriterion("application_env_desc not between", value1, value2, "applicationEnvDesc");
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

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNull() {
            addCriterion("create_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("create_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(Long value) {
            addCriterion("create_user_id =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(Long value) {
            addCriterion("create_user_id <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(Long value) {
            addCriterion("create_user_id >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("create_user_id >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(Long value) {
            addCriterion("create_user_id <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(Long value) {
            addCriterion("create_user_id <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<Long> values) {
            addCriterion("create_user_id in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<Long> values) {
            addCriterion("create_user_id not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(Long value1, Long value2) {
            addCriterion("create_user_id between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(Long value1, Long value2) {
            addCriterion("create_user_id not between", value1, value2, "createUserId");
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