package com.fan.configserver.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ResourceEnvExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResourceEnvExample() {
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

        public Criteria andResourceEnvNameIsNull() {
            addCriterion("resource_env_name is null");
            return (Criteria) this;
        }

        public Criteria andResourceEnvNameIsNotNull() {
            addCriterion("resource_env_name is not null");
            return (Criteria) this;
        }

        public Criteria andResourceEnvNameEqualTo(String value) {
            addCriterion("resource_env_name =", value, "resourceEnvName");
            return (Criteria) this;
        }

        public Criteria andResourceEnvNameNotEqualTo(String value) {
            addCriterion("resource_env_name <>", value, "resourceEnvName");
            return (Criteria) this;
        }

        public Criteria andResourceEnvNameGreaterThan(String value) {
            addCriterion("resource_env_name >", value, "resourceEnvName");
            return (Criteria) this;
        }

        public Criteria andResourceEnvNameGreaterThanOrEqualTo(String value) {
            addCriterion("resource_env_name >=", value, "resourceEnvName");
            return (Criteria) this;
        }

        public Criteria andResourceEnvNameLessThan(String value) {
            addCriterion("resource_env_name <", value, "resourceEnvName");
            return (Criteria) this;
        }

        public Criteria andResourceEnvNameLessThanOrEqualTo(String value) {
            addCriterion("resource_env_name <=", value, "resourceEnvName");
            return (Criteria) this;
        }

        public Criteria andResourceEnvNameLike(String value) {
            addCriterion("resource_env_name like", value, "resourceEnvName");
            return (Criteria) this;
        }

        public Criteria andResourceEnvNameNotLike(String value) {
            addCriterion("resource_env_name not like", value, "resourceEnvName");
            return (Criteria) this;
        }

        public Criteria andResourceEnvNameIn(List<String> values) {
            addCriterion("resource_env_name in", values, "resourceEnvName");
            return (Criteria) this;
        }

        public Criteria andResourceEnvNameNotIn(List<String> values) {
            addCriterion("resource_env_name not in", values, "resourceEnvName");
            return (Criteria) this;
        }

        public Criteria andResourceEnvNameBetween(String value1, String value2) {
            addCriterion("resource_env_name between", value1, value2, "resourceEnvName");
            return (Criteria) this;
        }

        public Criteria andResourceEnvNameNotBetween(String value1, String value2) {
            addCriterion("resource_env_name not between", value1, value2, "resourceEnvName");
            return (Criteria) this;
        }

        public Criteria andResourceEnvDescIsNull() {
            addCriterion("resource_env_desc is null");
            return (Criteria) this;
        }

        public Criteria andResourceEnvDescIsNotNull() {
            addCriterion("resource_env_desc is not null");
            return (Criteria) this;
        }

        public Criteria andResourceEnvDescEqualTo(String value) {
            addCriterion("resource_env_desc =", value, "resourceEnvDesc");
            return (Criteria) this;
        }

        public Criteria andResourceEnvDescNotEqualTo(String value) {
            addCriterion("resource_env_desc <>", value, "resourceEnvDesc");
            return (Criteria) this;
        }

        public Criteria andResourceEnvDescGreaterThan(String value) {
            addCriterion("resource_env_desc >", value, "resourceEnvDesc");
            return (Criteria) this;
        }

        public Criteria andResourceEnvDescGreaterThanOrEqualTo(String value) {
            addCriterion("resource_env_desc >=", value, "resourceEnvDesc");
            return (Criteria) this;
        }

        public Criteria andResourceEnvDescLessThan(String value) {
            addCriterion("resource_env_desc <", value, "resourceEnvDesc");
            return (Criteria) this;
        }

        public Criteria andResourceEnvDescLessThanOrEqualTo(String value) {
            addCriterion("resource_env_desc <=", value, "resourceEnvDesc");
            return (Criteria) this;
        }

        public Criteria andResourceEnvDescLike(String value) {
            addCriterion("resource_env_desc like", value, "resourceEnvDesc");
            return (Criteria) this;
        }

        public Criteria andResourceEnvDescNotLike(String value) {
            addCriterion("resource_env_desc not like", value, "resourceEnvDesc");
            return (Criteria) this;
        }

        public Criteria andResourceEnvDescIn(List<String> values) {
            addCriterion("resource_env_desc in", values, "resourceEnvDesc");
            return (Criteria) this;
        }

        public Criteria andResourceEnvDescNotIn(List<String> values) {
            addCriterion("resource_env_desc not in", values, "resourceEnvDesc");
            return (Criteria) this;
        }

        public Criteria andResourceEnvDescBetween(String value1, String value2) {
            addCriterion("resource_env_desc between", value1, value2, "resourceEnvDesc");
            return (Criteria) this;
        }

        public Criteria andResourceEnvDescNotBetween(String value1, String value2) {
            addCriterion("resource_env_desc not between", value1, value2, "resourceEnvDesc");
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