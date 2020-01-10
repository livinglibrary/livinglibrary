package com.livinglibrary.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ForumpostExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table forumpost
	 * @mbg.generated  Thu May 03 08:06:12 CST 2018
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table forumpost
	 * @mbg.generated  Thu May 03 08:06:12 CST 2018
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table forumpost
	 * @mbg.generated  Thu May 03 08:06:12 CST 2018
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table forumpost
	 * @mbg.generated  Thu May 03 08:06:12 CST 2018
	 */
	public ForumpostExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table forumpost
	 * @mbg.generated  Thu May 03 08:06:12 CST 2018
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table forumpost
	 * @mbg.generated  Thu May 03 08:06:12 CST 2018
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table forumpost
	 * @mbg.generated  Thu May 03 08:06:12 CST 2018
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table forumpost
	 * @mbg.generated  Thu May 03 08:06:12 CST 2018
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table forumpost
	 * @mbg.generated  Thu May 03 08:06:12 CST 2018
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table forumpost
	 * @mbg.generated  Thu May 03 08:06:12 CST 2018
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table forumpost
	 * @mbg.generated  Thu May 03 08:06:12 CST 2018
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table forumpost
	 * @mbg.generated  Thu May 03 08:06:12 CST 2018
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table forumpost
	 * @mbg.generated  Thu May 03 08:06:12 CST 2018
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table forumpost
	 * @mbg.generated  Thu May 03 08:06:12 CST 2018
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table forumpost
	 * @mbg.generated  Thu May 03 08:06:12 CST 2018
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

		public Criteria andAuthorIsNull() {
			addCriterion("author is null");
			return (Criteria) this;
		}

		public Criteria andAuthorIsNotNull() {
			addCriterion("author is not null");
			return (Criteria) this;
		}

		public Criteria andAuthorEqualTo(Integer value) {
			addCriterion("author =", value, "author");
			return (Criteria) this;
		}

		public Criteria andAuthorNotEqualTo(Integer value) {
			addCriterion("author <>", value, "author");
			return (Criteria) this;
		}

		public Criteria andAuthorGreaterThan(Integer value) {
			addCriterion("author >", value, "author");
			return (Criteria) this;
		}

		public Criteria andAuthorGreaterThanOrEqualTo(Integer value) {
			addCriterion("author >=", value, "author");
			return (Criteria) this;
		}

		public Criteria andAuthorLessThan(Integer value) {
			addCriterion("author <", value, "author");
			return (Criteria) this;
		}

		public Criteria andAuthorLessThanOrEqualTo(Integer value) {
			addCriterion("author <=", value, "author");
			return (Criteria) this;
		}

		public Criteria andAuthorIn(List<Integer> values) {
			addCriterion("author in", values, "author");
			return (Criteria) this;
		}

		public Criteria andAuthorNotIn(List<Integer> values) {
			addCriterion("author not in", values, "author");
			return (Criteria) this;
		}

		public Criteria andAuthorBetween(Integer value1, Integer value2) {
			addCriterion("author between", value1, value2, "author");
			return (Criteria) this;
		}

		public Criteria andAuthorNotBetween(Integer value1, Integer value2) {
			addCriterion("author not between", value1, value2, "author");
			return (Criteria) this;
		}

		public Criteria andCategoryIsNull() {
			addCriterion("category is null");
			return (Criteria) this;
		}

		public Criteria andCategoryIsNotNull() {
			addCriterion("category is not null");
			return (Criteria) this;
		}

		public Criteria andCategoryEqualTo(Integer value) {
			addCriterion("category =", value, "category");
			return (Criteria) this;
		}

		public Criteria andCategoryNotEqualTo(Integer value) {
			addCriterion("category <>", value, "category");
			return (Criteria) this;
		}

		public Criteria andCategoryGreaterThan(Integer value) {
			addCriterion("category >", value, "category");
			return (Criteria) this;
		}

		public Criteria andCategoryGreaterThanOrEqualTo(Integer value) {
			addCriterion("category >=", value, "category");
			return (Criteria) this;
		}

		public Criteria andCategoryLessThan(Integer value) {
			addCriterion("category <", value, "category");
			return (Criteria) this;
		}

		public Criteria andCategoryLessThanOrEqualTo(Integer value) {
			addCriterion("category <=", value, "category");
			return (Criteria) this;
		}

		public Criteria andCategoryIn(List<Integer> values) {
			addCriterion("category in", values, "category");
			return (Criteria) this;
		}

		public Criteria andCategoryNotIn(List<Integer> values) {
			addCriterion("category not in", values, "category");
			return (Criteria) this;
		}

		public Criteria andCategoryBetween(Integer value1, Integer value2) {
			addCriterion("category between", value1, value2, "category");
			return (Criteria) this;
		}

		public Criteria andCategoryNotBetween(Integer value1, Integer value2) {
			addCriterion("category not between", value1, value2, "category");
			return (Criteria) this;
		}

		public Criteria andTitleIsNull() {
			addCriterion("title is null");
			return (Criteria) this;
		}

		public Criteria andTitleIsNotNull() {
			addCriterion("title is not null");
			return (Criteria) this;
		}

		public Criteria andTitleEqualTo(String value) {
			addCriterion("title =", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotEqualTo(String value) {
			addCriterion("title <>", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleGreaterThan(String value) {
			addCriterion("title >", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleGreaterThanOrEqualTo(String value) {
			addCriterion("title >=", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleLessThan(String value) {
			addCriterion("title <", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleLessThanOrEqualTo(String value) {
			addCriterion("title <=", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleLike(String value) {
			addCriterion("title like", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotLike(String value) {
			addCriterion("title not like", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleIn(List<String> values) {
			addCriterion("title in", values, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotIn(List<String> values) {
			addCriterion("title not in", values, "title");
			return (Criteria) this;
		}

		public Criteria andTitleBetween(String value1, String value2) {
			addCriterion("title between", value1, value2, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotBetween(String value1, String value2) {
			addCriterion("title not between", value1, value2, "title");
			return (Criteria) this;
		}

		public Criteria andSummaryIsNull() {
			addCriterion("summary is null");
			return (Criteria) this;
		}

		public Criteria andSummaryIsNotNull() {
			addCriterion("summary is not null");
			return (Criteria) this;
		}

		public Criteria andSummaryEqualTo(String value) {
			addCriterion("summary =", value, "summary");
			return (Criteria) this;
		}

		public Criteria andSummaryNotEqualTo(String value) {
			addCriterion("summary <>", value, "summary");
			return (Criteria) this;
		}

		public Criteria andSummaryGreaterThan(String value) {
			addCriterion("summary >", value, "summary");
			return (Criteria) this;
		}

		public Criteria andSummaryGreaterThanOrEqualTo(String value) {
			addCriterion("summary >=", value, "summary");
			return (Criteria) this;
		}

		public Criteria andSummaryLessThan(String value) {
			addCriterion("summary <", value, "summary");
			return (Criteria) this;
		}

		public Criteria andSummaryLessThanOrEqualTo(String value) {
			addCriterion("summary <=", value, "summary");
			return (Criteria) this;
		}

		public Criteria andSummaryLike(String value) {
			addCriterion("summary like", value, "summary");
			return (Criteria) this;
		}

		public Criteria andSummaryNotLike(String value) {
			addCriterion("summary not like", value, "summary");
			return (Criteria) this;
		}

		public Criteria andSummaryIn(List<String> values) {
			addCriterion("summary in", values, "summary");
			return (Criteria) this;
		}

		public Criteria andSummaryNotIn(List<String> values) {
			addCriterion("summary not in", values, "summary");
			return (Criteria) this;
		}

		public Criteria andSummaryBetween(String value1, String value2) {
			addCriterion("summary between", value1, value2, "summary");
			return (Criteria) this;
		}

		public Criteria andSummaryNotBetween(String value1, String value2) {
			addCriterion("summary not between", value1, value2, "summary");
			return (Criteria) this;
		}

		public Criteria andLooknumIsNull() {
			addCriterion("looknum is null");
			return (Criteria) this;
		}

		public Criteria andLooknumIsNotNull() {
			addCriterion("looknum is not null");
			return (Criteria) this;
		}

		public Criteria andLooknumEqualTo(Integer value) {
			addCriterion("looknum =", value, "looknum");
			return (Criteria) this;
		}

		public Criteria andLooknumNotEqualTo(Integer value) {
			addCriterion("looknum <>", value, "looknum");
			return (Criteria) this;
		}

		public Criteria andLooknumGreaterThan(Integer value) {
			addCriterion("looknum >", value, "looknum");
			return (Criteria) this;
		}

		public Criteria andLooknumGreaterThanOrEqualTo(Integer value) {
			addCriterion("looknum >=", value, "looknum");
			return (Criteria) this;
		}

		public Criteria andLooknumLessThan(Integer value) {
			addCriterion("looknum <", value, "looknum");
			return (Criteria) this;
		}

		public Criteria andLooknumLessThanOrEqualTo(Integer value) {
			addCriterion("looknum <=", value, "looknum");
			return (Criteria) this;
		}

		public Criteria andLooknumIn(List<Integer> values) {
			addCriterion("looknum in", values, "looknum");
			return (Criteria) this;
		}

		public Criteria andLooknumNotIn(List<Integer> values) {
			addCriterion("looknum not in", values, "looknum");
			return (Criteria) this;
		}

		public Criteria andLooknumBetween(Integer value1, Integer value2) {
			addCriterion("looknum between", value1, value2, "looknum");
			return (Criteria) this;
		}

		public Criteria andLooknumNotBetween(Integer value1, Integer value2) {
			addCriterion("looknum not between", value1, value2, "looknum");
			return (Criteria) this;
		}

		public Criteria andCommentnumIsNull() {
			addCriterion("commentnum is null");
			return (Criteria) this;
		}

		public Criteria andCommentnumIsNotNull() {
			addCriterion("commentnum is not null");
			return (Criteria) this;
		}

		public Criteria andCommentnumEqualTo(Integer value) {
			addCriterion("commentnum =", value, "commentnum");
			return (Criteria) this;
		}

		public Criteria andCommentnumNotEqualTo(Integer value) {
			addCriterion("commentnum <>", value, "commentnum");
			return (Criteria) this;
		}

		public Criteria andCommentnumGreaterThan(Integer value) {
			addCriterion("commentnum >", value, "commentnum");
			return (Criteria) this;
		}

		public Criteria andCommentnumGreaterThanOrEqualTo(Integer value) {
			addCriterion("commentnum >=", value, "commentnum");
			return (Criteria) this;
		}

		public Criteria andCommentnumLessThan(Integer value) {
			addCriterion("commentnum <", value, "commentnum");
			return (Criteria) this;
		}

		public Criteria andCommentnumLessThanOrEqualTo(Integer value) {
			addCriterion("commentnum <=", value, "commentnum");
			return (Criteria) this;
		}

		public Criteria andCommentnumIn(List<Integer> values) {
			addCriterion("commentnum in", values, "commentnum");
			return (Criteria) this;
		}

		public Criteria andCommentnumNotIn(List<Integer> values) {
			addCriterion("commentnum not in", values, "commentnum");
			return (Criteria) this;
		}

		public Criteria andCommentnumBetween(Integer value1, Integer value2) {
			addCriterion("commentnum between", value1, value2, "commentnum");
			return (Criteria) this;
		}

		public Criteria andCommentnumNotBetween(Integer value1, Integer value2) {
			addCriterion("commentnum not between", value1, value2, "commentnum");
			return (Criteria) this;
		}

		public Criteria andFollownumIsNull() {
			addCriterion("follownum is null");
			return (Criteria) this;
		}

		public Criteria andFollownumIsNotNull() {
			addCriterion("follownum is not null");
			return (Criteria) this;
		}

		public Criteria andFollownumEqualTo(Integer value) {
			addCriterion("follownum =", value, "follownum");
			return (Criteria) this;
		}

		public Criteria andFollownumNotEqualTo(Integer value) {
			addCriterion("follownum <>", value, "follownum");
			return (Criteria) this;
		}

		public Criteria andFollownumGreaterThan(Integer value) {
			addCriterion("follownum >", value, "follownum");
			return (Criteria) this;
		}

		public Criteria andFollownumGreaterThanOrEqualTo(Integer value) {
			addCriterion("follownum >=", value, "follownum");
			return (Criteria) this;
		}

		public Criteria andFollownumLessThan(Integer value) {
			addCriterion("follownum <", value, "follownum");
			return (Criteria) this;
		}

		public Criteria andFollownumLessThanOrEqualTo(Integer value) {
			addCriterion("follownum <=", value, "follownum");
			return (Criteria) this;
		}

		public Criteria andFollownumIn(List<Integer> values) {
			addCriterion("follownum in", values, "follownum");
			return (Criteria) this;
		}

		public Criteria andFollownumNotIn(List<Integer> values) {
			addCriterion("follownum not in", values, "follownum");
			return (Criteria) this;
		}

		public Criteria andFollownumBetween(Integer value1, Integer value2) {
			addCriterion("follownum between", value1, value2, "follownum");
			return (Criteria) this;
		}

		public Criteria andFollownumNotBetween(Integer value1, Integer value2) {
			addCriterion("follownum not between", value1, value2, "follownum");
			return (Criteria) this;
		}

		public Criteria andStatusIsNull() {
			addCriterion("status is null");
			return (Criteria) this;
		}

		public Criteria andStatusIsNotNull() {
			addCriterion("status is not null");
			return (Criteria) this;
		}

		public Criteria andStatusEqualTo(Integer value) {
			addCriterion("status =", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotEqualTo(Integer value) {
			addCriterion("status <>", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThan(Integer value) {
			addCriterion("status >", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
			addCriterion("status >=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThan(Integer value) {
			addCriterion("status <", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThanOrEqualTo(Integer value) {
			addCriterion("status <=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusIn(List<Integer> values) {
			addCriterion("status in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotIn(List<Integer> values) {
			addCriterion("status not in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusBetween(Integer value1, Integer value2) {
			addCriterion("status between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotBetween(Integer value1, Integer value2) {
			addCriterion("status not between", value1, value2, "status");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table forumpost
	 * @mbg.generated  Thu May 03 08:06:12 CST 2018
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
     * This class corresponds to the database table forumpost
     *
     * @mbg.generated do_not_delete_during_merge Tue Apr 24 08:07:21 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}