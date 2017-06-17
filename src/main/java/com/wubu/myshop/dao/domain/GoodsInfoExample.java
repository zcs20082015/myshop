package com.wubu.myshop.dao.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsInfoExample {
    protected String orderByClause;

    protected boolean distinct;
    
    protected int page=1;
    
    protected int pageSize=10;
    
    public int getStart() {
		return (page-1)*pageSize;
	}

	public void setPage(int page) {
		if(page<1){
			page=1;
		}
		this.page = page;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		if(pageSize<0){
			pageSize=0;
		}
		this.pageSize = pageSize;
	}

    protected List<Criteria> oredCriteria;

    public GoodsInfoExample() {
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

        public Criteria andOidGoodsIsNull() {
            addCriterion("oid_goods is null");
            return (Criteria) this;
        }

        public Criteria andOidGoodsIsNotNull() {
            addCriterion("oid_goods is not null");
            return (Criteria) this;
        }

        public Criteria andOidGoodsEqualTo(String value) {
            addCriterion("oid_goods =", value, "oidGoods");
            return (Criteria) this;
        }

        public Criteria andOidGoodsNotEqualTo(String value) {
            addCriterion("oid_goods <>", value, "oidGoods");
            return (Criteria) this;
        }

        public Criteria andOidGoodsGreaterThan(String value) {
            addCriterion("oid_goods >", value, "oidGoods");
            return (Criteria) this;
        }

        public Criteria andOidGoodsGreaterThanOrEqualTo(String value) {
            addCriterion("oid_goods >=", value, "oidGoods");
            return (Criteria) this;
        }

        public Criteria andOidGoodsLessThan(String value) {
            addCriterion("oid_goods <", value, "oidGoods");
            return (Criteria) this;
        }

        public Criteria andOidGoodsLessThanOrEqualTo(String value) {
            addCriterion("oid_goods <=", value, "oidGoods");
            return (Criteria) this;
        }

        public Criteria andOidGoodsLike(String value) {
            addCriterion("oid_goods like", value, "oidGoods");
            return (Criteria) this;
        }

        public Criteria andOidGoodsNotLike(String value) {
            addCriterion("oid_goods not like", value, "oidGoods");
            return (Criteria) this;
        }

        public Criteria andOidGoodsIn(List<String> values) {
            addCriterion("oid_goods in", values, "oidGoods");
            return (Criteria) this;
        }

        public Criteria andOidGoodsNotIn(List<String> values) {
            addCriterion("oid_goods not in", values, "oidGoods");
            return (Criteria) this;
        }

        public Criteria andOidGoodsBetween(String value1, String value2) {
            addCriterion("oid_goods between", value1, value2, "oidGoods");
            return (Criteria) this;
        }

        public Criteria andOidGoodsNotBetween(String value1, String value2) {
            addCriterion("oid_goods not between", value1, value2, "oidGoods");
            return (Criteria) this;
        }

        public Criteria andNameGoodsIsNull() {
            addCriterion("name_goods is null");
            return (Criteria) this;
        }

        public Criteria andNameGoodsIsNotNull() {
            addCriterion("name_goods is not null");
            return (Criteria) this;
        }

        public Criteria andNameGoodsEqualTo(String value) {
            addCriterion("name_goods =", value, "nameGoods");
            return (Criteria) this;
        }

        public Criteria andNameGoodsNotEqualTo(String value) {
            addCriterion("name_goods <>", value, "nameGoods");
            return (Criteria) this;
        }

        public Criteria andNameGoodsGreaterThan(String value) {
            addCriterion("name_goods >", value, "nameGoods");
            return (Criteria) this;
        }

        public Criteria andNameGoodsGreaterThanOrEqualTo(String value) {
            addCriterion("name_goods >=", value, "nameGoods");
            return (Criteria) this;
        }

        public Criteria andNameGoodsLessThan(String value) {
            addCriterion("name_goods <", value, "nameGoods");
            return (Criteria) this;
        }

        public Criteria andNameGoodsLessThanOrEqualTo(String value) {
            addCriterion("name_goods <=", value, "nameGoods");
            return (Criteria) this;
        }

        public Criteria andNameGoodsLike(String value) {
            addCriterion("name_goods like", value, "nameGoods");
            return (Criteria) this;
        }

        public Criteria andNameGoodsNotLike(String value) {
            addCriterion("name_goods not like", value, "nameGoods");
            return (Criteria) this;
        }

        public Criteria andNameGoodsIn(List<String> values) {
            addCriterion("name_goods in", values, "nameGoods");
            return (Criteria) this;
        }

        public Criteria andNameGoodsNotIn(List<String> values) {
            addCriterion("name_goods not in", values, "nameGoods");
            return (Criteria) this;
        }

        public Criteria andNameGoodsBetween(String value1, String value2) {
            addCriterion("name_goods between", value1, value2, "nameGoods");
            return (Criteria) this;
        }

        public Criteria andNameGoodsNotBetween(String value1, String value2) {
            addCriterion("name_goods not between", value1, value2, "nameGoods");
            return (Criteria) this;
        }

        public Criteria andCountGoodsIsNull() {
            addCriterion("count_goods is null");
            return (Criteria) this;
        }

        public Criteria andCountGoodsIsNotNull() {
            addCriterion("count_goods is not null");
            return (Criteria) this;
        }

        public Criteria andCountGoodsEqualTo(Integer value) {
            addCriterion("count_goods =", value, "countGoods");
            return (Criteria) this;
        }

        public Criteria andCountGoodsNotEqualTo(Integer value) {
            addCriterion("count_goods <>", value, "countGoods");
            return (Criteria) this;
        }

        public Criteria andCountGoodsGreaterThan(Integer value) {
            addCriterion("count_goods >", value, "countGoods");
            return (Criteria) this;
        }

        public Criteria andCountGoodsGreaterThanOrEqualTo(Integer value) {
            addCriterion("count_goods >=", value, "countGoods");
            return (Criteria) this;
        }

        public Criteria andCountGoodsLessThan(Integer value) {
            addCriterion("count_goods <", value, "countGoods");
            return (Criteria) this;
        }

        public Criteria andCountGoodsLessThanOrEqualTo(Integer value) {
            addCriterion("count_goods <=", value, "countGoods");
            return (Criteria) this;
        }

        public Criteria andCountGoodsIn(List<Integer> values) {
            addCriterion("count_goods in", values, "countGoods");
            return (Criteria) this;
        }

        public Criteria andCountGoodsNotIn(List<Integer> values) {
            addCriterion("count_goods not in", values, "countGoods");
            return (Criteria) this;
        }

        public Criteria andCountGoodsBetween(Integer value1, Integer value2) {
            addCriterion("count_goods between", value1, value2, "countGoods");
            return (Criteria) this;
        }

        public Criteria andCountGoodsNotBetween(Integer value1, Integer value2) {
            addCriterion("count_goods not between", value1, value2, "countGoods");
            return (Criteria) this;
        }

        public Criteria andPriceGoodsIsNull() {
            addCriterion("price_goods is null");
            return (Criteria) this;
        }

        public Criteria andPriceGoodsIsNotNull() {
            addCriterion("price_goods is not null");
            return (Criteria) this;
        }

        public Criteria andPriceGoodsEqualTo(String value) {
            addCriterion("price_goods =", value, "priceGoods");
            return (Criteria) this;
        }

        public Criteria andPriceGoodsNotEqualTo(String value) {
            addCriterion("price_goods <>", value, "priceGoods");
            return (Criteria) this;
        }

        public Criteria andPriceGoodsGreaterThan(String value) {
            addCriterion("price_goods >", value, "priceGoods");
            return (Criteria) this;
        }

        public Criteria andPriceGoodsGreaterThanOrEqualTo(String value) {
            addCriterion("price_goods >=", value, "priceGoods");
            return (Criteria) this;
        }

        public Criteria andPriceGoodsLessThan(String value) {
            addCriterion("price_goods <", value, "priceGoods");
            return (Criteria) this;
        }

        public Criteria andPriceGoodsLessThanOrEqualTo(String value) {
            addCriterion("price_goods <=", value, "priceGoods");
            return (Criteria) this;
        }

        public Criteria andPriceGoodsLike(String value) {
            addCriterion("price_goods like", value, "priceGoods");
            return (Criteria) this;
        }

        public Criteria andPriceGoodsNotLike(String value) {
            addCriterion("price_goods not like", value, "priceGoods");
            return (Criteria) this;
        }

        public Criteria andPriceGoodsIn(List<String> values) {
            addCriterion("price_goods in", values, "priceGoods");
            return (Criteria) this;
        }

        public Criteria andPriceGoodsNotIn(List<String> values) {
            addCriterion("price_goods not in", values, "priceGoods");
            return (Criteria) this;
        }

        public Criteria andPriceGoodsBetween(String value1, String value2) {
            addCriterion("price_goods between", value1, value2, "priceGoods");
            return (Criteria) this;
        }

        public Criteria andPriceGoodsNotBetween(String value1, String value2) {
            addCriterion("price_goods not between", value1, value2, "priceGoods");
            return (Criteria) this;
        }

        public Criteria andInfoGoodsIsNull() {
            addCriterion("info_goods is null");
            return (Criteria) this;
        }

        public Criteria andInfoGoodsIsNotNull() {
            addCriterion("info_goods is not null");
            return (Criteria) this;
        }

        public Criteria andInfoGoodsEqualTo(String value) {
            addCriterion("info_goods =", value, "infoGoods");
            return (Criteria) this;
        }

        public Criteria andInfoGoodsNotEqualTo(String value) {
            addCriterion("info_goods <>", value, "infoGoods");
            return (Criteria) this;
        }

        public Criteria andInfoGoodsGreaterThan(String value) {
            addCriterion("info_goods >", value, "infoGoods");
            return (Criteria) this;
        }

        public Criteria andInfoGoodsGreaterThanOrEqualTo(String value) {
            addCriterion("info_goods >=", value, "infoGoods");
            return (Criteria) this;
        }

        public Criteria andInfoGoodsLessThan(String value) {
            addCriterion("info_goods <", value, "infoGoods");
            return (Criteria) this;
        }

        public Criteria andInfoGoodsLessThanOrEqualTo(String value) {
            addCriterion("info_goods <=", value, "infoGoods");
            return (Criteria) this;
        }

        public Criteria andInfoGoodsLike(String value) {
            addCriterion("info_goods like", value, "infoGoods");
            return (Criteria) this;
        }

        public Criteria andInfoGoodsNotLike(String value) {
            addCriterion("info_goods not like", value, "infoGoods");
            return (Criteria) this;
        }

        public Criteria andInfoGoodsIn(List<String> values) {
            addCriterion("info_goods in", values, "infoGoods");
            return (Criteria) this;
        }

        public Criteria andInfoGoodsNotIn(List<String> values) {
            addCriterion("info_goods not in", values, "infoGoods");
            return (Criteria) this;
        }

        public Criteria andInfoGoodsBetween(String value1, String value2) {
            addCriterion("info_goods between", value1, value2, "infoGoods");
            return (Criteria) this;
        }

        public Criteria andInfoGoodsNotBetween(String value1, String value2) {
            addCriterion("info_goods not between", value1, value2, "infoGoods");
            return (Criteria) this;
        }

        public Criteria andImageGoodsIsNull() {
            addCriterion("image_goods is null");
            return (Criteria) this;
        }

        public Criteria andImageGoodsIsNotNull() {
            addCriterion("image_goods is not null");
            return (Criteria) this;
        }

        public Criteria andImageGoodsEqualTo(String value) {
            addCriterion("image_goods =", value, "imageGoods");
            return (Criteria) this;
        }

        public Criteria andImageGoodsNotEqualTo(String value) {
            addCriterion("image_goods <>", value, "imageGoods");
            return (Criteria) this;
        }

        public Criteria andImageGoodsGreaterThan(String value) {
            addCriterion("image_goods >", value, "imageGoods");
            return (Criteria) this;
        }

        public Criteria andImageGoodsGreaterThanOrEqualTo(String value) {
            addCriterion("image_goods >=", value, "imageGoods");
            return (Criteria) this;
        }

        public Criteria andImageGoodsLessThan(String value) {
            addCriterion("image_goods <", value, "imageGoods");
            return (Criteria) this;
        }

        public Criteria andImageGoodsLessThanOrEqualTo(String value) {
            addCriterion("image_goods <=", value, "imageGoods");
            return (Criteria) this;
        }

        public Criteria andImageGoodsLike(String value) {
            addCriterion("image_goods like", value, "imageGoods");
            return (Criteria) this;
        }

        public Criteria andImageGoodsNotLike(String value) {
            addCriterion("image_goods not like", value, "imageGoods");
            return (Criteria) this;
        }

        public Criteria andImageGoodsIn(List<String> values) {
            addCriterion("image_goods in", values, "imageGoods");
            return (Criteria) this;
        }

        public Criteria andImageGoodsNotIn(List<String> values) {
            addCriterion("image_goods not in", values, "imageGoods");
            return (Criteria) this;
        }

        public Criteria andImageGoodsBetween(String value1, String value2) {
            addCriterion("image_goods between", value1, value2, "imageGoods");
            return (Criteria) this;
        }

        public Criteria andImageGoodsNotBetween(String value1, String value2) {
            addCriterion("image_goods not between", value1, value2, "imageGoods");
            return (Criteria) this;
        }

        public Criteria andStatusGoodsIsNull() {
            addCriterion("status_goods is null");
            return (Criteria) this;
        }

        public Criteria andStatusGoodsIsNotNull() {
            addCriterion("status_goods is not null");
            return (Criteria) this;
        }

        public Criteria andStatusGoodsEqualTo(String value) {
            addCriterion("status_goods =", value, "statusGoods");
            return (Criteria) this;
        }

        public Criteria andStatusGoodsNotEqualTo(String value) {
            addCriterion("status_goods <>", value, "statusGoods");
            return (Criteria) this;
        }

        public Criteria andStatusGoodsGreaterThan(String value) {
            addCriterion("status_goods >", value, "statusGoods");
            return (Criteria) this;
        }

        public Criteria andStatusGoodsGreaterThanOrEqualTo(String value) {
            addCriterion("status_goods >=", value, "statusGoods");
            return (Criteria) this;
        }

        public Criteria andStatusGoodsLessThan(String value) {
            addCriterion("status_goods <", value, "statusGoods");
            return (Criteria) this;
        }

        public Criteria andStatusGoodsLessThanOrEqualTo(String value) {
            addCriterion("status_goods <=", value, "statusGoods");
            return (Criteria) this;
        }

        public Criteria andStatusGoodsLike(String value) {
            addCriterion("status_goods like", value, "statusGoods");
            return (Criteria) this;
        }

        public Criteria andStatusGoodsNotLike(String value) {
            addCriterion("status_goods not like", value, "statusGoods");
            return (Criteria) this;
        }

        public Criteria andStatusGoodsIn(List<String> values) {
            addCriterion("status_goods in", values, "statusGoods");
            return (Criteria) this;
        }

        public Criteria andStatusGoodsNotIn(List<String> values) {
            addCriterion("status_goods not in", values, "statusGoods");
            return (Criteria) this;
        }

        public Criteria andStatusGoodsBetween(String value1, String value2) {
            addCriterion("status_goods between", value1, value2, "statusGoods");
            return (Criteria) this;
        }

        public Criteria andStatusGoodsNotBetween(String value1, String value2) {
            addCriterion("status_goods not between", value1, value2, "statusGoods");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andDtCreateIsNull() {
            addCriterion("dt_create is null");
            return (Criteria) this;
        }

        public Criteria andDtCreateIsNotNull() {
            addCriterion("dt_create is not null");
            return (Criteria) this;
        }

        public Criteria andDtCreateEqualTo(Date value) {
            addCriterion("dt_create =", value, "dtCreate");
            return (Criteria) this;
        }

        public Criteria andDtCreateNotEqualTo(Date value) {
            addCriterion("dt_create <>", value, "dtCreate");
            return (Criteria) this;
        }

        public Criteria andDtCreateGreaterThan(Date value) {
            addCriterion("dt_create >", value, "dtCreate");
            return (Criteria) this;
        }

        public Criteria andDtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("dt_create >=", value, "dtCreate");
            return (Criteria) this;
        }

        public Criteria andDtCreateLessThan(Date value) {
            addCriterion("dt_create <", value, "dtCreate");
            return (Criteria) this;
        }

        public Criteria andDtCreateLessThanOrEqualTo(Date value) {
            addCriterion("dt_create <=", value, "dtCreate");
            return (Criteria) this;
        }

        public Criteria andDtCreateIn(List<Date> values) {
            addCriterion("dt_create in", values, "dtCreate");
            return (Criteria) this;
        }

        public Criteria andDtCreateNotIn(List<Date> values) {
            addCriterion("dt_create not in", values, "dtCreate");
            return (Criteria) this;
        }

        public Criteria andDtCreateBetween(Date value1, Date value2) {
            addCriterion("dt_create between", value1, value2, "dtCreate");
            return (Criteria) this;
        }

        public Criteria andDtCreateNotBetween(Date value1, Date value2) {
            addCriterion("dt_create not between", value1, value2, "dtCreate");
            return (Criteria) this;
        }

        public Criteria andDtUpdateIsNull() {
            addCriterion("dt_update is null");
            return (Criteria) this;
        }

        public Criteria andDtUpdateIsNotNull() {
            addCriterion("dt_update is not null");
            return (Criteria) this;
        }

        public Criteria andDtUpdateEqualTo(Date value) {
            addCriterion("dt_update =", value, "dtUpdate");
            return (Criteria) this;
        }

        public Criteria andDtUpdateNotEqualTo(Date value) {
            addCriterion("dt_update <>", value, "dtUpdate");
            return (Criteria) this;
        }

        public Criteria andDtUpdateGreaterThan(Date value) {
            addCriterion("dt_update >", value, "dtUpdate");
            return (Criteria) this;
        }

        public Criteria andDtUpdateGreaterThanOrEqualTo(Date value) {
            addCriterion("dt_update >=", value, "dtUpdate");
            return (Criteria) this;
        }

        public Criteria andDtUpdateLessThan(Date value) {
            addCriterion("dt_update <", value, "dtUpdate");
            return (Criteria) this;
        }

        public Criteria andDtUpdateLessThanOrEqualTo(Date value) {
            addCriterion("dt_update <=", value, "dtUpdate");
            return (Criteria) this;
        }

        public Criteria andDtUpdateIn(List<Date> values) {
            addCriterion("dt_update in", values, "dtUpdate");
            return (Criteria) this;
        }

        public Criteria andDtUpdateNotIn(List<Date> values) {
            addCriterion("dt_update not in", values, "dtUpdate");
            return (Criteria) this;
        }

        public Criteria andDtUpdateBetween(Date value1, Date value2) {
            addCriterion("dt_update between", value1, value2, "dtUpdate");
            return (Criteria) this;
        }

        public Criteria andDtUpdateNotBetween(Date value1, Date value2) {
            addCriterion("dt_update not between", value1, value2, "dtUpdate");
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