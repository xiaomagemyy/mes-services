package com.unilever.hefei.mes.basic.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LineInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LineInfoExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFactoryIsNull() {
            addCriterion("factory is null");
            return (Criteria) this;
        }

        public Criteria andFactoryIsNotNull() {
            addCriterion("factory is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryEqualTo(String value) {
            addCriterion("factory =", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryNotEqualTo(String value) {
            addCriterion("factory <>", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryGreaterThan(String value) {
            addCriterion("factory >", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryGreaterThanOrEqualTo(String value) {
            addCriterion("factory >=", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryLessThan(String value) {
            addCriterion("factory <", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryLessThanOrEqualTo(String value) {
            addCriterion("factory <=", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryLike(String value) {
            addCriterion("factory like", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryNotLike(String value) {
            addCriterion("factory not like", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryIn(List<String> values) {
            addCriterion("factory in", values, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryNotIn(List<String> values) {
            addCriterion("factory not in", values, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryBetween(String value1, String value2) {
            addCriterion("factory between", value1, value2, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryNotBetween(String value1, String value2) {
            addCriterion("factory not between", value1, value2, "factory");
            return (Criteria) this;
        }

        public Criteria andWorkshopIsNull() {
            addCriterion("workshop is null");
            return (Criteria) this;
        }

        public Criteria andWorkshopIsNotNull() {
            addCriterion("workshop is not null");
            return (Criteria) this;
        }

        public Criteria andWorkshopEqualTo(String value) {
            addCriterion("workshop =", value, "workshop");
            return (Criteria) this;
        }

        public Criteria andWorkshopNotEqualTo(String value) {
            addCriterion("workshop <>", value, "workshop");
            return (Criteria) this;
        }

        public Criteria andWorkshopGreaterThan(String value) {
            addCriterion("workshop >", value, "workshop");
            return (Criteria) this;
        }

        public Criteria andWorkshopGreaterThanOrEqualTo(String value) {
            addCriterion("workshop >=", value, "workshop");
            return (Criteria) this;
        }

        public Criteria andWorkshopLessThan(String value) {
            addCriterion("workshop <", value, "workshop");
            return (Criteria) this;
        }

        public Criteria andWorkshopLessThanOrEqualTo(String value) {
            addCriterion("workshop <=", value, "workshop");
            return (Criteria) this;
        }

        public Criteria andWorkshopLike(String value) {
            addCriterion("workshop like", value, "workshop");
            return (Criteria) this;
        }

        public Criteria andWorkshopNotLike(String value) {
            addCriterion("workshop not like", value, "workshop");
            return (Criteria) this;
        }

        public Criteria andWorkshopIn(List<String> values) {
            addCriterion("workshop in", values, "workshop");
            return (Criteria) this;
        }

        public Criteria andWorkshopNotIn(List<String> values) {
            addCriterion("workshop not in", values, "workshop");
            return (Criteria) this;
        }

        public Criteria andWorkshopBetween(String value1, String value2) {
            addCriterion("workshop between", value1, value2, "workshop");
            return (Criteria) this;
        }

        public Criteria andWorkshopNotBetween(String value1, String value2) {
            addCriterion("workshop not between", value1, value2, "workshop");
            return (Criteria) this;
        }

        public Criteria andProductionLineNumIsNull() {
            addCriterion("production_line_num is null");
            return (Criteria) this;
        }

        public Criteria andProductionLineNumIsNotNull() {
            addCriterion("production_line_num is not null");
            return (Criteria) this;
        }

        public Criteria andProductionLineNumEqualTo(String value) {
            addCriterion("production_line_num =", value, "productionLineNum");
            return (Criteria) this;
        }

        public Criteria andProductionLineNumNotEqualTo(String value) {
            addCriterion("production_line_num <>", value, "productionLineNum");
            return (Criteria) this;
        }

        public Criteria andProductionLineNumGreaterThan(String value) {
            addCriterion("production_line_num >", value, "productionLineNum");
            return (Criteria) this;
        }

        public Criteria andProductionLineNumGreaterThanOrEqualTo(String value) {
            addCriterion("production_line_num >=", value, "productionLineNum");
            return (Criteria) this;
        }

        public Criteria andProductionLineNumLessThan(String value) {
            addCriterion("production_line_num <", value, "productionLineNum");
            return (Criteria) this;
        }

        public Criteria andProductionLineNumLessThanOrEqualTo(String value) {
            addCriterion("production_line_num <=", value, "productionLineNum");
            return (Criteria) this;
        }

        public Criteria andProductionLineNumLike(String value) {
            addCriterion("production_line_num like", value, "productionLineNum");
            return (Criteria) this;
        }

        public Criteria andProductionLineNumNotLike(String value) {
            addCriterion("production_line_num not like", value, "productionLineNum");
            return (Criteria) this;
        }

        public Criteria andProductionLineNumIn(List<String> values) {
            addCriterion("production_line_num in", values, "productionLineNum");
            return (Criteria) this;
        }

        public Criteria andProductionLineNumNotIn(List<String> values) {
            addCriterion("production_line_num not in", values, "productionLineNum");
            return (Criteria) this;
        }

        public Criteria andProductionLineNumBetween(String value1, String value2) {
            addCriterion("production_line_num between", value1, value2, "productionLineNum");
            return (Criteria) this;
        }

        public Criteria andProductionLineNumNotBetween(String value1, String value2) {
            addCriterion("production_line_num not between", value1, value2, "productionLineNum");
            return (Criteria) this;
        }

        public Criteria andProductionLineNameIsNull() {
            addCriterion("production_line_name is null");
            return (Criteria) this;
        }

        public Criteria andProductionLineNameIsNotNull() {
            addCriterion("production_line_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductionLineNameEqualTo(String value) {
            addCriterion("production_line_name =", value, "productionLineName");
            return (Criteria) this;
        }

        public Criteria andProductionLineNameNotEqualTo(String value) {
            addCriterion("production_line_name <>", value, "productionLineName");
            return (Criteria) this;
        }

        public Criteria andProductionLineNameGreaterThan(String value) {
            addCriterion("production_line_name >", value, "productionLineName");
            return (Criteria) this;
        }

        public Criteria andProductionLineNameGreaterThanOrEqualTo(String value) {
            addCriterion("production_line_name >=", value, "productionLineName");
            return (Criteria) this;
        }

        public Criteria andProductionLineNameLessThan(String value) {
            addCriterion("production_line_name <", value, "productionLineName");
            return (Criteria) this;
        }

        public Criteria andProductionLineNameLessThanOrEqualTo(String value) {
            addCriterion("production_line_name <=", value, "productionLineName");
            return (Criteria) this;
        }

        public Criteria andProductionLineNameLike(String value) {
            addCriterion("production_line_name like", value, "productionLineName");
            return (Criteria) this;
        }

        public Criteria andProductionLineNameNotLike(String value) {
            addCriterion("production_line_name not like", value, "productionLineName");
            return (Criteria) this;
        }

        public Criteria andProductionLineNameIn(List<String> values) {
            addCriterion("production_line_name in", values, "productionLineName");
            return (Criteria) this;
        }

        public Criteria andProductionLineNameNotIn(List<String> values) {
            addCriterion("production_line_name not in", values, "productionLineName");
            return (Criteria) this;
        }

        public Criteria andProductionLineNameBetween(String value1, String value2) {
            addCriterion("production_line_name between", value1, value2, "productionLineName");
            return (Criteria) this;
        }

        public Criteria andProductionLineNameNotBetween(String value1, String value2) {
            addCriterion("production_line_name not between", value1, value2, "productionLineName");
            return (Criteria) this;
        }

        public Criteria andAmPictureNdIsNull() {
            addCriterion("am_picture_nd is null");
            return (Criteria) this;
        }

        public Criteria andAmPictureNdIsNotNull() {
            addCriterion("am_picture_nd is not null");
            return (Criteria) this;
        }

        public Criteria andAmPictureNdEqualTo(String value) {
            addCriterion("am_picture_nd =", value, "amPictureNd");
            return (Criteria) this;
        }

        public Criteria andAmPictureNdNotEqualTo(String value) {
            addCriterion("am_picture_nd <>", value, "amPictureNd");
            return (Criteria) this;
        }

        public Criteria andAmPictureNdGreaterThan(String value) {
            addCriterion("am_picture_nd >", value, "amPictureNd");
            return (Criteria) this;
        }

        public Criteria andAmPictureNdGreaterThanOrEqualTo(String value) {
            addCriterion("am_picture_nd >=", value, "amPictureNd");
            return (Criteria) this;
        }

        public Criteria andAmPictureNdLessThan(String value) {
            addCriterion("am_picture_nd <", value, "amPictureNd");
            return (Criteria) this;
        }

        public Criteria andAmPictureNdLessThanOrEqualTo(String value) {
            addCriterion("am_picture_nd <=", value, "amPictureNd");
            return (Criteria) this;
        }

        public Criteria andAmPictureNdLike(String value) {
            addCriterion("am_picture_nd like", value, "amPictureNd");
            return (Criteria) this;
        }

        public Criteria andAmPictureNdNotLike(String value) {
            addCriterion("am_picture_nd not like", value, "amPictureNd");
            return (Criteria) this;
        }

        public Criteria andAmPictureNdIn(List<String> values) {
            addCriterion("am_picture_nd in", values, "amPictureNd");
            return (Criteria) this;
        }

        public Criteria andAmPictureNdNotIn(List<String> values) {
            addCriterion("am_picture_nd not in", values, "amPictureNd");
            return (Criteria) this;
        }

        public Criteria andAmPictureNdBetween(String value1, String value2) {
            addCriterion("am_picture_nd between", value1, value2, "amPictureNd");
            return (Criteria) this;
        }

        public Criteria andAmPictureNdNotBetween(String value1, String value2) {
            addCriterion("am_picture_nd not between", value1, value2, "amPictureNd");
            return (Criteria) this;
        }

        public Criteria andAmPictureWdIsNull() {
            addCriterion("am_picture_wd is null");
            return (Criteria) this;
        }

        public Criteria andAmPictureWdIsNotNull() {
            addCriterion("am_picture_wd is not null");
            return (Criteria) this;
        }

        public Criteria andAmPictureWdEqualTo(String value) {
            addCriterion("am_picture_wd =", value, "amPictureWd");
            return (Criteria) this;
        }

        public Criteria andAmPictureWdNotEqualTo(String value) {
            addCriterion("am_picture_wd <>", value, "amPictureWd");
            return (Criteria) this;
        }

        public Criteria andAmPictureWdGreaterThan(String value) {
            addCriterion("am_picture_wd >", value, "amPictureWd");
            return (Criteria) this;
        }

        public Criteria andAmPictureWdGreaterThanOrEqualTo(String value) {
            addCriterion("am_picture_wd >=", value, "amPictureWd");
            return (Criteria) this;
        }

        public Criteria andAmPictureWdLessThan(String value) {
            addCriterion("am_picture_wd <", value, "amPictureWd");
            return (Criteria) this;
        }

        public Criteria andAmPictureWdLessThanOrEqualTo(String value) {
            addCriterion("am_picture_wd <=", value, "amPictureWd");
            return (Criteria) this;
        }

        public Criteria andAmPictureWdLike(String value) {
            addCriterion("am_picture_wd like", value, "amPictureWd");
            return (Criteria) this;
        }

        public Criteria andAmPictureWdNotLike(String value) {
            addCriterion("am_picture_wd not like", value, "amPictureWd");
            return (Criteria) this;
        }

        public Criteria andAmPictureWdIn(List<String> values) {
            addCriterion("am_picture_wd in", values, "amPictureWd");
            return (Criteria) this;
        }

        public Criteria andAmPictureWdNotIn(List<String> values) {
            addCriterion("am_picture_wd not in", values, "amPictureWd");
            return (Criteria) this;
        }

        public Criteria andAmPictureWdBetween(String value1, String value2) {
            addCriterion("am_picture_wd between", value1, value2, "amPictureWd");
            return (Criteria) this;
        }

        public Criteria andAmPictureWdNotBetween(String value1, String value2) {
            addCriterion("am_picture_wd not between", value1, value2, "amPictureWd");
            return (Criteria) this;
        }

        public Criteria andAmProportionWdIsNull() {
            addCriterion("am_proportion_wd is null");
            return (Criteria) this;
        }

        public Criteria andAmProportionWdIsNotNull() {
            addCriterion("am_proportion_wd is not null");
            return (Criteria) this;
        }

        public Criteria andAmProportionWdEqualTo(Double value) {
            addCriterion("am_proportion_wd =", value, "amProportionWd");
            return (Criteria) this;
        }

        public Criteria andAmProportionWdNotEqualTo(Double value) {
            addCriterion("am_proportion_wd <>", value, "amProportionWd");
            return (Criteria) this;
        }

        public Criteria andAmProportionWdGreaterThan(Double value) {
            addCriterion("am_proportion_wd >", value, "amProportionWd");
            return (Criteria) this;
        }

        public Criteria andAmProportionWdGreaterThanOrEqualTo(Double value) {
            addCriterion("am_proportion_wd >=", value, "amProportionWd");
            return (Criteria) this;
        }

        public Criteria andAmProportionWdLessThan(Double value) {
            addCriterion("am_proportion_wd <", value, "amProportionWd");
            return (Criteria) this;
        }

        public Criteria andAmProportionWdLessThanOrEqualTo(Double value) {
            addCriterion("am_proportion_wd <=", value, "amProportionWd");
            return (Criteria) this;
        }

        public Criteria andAmProportionWdIn(List<Double> values) {
            addCriterion("am_proportion_wd in", values, "amProportionWd");
            return (Criteria) this;
        }

        public Criteria andAmProportionWdNotIn(List<Double> values) {
            addCriterion("am_proportion_wd not in", values, "amProportionWd");
            return (Criteria) this;
        }

        public Criteria andAmProportionWdBetween(Double value1, Double value2) {
            addCriterion("am_proportion_wd between", value1, value2, "amProportionWd");
            return (Criteria) this;
        }

        public Criteria andAmProportionWdNotBetween(Double value1, Double value2) {
            addCriterion("am_proportion_wd not between", value1, value2, "amProportionWd");
            return (Criteria) this;
        }

        public Criteria andAmProportionNdIsNull() {
            addCriterion("am_proportion_nd is null");
            return (Criteria) this;
        }

        public Criteria andAmProportionNdIsNotNull() {
            addCriterion("am_proportion_nd is not null");
            return (Criteria) this;
        }

        public Criteria andAmProportionNdEqualTo(Double value) {
            addCriterion("am_proportion_nd =", value, "amProportionNd");
            return (Criteria) this;
        }

        public Criteria andAmProportionNdNotEqualTo(Double value) {
            addCriterion("am_proportion_nd <>", value, "amProportionNd");
            return (Criteria) this;
        }

        public Criteria andAmProportionNdGreaterThan(Double value) {
            addCriterion("am_proportion_nd >", value, "amProportionNd");
            return (Criteria) this;
        }

        public Criteria andAmProportionNdGreaterThanOrEqualTo(Double value) {
            addCriterion("am_proportion_nd >=", value, "amProportionNd");
            return (Criteria) this;
        }

        public Criteria andAmProportionNdLessThan(Double value) {
            addCriterion("am_proportion_nd <", value, "amProportionNd");
            return (Criteria) this;
        }

        public Criteria andAmProportionNdLessThanOrEqualTo(Double value) {
            addCriterion("am_proportion_nd <=", value, "amProportionNd");
            return (Criteria) this;
        }

        public Criteria andAmProportionNdIn(List<Double> values) {
            addCriterion("am_proportion_nd in", values, "amProportionNd");
            return (Criteria) this;
        }

        public Criteria andAmProportionNdNotIn(List<Double> values) {
            addCriterion("am_proportion_nd not in", values, "amProportionNd");
            return (Criteria) this;
        }

        public Criteria andAmProportionNdBetween(Double value1, Double value2) {
            addCriterion("am_proportion_nd between", value1, value2, "amProportionNd");
            return (Criteria) this;
        }

        public Criteria andAmProportionNdNotBetween(Double value1, Double value2) {
            addCriterion("am_proportion_nd not between", value1, value2, "amProportionNd");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andMakedateIsNull() {
            addCriterion("makedate is null");
            return (Criteria) this;
        }

        public Criteria andMakedateIsNotNull() {
            addCriterion("makedate is not null");
            return (Criteria) this;
        }

        public Criteria andMakedateEqualTo(Date value) {
            addCriterionForJDBCDate("makedate =", value, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("makedate <>", value, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateGreaterThan(Date value) {
            addCriterionForJDBCDate("makedate >", value, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("makedate >=", value, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateLessThan(Date value) {
            addCriterionForJDBCDate("makedate <", value, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("makedate <=", value, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateIn(List<Date> values) {
            addCriterionForJDBCDate("makedate in", values, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("makedate not in", values, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("makedate between", value1, value2, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("makedate not between", value1, value2, "makedate");
            return (Criteria) this;
        }

        public Criteria andMaketimeIsNull() {
            addCriterion("maketime is null");
            return (Criteria) this;
        }

        public Criteria andMaketimeIsNotNull() {
            addCriterion("maketime is not null");
            return (Criteria) this;
        }

        public Criteria andMaketimeEqualTo(Date value) {
            addCriterionForJDBCTime("maketime =", value, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("maketime <>", value, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeGreaterThan(Date value) {
            addCriterionForJDBCTime("maketime >", value, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("maketime >=", value, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeLessThan(Date value) {
            addCriterionForJDBCTime("maketime <", value, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("maketime <=", value, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeIn(List<Date> values) {
            addCriterionForJDBCTime("maketime in", values, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("maketime not in", values, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("maketime between", value1, value2, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("maketime not between", value1, value2, "maketime");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNull() {
            addCriterion("updatedate is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNotNull() {
            addCriterion("updatedate is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateEqualTo(Date value) {
            addCriterionForJDBCDate("updatedate =", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("updatedate <>", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThan(Date value) {
            addCriterionForJDBCDate("updatedate >", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("updatedate >=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThan(Date value) {
            addCriterionForJDBCDate("updatedate <", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("updatedate <=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIn(List<Date> values) {
            addCriterionForJDBCDate("updatedate in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("updatedate not in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("updatedate between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("updatedate not between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterionForJDBCTime("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterionForJDBCTime("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterionForJDBCTime("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterionForJDBCTime("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("updatetime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andPictureIsNull() {
            addCriterion("picture is null");
            return (Criteria) this;
        }

        public Criteria andPictureIsNotNull() {
            addCriterion("picture is not null");
            return (Criteria) this;
        }

        public Criteria andPictureEqualTo(String value) {
            addCriterion("picture =", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotEqualTo(String value) {
            addCriterion("picture <>", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThan(String value) {
            addCriterion("picture >", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThanOrEqualTo(String value) {
            addCriterion("picture >=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThan(String value) {
            addCriterion("picture <", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThanOrEqualTo(String value) {
            addCriterion("picture <=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLike(String value) {
            addCriterion("picture like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotLike(String value) {
            addCriterion("picture not like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureIn(List<String> values) {
            addCriterion("picture in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotIn(List<String> values) {
            addCriterion("picture not in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureBetween(String value1, String value2) {
            addCriterion("picture between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotBetween(String value1, String value2) {
            addCriterion("picture not between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andAbbreviationIsNull() {
            addCriterion("abbreviation is null");
            return (Criteria) this;
        }

        public Criteria andAbbreviationIsNotNull() {
            addCriterion("abbreviation is not null");
            return (Criteria) this;
        }

        public Criteria andAbbreviationEqualTo(String value) {
            addCriterion("abbreviation =", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationNotEqualTo(String value) {
            addCriterion("abbreviation <>", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationGreaterThan(String value) {
            addCriterion("abbreviation >", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationGreaterThanOrEqualTo(String value) {
            addCriterion("abbreviation >=", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationLessThan(String value) {
            addCriterion("abbreviation <", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationLessThanOrEqualTo(String value) {
            addCriterion("abbreviation <=", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationLike(String value) {
            addCriterion("abbreviation like", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationNotLike(String value) {
            addCriterion("abbreviation not like", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationIn(List<String> values) {
            addCriterion("abbreviation in", values, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationNotIn(List<String> values) {
            addCriterion("abbreviation not in", values, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationBetween(String value1, String value2) {
            addCriterion("abbreviation between", value1, value2, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationNotBetween(String value1, String value2) {
            addCriterion("abbreviation not between", value1, value2, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andSecuritymapImgIsNull() {
            addCriterion("securitymap_img is null");
            return (Criteria) this;
        }

        public Criteria andSecuritymapImgIsNotNull() {
            addCriterion("securitymap_img is not null");
            return (Criteria) this;
        }

        public Criteria andSecuritymapImgEqualTo(String value) {
            addCriterion("securitymap_img =", value, "securitymapImg");
            return (Criteria) this;
        }

        public Criteria andSecuritymapImgNotEqualTo(String value) {
            addCriterion("securitymap_img <>", value, "securitymapImg");
            return (Criteria) this;
        }

        public Criteria andSecuritymapImgGreaterThan(String value) {
            addCriterion("securitymap_img >", value, "securitymapImg");
            return (Criteria) this;
        }

        public Criteria andSecuritymapImgGreaterThanOrEqualTo(String value) {
            addCriterion("securitymap_img >=", value, "securitymapImg");
            return (Criteria) this;
        }

        public Criteria andSecuritymapImgLessThan(String value) {
            addCriterion("securitymap_img <", value, "securitymapImg");
            return (Criteria) this;
        }

        public Criteria andSecuritymapImgLessThanOrEqualTo(String value) {
            addCriterion("securitymap_img <=", value, "securitymapImg");
            return (Criteria) this;
        }

        public Criteria andSecuritymapImgLike(String value) {
            addCriterion("securitymap_img like", value, "securitymapImg");
            return (Criteria) this;
        }

        public Criteria andSecuritymapImgNotLike(String value) {
            addCriterion("securitymap_img not like", value, "securitymapImg");
            return (Criteria) this;
        }

        public Criteria andSecuritymapImgIn(List<String> values) {
            addCriterion("securitymap_img in", values, "securitymapImg");
            return (Criteria) this;
        }

        public Criteria andSecuritymapImgNotIn(List<String> values) {
            addCriterion("securitymap_img not in", values, "securitymapImg");
            return (Criteria) this;
        }

        public Criteria andSecuritymapImgBetween(String value1, String value2) {
            addCriterion("securitymap_img between", value1, value2, "securitymapImg");
            return (Criteria) this;
        }

        public Criteria andSecuritymapImgNotBetween(String value1, String value2) {
            addCriterion("securitymap_img not between", value1, value2, "securitymapImg");
            return (Criteria) this;
        }

        public Criteria andEventmapImgIsNull() {
            addCriterion("eventmap_img is null");
            return (Criteria) this;
        }

        public Criteria andEventmapImgIsNotNull() {
            addCriterion("eventmap_img is not null");
            return (Criteria) this;
        }

        public Criteria andEventmapImgEqualTo(String value) {
            addCriterion("eventmap_img =", value, "eventmapImg");
            return (Criteria) this;
        }

        public Criteria andEventmapImgNotEqualTo(String value) {
            addCriterion("eventmap_img <>", value, "eventmapImg");
            return (Criteria) this;
        }

        public Criteria andEventmapImgGreaterThan(String value) {
            addCriterion("eventmap_img >", value, "eventmapImg");
            return (Criteria) this;
        }

        public Criteria andEventmapImgGreaterThanOrEqualTo(String value) {
            addCriterion("eventmap_img >=", value, "eventmapImg");
            return (Criteria) this;
        }

        public Criteria andEventmapImgLessThan(String value) {
            addCriterion("eventmap_img <", value, "eventmapImg");
            return (Criteria) this;
        }

        public Criteria andEventmapImgLessThanOrEqualTo(String value) {
            addCriterion("eventmap_img <=", value, "eventmapImg");
            return (Criteria) this;
        }

        public Criteria andEventmapImgLike(String value) {
            addCriterion("eventmap_img like", value, "eventmapImg");
            return (Criteria) this;
        }

        public Criteria andEventmapImgNotLike(String value) {
            addCriterion("eventmap_img not like", value, "eventmapImg");
            return (Criteria) this;
        }

        public Criteria andEventmapImgIn(List<String> values) {
            addCriterion("eventmap_img in", values, "eventmapImg");
            return (Criteria) this;
        }

        public Criteria andEventmapImgNotIn(List<String> values) {
            addCriterion("eventmap_img not in", values, "eventmapImg");
            return (Criteria) this;
        }

        public Criteria andEventmapImgBetween(String value1, String value2) {
            addCriterion("eventmap_img between", value1, value2, "eventmapImg");
            return (Criteria) this;
        }

        public Criteria andEventmapImgNotBetween(String value1, String value2) {
            addCriterion("eventmap_img not between", value1, value2, "eventmapImg");
            return (Criteria) this;
        }

        public Criteria andBatchNumIsNull() {
            addCriterion("batch_num is null");
            return (Criteria) this;
        }

        public Criteria andBatchNumIsNotNull() {
            addCriterion("batch_num is not null");
            return (Criteria) this;
        }

        public Criteria andBatchNumEqualTo(String value) {
            addCriterion("batch_num =", value, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumNotEqualTo(String value) {
            addCriterion("batch_num <>", value, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumGreaterThan(String value) {
            addCriterion("batch_num >", value, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumGreaterThanOrEqualTo(String value) {
            addCriterion("batch_num >=", value, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumLessThan(String value) {
            addCriterion("batch_num <", value, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumLessThanOrEqualTo(String value) {
            addCriterion("batch_num <=", value, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumLike(String value) {
            addCriterion("batch_num like", value, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumNotLike(String value) {
            addCriterion("batch_num not like", value, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumIn(List<String> values) {
            addCriterion("batch_num in", values, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumNotIn(List<String> values) {
            addCriterion("batch_num not in", values, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumBetween(String value1, String value2) {
            addCriterion("batch_num between", value1, value2, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumNotBetween(String value1, String value2) {
            addCriterion("batch_num not between", value1, value2, "batchNum");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andPmStarttimeIsNull() {
            addCriterion("pm_starttime is null");
            return (Criteria) this;
        }

        public Criteria andPmStarttimeIsNotNull() {
            addCriterion("pm_starttime is not null");
            return (Criteria) this;
        }

        public Criteria andPmStarttimeEqualTo(Date value) {
            addCriterion("pm_starttime =", value, "pmStarttime");
            return (Criteria) this;
        }

        public Criteria andPmStarttimeNotEqualTo(Date value) {
            addCriterion("pm_starttime <>", value, "pmStarttime");
            return (Criteria) this;
        }

        public Criteria andPmStarttimeGreaterThan(Date value) {
            addCriterion("pm_starttime >", value, "pmStarttime");
            return (Criteria) this;
        }

        public Criteria andPmStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pm_starttime >=", value, "pmStarttime");
            return (Criteria) this;
        }

        public Criteria andPmStarttimeLessThan(Date value) {
            addCriterion("pm_starttime <", value, "pmStarttime");
            return (Criteria) this;
        }

        public Criteria andPmStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("pm_starttime <=", value, "pmStarttime");
            return (Criteria) this;
        }

        public Criteria andPmStarttimeIn(List<Date> values) {
            addCriterion("pm_starttime in", values, "pmStarttime");
            return (Criteria) this;
        }

        public Criteria andPmStarttimeNotIn(List<Date> values) {
            addCriterion("pm_starttime not in", values, "pmStarttime");
            return (Criteria) this;
        }

        public Criteria andPmStarttimeBetween(Date value1, Date value2) {
            addCriterion("pm_starttime between", value1, value2, "pmStarttime");
            return (Criteria) this;
        }

        public Criteria andPmStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("pm_starttime not between", value1, value2, "pmStarttime");
            return (Criteria) this;
        }

        public Criteria andPmTimeCountIsNull() {
            addCriterion("pm_time_count is null");
            return (Criteria) this;
        }

        public Criteria andPmTimeCountIsNotNull() {
            addCriterion("pm_time_count is not null");
            return (Criteria) this;
        }

        public Criteria andPmTimeCountEqualTo(Integer value) {
            addCriterion("pm_time_count =", value, "pmTimeCount");
            return (Criteria) this;
        }

        public Criteria andPmTimeCountNotEqualTo(Integer value) {
            addCriterion("pm_time_count <>", value, "pmTimeCount");
            return (Criteria) this;
        }

        public Criteria andPmTimeCountGreaterThan(Integer value) {
            addCriterion("pm_time_count >", value, "pmTimeCount");
            return (Criteria) this;
        }

        public Criteria andPmTimeCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("pm_time_count >=", value, "pmTimeCount");
            return (Criteria) this;
        }

        public Criteria andPmTimeCountLessThan(Integer value) {
            addCriterion("pm_time_count <", value, "pmTimeCount");
            return (Criteria) this;
        }

        public Criteria andPmTimeCountLessThanOrEqualTo(Integer value) {
            addCriterion("pm_time_count <=", value, "pmTimeCount");
            return (Criteria) this;
        }

        public Criteria andPmTimeCountIn(List<Integer> values) {
            addCriterion("pm_time_count in", values, "pmTimeCount");
            return (Criteria) this;
        }

        public Criteria andPmTimeCountNotIn(List<Integer> values) {
            addCriterion("pm_time_count not in", values, "pmTimeCount");
            return (Criteria) this;
        }

        public Criteria andPmTimeCountBetween(Integer value1, Integer value2) {
            addCriterion("pm_time_count between", value1, value2, "pmTimeCount");
            return (Criteria) this;
        }

        public Criteria andPmTimeCountNotBetween(Integer value1, Integer value2) {
            addCriterion("pm_time_count not between", value1, value2, "pmTimeCount");
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