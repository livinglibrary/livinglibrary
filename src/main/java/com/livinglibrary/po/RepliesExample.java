package com.livinglibrary.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RepliesExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table replies
	 * @mbg.generated  Sat Jan 12 10:57:32 CST 2019
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table replies
	 * @mbg.generated  Sat Jan 12 10:57:32 CST 2019
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table replies
	 * @mbg.generated  Sat Jan 12 10:57:32 CST 2019
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table replies
	 * @mbg.generated  Sat Jan 12 10:57:32 CST 2019
	 */
	public RepliesExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table replies
	 * @mbg.generated  Sat Jan 12 10:57:32 CST 2019
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table replies
	 * @mbg.generated  Sat Jan 12 10:57:32 CST 2019
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table replies
	 * @mbg.generated  Sat Jan 12 10:57:32 CST 2019
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table replies
	 * @mbg.generated  Sat Jan 12 10:57:32 CST 2019
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table replies
	 * @mbg.generated  Sat Jan 12 10:57:32 CST 2019
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table replies
	 * @mbg.generated  Sat Jan 12 10:57:32 CST 2019
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table replies
	 * @mbg.generated  Sat Jan 12 10:57:32 CST 2019
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table replies
	 * @mbg.generated  Sat Jan 12 10:57:32 CST 2019
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table replies
	 * @mbg.generated  Sat Jan 12 10:57:32 CST 2019
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table replies
	 * @mbg.generated  Sat Jan 12 10:57:32 CST 2019
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table replies
	 * @mbg.generated  Sat Jan 12 10:57:32 CST 2019
	 */
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

		public Criteria andRidIsNull() {
			addCriterion("rid is null");
			return (Criteria) this;
		}

		public Criteria andRidIsNotNull() {
			addCriterion("rid is not null");
			return (Criteria) this;
		}

		public Criteria andRidEqualTo(Integer value) {
			addCriterion("rid =", value, "rid");
			return (Criteria) this;
		}

		public Criteria andRidNotEqualTo(Integer value) {
			addCriterion("rid <>", value, "rid");
			return (Criteria) this;
		}

		public Criteria andRidGreaterThan(Integer value) {
			addCriterion("rid >", value, "rid");
			return (Criteria) this;
		}

		public Criteria andRidGreaterThanOrEqualTo(Integer value) {
			addCriterion("rid >=", value, "rid");
			return (Criteria) this;
		}

		public Criteria andRidLessThan(Integer value) {
			addCriterion("rid <", value, "rid");
			return (Criteria) this;
		}

		public Criteria andRidLessThanOrEqualTo(Integer value) {
			addCriterion("rid <=", value, "rid");
			return (Criteria) this;
		}

		public Criteria andRidIn(List<Integer> values) {
			addCriterion("rid in", values, "rid");
			return (Criteria) this;
		}

		public Criteria andRidNotIn(List<Integer> values) {
			addCriterion("rid not in", values, "rid");
			return (Criteria) this;
		}

		public Criteria andRidBetween(Integer value1, Integer value2) {
			addCriterion("rid between", value1, value2, "rid");
			return (Criteria) this;
		}

		public Criteria andRidNotBetween(Integer value1, Integer value2) {
			addCriterion("rid not between", value1, value2, "rid");
			return (Criteria) this;
		}

		public Criteria andTidIsNull() {
			addCriterion("tid is null");
			return (Criteria) this;
		}

		public Criteria andTidIsNotNull() {
			addCriterion("tid is not null");
			return (Criteria) this;
		}

		public Criteria andTidEqualTo(String value) {
			addCriterion("tid =", value, "tid");
			return (Criteria) this;
		}

		public Criteria andTidNotEqualTo(String value) {
			addCriterion("tid <>", value, "tid");
			return (Criteria) this;
		}

		public Criteria andTidGreaterThan(String value) {
			addCriterion("tid >", value, "tid");
			return (Criteria) this;
		}

		public Criteria andTidGreaterThanOrEqualTo(String value) {
			addCriterion("tid >=", value, "tid");
			return (Criteria) this;
		}

		public Criteria andTidLessThan(String value) {
			addCriterion("tid <", value, "tid");
			return (Criteria) this;
		}

		public Criteria andTidLessThanOrEqualTo(String value) {
			addCriterion("tid <=", value, "tid");
			return (Criteria) this;
		}

		public Criteria andTidLike(String value) {
			addCriterion("tid like", value, "tid");
			return (Criteria) this;
		}

		public Criteria andTidNotLike(String value) {
			addCriterion("tid not like", value, "tid");
			return (Criteria) this;
		}

		public Criteria andTidIn(List<String> values) {
			addCriterion("tid in", values, "tid");
			return (Criteria) this;
		}

		public Criteria andTidNotIn(List<String> values) {
			addCriterion("tid not in", values, "tid");
			return (Criteria) this;
		}

		public Criteria andTidBetween(String value1, String value2) {
			addCriterion("tid between", value1, value2, "tid");
			return (Criteria) this;
		}

		public Criteria andTidNotBetween(String value1, String value2) {
			addCriterion("tid not between", value1, value2, "tid");
			return (Criteria) this;
		}

		public Criteria andStuidIsNull() {
			addCriterion("stuid is null");
			return (Criteria) this;
		}

		public Criteria andStuidIsNotNull() {
			addCriterion("stuid is not null");
			return (Criteria) this;
		}

		public Criteria andStuidEqualTo(String value) {
			addCriterion("stuid =", value, "stuid");
			return (Criteria) this;
		}

		public Criteria andStuidNotEqualTo(String value) {
			addCriterion("stuid <>", value, "stuid");
			return (Criteria) this;
		}

		public Criteria andStuidGreaterThan(String value) {
			addCriterion("stuid >", value, "stuid");
			return (Criteria) this;
		}

		public Criteria andStuidGreaterThanOrEqualTo(String value) {
			addCriterion("stuid >=", value, "stuid");
			return (Criteria) this;
		}

		public Criteria andStuidLessThan(String value) {
			addCriterion("stuid <", value, "stuid");
			return (Criteria) this;
		}

		public Criteria andStuidLessThanOrEqualTo(String value) {
			addCriterion("stuid <=", value, "stuid");
			return (Criteria) this;
		}

		public Criteria andStuidLike(String value) {
			addCriterion("stuid like", value, "stuid");
			return (Criteria) this;
		}

		public Criteria andStuidNotLike(String value) {
			addCriterion("stuid not like", value, "stuid");
			return (Criteria) this;
		}

		public Criteria andStuidIn(List<String> values) {
			addCriterion("stuid in", values, "stuid");
			return (Criteria) this;
		}

		public Criteria andStuidNotIn(List<String> values) {
			addCriterion("stuid not in", values, "stuid");
			return (Criteria) this;
		}

		public Criteria andStuidBetween(String value1, String value2) {
			addCriterion("stuid between", value1, value2, "stuid");
			return (Criteria) this;
		}

		public Criteria andStuidNotBetween(String value1, String value2) {
			addCriterion("stuid not between", value1, value2, "stuid");
			return (Criteria) this;
		}

		public Criteria andPostidIsNull() {
			addCriterion("postid is null");
			return (Criteria) this;
		}

		public Criteria andPostidIsNotNull() {
			addCriterion("postid is not null");
			return (Criteria) this;
		}

		public Criteria andPostidEqualTo(Integer value) {
			addCriterion("postid =", value, "postid");
			return (Criteria) this;
		}

		public Criteria andPostidNotEqualTo(Integer value) {
			addCriterion("postid <>", value, "postid");
			return (Criteria) this;
		}

		public Criteria andPostidGreaterThan(Integer value) {
			addCriterion("postid >", value, "postid");
			return (Criteria) this;
		}

		public Criteria andPostidGreaterThanOrEqualTo(Integer value) {
			addCriterion("postid >=", value, "postid");
			return (Criteria) this;
		}

		public Criteria andPostidLessThan(Integer value) {
			addCriterion("postid <", value, "postid");
			return (Criteria) this;
		}

		public Criteria andPostidLessThanOrEqualTo(Integer value) {
			addCriterion("postid <=", value, "postid");
			return (Criteria) this;
		}

		public Criteria andPostidIn(List<Integer> values) {
			addCriterion("postid in", values, "postid");
			return (Criteria) this;
		}

		public Criteria andPostidNotIn(List<Integer> values) {
			addCriterion("postid not in", values, "postid");
			return (Criteria) this;
		}

		public Criteria andPostidBetween(Integer value1, Integer value2) {
			addCriterion("postid between", value1, value2, "postid");
			return (Criteria) this;
		}

		public Criteria andPostidNotBetween(Integer value1, Integer value2) {
			addCriterion("postid not between", value1, value2, "postid");
			return (Criteria) this;
		}

		public Criteria andTimeIsNull() {
			addCriterion("time is null");
			return (Criteria) this;
		}

		public Criteria andTimeIsNotNull() {
			addCriterion("time is not null");
			return (Criteria) this;
		}

		public Criteria andTimeEqualTo(Date value) {
			addCriterion("time =", value, "time");
			return (Criteria) this;
		}

		public Criteria andTimeNotEqualTo(Date value) {
			addCriterion("time <>", value, "time");
			return (Criteria) this;
		}

		public Criteria andTimeGreaterThan(Date value) {
			addCriterion("time >", value, "time");
			return (Criteria) this;
		}

		public Criteria andTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("time >=", value, "time");
			return (Criteria) this;
		}

		public Criteria andTimeLessThan(Date value) {
			addCriterion("time <", value, "time");
			return (Criteria) this;
		}

		public Criteria andTimeLessThanOrEqualTo(Date value) {
			addCriterion("time <=", value, "time");
			return (Criteria) this;
		}

		public Criteria andTimeIn(List<Date> values) {
			addCriterion("time in", values, "time");
			return (Criteria) this;
		}

		public Criteria andTimeNotIn(List<Date> values) {
			addCriterion("time not in", values, "time");
			return (Criteria) this;
		}

		public Criteria andTimeBetween(Date value1, Date value2) {
			addCriterion("time between", value1, value2, "time");
			return (Criteria) this;
		}

		public Criteria andTimeNotBetween(Date value1, Date value2) {
			addCriterion("time not between", value1, value2, "time");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table replies
	 * @mbg.generated  Sat Jan 12 10:57:32 CST 2019
	 */
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table replies
     *
     * @mbg.generated do_not_delete_during_merge Wed Apr 11 19:49:21 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}