package com.wubu.myshop.dao.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.wubu.share.pojo.BasePageQuery;

public class UserInfoExample extends BasePageQuery{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfoExample() {
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

        public Criteria andOidUsernoIsNull() {
            addCriterion("OID_USERNO is null");
            return (Criteria) this;
        }

        public Criteria andOidUsernoIsNotNull() {
            addCriterion("OID_USERNO is not null");
            return (Criteria) this;
        }

        public Criteria andOidUsernoEqualTo(String value) {
            addCriterion("OID_USERNO =", value, "oidUserno");
            return (Criteria) this;
        }

        public Criteria andOidUsernoNotEqualTo(String value) {
            addCriterion("OID_USERNO <>", value, "oidUserno");
            return (Criteria) this;
        }

        public Criteria andOidUsernoGreaterThan(String value) {
            addCriterion("OID_USERNO >", value, "oidUserno");
            return (Criteria) this;
        }

        public Criteria andOidUsernoGreaterThanOrEqualTo(String value) {
            addCriterion("OID_USERNO >=", value, "oidUserno");
            return (Criteria) this;
        }

        public Criteria andOidUsernoLessThan(String value) {
            addCriterion("OID_USERNO <", value, "oidUserno");
            return (Criteria) this;
        }

        public Criteria andOidUsernoLessThanOrEqualTo(String value) {
            addCriterion("OID_USERNO <=", value, "oidUserno");
            return (Criteria) this;
        }

        public Criteria andOidUsernoLike(String value) {
            addCriterion("OID_USERNO like", value, "oidUserno");
            return (Criteria) this;
        }

        public Criteria andOidUsernoNotLike(String value) {
            addCriterion("OID_USERNO not like", value, "oidUserno");
            return (Criteria) this;
        }

        public Criteria andOidUsernoIn(List<String> values) {
            addCriterion("OID_USERNO in", values, "oidUserno");
            return (Criteria) this;
        }

        public Criteria andOidUsernoNotIn(List<String> values) {
            addCriterion("OID_USERNO not in", values, "oidUserno");
            return (Criteria) this;
        }

        public Criteria andOidUsernoBetween(String value1, String value2) {
            addCriterion("OID_USERNO between", value1, value2, "oidUserno");
            return (Criteria) this;
        }

        public Criteria andOidUsernoNotBetween(String value1, String value2) {
            addCriterion("OID_USERNO not between", value1, value2, "oidUserno");
            return (Criteria) this;
        }

        public Criteria andStatUserIsNull() {
            addCriterion("STAT_USER is null");
            return (Criteria) this;
        }

        public Criteria andStatUserIsNotNull() {
            addCriterion("STAT_USER is not null");
            return (Criteria) this;
        }

        public Criteria andStatUserEqualTo(String value) {
            addCriterion("STAT_USER =", value, "statUser");
            return (Criteria) this;
        }

        public Criteria andStatUserNotEqualTo(String value) {
            addCriterion("STAT_USER <>", value, "statUser");
            return (Criteria) this;
        }

        public Criteria andStatUserGreaterThan(String value) {
            addCriterion("STAT_USER >", value, "statUser");
            return (Criteria) this;
        }

        public Criteria andStatUserGreaterThanOrEqualTo(String value) {
            addCriterion("STAT_USER >=", value, "statUser");
            return (Criteria) this;
        }

        public Criteria andStatUserLessThan(String value) {
            addCriterion("STAT_USER <", value, "statUser");
            return (Criteria) this;
        }

        public Criteria andStatUserLessThanOrEqualTo(String value) {
            addCriterion("STAT_USER <=", value, "statUser");
            return (Criteria) this;
        }

        public Criteria andStatUserLike(String value) {
            addCriterion("STAT_USER like", value, "statUser");
            return (Criteria) this;
        }

        public Criteria andStatUserNotLike(String value) {
            addCriterion("STAT_USER not like", value, "statUser");
            return (Criteria) this;
        }

        public Criteria andStatUserIn(List<String> values) {
            addCriterion("STAT_USER in", values, "statUser");
            return (Criteria) this;
        }

        public Criteria andStatUserNotIn(List<String> values) {
            addCriterion("STAT_USER not in", values, "statUser");
            return (Criteria) this;
        }

        public Criteria andStatUserBetween(String value1, String value2) {
            addCriterion("STAT_USER between", value1, value2, "statUser");
            return (Criteria) this;
        }

        public Criteria andStatUserNotBetween(String value1, String value2) {
            addCriterion("STAT_USER not between", value1, value2, "statUser");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andMobUserIsNull() {
            addCriterion("MOB_USER is null");
            return (Criteria) this;
        }

        public Criteria andMobUserIsNotNull() {
            addCriterion("MOB_USER is not null");
            return (Criteria) this;
        }

        public Criteria andMobUserEqualTo(String value) {
            addCriterion("MOB_USER =", value, "mobUser");
            return (Criteria) this;
        }

        public Criteria andMobUserNotEqualTo(String value) {
            addCriterion("MOB_USER <>", value, "mobUser");
            return (Criteria) this;
        }

        public Criteria andMobUserGreaterThan(String value) {
            addCriterion("MOB_USER >", value, "mobUser");
            return (Criteria) this;
        }

        public Criteria andMobUserGreaterThanOrEqualTo(String value) {
            addCriterion("MOB_USER >=", value, "mobUser");
            return (Criteria) this;
        }

        public Criteria andMobUserLessThan(String value) {
            addCriterion("MOB_USER <", value, "mobUser");
            return (Criteria) this;
        }

        public Criteria andMobUserLessThanOrEqualTo(String value) {
            addCriterion("MOB_USER <=", value, "mobUser");
            return (Criteria) this;
        }

        public Criteria andMobUserLike(String value) {
            addCriterion("MOB_USER like", value, "mobUser");
            return (Criteria) this;
        }

        public Criteria andMobUserNotLike(String value) {
            addCriterion("MOB_USER not like", value, "mobUser");
            return (Criteria) this;
        }

        public Criteria andMobUserIn(List<String> values) {
            addCriterion("MOB_USER in", values, "mobUser");
            return (Criteria) this;
        }

        public Criteria andMobUserNotIn(List<String> values) {
            addCriterion("MOB_USER not in", values, "mobUser");
            return (Criteria) this;
        }

        public Criteria andMobUserBetween(String value1, String value2) {
            addCriterion("MOB_USER between", value1, value2, "mobUser");
            return (Criteria) this;
        }

        public Criteria andMobUserNotBetween(String value1, String value2) {
            addCriterion("MOB_USER not between", value1, value2, "mobUser");
            return (Criteria) this;
        }

        public Criteria andLevelSecurityIsNull() {
            addCriterion("LEVEL_SECURITY is null");
            return (Criteria) this;
        }

        public Criteria andLevelSecurityIsNotNull() {
            addCriterion("LEVEL_SECURITY is not null");
            return (Criteria) this;
        }

        public Criteria andLevelSecurityEqualTo(String value) {
            addCriterion("LEVEL_SECURITY =", value, "levelSecurity");
            return (Criteria) this;
        }

        public Criteria andLevelSecurityNotEqualTo(String value) {
            addCriterion("LEVEL_SECURITY <>", value, "levelSecurity");
            return (Criteria) this;
        }

        public Criteria andLevelSecurityGreaterThan(String value) {
            addCriterion("LEVEL_SECURITY >", value, "levelSecurity");
            return (Criteria) this;
        }

        public Criteria andLevelSecurityGreaterThanOrEqualTo(String value) {
            addCriterion("LEVEL_SECURITY >=", value, "levelSecurity");
            return (Criteria) this;
        }

        public Criteria andLevelSecurityLessThan(String value) {
            addCriterion("LEVEL_SECURITY <", value, "levelSecurity");
            return (Criteria) this;
        }

        public Criteria andLevelSecurityLessThanOrEqualTo(String value) {
            addCriterion("LEVEL_SECURITY <=", value, "levelSecurity");
            return (Criteria) this;
        }

        public Criteria andLevelSecurityLike(String value) {
            addCriterion("LEVEL_SECURITY like", value, "levelSecurity");
            return (Criteria) this;
        }

        public Criteria andLevelSecurityNotLike(String value) {
            addCriterion("LEVEL_SECURITY not like", value, "levelSecurity");
            return (Criteria) this;
        }

        public Criteria andLevelSecurityIn(List<String> values) {
            addCriterion("LEVEL_SECURITY in", values, "levelSecurity");
            return (Criteria) this;
        }

        public Criteria andLevelSecurityNotIn(List<String> values) {
            addCriterion("LEVEL_SECURITY not in", values, "levelSecurity");
            return (Criteria) this;
        }

        public Criteria andLevelSecurityBetween(String value1, String value2) {
            addCriterion("LEVEL_SECURITY between", value1, value2, "levelSecurity");
            return (Criteria) this;
        }

        public Criteria andLevelSecurityNotBetween(String value1, String value2) {
            addCriterion("LEVEL_SECURITY not between", value1, value2, "levelSecurity");
            return (Criteria) this;
        }

        public Criteria andNameUserIsNull() {
            addCriterion("NAME_USER is null");
            return (Criteria) this;
        }

        public Criteria andNameUserIsNotNull() {
            addCriterion("NAME_USER is not null");
            return (Criteria) this;
        }

        public Criteria andNameUserEqualTo(String value) {
            addCriterion("NAME_USER =", value, "nameUser");
            return (Criteria) this;
        }

        public Criteria andNameUserNotEqualTo(String value) {
            addCriterion("NAME_USER <>", value, "nameUser");
            return (Criteria) this;
        }

        public Criteria andNameUserGreaterThan(String value) {
            addCriterion("NAME_USER >", value, "nameUser");
            return (Criteria) this;
        }

        public Criteria andNameUserGreaterThanOrEqualTo(String value) {
            addCriterion("NAME_USER >=", value, "nameUser");
            return (Criteria) this;
        }

        public Criteria andNameUserLessThan(String value) {
            addCriterion("NAME_USER <", value, "nameUser");
            return (Criteria) this;
        }

        public Criteria andNameUserLessThanOrEqualTo(String value) {
            addCriterion("NAME_USER <=", value, "nameUser");
            return (Criteria) this;
        }

        public Criteria andNameUserLike(String value) {
            addCriterion("NAME_USER like", value, "nameUser");
            return (Criteria) this;
        }

        public Criteria andNameUserNotLike(String value) {
            addCriterion("NAME_USER not like", value, "nameUser");
            return (Criteria) this;
        }

        public Criteria andNameUserIn(List<String> values) {
            addCriterion("NAME_USER in", values, "nameUser");
            return (Criteria) this;
        }

        public Criteria andNameUserNotIn(List<String> values) {
            addCriterion("NAME_USER not in", values, "nameUser");
            return (Criteria) this;
        }

        public Criteria andNameUserBetween(String value1, String value2) {
            addCriterion("NAME_USER between", value1, value2, "nameUser");
            return (Criteria) this;
        }

        public Criteria andNameUserNotBetween(String value1, String value2) {
            addCriterion("NAME_USER not between", value1, value2, "nameUser");
            return (Criteria) this;
        }

        public Criteria andSexUserIsNull() {
            addCriterion("SEX_USER is null");
            return (Criteria) this;
        }

        public Criteria andSexUserIsNotNull() {
            addCriterion("SEX_USER is not null");
            return (Criteria) this;
        }

        public Criteria andSexUserEqualTo(String value) {
            addCriterion("SEX_USER =", value, "sexUser");
            return (Criteria) this;
        }

        public Criteria andSexUserNotEqualTo(String value) {
            addCriterion("SEX_USER <>", value, "sexUser");
            return (Criteria) this;
        }

        public Criteria andSexUserGreaterThan(String value) {
            addCriterion("SEX_USER >", value, "sexUser");
            return (Criteria) this;
        }

        public Criteria andSexUserGreaterThanOrEqualTo(String value) {
            addCriterion("SEX_USER >=", value, "sexUser");
            return (Criteria) this;
        }

        public Criteria andSexUserLessThan(String value) {
            addCriterion("SEX_USER <", value, "sexUser");
            return (Criteria) this;
        }

        public Criteria andSexUserLessThanOrEqualTo(String value) {
            addCriterion("SEX_USER <=", value, "sexUser");
            return (Criteria) this;
        }

        public Criteria andSexUserLike(String value) {
            addCriterion("SEX_USER like", value, "sexUser");
            return (Criteria) this;
        }

        public Criteria andSexUserNotLike(String value) {
            addCriterion("SEX_USER not like", value, "sexUser");
            return (Criteria) this;
        }

        public Criteria andSexUserIn(List<String> values) {
            addCriterion("SEX_USER in", values, "sexUser");
            return (Criteria) this;
        }

        public Criteria andSexUserNotIn(List<String> values) {
            addCriterion("SEX_USER not in", values, "sexUser");
            return (Criteria) this;
        }

        public Criteria andSexUserBetween(String value1, String value2) {
            addCriterion("SEX_USER between", value1, value2, "sexUser");
            return (Criteria) this;
        }

        public Criteria andSexUserNotBetween(String value1, String value2) {
            addCriterion("SEX_USER not between", value1, value2, "sexUser");
            return (Criteria) this;
        }

        public Criteria andDateBirthdayIsNull() {
            addCriterion("DATE_BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andDateBirthdayIsNotNull() {
            addCriterion("DATE_BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andDateBirthdayEqualTo(String value) {
            addCriterion("DATE_BIRTHDAY =", value, "dateBirthday");
            return (Criteria) this;
        }

        public Criteria andDateBirthdayNotEqualTo(String value) {
            addCriterion("DATE_BIRTHDAY <>", value, "dateBirthday");
            return (Criteria) this;
        }

        public Criteria andDateBirthdayGreaterThan(String value) {
            addCriterion("DATE_BIRTHDAY >", value, "dateBirthday");
            return (Criteria) this;
        }

        public Criteria andDateBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("DATE_BIRTHDAY >=", value, "dateBirthday");
            return (Criteria) this;
        }

        public Criteria andDateBirthdayLessThan(String value) {
            addCriterion("DATE_BIRTHDAY <", value, "dateBirthday");
            return (Criteria) this;
        }

        public Criteria andDateBirthdayLessThanOrEqualTo(String value) {
            addCriterion("DATE_BIRTHDAY <=", value, "dateBirthday");
            return (Criteria) this;
        }

        public Criteria andDateBirthdayLike(String value) {
            addCriterion("DATE_BIRTHDAY like", value, "dateBirthday");
            return (Criteria) this;
        }

        public Criteria andDateBirthdayNotLike(String value) {
            addCriterion("DATE_BIRTHDAY not like", value, "dateBirthday");
            return (Criteria) this;
        }

        public Criteria andDateBirthdayIn(List<String> values) {
            addCriterion("DATE_BIRTHDAY in", values, "dateBirthday");
            return (Criteria) this;
        }

        public Criteria andDateBirthdayNotIn(List<String> values) {
            addCriterion("DATE_BIRTHDAY not in", values, "dateBirthday");
            return (Criteria) this;
        }

        public Criteria andDateBirthdayBetween(String value1, String value2) {
            addCriterion("DATE_BIRTHDAY between", value1, value2, "dateBirthday");
            return (Criteria) this;
        }

        public Criteria andDateBirthdayNotBetween(String value1, String value2) {
            addCriterion("DATE_BIRTHDAY not between", value1, value2, "dateBirthday");
            return (Criteria) this;
        }

        public Criteria andTypeIdcardIsNull() {
            addCriterion("TYPE_IDCARD is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdcardIsNotNull() {
            addCriterion("TYPE_IDCARD is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdcardEqualTo(String value) {
            addCriterion("TYPE_IDCARD =", value, "typeIdcard");
            return (Criteria) this;
        }

        public Criteria andTypeIdcardNotEqualTo(String value) {
            addCriterion("TYPE_IDCARD <>", value, "typeIdcard");
            return (Criteria) this;
        }

        public Criteria andTypeIdcardGreaterThan(String value) {
            addCriterion("TYPE_IDCARD >", value, "typeIdcard");
            return (Criteria) this;
        }

        public Criteria andTypeIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE_IDCARD >=", value, "typeIdcard");
            return (Criteria) this;
        }

        public Criteria andTypeIdcardLessThan(String value) {
            addCriterion("TYPE_IDCARD <", value, "typeIdcard");
            return (Criteria) this;
        }

        public Criteria andTypeIdcardLessThanOrEqualTo(String value) {
            addCriterion("TYPE_IDCARD <=", value, "typeIdcard");
            return (Criteria) this;
        }

        public Criteria andTypeIdcardLike(String value) {
            addCriterion("TYPE_IDCARD like", value, "typeIdcard");
            return (Criteria) this;
        }

        public Criteria andTypeIdcardNotLike(String value) {
            addCriterion("TYPE_IDCARD not like", value, "typeIdcard");
            return (Criteria) this;
        }

        public Criteria andTypeIdcardIn(List<String> values) {
            addCriterion("TYPE_IDCARD in", values, "typeIdcard");
            return (Criteria) this;
        }

        public Criteria andTypeIdcardNotIn(List<String> values) {
            addCriterion("TYPE_IDCARD not in", values, "typeIdcard");
            return (Criteria) this;
        }

        public Criteria andTypeIdcardBetween(String value1, String value2) {
            addCriterion("TYPE_IDCARD between", value1, value2, "typeIdcard");
            return (Criteria) this;
        }

        public Criteria andTypeIdcardNotBetween(String value1, String value2) {
            addCriterion("TYPE_IDCARD not between", value1, value2, "typeIdcard");
            return (Criteria) this;
        }

        public Criteria andNoIdcardIsNull() {
            addCriterion("NO_IDCARD is null");
            return (Criteria) this;
        }

        public Criteria andNoIdcardIsNotNull() {
            addCriterion("NO_IDCARD is not null");
            return (Criteria) this;
        }

        public Criteria andNoIdcardEqualTo(String value) {
            addCriterion("NO_IDCARD =", value, "noIdcard");
            return (Criteria) this;
        }

        public Criteria andNoIdcardNotEqualTo(String value) {
            addCriterion("NO_IDCARD <>", value, "noIdcard");
            return (Criteria) this;
        }

        public Criteria andNoIdcardGreaterThan(String value) {
            addCriterion("NO_IDCARD >", value, "noIdcard");
            return (Criteria) this;
        }

        public Criteria andNoIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("NO_IDCARD >=", value, "noIdcard");
            return (Criteria) this;
        }

        public Criteria andNoIdcardLessThan(String value) {
            addCriterion("NO_IDCARD <", value, "noIdcard");
            return (Criteria) this;
        }

        public Criteria andNoIdcardLessThanOrEqualTo(String value) {
            addCriterion("NO_IDCARD <=", value, "noIdcard");
            return (Criteria) this;
        }

        public Criteria andNoIdcardLike(String value) {
            addCriterion("NO_IDCARD like", value, "noIdcard");
            return (Criteria) this;
        }

        public Criteria andNoIdcardNotLike(String value) {
            addCriterion("NO_IDCARD not like", value, "noIdcard");
            return (Criteria) this;
        }

        public Criteria andNoIdcardIn(List<String> values) {
            addCriterion("NO_IDCARD in", values, "noIdcard");
            return (Criteria) this;
        }

        public Criteria andNoIdcardNotIn(List<String> values) {
            addCriterion("NO_IDCARD not in", values, "noIdcard");
            return (Criteria) this;
        }

        public Criteria andNoIdcardBetween(String value1, String value2) {
            addCriterion("NO_IDCARD between", value1, value2, "noIdcard");
            return (Criteria) this;
        }

        public Criteria andNoIdcardNotBetween(String value1, String value2) {
            addCriterion("NO_IDCARD not between", value1, value2, "noIdcard");
            return (Criteria) this;
        }

        public Criteria andTelUserIsNull() {
            addCriterion("TEL_USER is null");
            return (Criteria) this;
        }

        public Criteria andTelUserIsNotNull() {
            addCriterion("TEL_USER is not null");
            return (Criteria) this;
        }

        public Criteria andTelUserEqualTo(String value) {
            addCriterion("TEL_USER =", value, "telUser");
            return (Criteria) this;
        }

        public Criteria andTelUserNotEqualTo(String value) {
            addCriterion("TEL_USER <>", value, "telUser");
            return (Criteria) this;
        }

        public Criteria andTelUserGreaterThan(String value) {
            addCriterion("TEL_USER >", value, "telUser");
            return (Criteria) this;
        }

        public Criteria andTelUserGreaterThanOrEqualTo(String value) {
            addCriterion("TEL_USER >=", value, "telUser");
            return (Criteria) this;
        }

        public Criteria andTelUserLessThan(String value) {
            addCriterion("TEL_USER <", value, "telUser");
            return (Criteria) this;
        }

        public Criteria andTelUserLessThanOrEqualTo(String value) {
            addCriterion("TEL_USER <=", value, "telUser");
            return (Criteria) this;
        }

        public Criteria andTelUserLike(String value) {
            addCriterion("TEL_USER like", value, "telUser");
            return (Criteria) this;
        }

        public Criteria andTelUserNotLike(String value) {
            addCriterion("TEL_USER not like", value, "telUser");
            return (Criteria) this;
        }

        public Criteria andTelUserIn(List<String> values) {
            addCriterion("TEL_USER in", values, "telUser");
            return (Criteria) this;
        }

        public Criteria andTelUserNotIn(List<String> values) {
            addCriterion("TEL_USER not in", values, "telUser");
            return (Criteria) this;
        }

        public Criteria andTelUserBetween(String value1, String value2) {
            addCriterion("TEL_USER between", value1, value2, "telUser");
            return (Criteria) this;
        }

        public Criteria andTelUserNotBetween(String value1, String value2) {
            addCriterion("TEL_USER not between", value1, value2, "telUser");
            return (Criteria) this;
        }

        public Criteria andAddrProIsNull() {
            addCriterion("ADDR_PRO is null");
            return (Criteria) this;
        }

        public Criteria andAddrProIsNotNull() {
            addCriterion("ADDR_PRO is not null");
            return (Criteria) this;
        }

        public Criteria andAddrProEqualTo(String value) {
            addCriterion("ADDR_PRO =", value, "addrPro");
            return (Criteria) this;
        }

        public Criteria andAddrProNotEqualTo(String value) {
            addCriterion("ADDR_PRO <>", value, "addrPro");
            return (Criteria) this;
        }

        public Criteria andAddrProGreaterThan(String value) {
            addCriterion("ADDR_PRO >", value, "addrPro");
            return (Criteria) this;
        }

        public Criteria andAddrProGreaterThanOrEqualTo(String value) {
            addCriterion("ADDR_PRO >=", value, "addrPro");
            return (Criteria) this;
        }

        public Criteria andAddrProLessThan(String value) {
            addCriterion("ADDR_PRO <", value, "addrPro");
            return (Criteria) this;
        }

        public Criteria andAddrProLessThanOrEqualTo(String value) {
            addCriterion("ADDR_PRO <=", value, "addrPro");
            return (Criteria) this;
        }

        public Criteria andAddrProLike(String value) {
            addCriterion("ADDR_PRO like", value, "addrPro");
            return (Criteria) this;
        }

        public Criteria andAddrProNotLike(String value) {
            addCriterion("ADDR_PRO not like", value, "addrPro");
            return (Criteria) this;
        }

        public Criteria andAddrProIn(List<String> values) {
            addCriterion("ADDR_PRO in", values, "addrPro");
            return (Criteria) this;
        }

        public Criteria andAddrProNotIn(List<String> values) {
            addCriterion("ADDR_PRO not in", values, "addrPro");
            return (Criteria) this;
        }

        public Criteria andAddrProBetween(String value1, String value2) {
            addCriterion("ADDR_PRO between", value1, value2, "addrPro");
            return (Criteria) this;
        }

        public Criteria andAddrProNotBetween(String value1, String value2) {
            addCriterion("ADDR_PRO not between", value1, value2, "addrPro");
            return (Criteria) this;
        }

        public Criteria andAddrCityIsNull() {
            addCriterion("ADDR_CITY is null");
            return (Criteria) this;
        }

        public Criteria andAddrCityIsNotNull() {
            addCriterion("ADDR_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andAddrCityEqualTo(String value) {
            addCriterion("ADDR_CITY =", value, "addrCity");
            return (Criteria) this;
        }

        public Criteria andAddrCityNotEqualTo(String value) {
            addCriterion("ADDR_CITY <>", value, "addrCity");
            return (Criteria) this;
        }

        public Criteria andAddrCityGreaterThan(String value) {
            addCriterion("ADDR_CITY >", value, "addrCity");
            return (Criteria) this;
        }

        public Criteria andAddrCityGreaterThanOrEqualTo(String value) {
            addCriterion("ADDR_CITY >=", value, "addrCity");
            return (Criteria) this;
        }

        public Criteria andAddrCityLessThan(String value) {
            addCriterion("ADDR_CITY <", value, "addrCity");
            return (Criteria) this;
        }

        public Criteria andAddrCityLessThanOrEqualTo(String value) {
            addCriterion("ADDR_CITY <=", value, "addrCity");
            return (Criteria) this;
        }

        public Criteria andAddrCityLike(String value) {
            addCriterion("ADDR_CITY like", value, "addrCity");
            return (Criteria) this;
        }

        public Criteria andAddrCityNotLike(String value) {
            addCriterion("ADDR_CITY not like", value, "addrCity");
            return (Criteria) this;
        }

        public Criteria andAddrCityIn(List<String> values) {
            addCriterion("ADDR_CITY in", values, "addrCity");
            return (Criteria) this;
        }

        public Criteria andAddrCityNotIn(List<String> values) {
            addCriterion("ADDR_CITY not in", values, "addrCity");
            return (Criteria) this;
        }

        public Criteria andAddrCityBetween(String value1, String value2) {
            addCriterion("ADDR_CITY between", value1, value2, "addrCity");
            return (Criteria) this;
        }

        public Criteria andAddrCityNotBetween(String value1, String value2) {
            addCriterion("ADDR_CITY not between", value1, value2, "addrCity");
            return (Criteria) this;
        }

        public Criteria andAddrDistIsNull() {
            addCriterion("ADDR_DIST is null");
            return (Criteria) this;
        }

        public Criteria andAddrDistIsNotNull() {
            addCriterion("ADDR_DIST is not null");
            return (Criteria) this;
        }

        public Criteria andAddrDistEqualTo(String value) {
            addCriterion("ADDR_DIST =", value, "addrDist");
            return (Criteria) this;
        }

        public Criteria andAddrDistNotEqualTo(String value) {
            addCriterion("ADDR_DIST <>", value, "addrDist");
            return (Criteria) this;
        }

        public Criteria andAddrDistGreaterThan(String value) {
            addCriterion("ADDR_DIST >", value, "addrDist");
            return (Criteria) this;
        }

        public Criteria andAddrDistGreaterThanOrEqualTo(String value) {
            addCriterion("ADDR_DIST >=", value, "addrDist");
            return (Criteria) this;
        }

        public Criteria andAddrDistLessThan(String value) {
            addCriterion("ADDR_DIST <", value, "addrDist");
            return (Criteria) this;
        }

        public Criteria andAddrDistLessThanOrEqualTo(String value) {
            addCriterion("ADDR_DIST <=", value, "addrDist");
            return (Criteria) this;
        }

        public Criteria andAddrDistLike(String value) {
            addCriterion("ADDR_DIST like", value, "addrDist");
            return (Criteria) this;
        }

        public Criteria andAddrDistNotLike(String value) {
            addCriterion("ADDR_DIST not like", value, "addrDist");
            return (Criteria) this;
        }

        public Criteria andAddrDistIn(List<String> values) {
            addCriterion("ADDR_DIST in", values, "addrDist");
            return (Criteria) this;
        }

        public Criteria andAddrDistNotIn(List<String> values) {
            addCriterion("ADDR_DIST not in", values, "addrDist");
            return (Criteria) this;
        }

        public Criteria andAddrDistBetween(String value1, String value2) {
            addCriterion("ADDR_DIST between", value1, value2, "addrDist");
            return (Criteria) this;
        }

        public Criteria andAddrDistNotBetween(String value1, String value2) {
            addCriterion("ADDR_DIST not between", value1, value2, "addrDist");
            return (Criteria) this;
        }

        public Criteria andAddrConnIsNull() {
            addCriterion("ADDR_CONN is null");
            return (Criteria) this;
        }

        public Criteria andAddrConnIsNotNull() {
            addCriterion("ADDR_CONN is not null");
            return (Criteria) this;
        }

        public Criteria andAddrConnEqualTo(String value) {
            addCriterion("ADDR_CONN =", value, "addrConn");
            return (Criteria) this;
        }

        public Criteria andAddrConnNotEqualTo(String value) {
            addCriterion("ADDR_CONN <>", value, "addrConn");
            return (Criteria) this;
        }

        public Criteria andAddrConnGreaterThan(String value) {
            addCriterion("ADDR_CONN >", value, "addrConn");
            return (Criteria) this;
        }

        public Criteria andAddrConnGreaterThanOrEqualTo(String value) {
            addCriterion("ADDR_CONN >=", value, "addrConn");
            return (Criteria) this;
        }

        public Criteria andAddrConnLessThan(String value) {
            addCriterion("ADDR_CONN <", value, "addrConn");
            return (Criteria) this;
        }

        public Criteria andAddrConnLessThanOrEqualTo(String value) {
            addCriterion("ADDR_CONN <=", value, "addrConn");
            return (Criteria) this;
        }

        public Criteria andAddrConnLike(String value) {
            addCriterion("ADDR_CONN like", value, "addrConn");
            return (Criteria) this;
        }

        public Criteria andAddrConnNotLike(String value) {
            addCriterion("ADDR_CONN not like", value, "addrConn");
            return (Criteria) this;
        }

        public Criteria andAddrConnIn(List<String> values) {
            addCriterion("ADDR_CONN in", values, "addrConn");
            return (Criteria) this;
        }

        public Criteria andAddrConnNotIn(List<String> values) {
            addCriterion("ADDR_CONN not in", values, "addrConn");
            return (Criteria) this;
        }

        public Criteria andAddrConnBetween(String value1, String value2) {
            addCriterion("ADDR_CONN between", value1, value2, "addrConn");
            return (Criteria) this;
        }

        public Criteria andAddrConnNotBetween(String value1, String value2) {
            addCriterion("ADDR_CONN not between", value1, value2, "addrConn");
            return (Criteria) this;
        }

        public Criteria andNoPostcodeIsNull() {
            addCriterion("NO_POSTCODE is null");
            return (Criteria) this;
        }

        public Criteria andNoPostcodeIsNotNull() {
            addCriterion("NO_POSTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andNoPostcodeEqualTo(String value) {
            addCriterion("NO_POSTCODE =", value, "noPostcode");
            return (Criteria) this;
        }

        public Criteria andNoPostcodeNotEqualTo(String value) {
            addCriterion("NO_POSTCODE <>", value, "noPostcode");
            return (Criteria) this;
        }

        public Criteria andNoPostcodeGreaterThan(String value) {
            addCriterion("NO_POSTCODE >", value, "noPostcode");
            return (Criteria) this;
        }

        public Criteria andNoPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("NO_POSTCODE >=", value, "noPostcode");
            return (Criteria) this;
        }

        public Criteria andNoPostcodeLessThan(String value) {
            addCriterion("NO_POSTCODE <", value, "noPostcode");
            return (Criteria) this;
        }

        public Criteria andNoPostcodeLessThanOrEqualTo(String value) {
            addCriterion("NO_POSTCODE <=", value, "noPostcode");
            return (Criteria) this;
        }

        public Criteria andNoPostcodeLike(String value) {
            addCriterion("NO_POSTCODE like", value, "noPostcode");
            return (Criteria) this;
        }

        public Criteria andNoPostcodeNotLike(String value) {
            addCriterion("NO_POSTCODE not like", value, "noPostcode");
            return (Criteria) this;
        }

        public Criteria andNoPostcodeIn(List<String> values) {
            addCriterion("NO_POSTCODE in", values, "noPostcode");
            return (Criteria) this;
        }

        public Criteria andNoPostcodeNotIn(List<String> values) {
            addCriterion("NO_POSTCODE not in", values, "noPostcode");
            return (Criteria) this;
        }

        public Criteria andNoPostcodeBetween(String value1, String value2) {
            addCriterion("NO_POSTCODE between", value1, value2, "noPostcode");
            return (Criteria) this;
        }

        public Criteria andNoPostcodeNotBetween(String value1, String value2) {
            addCriterion("NO_POSTCODE not between", value1, value2, "noPostcode");
            return (Criteria) this;
        }

        public Criteria andDtRegIsNull() {
            addCriterion("DT_REG is null");
            return (Criteria) this;
        }

        public Criteria andDtRegIsNotNull() {
            addCriterion("DT_REG is not null");
            return (Criteria) this;
        }

        public Criteria andDtRegEqualTo(Date value) {
            addCriterion("DT_REG =", value, "dtReg");
            return (Criteria) this;
        }

        public Criteria andDtRegNotEqualTo(Date value) {
            addCriterion("DT_REG <>", value, "dtReg");
            return (Criteria) this;
        }

        public Criteria andDtRegGreaterThan(Date value) {
            addCriterion("DT_REG >", value, "dtReg");
            return (Criteria) this;
        }

        public Criteria andDtRegGreaterThanOrEqualTo(Date value) {
            addCriterion("DT_REG >=", value, "dtReg");
            return (Criteria) this;
        }

        public Criteria andDtRegLessThan(Date value) {
            addCriterion("DT_REG <", value, "dtReg");
            return (Criteria) this;
        }

        public Criteria andDtRegLessThanOrEqualTo(Date value) {
            addCriterion("DT_REG <=", value, "dtReg");
            return (Criteria) this;
        }

        public Criteria andDtRegIn(List<Date> values) {
            addCriterion("DT_REG in", values, "dtReg");
            return (Criteria) this;
        }

        public Criteria andDtRegNotIn(List<Date> values) {
            addCriterion("DT_REG not in", values, "dtReg");
            return (Criteria) this;
        }

        public Criteria andDtRegBetween(Date value1, Date value2) {
            addCriterion("DT_REG between", value1, value2, "dtReg");
            return (Criteria) this;
        }

        public Criteria andDtRegNotBetween(Date value1, Date value2) {
            addCriterion("DT_REG not between", value1, value2, "dtReg");
            return (Criteria) this;
        }

        public Criteria andDtUnregIsNull() {
            addCriterion("DT_UNREG is null");
            return (Criteria) this;
        }

        public Criteria andDtUnregIsNotNull() {
            addCriterion("DT_UNREG is not null");
            return (Criteria) this;
        }

        public Criteria andDtUnregEqualTo(Date value) {
            addCriterion("DT_UNREG =", value, "dtUnreg");
            return (Criteria) this;
        }

        public Criteria andDtUnregNotEqualTo(Date value) {
            addCriterion("DT_UNREG <>", value, "dtUnreg");
            return (Criteria) this;
        }

        public Criteria andDtUnregGreaterThan(Date value) {
            addCriterion("DT_UNREG >", value, "dtUnreg");
            return (Criteria) this;
        }

        public Criteria andDtUnregGreaterThanOrEqualTo(Date value) {
            addCriterion("DT_UNREG >=", value, "dtUnreg");
            return (Criteria) this;
        }

        public Criteria andDtUnregLessThan(Date value) {
            addCriterion("DT_UNREG <", value, "dtUnreg");
            return (Criteria) this;
        }

        public Criteria andDtUnregLessThanOrEqualTo(Date value) {
            addCriterion("DT_UNREG <=", value, "dtUnreg");
            return (Criteria) this;
        }

        public Criteria andDtUnregIn(List<Date> values) {
            addCriterion("DT_UNREG in", values, "dtUnreg");
            return (Criteria) this;
        }

        public Criteria andDtUnregNotIn(List<Date> values) {
            addCriterion("DT_UNREG not in", values, "dtUnreg");
            return (Criteria) this;
        }

        public Criteria andDtUnregBetween(Date value1, Date value2) {
            addCriterion("DT_UNREG between", value1, value2, "dtUnreg");
            return (Criteria) this;
        }

        public Criteria andDtUnregNotBetween(Date value1, Date value2) {
            addCriterion("DT_UNREG not between", value1, value2, "dtUnreg");
            return (Criteria) this;
        }

        public Criteria andDtLastupdateIsNull() {
            addCriterion("DT_LASTUPDATE is null");
            return (Criteria) this;
        }

        public Criteria andDtLastupdateIsNotNull() {
            addCriterion("DT_LASTUPDATE is not null");
            return (Criteria) this;
        }

        public Criteria andDtLastupdateEqualTo(Date value) {
            addCriterion("DT_LASTUPDATE =", value, "dtLastupdate");
            return (Criteria) this;
        }

        public Criteria andDtLastupdateNotEqualTo(Date value) {
            addCriterion("DT_LASTUPDATE <>", value, "dtLastupdate");
            return (Criteria) this;
        }

        public Criteria andDtLastupdateGreaterThan(Date value) {
            addCriterion("DT_LASTUPDATE >", value, "dtLastupdate");
            return (Criteria) this;
        }

        public Criteria andDtLastupdateGreaterThanOrEqualTo(Date value) {
            addCriterion("DT_LASTUPDATE >=", value, "dtLastupdate");
            return (Criteria) this;
        }

        public Criteria andDtLastupdateLessThan(Date value) {
            addCriterion("DT_LASTUPDATE <", value, "dtLastupdate");
            return (Criteria) this;
        }

        public Criteria andDtLastupdateLessThanOrEqualTo(Date value) {
            addCriterion("DT_LASTUPDATE <=", value, "dtLastupdate");
            return (Criteria) this;
        }

        public Criteria andDtLastupdateIn(List<Date> values) {
            addCriterion("DT_LASTUPDATE in", values, "dtLastupdate");
            return (Criteria) this;
        }

        public Criteria andDtLastupdateNotIn(List<Date> values) {
            addCriterion("DT_LASTUPDATE not in", values, "dtLastupdate");
            return (Criteria) this;
        }

        public Criteria andDtLastupdateBetween(Date value1, Date value2) {
            addCriterion("DT_LASTUPDATE between", value1, value2, "dtLastupdate");
            return (Criteria) this;
        }

        public Criteria andDtLastupdateNotBetween(Date value1, Date value2) {
            addCriterion("DT_LASTUPDATE not between", value1, value2, "dtLastupdate");
            return (Criteria) this;
        }

        public Criteria andPreservingInfoIsNull() {
            addCriterion("PRESERVING_INFO is null");
            return (Criteria) this;
        }

        public Criteria andPreservingInfoIsNotNull() {
            addCriterion("PRESERVING_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andPreservingInfoEqualTo(String value) {
            addCriterion("PRESERVING_INFO =", value, "preservingInfo");
            return (Criteria) this;
        }

        public Criteria andPreservingInfoNotEqualTo(String value) {
            addCriterion("PRESERVING_INFO <>", value, "preservingInfo");
            return (Criteria) this;
        }

        public Criteria andPreservingInfoGreaterThan(String value) {
            addCriterion("PRESERVING_INFO >", value, "preservingInfo");
            return (Criteria) this;
        }

        public Criteria andPreservingInfoGreaterThanOrEqualTo(String value) {
            addCriterion("PRESERVING_INFO >=", value, "preservingInfo");
            return (Criteria) this;
        }

        public Criteria andPreservingInfoLessThan(String value) {
            addCriterion("PRESERVING_INFO <", value, "preservingInfo");
            return (Criteria) this;
        }

        public Criteria andPreservingInfoLessThanOrEqualTo(String value) {
            addCriterion("PRESERVING_INFO <=", value, "preservingInfo");
            return (Criteria) this;
        }

        public Criteria andPreservingInfoLike(String value) {
            addCriterion("PRESERVING_INFO like", value, "preservingInfo");
            return (Criteria) this;
        }

        public Criteria andPreservingInfoNotLike(String value) {
            addCriterion("PRESERVING_INFO not like", value, "preservingInfo");
            return (Criteria) this;
        }

        public Criteria andPreservingInfoIn(List<String> values) {
            addCriterion("PRESERVING_INFO in", values, "preservingInfo");
            return (Criteria) this;
        }

        public Criteria andPreservingInfoNotIn(List<String> values) {
            addCriterion("PRESERVING_INFO not in", values, "preservingInfo");
            return (Criteria) this;
        }

        public Criteria andPreservingInfoBetween(String value1, String value2) {
            addCriterion("PRESERVING_INFO between", value1, value2, "preservingInfo");
            return (Criteria) this;
        }

        public Criteria andPreservingInfoNotBetween(String value1, String value2) {
            addCriterion("PRESERVING_INFO not between", value1, value2, "preservingInfo");
            return (Criteria) this;
        }

        public Criteria andNationUserIsNull() {
            addCriterion("NATION_USER is null");
            return (Criteria) this;
        }

        public Criteria andNationUserIsNotNull() {
            addCriterion("NATION_USER is not null");
            return (Criteria) this;
        }

        public Criteria andNationUserEqualTo(String value) {
            addCriterion("NATION_USER =", value, "nationUser");
            return (Criteria) this;
        }

        public Criteria andNationUserNotEqualTo(String value) {
            addCriterion("NATION_USER <>", value, "nationUser");
            return (Criteria) this;
        }

        public Criteria andNationUserGreaterThan(String value) {
            addCriterion("NATION_USER >", value, "nationUser");
            return (Criteria) this;
        }

        public Criteria andNationUserGreaterThanOrEqualTo(String value) {
            addCriterion("NATION_USER >=", value, "nationUser");
            return (Criteria) this;
        }

        public Criteria andNationUserLessThan(String value) {
            addCriterion("NATION_USER <", value, "nationUser");
            return (Criteria) this;
        }

        public Criteria andNationUserLessThanOrEqualTo(String value) {
            addCriterion("NATION_USER <=", value, "nationUser");
            return (Criteria) this;
        }

        public Criteria andNationUserLike(String value) {
            addCriterion("NATION_USER like", value, "nationUser");
            return (Criteria) this;
        }

        public Criteria andNationUserNotLike(String value) {
            addCriterion("NATION_USER not like", value, "nationUser");
            return (Criteria) this;
        }

        public Criteria andNationUserIn(List<String> values) {
            addCriterion("NATION_USER in", values, "nationUser");
            return (Criteria) this;
        }

        public Criteria andNationUserNotIn(List<String> values) {
            addCriterion("NATION_USER not in", values, "nationUser");
            return (Criteria) this;
        }

        public Criteria andNationUserBetween(String value1, String value2) {
            addCriterion("NATION_USER between", value1, value2, "nationUser");
            return (Criteria) this;
        }

        public Criteria andNationUserNotBetween(String value1, String value2) {
            addCriterion("NATION_USER not between", value1, value2, "nationUser");
            return (Criteria) this;
        }

        public Criteria andExpIdcardIsNull() {
            addCriterion("EXP_IDCARD is null");
            return (Criteria) this;
        }

        public Criteria andExpIdcardIsNotNull() {
            addCriterion("EXP_IDCARD is not null");
            return (Criteria) this;
        }

        public Criteria andExpIdcardEqualTo(String value) {
            addCriterion("EXP_IDCARD =", value, "expIdcard");
            return (Criteria) this;
        }

        public Criteria andExpIdcardNotEqualTo(String value) {
            addCriterion("EXP_IDCARD <>", value, "expIdcard");
            return (Criteria) this;
        }

        public Criteria andExpIdcardGreaterThan(String value) {
            addCriterion("EXP_IDCARD >", value, "expIdcard");
            return (Criteria) this;
        }

        public Criteria andExpIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("EXP_IDCARD >=", value, "expIdcard");
            return (Criteria) this;
        }

        public Criteria andExpIdcardLessThan(String value) {
            addCriterion("EXP_IDCARD <", value, "expIdcard");
            return (Criteria) this;
        }

        public Criteria andExpIdcardLessThanOrEqualTo(String value) {
            addCriterion("EXP_IDCARD <=", value, "expIdcard");
            return (Criteria) this;
        }

        public Criteria andExpIdcardLike(String value) {
            addCriterion("EXP_IDCARD like", value, "expIdcard");
            return (Criteria) this;
        }

        public Criteria andExpIdcardNotLike(String value) {
            addCriterion("EXP_IDCARD not like", value, "expIdcard");
            return (Criteria) this;
        }

        public Criteria andExpIdcardIn(List<String> values) {
            addCriterion("EXP_IDCARD in", values, "expIdcard");
            return (Criteria) this;
        }

        public Criteria andExpIdcardNotIn(List<String> values) {
            addCriterion("EXP_IDCARD not in", values, "expIdcard");
            return (Criteria) this;
        }

        public Criteria andExpIdcardBetween(String value1, String value2) {
            addCriterion("EXP_IDCARD between", value1, value2, "expIdcard");
            return (Criteria) this;
        }

        public Criteria andExpIdcardNotBetween(String value1, String value2) {
            addCriterion("EXP_IDCARD not between", value1, value2, "expIdcard");
            return (Criteria) this;
        }

        public Criteria andTypeUserIsNull() {
            addCriterion("TYPE_USER is null");
            return (Criteria) this;
        }

        public Criteria andTypeUserIsNotNull() {
            addCriterion("TYPE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andTypeUserEqualTo(String value) {
            addCriterion("TYPE_USER =", value, "typeUser");
            return (Criteria) this;
        }

        public Criteria andTypeUserNotEqualTo(String value) {
            addCriterion("TYPE_USER <>", value, "typeUser");
            return (Criteria) this;
        }

        public Criteria andTypeUserGreaterThan(String value) {
            addCriterion("TYPE_USER >", value, "typeUser");
            return (Criteria) this;
        }

        public Criteria andTypeUserGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE_USER >=", value, "typeUser");
            return (Criteria) this;
        }

        public Criteria andTypeUserLessThan(String value) {
            addCriterion("TYPE_USER <", value, "typeUser");
            return (Criteria) this;
        }

        public Criteria andTypeUserLessThanOrEqualTo(String value) {
            addCriterion("TYPE_USER <=", value, "typeUser");
            return (Criteria) this;
        }

        public Criteria andTypeUserLike(String value) {
            addCriterion("TYPE_USER like", value, "typeUser");
            return (Criteria) this;
        }

        public Criteria andTypeUserNotLike(String value) {
            addCriterion("TYPE_USER not like", value, "typeUser");
            return (Criteria) this;
        }

        public Criteria andTypeUserIn(List<String> values) {
            addCriterion("TYPE_USER in", values, "typeUser");
            return (Criteria) this;
        }

        public Criteria andTypeUserNotIn(List<String> values) {
            addCriterion("TYPE_USER not in", values, "typeUser");
            return (Criteria) this;
        }

        public Criteria andTypeUserBetween(String value1, String value2) {
            addCriterion("TYPE_USER between", value1, value2, "typeUser");
            return (Criteria) this;
        }

        public Criteria andTypeUserNotBetween(String value1, String value2) {
            addCriterion("TYPE_USER not between", value1, value2, "typeUser");
            return (Criteria) this;
        }

        public Criteria andOidJobIsNull() {
            addCriterion("OID_JOB is null");
            return (Criteria) this;
        }

        public Criteria andOidJobIsNotNull() {
            addCriterion("OID_JOB is not null");
            return (Criteria) this;
        }

        public Criteria andOidJobEqualTo(String value) {
            addCriterion("OID_JOB =", value, "oidJob");
            return (Criteria) this;
        }

        public Criteria andOidJobNotEqualTo(String value) {
            addCriterion("OID_JOB <>", value, "oidJob");
            return (Criteria) this;
        }

        public Criteria andOidJobGreaterThan(String value) {
            addCriterion("OID_JOB >", value, "oidJob");
            return (Criteria) this;
        }

        public Criteria andOidJobGreaterThanOrEqualTo(String value) {
            addCriterion("OID_JOB >=", value, "oidJob");
            return (Criteria) this;
        }

        public Criteria andOidJobLessThan(String value) {
            addCriterion("OID_JOB <", value, "oidJob");
            return (Criteria) this;
        }

        public Criteria andOidJobLessThanOrEqualTo(String value) {
            addCriterion("OID_JOB <=", value, "oidJob");
            return (Criteria) this;
        }

        public Criteria andOidJobLike(String value) {
            addCriterion("OID_JOB like", value, "oidJob");
            return (Criteria) this;
        }

        public Criteria andOidJobNotLike(String value) {
            addCriterion("OID_JOB not like", value, "oidJob");
            return (Criteria) this;
        }

        public Criteria andOidJobIn(List<String> values) {
            addCriterion("OID_JOB in", values, "oidJob");
            return (Criteria) this;
        }

        public Criteria andOidJobNotIn(List<String> values) {
            addCriterion("OID_JOB not in", values, "oidJob");
            return (Criteria) this;
        }

        public Criteria andOidJobBetween(String value1, String value2) {
            addCriterion("OID_JOB between", value1, value2, "oidJob");
            return (Criteria) this;
        }

        public Criteria andOidJobNotBetween(String value1, String value2) {
            addCriterion("OID_JOB not between", value1, value2, "oidJob");
            return (Criteria) this;
        }

        public Criteria andOidChnlIsNull() {
            addCriterion("OID_CHNL is null");
            return (Criteria) this;
        }

        public Criteria andOidChnlIsNotNull() {
            addCriterion("OID_CHNL is not null");
            return (Criteria) this;
        }

        public Criteria andOidChnlEqualTo(String value) {
            addCriterion("OID_CHNL =", value, "oidChnl");
            return (Criteria) this;
        }

        public Criteria andOidChnlNotEqualTo(String value) {
            addCriterion("OID_CHNL <>", value, "oidChnl");
            return (Criteria) this;
        }

        public Criteria andOidChnlGreaterThan(String value) {
            addCriterion("OID_CHNL >", value, "oidChnl");
            return (Criteria) this;
        }

        public Criteria andOidChnlGreaterThanOrEqualTo(String value) {
            addCriterion("OID_CHNL >=", value, "oidChnl");
            return (Criteria) this;
        }

        public Criteria andOidChnlLessThan(String value) {
            addCriterion("OID_CHNL <", value, "oidChnl");
            return (Criteria) this;
        }

        public Criteria andOidChnlLessThanOrEqualTo(String value) {
            addCriterion("OID_CHNL <=", value, "oidChnl");
            return (Criteria) this;
        }

        public Criteria andOidChnlLike(String value) {
            addCriterion("OID_CHNL like", value, "oidChnl");
            return (Criteria) this;
        }

        public Criteria andOidChnlNotLike(String value) {
            addCriterion("OID_CHNL not like", value, "oidChnl");
            return (Criteria) this;
        }

        public Criteria andOidChnlIn(List<String> values) {
            addCriterion("OID_CHNL in", values, "oidChnl");
            return (Criteria) this;
        }

        public Criteria andOidChnlNotIn(List<String> values) {
            addCriterion("OID_CHNL not in", values, "oidChnl");
            return (Criteria) this;
        }

        public Criteria andOidChnlBetween(String value1, String value2) {
            addCriterion("OID_CHNL between", value1, value2, "oidChnl");
            return (Criteria) this;
        }

        public Criteria andOidChnlNotBetween(String value1, String value2) {
            addCriterion("OID_CHNL not between", value1, value2, "oidChnl");
            return (Criteria) this;
        }

        public Criteria andStatMarryIsNull() {
            addCriterion("STAT_MARRY is null");
            return (Criteria) this;
        }

        public Criteria andStatMarryIsNotNull() {
            addCriterion("STAT_MARRY is not null");
            return (Criteria) this;
        }

        public Criteria andStatMarryEqualTo(String value) {
            addCriterion("STAT_MARRY =", value, "statMarry");
            return (Criteria) this;
        }

        public Criteria andStatMarryNotEqualTo(String value) {
            addCriterion("STAT_MARRY <>", value, "statMarry");
            return (Criteria) this;
        }

        public Criteria andStatMarryGreaterThan(String value) {
            addCriterion("STAT_MARRY >", value, "statMarry");
            return (Criteria) this;
        }

        public Criteria andStatMarryGreaterThanOrEqualTo(String value) {
            addCriterion("STAT_MARRY >=", value, "statMarry");
            return (Criteria) this;
        }

        public Criteria andStatMarryLessThan(String value) {
            addCriterion("STAT_MARRY <", value, "statMarry");
            return (Criteria) this;
        }

        public Criteria andStatMarryLessThanOrEqualTo(String value) {
            addCriterion("STAT_MARRY <=", value, "statMarry");
            return (Criteria) this;
        }

        public Criteria andStatMarryLike(String value) {
            addCriterion("STAT_MARRY like", value, "statMarry");
            return (Criteria) this;
        }

        public Criteria andStatMarryNotLike(String value) {
            addCriterion("STAT_MARRY not like", value, "statMarry");
            return (Criteria) this;
        }

        public Criteria andStatMarryIn(List<String> values) {
            addCriterion("STAT_MARRY in", values, "statMarry");
            return (Criteria) this;
        }

        public Criteria andStatMarryNotIn(List<String> values) {
            addCriterion("STAT_MARRY not in", values, "statMarry");
            return (Criteria) this;
        }

        public Criteria andStatMarryBetween(String value1, String value2) {
            addCriterion("STAT_MARRY between", value1, value2, "statMarry");
            return (Criteria) this;
        }

        public Criteria andStatMarryNotBetween(String value1, String value2) {
            addCriterion("STAT_MARRY not between", value1, value2, "statMarry");
            return (Criteria) this;
        }

        public Criteria andStatJobIsNull() {
            addCriterion("STAT_JOB is null");
            return (Criteria) this;
        }

        public Criteria andStatJobIsNotNull() {
            addCriterion("STAT_JOB is not null");
            return (Criteria) this;
        }

        public Criteria andStatJobEqualTo(String value) {
            addCriterion("STAT_JOB =", value, "statJob");
            return (Criteria) this;
        }

        public Criteria andStatJobNotEqualTo(String value) {
            addCriterion("STAT_JOB <>", value, "statJob");
            return (Criteria) this;
        }

        public Criteria andStatJobGreaterThan(String value) {
            addCriterion("STAT_JOB >", value, "statJob");
            return (Criteria) this;
        }

        public Criteria andStatJobGreaterThanOrEqualTo(String value) {
            addCriterion("STAT_JOB >=", value, "statJob");
            return (Criteria) this;
        }

        public Criteria andStatJobLessThan(String value) {
            addCriterion("STAT_JOB <", value, "statJob");
            return (Criteria) this;
        }

        public Criteria andStatJobLessThanOrEqualTo(String value) {
            addCriterion("STAT_JOB <=", value, "statJob");
            return (Criteria) this;
        }

        public Criteria andStatJobLike(String value) {
            addCriterion("STAT_JOB like", value, "statJob");
            return (Criteria) this;
        }

        public Criteria andStatJobNotLike(String value) {
            addCriterion("STAT_JOB not like", value, "statJob");
            return (Criteria) this;
        }

        public Criteria andStatJobIn(List<String> values) {
            addCriterion("STAT_JOB in", values, "statJob");
            return (Criteria) this;
        }

        public Criteria andStatJobNotIn(List<String> values) {
            addCriterion("STAT_JOB not in", values, "statJob");
            return (Criteria) this;
        }

        public Criteria andStatJobBetween(String value1, String value2) {
            addCriterion("STAT_JOB between", value1, value2, "statJob");
            return (Criteria) this;
        }

        public Criteria andStatJobNotBetween(String value1, String value2) {
            addCriterion("STAT_JOB not between", value1, value2, "statJob");
            return (Criteria) this;
        }

        public Criteria andFlagRealIsNull() {
            addCriterion("FLAG_REAL is null");
            return (Criteria) this;
        }

        public Criteria andFlagRealIsNotNull() {
            addCriterion("FLAG_REAL is not null");
            return (Criteria) this;
        }

        public Criteria andFlagRealEqualTo(String value) {
            addCriterion("FLAG_REAL =", value, "flagReal");
            return (Criteria) this;
        }

        public Criteria andFlagRealNotEqualTo(String value) {
            addCriterion("FLAG_REAL <>", value, "flagReal");
            return (Criteria) this;
        }

        public Criteria andFlagRealGreaterThan(String value) {
            addCriterion("FLAG_REAL >", value, "flagReal");
            return (Criteria) this;
        }

        public Criteria andFlagRealGreaterThanOrEqualTo(String value) {
            addCriterion("FLAG_REAL >=", value, "flagReal");
            return (Criteria) this;
        }

        public Criteria andFlagRealLessThan(String value) {
            addCriterion("FLAG_REAL <", value, "flagReal");
            return (Criteria) this;
        }

        public Criteria andFlagRealLessThanOrEqualTo(String value) {
            addCriterion("FLAG_REAL <=", value, "flagReal");
            return (Criteria) this;
        }

        public Criteria andFlagRealLike(String value) {
            addCriterion("FLAG_REAL like", value, "flagReal");
            return (Criteria) this;
        }

        public Criteria andFlagRealNotLike(String value) {
            addCriterion("FLAG_REAL not like", value, "flagReal");
            return (Criteria) this;
        }

        public Criteria andFlagRealIn(List<String> values) {
            addCriterion("FLAG_REAL in", values, "flagReal");
            return (Criteria) this;
        }

        public Criteria andFlagRealNotIn(List<String> values) {
            addCriterion("FLAG_REAL not in", values, "flagReal");
            return (Criteria) this;
        }

        public Criteria andFlagRealBetween(String value1, String value2) {
            addCriterion("FLAG_REAL between", value1, value2, "flagReal");
            return (Criteria) this;
        }

        public Criteria andFlagRealNotBetween(String value1, String value2) {
            addCriterion("FLAG_REAL not between", value1, value2, "flagReal");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNull() {
            addCriterion("OPENID is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("OPENID is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("OPENID =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("OPENID <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("OPENID >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("OPENID >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("OPENID <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("OPENID <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("OPENID like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("OPENID not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("OPENID in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("OPENID not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("OPENID between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("OPENID not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("MEMO is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("MEMO =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("MEMO <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("MEMO >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("MEMO >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("MEMO <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("MEMO <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("MEMO like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("MEMO not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("MEMO in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("MEMO not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("MEMO between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("MEMO not between", value1, value2, "memo");
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