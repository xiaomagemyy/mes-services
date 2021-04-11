package com.unilever.hefei.mes.order.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MspDailyPlanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MspDailyPlanExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andLineNumIsNull() {
            addCriterion("line_num is null");
            return (Criteria) this;
        }

        public Criteria andLineNumIsNotNull() {
            addCriterion("line_num is not null");
            return (Criteria) this;
        }

        public Criteria andLineNumEqualTo(String value) {
            addCriterion("line_num =", value, "lineNum");
            return (Criteria) this;
        }

        public Criteria andLineNumNotEqualTo(String value) {
            addCriterion("line_num <>", value, "lineNum");
            return (Criteria) this;
        }

        public Criteria andLineNumGreaterThan(String value) {
            addCriterion("line_num >", value, "lineNum");
            return (Criteria) this;
        }

        public Criteria andLineNumGreaterThanOrEqualTo(String value) {
            addCriterion("line_num >=", value, "lineNum");
            return (Criteria) this;
        }

        public Criteria andLineNumLessThan(String value) {
            addCriterion("line_num <", value, "lineNum");
            return (Criteria) this;
        }

        public Criteria andLineNumLessThanOrEqualTo(String value) {
            addCriterion("line_num <=", value, "lineNum");
            return (Criteria) this;
        }

        public Criteria andLineNumLike(String value) {
            addCriterion("line_num like", value, "lineNum");
            return (Criteria) this;
        }

        public Criteria andLineNumNotLike(String value) {
            addCriterion("line_num not like", value, "lineNum");
            return (Criteria) this;
        }

        public Criteria andLineNumIn(List<String> values) {
            addCriterion("line_num in", values, "lineNum");
            return (Criteria) this;
        }

        public Criteria andLineNumNotIn(List<String> values) {
            addCriterion("line_num not in", values, "lineNum");
            return (Criteria) this;
        }

        public Criteria andLineNumBetween(String value1, String value2) {
            addCriterion("line_num between", value1, value2, "lineNum");
            return (Criteria) this;
        }

        public Criteria andLineNumNotBetween(String value1, String value2) {
            addCriterion("line_num not between", value1, value2, "lineNum");
            return (Criteria) this;
        }

        public Criteria andActualProduceOrderIsNull() {
            addCriterion("actual_produce_order is null");
            return (Criteria) this;
        }

        public Criteria andActualProduceOrderIsNotNull() {
            addCriterion("actual_produce_order is not null");
            return (Criteria) this;
        }

        public Criteria andActualProduceOrderEqualTo(Integer value) {
            addCriterion("actual_produce_order =", value, "actualProduceOrder");
            return (Criteria) this;
        }

        public Criteria andActualProduceOrderNotEqualTo(Integer value) {
            addCriterion("actual_produce_order <>", value, "actualProduceOrder");
            return (Criteria) this;
        }

        public Criteria andActualProduceOrderGreaterThan(Integer value) {
            addCriterion("actual_produce_order >", value, "actualProduceOrder");
            return (Criteria) this;
        }

        public Criteria andActualProduceOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("actual_produce_order >=", value, "actualProduceOrder");
            return (Criteria) this;
        }

        public Criteria andActualProduceOrderLessThan(Integer value) {
            addCriterion("actual_produce_order <", value, "actualProduceOrder");
            return (Criteria) this;
        }

        public Criteria andActualProduceOrderLessThanOrEqualTo(Integer value) {
            addCriterion("actual_produce_order <=", value, "actualProduceOrder");
            return (Criteria) this;
        }

        public Criteria andActualProduceOrderIn(List<Integer> values) {
            addCriterion("actual_produce_order in", values, "actualProduceOrder");
            return (Criteria) this;
        }

        public Criteria andActualProduceOrderNotIn(List<Integer> values) {
            addCriterion("actual_produce_order not in", values, "actualProduceOrder");
            return (Criteria) this;
        }

        public Criteria andActualProduceOrderBetween(Integer value1, Integer value2) {
            addCriterion("actual_produce_order between", value1, value2, "actualProduceOrder");
            return (Criteria) this;
        }

        public Criteria andActualProduceOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("actual_produce_order not between", value1, value2, "actualProduceOrder");
            return (Criteria) this;
        }

        public Criteria andAutoCleaningStatusIsNull() {
            addCriterion("auto_cleaning_status is null");
            return (Criteria) this;
        }

        public Criteria andAutoCleaningStatusIsNotNull() {
            addCriterion("auto_cleaning_status is not null");
            return (Criteria) this;
        }

        public Criteria andAutoCleaningStatusEqualTo(String value) {
            addCriterion("auto_cleaning_status =", value, "autoCleaningStatus");
            return (Criteria) this;
        }

        public Criteria andAutoCleaningStatusNotEqualTo(String value) {
            addCriterion("auto_cleaning_status <>", value, "autoCleaningStatus");
            return (Criteria) this;
        }

        public Criteria andAutoCleaningStatusGreaterThan(String value) {
            addCriterion("auto_cleaning_status >", value, "autoCleaningStatus");
            return (Criteria) this;
        }

        public Criteria andAutoCleaningStatusGreaterThanOrEqualTo(String value) {
            addCriterion("auto_cleaning_status >=", value, "autoCleaningStatus");
            return (Criteria) this;
        }

        public Criteria andAutoCleaningStatusLessThan(String value) {
            addCriterion("auto_cleaning_status <", value, "autoCleaningStatus");
            return (Criteria) this;
        }

        public Criteria andAutoCleaningStatusLessThanOrEqualTo(String value) {
            addCriterion("auto_cleaning_status <=", value, "autoCleaningStatus");
            return (Criteria) this;
        }

        public Criteria andAutoCleaningStatusLike(String value) {
            addCriterion("auto_cleaning_status like", value, "autoCleaningStatus");
            return (Criteria) this;
        }

        public Criteria andAutoCleaningStatusNotLike(String value) {
            addCriterion("auto_cleaning_status not like", value, "autoCleaningStatus");
            return (Criteria) this;
        }

        public Criteria andAutoCleaningStatusIn(List<String> values) {
            addCriterion("auto_cleaning_status in", values, "autoCleaningStatus");
            return (Criteria) this;
        }

        public Criteria andAutoCleaningStatusNotIn(List<String> values) {
            addCriterion("auto_cleaning_status not in", values, "autoCleaningStatus");
            return (Criteria) this;
        }

        public Criteria andAutoCleaningStatusBetween(String value1, String value2) {
            addCriterion("auto_cleaning_status between", value1, value2, "autoCleaningStatus");
            return (Criteria) this;
        }

        public Criteria andAutoCleaningStatusNotBetween(String value1, String value2) {
            addCriterion("auto_cleaning_status not between", value1, value2, "autoCleaningStatus");
            return (Criteria) this;
        }

        public Criteria andPersonCleaningStatusIsNull() {
            addCriterion("person_cleaning_status is null");
            return (Criteria) this;
        }

        public Criteria andPersonCleaningStatusIsNotNull() {
            addCriterion("person_cleaning_status is not null");
            return (Criteria) this;
        }

        public Criteria andPersonCleaningStatusEqualTo(String value) {
            addCriterion("person_cleaning_status =", value, "personCleaningStatus");
            return (Criteria) this;
        }

        public Criteria andPersonCleaningStatusNotEqualTo(String value) {
            addCriterion("person_cleaning_status <>", value, "personCleaningStatus");
            return (Criteria) this;
        }

        public Criteria andPersonCleaningStatusGreaterThan(String value) {
            addCriterion("person_cleaning_status >", value, "personCleaningStatus");
            return (Criteria) this;
        }

        public Criteria andPersonCleaningStatusGreaterThanOrEqualTo(String value) {
            addCriterion("person_cleaning_status >=", value, "personCleaningStatus");
            return (Criteria) this;
        }

        public Criteria andPersonCleaningStatusLessThan(String value) {
            addCriterion("person_cleaning_status <", value, "personCleaningStatus");
            return (Criteria) this;
        }

        public Criteria andPersonCleaningStatusLessThanOrEqualTo(String value) {
            addCriterion("person_cleaning_status <=", value, "personCleaningStatus");
            return (Criteria) this;
        }

        public Criteria andPersonCleaningStatusLike(String value) {
            addCriterion("person_cleaning_status like", value, "personCleaningStatus");
            return (Criteria) this;
        }

        public Criteria andPersonCleaningStatusNotLike(String value) {
            addCriterion("person_cleaning_status not like", value, "personCleaningStatus");
            return (Criteria) this;
        }

        public Criteria andPersonCleaningStatusIn(List<String> values) {
            addCriterion("person_cleaning_status in", values, "personCleaningStatus");
            return (Criteria) this;
        }

        public Criteria andPersonCleaningStatusNotIn(List<String> values) {
            addCriterion("person_cleaning_status not in", values, "personCleaningStatus");
            return (Criteria) this;
        }

        public Criteria andPersonCleaningStatusBetween(String value1, String value2) {
            addCriterion("person_cleaning_status between", value1, value2, "personCleaningStatus");
            return (Criteria) this;
        }

        public Criteria andPersonCleaningStatusNotBetween(String value1, String value2) {
            addCriterion("person_cleaning_status not between", value1, value2, "personCleaningStatus");
            return (Criteria) this;
        }

        public Criteria andAutoDisinfectionIsNull() {
            addCriterion("auto_disinfection is null");
            return (Criteria) this;
        }

        public Criteria andAutoDisinfectionIsNotNull() {
            addCriterion("auto_disinfection is not null");
            return (Criteria) this;
        }

        public Criteria andAutoDisinfectionEqualTo(String value) {
            addCriterion("auto_disinfection =", value, "autoDisinfection");
            return (Criteria) this;
        }

        public Criteria andAutoDisinfectionNotEqualTo(String value) {
            addCriterion("auto_disinfection <>", value, "autoDisinfection");
            return (Criteria) this;
        }

        public Criteria andAutoDisinfectionGreaterThan(String value) {
            addCriterion("auto_disinfection >", value, "autoDisinfection");
            return (Criteria) this;
        }

        public Criteria andAutoDisinfectionGreaterThanOrEqualTo(String value) {
            addCriterion("auto_disinfection >=", value, "autoDisinfection");
            return (Criteria) this;
        }

        public Criteria andAutoDisinfectionLessThan(String value) {
            addCriterion("auto_disinfection <", value, "autoDisinfection");
            return (Criteria) this;
        }

        public Criteria andAutoDisinfectionLessThanOrEqualTo(String value) {
            addCriterion("auto_disinfection <=", value, "autoDisinfection");
            return (Criteria) this;
        }

        public Criteria andAutoDisinfectionLike(String value) {
            addCriterion("auto_disinfection like", value, "autoDisinfection");
            return (Criteria) this;
        }

        public Criteria andAutoDisinfectionNotLike(String value) {
            addCriterion("auto_disinfection not like", value, "autoDisinfection");
            return (Criteria) this;
        }

        public Criteria andAutoDisinfectionIn(List<String> values) {
            addCriterion("auto_disinfection in", values, "autoDisinfection");
            return (Criteria) this;
        }

        public Criteria andAutoDisinfectionNotIn(List<String> values) {
            addCriterion("auto_disinfection not in", values, "autoDisinfection");
            return (Criteria) this;
        }

        public Criteria andAutoDisinfectionBetween(String value1, String value2) {
            addCriterion("auto_disinfection between", value1, value2, "autoDisinfection");
            return (Criteria) this;
        }

        public Criteria andAutoDisinfectionNotBetween(String value1, String value2) {
            addCriterion("auto_disinfection not between", value1, value2, "autoDisinfection");
            return (Criteria) this;
        }

        public Criteria andPersonDisinfectionIsNull() {
            addCriterion("person_disinfection is null");
            return (Criteria) this;
        }

        public Criteria andPersonDisinfectionIsNotNull() {
            addCriterion("person_disinfection is not null");
            return (Criteria) this;
        }

        public Criteria andPersonDisinfectionEqualTo(String value) {
            addCriterion("person_disinfection =", value, "personDisinfection");
            return (Criteria) this;
        }

        public Criteria andPersonDisinfectionNotEqualTo(String value) {
            addCriterion("person_disinfection <>", value, "personDisinfection");
            return (Criteria) this;
        }

        public Criteria andPersonDisinfectionGreaterThan(String value) {
            addCriterion("person_disinfection >", value, "personDisinfection");
            return (Criteria) this;
        }

        public Criteria andPersonDisinfectionGreaterThanOrEqualTo(String value) {
            addCriterion("person_disinfection >=", value, "personDisinfection");
            return (Criteria) this;
        }

        public Criteria andPersonDisinfectionLessThan(String value) {
            addCriterion("person_disinfection <", value, "personDisinfection");
            return (Criteria) this;
        }

        public Criteria andPersonDisinfectionLessThanOrEqualTo(String value) {
            addCriterion("person_disinfection <=", value, "personDisinfection");
            return (Criteria) this;
        }

        public Criteria andPersonDisinfectionLike(String value) {
            addCriterion("person_disinfection like", value, "personDisinfection");
            return (Criteria) this;
        }

        public Criteria andPersonDisinfectionNotLike(String value) {
            addCriterion("person_disinfection not like", value, "personDisinfection");
            return (Criteria) this;
        }

        public Criteria andPersonDisinfectionIn(List<String> values) {
            addCriterion("person_disinfection in", values, "personDisinfection");
            return (Criteria) this;
        }

        public Criteria andPersonDisinfectionNotIn(List<String> values) {
            addCriterion("person_disinfection not in", values, "personDisinfection");
            return (Criteria) this;
        }

        public Criteria andPersonDisinfectionBetween(String value1, String value2) {
            addCriterion("person_disinfection between", value1, value2, "personDisinfection");
            return (Criteria) this;
        }

        public Criteria andPersonDisinfectionNotBetween(String value1, String value2) {
            addCriterion("person_disinfection not between", value1, value2, "personDisinfection");
            return (Criteria) this;
        }

        public Criteria andTeamIsNull() {
            addCriterion("team is null");
            return (Criteria) this;
        }

        public Criteria andTeamIsNotNull() {
            addCriterion("team is not null");
            return (Criteria) this;
        }

        public Criteria andTeamEqualTo(String value) {
            addCriterion("team =", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamNotEqualTo(String value) {
            addCriterion("team <>", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamGreaterThan(String value) {
            addCriterion("team >", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamGreaterThanOrEqualTo(String value) {
            addCriterion("team >=", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamLessThan(String value) {
            addCriterion("team <", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamLessThanOrEqualTo(String value) {
            addCriterion("team <=", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamLike(String value) {
            addCriterion("team like", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamNotLike(String value) {
            addCriterion("team not like", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamIn(List<String> values) {
            addCriterion("team in", values, "team");
            return (Criteria) this;
        }

        public Criteria andTeamNotIn(List<String> values) {
            addCriterion("team not in", values, "team");
            return (Criteria) this;
        }

        public Criteria andTeamBetween(String value1, String value2) {
            addCriterion("team between", value1, value2, "team");
            return (Criteria) this;
        }

        public Criteria andTeamNotBetween(String value1, String value2) {
            addCriterion("team not between", value1, value2, "team");
            return (Criteria) this;
        }

        public Criteria andProductionStateIsNull() {
            addCriterion("production_state is null");
            return (Criteria) this;
        }

        public Criteria andProductionStateIsNotNull() {
            addCriterion("production_state is not null");
            return (Criteria) this;
        }

        public Criteria andProductionStateEqualTo(String value) {
            addCriterion("production_state =", value, "productionState");
            return (Criteria) this;
        }

        public Criteria andProductionStateNotEqualTo(String value) {
            addCriterion("production_state <>", value, "productionState");
            return (Criteria) this;
        }

        public Criteria andProductionStateGreaterThan(String value) {
            addCriterion("production_state >", value, "productionState");
            return (Criteria) this;
        }

        public Criteria andProductionStateGreaterThanOrEqualTo(String value) {
            addCriterion("production_state >=", value, "productionState");
            return (Criteria) this;
        }

        public Criteria andProductionStateLessThan(String value) {
            addCriterion("production_state <", value, "productionState");
            return (Criteria) this;
        }

        public Criteria andProductionStateLessThanOrEqualTo(String value) {
            addCriterion("production_state <=", value, "productionState");
            return (Criteria) this;
        }

        public Criteria andProductionStateLike(String value) {
            addCriterion("production_state like", value, "productionState");
            return (Criteria) this;
        }

        public Criteria andProductionStateNotLike(String value) {
            addCriterion("production_state not like", value, "productionState");
            return (Criteria) this;
        }

        public Criteria andProductionStateIn(List<String> values) {
            addCriterion("production_state in", values, "productionState");
            return (Criteria) this;
        }

        public Criteria andProductionStateNotIn(List<String> values) {
            addCriterion("production_state not in", values, "productionState");
            return (Criteria) this;
        }

        public Criteria andProductionStateBetween(String value1, String value2) {
            addCriterion("production_state between", value1, value2, "productionState");
            return (Criteria) this;
        }

        public Criteria andProductionStateNotBetween(String value1, String value2) {
            addCriterion("production_state not between", value1, value2, "productionState");
            return (Criteria) this;
        }

        public Criteria andPlanDateIsNull() {
            addCriterion("plan_date is null");
            return (Criteria) this;
        }

        public Criteria andPlanDateIsNotNull() {
            addCriterion("plan_date is not null");
            return (Criteria) this;
        }

        public Criteria andPlanDateEqualTo(String value) {
            addCriterion("plan_date =", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateNotEqualTo(String value) {
            addCriterion("plan_date <>", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateGreaterThan(String value) {
            addCriterion("plan_date >", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateGreaterThanOrEqualTo(String value) {
            addCriterion("plan_date >=", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateLessThan(String value) {
            addCriterion("plan_date <", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateLessThanOrEqualTo(String value) {
            addCriterion("plan_date <=", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateLike(String value) {
            addCriterion("plan_date like", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateNotLike(String value) {
            addCriterion("plan_date not like", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateIn(List<String> values) {
            addCriterion("plan_date in", values, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateNotIn(List<String> values) {
            addCriterion("plan_date not in", values, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateBetween(String value1, String value2) {
            addCriterion("plan_date between", value1, value2, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateNotBetween(String value1, String value2) {
            addCriterion("plan_date not between", value1, value2, "planDate");
            return (Criteria) this;
        }

        public Criteria andProductionClassIsNull() {
            addCriterion("production_class is null");
            return (Criteria) this;
        }

        public Criteria andProductionClassIsNotNull() {
            addCriterion("production_class is not null");
            return (Criteria) this;
        }

        public Criteria andProductionClassEqualTo(String value) {
            addCriterion("production_class =", value, "productionClass");
            return (Criteria) this;
        }

        public Criteria andProductionClassNotEqualTo(String value) {
            addCriterion("production_class <>", value, "productionClass");
            return (Criteria) this;
        }

        public Criteria andProductionClassGreaterThan(String value) {
            addCriterion("production_class >", value, "productionClass");
            return (Criteria) this;
        }

        public Criteria andProductionClassGreaterThanOrEqualTo(String value) {
            addCriterion("production_class >=", value, "productionClass");
            return (Criteria) this;
        }

        public Criteria andProductionClassLessThan(String value) {
            addCriterion("production_class <", value, "productionClass");
            return (Criteria) this;
        }

        public Criteria andProductionClassLessThanOrEqualTo(String value) {
            addCriterion("production_class <=", value, "productionClass");
            return (Criteria) this;
        }

        public Criteria andProductionClassLike(String value) {
            addCriterion("production_class like", value, "productionClass");
            return (Criteria) this;
        }

        public Criteria andProductionClassNotLike(String value) {
            addCriterion("production_class not like", value, "productionClass");
            return (Criteria) this;
        }

        public Criteria andProductionClassIn(List<String> values) {
            addCriterion("production_class in", values, "productionClass");
            return (Criteria) this;
        }

        public Criteria andProductionClassNotIn(List<String> values) {
            addCriterion("production_class not in", values, "productionClass");
            return (Criteria) this;
        }

        public Criteria andProductionClassBetween(String value1, String value2) {
            addCriterion("production_class between", value1, value2, "productionClass");
            return (Criteria) this;
        }

        public Criteria andProductionClassNotBetween(String value1, String value2) {
            addCriterion("production_class not between", value1, value2, "productionClass");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(String value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(String value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(String value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(String value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(String value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLike(String value) {
            addCriterion("project_id like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotLike(String value) {
            addCriterion("project_id not like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<String> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<String> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(String value1, String value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(String value1, String value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andPlanDescribeIsNull() {
            addCriterion("plan_describe is null");
            return (Criteria) this;
        }

        public Criteria andPlanDescribeIsNotNull() {
            addCriterion("plan_describe is not null");
            return (Criteria) this;
        }

        public Criteria andPlanDescribeEqualTo(String value) {
            addCriterion("plan_describe =", value, "planDescribe");
            return (Criteria) this;
        }

        public Criteria andPlanDescribeNotEqualTo(String value) {
            addCriterion("plan_describe <>", value, "planDescribe");
            return (Criteria) this;
        }

        public Criteria andPlanDescribeGreaterThan(String value) {
            addCriterion("plan_describe >", value, "planDescribe");
            return (Criteria) this;
        }

        public Criteria andPlanDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("plan_describe >=", value, "planDescribe");
            return (Criteria) this;
        }

        public Criteria andPlanDescribeLessThan(String value) {
            addCriterion("plan_describe <", value, "planDescribe");
            return (Criteria) this;
        }

        public Criteria andPlanDescribeLessThanOrEqualTo(String value) {
            addCriterion("plan_describe <=", value, "planDescribe");
            return (Criteria) this;
        }

        public Criteria andPlanDescribeLike(String value) {
            addCriterion("plan_describe like", value, "planDescribe");
            return (Criteria) this;
        }

        public Criteria andPlanDescribeNotLike(String value) {
            addCriterion("plan_describe not like", value, "planDescribe");
            return (Criteria) this;
        }

        public Criteria andPlanDescribeIn(List<String> values) {
            addCriterion("plan_describe in", values, "planDescribe");
            return (Criteria) this;
        }

        public Criteria andPlanDescribeNotIn(List<String> values) {
            addCriterion("plan_describe not in", values, "planDescribe");
            return (Criteria) this;
        }

        public Criteria andPlanDescribeBetween(String value1, String value2) {
            addCriterion("plan_describe between", value1, value2, "planDescribe");
            return (Criteria) this;
        }

        public Criteria andPlanDescribeNotBetween(String value1, String value2) {
            addCriterion("plan_describe not between", value1, value2, "planDescribe");
            return (Criteria) this;
        }

        public Criteria andActualNumBoxIsNull() {
            addCriterion("actual_num_box is null");
            return (Criteria) this;
        }

        public Criteria andActualNumBoxIsNotNull() {
            addCriterion("actual_num_box is not null");
            return (Criteria) this;
        }

        public Criteria andActualNumBoxEqualTo(String value) {
            addCriterion("actual_num_box =", value, "actualNumBox");
            return (Criteria) this;
        }

        public Criteria andActualNumBoxNotEqualTo(String value) {
            addCriterion("actual_num_box <>", value, "actualNumBox");
            return (Criteria) this;
        }

        public Criteria andActualNumBoxGreaterThan(String value) {
            addCriterion("actual_num_box >", value, "actualNumBox");
            return (Criteria) this;
        }

        public Criteria andActualNumBoxGreaterThanOrEqualTo(String value) {
            addCriterion("actual_num_box >=", value, "actualNumBox");
            return (Criteria) this;
        }

        public Criteria andActualNumBoxLessThan(String value) {
            addCriterion("actual_num_box <", value, "actualNumBox");
            return (Criteria) this;
        }

        public Criteria andActualNumBoxLessThanOrEqualTo(String value) {
            addCriterion("actual_num_box <=", value, "actualNumBox");
            return (Criteria) this;
        }

        public Criteria andActualNumBoxLike(String value) {
            addCriterion("actual_num_box like", value, "actualNumBox");
            return (Criteria) this;
        }

        public Criteria andActualNumBoxNotLike(String value) {
            addCriterion("actual_num_box not like", value, "actualNumBox");
            return (Criteria) this;
        }

        public Criteria andActualNumBoxIn(List<String> values) {
            addCriterion("actual_num_box in", values, "actualNumBox");
            return (Criteria) this;
        }

        public Criteria andActualNumBoxNotIn(List<String> values) {
            addCriterion("actual_num_box not in", values, "actualNumBox");
            return (Criteria) this;
        }

        public Criteria andActualNumBoxBetween(String value1, String value2) {
            addCriterion("actual_num_box between", value1, value2, "actualNumBox");
            return (Criteria) this;
        }

        public Criteria andActualNumBoxNotBetween(String value1, String value2) {
            addCriterion("actual_num_box not between", value1, value2, "actualNumBox");
            return (Criteria) this;
        }

        public Criteria andPlanProduceStartIsNull() {
            addCriterion("plan_produce_start is null");
            return (Criteria) this;
        }

        public Criteria andPlanProduceStartIsNotNull() {
            addCriterion("plan_produce_start is not null");
            return (Criteria) this;
        }

        public Criteria andPlanProduceStartEqualTo(Date value) {
            addCriterion("plan_produce_start =", value, "planProduceStart");
            return (Criteria) this;
        }

        public Criteria andPlanProduceStartNotEqualTo(Date value) {
            addCriterion("plan_produce_start <>", value, "planProduceStart");
            return (Criteria) this;
        }

        public Criteria andPlanProduceStartGreaterThan(Date value) {
            addCriterion("plan_produce_start >", value, "planProduceStart");
            return (Criteria) this;
        }

        public Criteria andPlanProduceStartGreaterThanOrEqualTo(Date value) {
            addCriterion("plan_produce_start >=", value, "planProduceStart");
            return (Criteria) this;
        }

        public Criteria andPlanProduceStartLessThan(Date value) {
            addCriterion("plan_produce_start <", value, "planProduceStart");
            return (Criteria) this;
        }

        public Criteria andPlanProduceStartLessThanOrEqualTo(Date value) {
            addCriterion("plan_produce_start <=", value, "planProduceStart");
            return (Criteria) this;
        }

        public Criteria andPlanProduceStartIn(List<Date> values) {
            addCriterion("plan_produce_start in", values, "planProduceStart");
            return (Criteria) this;
        }

        public Criteria andPlanProduceStartNotIn(List<Date> values) {
            addCriterion("plan_produce_start not in", values, "planProduceStart");
            return (Criteria) this;
        }

        public Criteria andPlanProduceStartBetween(Date value1, Date value2) {
            addCriterion("plan_produce_start between", value1, value2, "planProduceStart");
            return (Criteria) this;
        }

        public Criteria andPlanProduceStartNotBetween(Date value1, Date value2) {
            addCriterion("plan_produce_start not between", value1, value2, "planProduceStart");
            return (Criteria) this;
        }

        public Criteria andPlanProduceEndIsNull() {
            addCriterion("plan_produce_end is null");
            return (Criteria) this;
        }

        public Criteria andPlanProduceEndIsNotNull() {
            addCriterion("plan_produce_end is not null");
            return (Criteria) this;
        }

        public Criteria andPlanProduceEndEqualTo(Date value) {
            addCriterion("plan_produce_end =", value, "planProduceEnd");
            return (Criteria) this;
        }

        public Criteria andPlanProduceEndNotEqualTo(Date value) {
            addCriterion("plan_produce_end <>", value, "planProduceEnd");
            return (Criteria) this;
        }

        public Criteria andPlanProduceEndGreaterThan(Date value) {
            addCriterion("plan_produce_end >", value, "planProduceEnd");
            return (Criteria) this;
        }

        public Criteria andPlanProduceEndGreaterThanOrEqualTo(Date value) {
            addCriterion("plan_produce_end >=", value, "planProduceEnd");
            return (Criteria) this;
        }

        public Criteria andPlanProduceEndLessThan(Date value) {
            addCriterion("plan_produce_end <", value, "planProduceEnd");
            return (Criteria) this;
        }

        public Criteria andPlanProduceEndLessThanOrEqualTo(Date value) {
            addCriterion("plan_produce_end <=", value, "planProduceEnd");
            return (Criteria) this;
        }

        public Criteria andPlanProduceEndIn(List<Date> values) {
            addCriterion("plan_produce_end in", values, "planProduceEnd");
            return (Criteria) this;
        }

        public Criteria andPlanProduceEndNotIn(List<Date> values) {
            addCriterion("plan_produce_end not in", values, "planProduceEnd");
            return (Criteria) this;
        }

        public Criteria andPlanProduceEndBetween(Date value1, Date value2) {
            addCriterion("plan_produce_end between", value1, value2, "planProduceEnd");
            return (Criteria) this;
        }

        public Criteria andPlanProduceEndNotBetween(Date value1, Date value2) {
            addCriterion("plan_produce_end not between", value1, value2, "planProduceEnd");
            return (Criteria) this;
        }

        public Criteria andPotIsNull() {
            addCriterion("pot is null");
            return (Criteria) this;
        }

        public Criteria andPotIsNotNull() {
            addCriterion("pot is not null");
            return (Criteria) this;
        }

        public Criteria andPotEqualTo(String value) {
            addCriterion("pot =", value, "pot");
            return (Criteria) this;
        }

        public Criteria andPotNotEqualTo(String value) {
            addCriterion("pot <>", value, "pot");
            return (Criteria) this;
        }

        public Criteria andPotGreaterThan(String value) {
            addCriterion("pot >", value, "pot");
            return (Criteria) this;
        }

        public Criteria andPotGreaterThanOrEqualTo(String value) {
            addCriterion("pot >=", value, "pot");
            return (Criteria) this;
        }

        public Criteria andPotLessThan(String value) {
            addCriterion("pot <", value, "pot");
            return (Criteria) this;
        }

        public Criteria andPotLessThanOrEqualTo(String value) {
            addCriterion("pot <=", value, "pot");
            return (Criteria) this;
        }

        public Criteria andPotLike(String value) {
            addCriterion("pot like", value, "pot");
            return (Criteria) this;
        }

        public Criteria andPotNotLike(String value) {
            addCriterion("pot not like", value, "pot");
            return (Criteria) this;
        }

        public Criteria andPotIn(List<String> values) {
            addCriterion("pot in", values, "pot");
            return (Criteria) this;
        }

        public Criteria andPotNotIn(List<String> values) {
            addCriterion("pot not in", values, "pot");
            return (Criteria) this;
        }

        public Criteria andPotBetween(String value1, String value2) {
            addCriterion("pot between", value1, value2, "pot");
            return (Criteria) this;
        }

        public Criteria andPotNotBetween(String value1, String value2) {
            addCriterion("pot not between", value1, value2, "pot");
            return (Criteria) this;
        }

        public Criteria andMaterialNumIsNull() {
            addCriterion("material_num is null");
            return (Criteria) this;
        }

        public Criteria andMaterialNumIsNotNull() {
            addCriterion("material_num is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialNumEqualTo(String value) {
            addCriterion("material_num =", value, "materialNum");
            return (Criteria) this;
        }

        public Criteria andMaterialNumNotEqualTo(String value) {
            addCriterion("material_num <>", value, "materialNum");
            return (Criteria) this;
        }

        public Criteria andMaterialNumGreaterThan(String value) {
            addCriterion("material_num >", value, "materialNum");
            return (Criteria) this;
        }

        public Criteria andMaterialNumGreaterThanOrEqualTo(String value) {
            addCriterion("material_num >=", value, "materialNum");
            return (Criteria) this;
        }

        public Criteria andMaterialNumLessThan(String value) {
            addCriterion("material_num <", value, "materialNum");
            return (Criteria) this;
        }

        public Criteria andMaterialNumLessThanOrEqualTo(String value) {
            addCriterion("material_num <=", value, "materialNum");
            return (Criteria) this;
        }

        public Criteria andMaterialNumLike(String value) {
            addCriterion("material_num like", value, "materialNum");
            return (Criteria) this;
        }

        public Criteria andMaterialNumNotLike(String value) {
            addCriterion("material_num not like", value, "materialNum");
            return (Criteria) this;
        }

        public Criteria andMaterialNumIn(List<String> values) {
            addCriterion("material_num in", values, "materialNum");
            return (Criteria) this;
        }

        public Criteria andMaterialNumNotIn(List<String> values) {
            addCriterion("material_num not in", values, "materialNum");
            return (Criteria) this;
        }

        public Criteria andMaterialNumBetween(String value1, String value2) {
            addCriterion("material_num between", value1, value2, "materialNum");
            return (Criteria) this;
        }

        public Criteria andMaterialNumNotBetween(String value1, String value2) {
            addCriterion("material_num not between", value1, value2, "materialNum");
            return (Criteria) this;
        }

        public Criteria andMaterialDescribeIsNull() {
            addCriterion("material_describe is null");
            return (Criteria) this;
        }

        public Criteria andMaterialDescribeIsNotNull() {
            addCriterion("material_describe is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialDescribeEqualTo(String value) {
            addCriterion("material_describe =", value, "materialDescribe");
            return (Criteria) this;
        }

        public Criteria andMaterialDescribeNotEqualTo(String value) {
            addCriterion("material_describe <>", value, "materialDescribe");
            return (Criteria) this;
        }

        public Criteria andMaterialDescribeGreaterThan(String value) {
            addCriterion("material_describe >", value, "materialDescribe");
            return (Criteria) this;
        }

        public Criteria andMaterialDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("material_describe >=", value, "materialDescribe");
            return (Criteria) this;
        }

        public Criteria andMaterialDescribeLessThan(String value) {
            addCriterion("material_describe <", value, "materialDescribe");
            return (Criteria) this;
        }

        public Criteria andMaterialDescribeLessThanOrEqualTo(String value) {
            addCriterion("material_describe <=", value, "materialDescribe");
            return (Criteria) this;
        }

        public Criteria andMaterialDescribeLike(String value) {
            addCriterion("material_describe like", value, "materialDescribe");
            return (Criteria) this;
        }

        public Criteria andMaterialDescribeNotLike(String value) {
            addCriterion("material_describe not like", value, "materialDescribe");
            return (Criteria) this;
        }

        public Criteria andMaterialDescribeIn(List<String> values) {
            addCriterion("material_describe in", values, "materialDescribe");
            return (Criteria) this;
        }

        public Criteria andMaterialDescribeNotIn(List<String> values) {
            addCriterion("material_describe not in", values, "materialDescribe");
            return (Criteria) this;
        }

        public Criteria andMaterialDescribeBetween(String value1, String value2) {
            addCriterion("material_describe between", value1, value2, "materialDescribe");
            return (Criteria) this;
        }

        public Criteria andMaterialDescribeNotBetween(String value1, String value2) {
            addCriterion("material_describe not between", value1, value2, "materialDescribe");
            return (Criteria) this;
        }

        public Criteria andMaterialActualNumIsNull() {
            addCriterion("material_actual_num is null");
            return (Criteria) this;
        }

        public Criteria andMaterialActualNumIsNotNull() {
            addCriterion("material_actual_num is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialActualNumEqualTo(String value) {
            addCriterion("material_actual_num =", value, "materialActualNum");
            return (Criteria) this;
        }

        public Criteria andMaterialActualNumNotEqualTo(String value) {
            addCriterion("material_actual_num <>", value, "materialActualNum");
            return (Criteria) this;
        }

        public Criteria andMaterialActualNumGreaterThan(String value) {
            addCriterion("material_actual_num >", value, "materialActualNum");
            return (Criteria) this;
        }

        public Criteria andMaterialActualNumGreaterThanOrEqualTo(String value) {
            addCriterion("material_actual_num >=", value, "materialActualNum");
            return (Criteria) this;
        }

        public Criteria andMaterialActualNumLessThan(String value) {
            addCriterion("material_actual_num <", value, "materialActualNum");
            return (Criteria) this;
        }

        public Criteria andMaterialActualNumLessThanOrEqualTo(String value) {
            addCriterion("material_actual_num <=", value, "materialActualNum");
            return (Criteria) this;
        }

        public Criteria andMaterialActualNumLike(String value) {
            addCriterion("material_actual_num like", value, "materialActualNum");
            return (Criteria) this;
        }

        public Criteria andMaterialActualNumNotLike(String value) {
            addCriterion("material_actual_num not like", value, "materialActualNum");
            return (Criteria) this;
        }

        public Criteria andMaterialActualNumIn(List<String> values) {
            addCriterion("material_actual_num in", values, "materialActualNum");
            return (Criteria) this;
        }

        public Criteria andMaterialActualNumNotIn(List<String> values) {
            addCriterion("material_actual_num not in", values, "materialActualNum");
            return (Criteria) this;
        }

        public Criteria andMaterialActualNumBetween(String value1, String value2) {
            addCriterion("material_actual_num between", value1, value2, "materialActualNum");
            return (Criteria) this;
        }

        public Criteria andMaterialActualNumNotBetween(String value1, String value2) {
            addCriterion("material_actual_num not between", value1, value2, "materialActualNum");
            return (Criteria) this;
        }

        public Criteria andPlanStartIsNull() {
            addCriterion("plan_start is null");
            return (Criteria) this;
        }

        public Criteria andPlanStartIsNotNull() {
            addCriterion("plan_start is not null");
            return (Criteria) this;
        }

        public Criteria andPlanStartEqualTo(Date value) {
            addCriterion("plan_start =", value, "planStart");
            return (Criteria) this;
        }

        public Criteria andPlanStartNotEqualTo(Date value) {
            addCriterion("plan_start <>", value, "planStart");
            return (Criteria) this;
        }

        public Criteria andPlanStartGreaterThan(Date value) {
            addCriterion("plan_start >", value, "planStart");
            return (Criteria) this;
        }

        public Criteria andPlanStartGreaterThanOrEqualTo(Date value) {
            addCriterion("plan_start >=", value, "planStart");
            return (Criteria) this;
        }

        public Criteria andPlanStartLessThan(Date value) {
            addCriterion("plan_start <", value, "planStart");
            return (Criteria) this;
        }

        public Criteria andPlanStartLessThanOrEqualTo(Date value) {
            addCriterion("plan_start <=", value, "planStart");
            return (Criteria) this;
        }

        public Criteria andPlanStartIn(List<Date> values) {
            addCriterion("plan_start in", values, "planStart");
            return (Criteria) this;
        }

        public Criteria andPlanStartNotIn(List<Date> values) {
            addCriterion("plan_start not in", values, "planStart");
            return (Criteria) this;
        }

        public Criteria andPlanStartBetween(Date value1, Date value2) {
            addCriterion("plan_start between", value1, value2, "planStart");
            return (Criteria) this;
        }

        public Criteria andPlanStartNotBetween(Date value1, Date value2) {
            addCriterion("plan_start not between", value1, value2, "planStart");
            return (Criteria) this;
        }

        public Criteria andPlanEndIsNull() {
            addCriterion("plan_end is null");
            return (Criteria) this;
        }

        public Criteria andPlanEndIsNotNull() {
            addCriterion("plan_end is not null");
            return (Criteria) this;
        }

        public Criteria andPlanEndEqualTo(Date value) {
            addCriterion("plan_end =", value, "planEnd");
            return (Criteria) this;
        }

        public Criteria andPlanEndNotEqualTo(Date value) {
            addCriterion("plan_end <>", value, "planEnd");
            return (Criteria) this;
        }

        public Criteria andPlanEndGreaterThan(Date value) {
            addCriterion("plan_end >", value, "planEnd");
            return (Criteria) this;
        }

        public Criteria andPlanEndGreaterThanOrEqualTo(Date value) {
            addCriterion("plan_end >=", value, "planEnd");
            return (Criteria) this;
        }

        public Criteria andPlanEndLessThan(Date value) {
            addCriterion("plan_end <", value, "planEnd");
            return (Criteria) this;
        }

        public Criteria andPlanEndLessThanOrEqualTo(Date value) {
            addCriterion("plan_end <=", value, "planEnd");
            return (Criteria) this;
        }

        public Criteria andPlanEndIn(List<Date> values) {
            addCriterion("plan_end in", values, "planEnd");
            return (Criteria) this;
        }

        public Criteria andPlanEndNotIn(List<Date> values) {
            addCriterion("plan_end not in", values, "planEnd");
            return (Criteria) this;
        }

        public Criteria andPlanEndBetween(Date value1, Date value2) {
            addCriterion("plan_end between", value1, value2, "planEnd");
            return (Criteria) this;
        }

        public Criteria andPlanEndNotBetween(Date value1, Date value2) {
            addCriterion("plan_end not between", value1, value2, "planEnd");
            return (Criteria) this;
        }

        public Criteria andActualStartIsNull() {
            addCriterion("actual_start is null");
            return (Criteria) this;
        }

        public Criteria andActualStartIsNotNull() {
            addCriterion("actual_start is not null");
            return (Criteria) this;
        }

        public Criteria andActualStartEqualTo(Date value) {
            addCriterion("actual_start =", value, "actualStart");
            return (Criteria) this;
        }

        public Criteria andActualStartNotEqualTo(Date value) {
            addCriterion("actual_start <>", value, "actualStart");
            return (Criteria) this;
        }

        public Criteria andActualStartGreaterThan(Date value) {
            addCriterion("actual_start >", value, "actualStart");
            return (Criteria) this;
        }

        public Criteria andActualStartGreaterThanOrEqualTo(Date value) {
            addCriterion("actual_start >=", value, "actualStart");
            return (Criteria) this;
        }

        public Criteria andActualStartLessThan(Date value) {
            addCriterion("actual_start <", value, "actualStart");
            return (Criteria) this;
        }

        public Criteria andActualStartLessThanOrEqualTo(Date value) {
            addCriterion("actual_start <=", value, "actualStart");
            return (Criteria) this;
        }

        public Criteria andActualStartIn(List<Date> values) {
            addCriterion("actual_start in", values, "actualStart");
            return (Criteria) this;
        }

        public Criteria andActualStartNotIn(List<Date> values) {
            addCriterion("actual_start not in", values, "actualStart");
            return (Criteria) this;
        }

        public Criteria andActualStartBetween(Date value1, Date value2) {
            addCriterion("actual_start between", value1, value2, "actualStart");
            return (Criteria) this;
        }

        public Criteria andActualStartNotBetween(Date value1, Date value2) {
            addCriterion("actual_start not between", value1, value2, "actualStart");
            return (Criteria) this;
        }

        public Criteria andActualEndIsNull() {
            addCriterion("actual_end is null");
            return (Criteria) this;
        }

        public Criteria andActualEndIsNotNull() {
            addCriterion("actual_end is not null");
            return (Criteria) this;
        }

        public Criteria andActualEndEqualTo(Date value) {
            addCriterion("actual_end =", value, "actualEnd");
            return (Criteria) this;
        }

        public Criteria andActualEndNotEqualTo(Date value) {
            addCriterion("actual_end <>", value, "actualEnd");
            return (Criteria) this;
        }

        public Criteria andActualEndGreaterThan(Date value) {
            addCriterion("actual_end >", value, "actualEnd");
            return (Criteria) this;
        }

        public Criteria andActualEndGreaterThanOrEqualTo(Date value) {
            addCriterion("actual_end >=", value, "actualEnd");
            return (Criteria) this;
        }

        public Criteria andActualEndLessThan(Date value) {
            addCriterion("actual_end <", value, "actualEnd");
            return (Criteria) this;
        }

        public Criteria andActualEndLessThanOrEqualTo(Date value) {
            addCriterion("actual_end <=", value, "actualEnd");
            return (Criteria) this;
        }

        public Criteria andActualEndIn(List<Date> values) {
            addCriterion("actual_end in", values, "actualEnd");
            return (Criteria) this;
        }

        public Criteria andActualEndNotIn(List<Date> values) {
            addCriterion("actual_end not in", values, "actualEnd");
            return (Criteria) this;
        }

        public Criteria andActualEndBetween(Date value1, Date value2) {
            addCriterion("actual_end between", value1, value2, "actualEnd");
            return (Criteria) this;
        }

        public Criteria andActualEndNotBetween(Date value1, Date value2) {
            addCriterion("actual_end not between", value1, value2, "actualEnd");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
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

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Integer value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Integer value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Integer value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Integer value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Integer value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Integer value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Integer> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Integer> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Integer value1, Integer value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Integer value1, Integer value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andForcedStartIsNull() {
            addCriterion("forced_start is null");
            return (Criteria) this;
        }

        public Criteria andForcedStartIsNotNull() {
            addCriterion("forced_start is not null");
            return (Criteria) this;
        }

        public Criteria andForcedStartEqualTo(Integer value) {
            addCriterion("forced_start =", value, "forcedStart");
            return (Criteria) this;
        }

        public Criteria andForcedStartNotEqualTo(Integer value) {
            addCriterion("forced_start <>", value, "forcedStart");
            return (Criteria) this;
        }

        public Criteria andForcedStartGreaterThan(Integer value) {
            addCriterion("forced_start >", value, "forcedStart");
            return (Criteria) this;
        }

        public Criteria andForcedStartGreaterThanOrEqualTo(Integer value) {
            addCriterion("forced_start >=", value, "forcedStart");
            return (Criteria) this;
        }

        public Criteria andForcedStartLessThan(Integer value) {
            addCriterion("forced_start <", value, "forcedStart");
            return (Criteria) this;
        }

        public Criteria andForcedStartLessThanOrEqualTo(Integer value) {
            addCriterion("forced_start <=", value, "forcedStart");
            return (Criteria) this;
        }

        public Criteria andForcedStartIn(List<Integer> values) {
            addCriterion("forced_start in", values, "forcedStart");
            return (Criteria) this;
        }

        public Criteria andForcedStartNotIn(List<Integer> values) {
            addCriterion("forced_start not in", values, "forcedStart");
            return (Criteria) this;
        }

        public Criteria andForcedStartBetween(Integer value1, Integer value2) {
            addCriterion("forced_start between", value1, value2, "forcedStart");
            return (Criteria) this;
        }

        public Criteria andForcedStartNotBetween(Integer value1, Integer value2) {
            addCriterion("forced_start not between", value1, value2, "forcedStart");
            return (Criteria) this;
        }

        public Criteria andForcedStartReasonIsNull() {
            addCriterion("forced_start_reason is null");
            return (Criteria) this;
        }

        public Criteria andForcedStartReasonIsNotNull() {
            addCriterion("forced_start_reason is not null");
            return (Criteria) this;
        }

        public Criteria andForcedStartReasonEqualTo(String value) {
            addCriterion("forced_start_reason =", value, "forcedStartReason");
            return (Criteria) this;
        }

        public Criteria andForcedStartReasonNotEqualTo(String value) {
            addCriterion("forced_start_reason <>", value, "forcedStartReason");
            return (Criteria) this;
        }

        public Criteria andForcedStartReasonGreaterThan(String value) {
            addCriterion("forced_start_reason >", value, "forcedStartReason");
            return (Criteria) this;
        }

        public Criteria andForcedStartReasonGreaterThanOrEqualTo(String value) {
            addCriterion("forced_start_reason >=", value, "forcedStartReason");
            return (Criteria) this;
        }

        public Criteria andForcedStartReasonLessThan(String value) {
            addCriterion("forced_start_reason <", value, "forcedStartReason");
            return (Criteria) this;
        }

        public Criteria andForcedStartReasonLessThanOrEqualTo(String value) {
            addCriterion("forced_start_reason <=", value, "forcedStartReason");
            return (Criteria) this;
        }

        public Criteria andForcedStartReasonLike(String value) {
            addCriterion("forced_start_reason like", value, "forcedStartReason");
            return (Criteria) this;
        }

        public Criteria andForcedStartReasonNotLike(String value) {
            addCriterion("forced_start_reason not like", value, "forcedStartReason");
            return (Criteria) this;
        }

        public Criteria andForcedStartReasonIn(List<String> values) {
            addCriterion("forced_start_reason in", values, "forcedStartReason");
            return (Criteria) this;
        }

        public Criteria andForcedStartReasonNotIn(List<String> values) {
            addCriterion("forced_start_reason not in", values, "forcedStartReason");
            return (Criteria) this;
        }

        public Criteria andForcedStartReasonBetween(String value1, String value2) {
            addCriterion("forced_start_reason between", value1, value2, "forcedStartReason");
            return (Criteria) this;
        }

        public Criteria andForcedStartReasonNotBetween(String value1, String value2) {
            addCriterion("forced_start_reason not between", value1, value2, "forcedStartReason");
            return (Criteria) this;
        }

        public Criteria andPackagingStandardIdIsNull() {
            addCriterion("packaging_standard_id is null");
            return (Criteria) this;
        }

        public Criteria andPackagingStandardIdIsNotNull() {
            addCriterion("packaging_standard_id is not null");
            return (Criteria) this;
        }

        public Criteria andPackagingStandardIdEqualTo(Integer value) {
            addCriterion("packaging_standard_id =", value, "packagingStandardId");
            return (Criteria) this;
        }

        public Criteria andPackagingStandardIdNotEqualTo(Integer value) {
            addCriterion("packaging_standard_id <>", value, "packagingStandardId");
            return (Criteria) this;
        }

        public Criteria andPackagingStandardIdGreaterThan(Integer value) {
            addCriterion("packaging_standard_id >", value, "packagingStandardId");
            return (Criteria) this;
        }

        public Criteria andPackagingStandardIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("packaging_standard_id >=", value, "packagingStandardId");
            return (Criteria) this;
        }

        public Criteria andPackagingStandardIdLessThan(Integer value) {
            addCriterion("packaging_standard_id <", value, "packagingStandardId");
            return (Criteria) this;
        }

        public Criteria andPackagingStandardIdLessThanOrEqualTo(Integer value) {
            addCriterion("packaging_standard_id <=", value, "packagingStandardId");
            return (Criteria) this;
        }

        public Criteria andPackagingStandardIdIn(List<Integer> values) {
            addCriterion("packaging_standard_id in", values, "packagingStandardId");
            return (Criteria) this;
        }

        public Criteria andPackagingStandardIdNotIn(List<Integer> values) {
            addCriterion("packaging_standard_id not in", values, "packagingStandardId");
            return (Criteria) this;
        }

        public Criteria andPackagingStandardIdBetween(Integer value1, Integer value2) {
            addCriterion("packaging_standard_id between", value1, value2, "packagingStandardId");
            return (Criteria) this;
        }

        public Criteria andPackagingStandardIdNotBetween(Integer value1, Integer value2) {
            addCriterion("packaging_standard_id not between", value1, value2, "packagingStandardId");
            return (Criteria) this;
        }

        public Criteria andVersionNumIsNull() {
            addCriterion("version_num is null");
            return (Criteria) this;
        }

        public Criteria andVersionNumIsNotNull() {
            addCriterion("version_num is not null");
            return (Criteria) this;
        }

        public Criteria andVersionNumEqualTo(String value) {
            addCriterion("version_num =", value, "versionNum");
            return (Criteria) this;
        }

        public Criteria andVersionNumNotEqualTo(String value) {
            addCriterion("version_num <>", value, "versionNum");
            return (Criteria) this;
        }

        public Criteria andVersionNumGreaterThan(String value) {
            addCriterion("version_num >", value, "versionNum");
            return (Criteria) this;
        }

        public Criteria andVersionNumGreaterThanOrEqualTo(String value) {
            addCriterion("version_num >=", value, "versionNum");
            return (Criteria) this;
        }

        public Criteria andVersionNumLessThan(String value) {
            addCriterion("version_num <", value, "versionNum");
            return (Criteria) this;
        }

        public Criteria andVersionNumLessThanOrEqualTo(String value) {
            addCriterion("version_num <=", value, "versionNum");
            return (Criteria) this;
        }

        public Criteria andVersionNumLike(String value) {
            addCriterion("version_num like", value, "versionNum");
            return (Criteria) this;
        }

        public Criteria andVersionNumNotLike(String value) {
            addCriterion("version_num not like", value, "versionNum");
            return (Criteria) this;
        }

        public Criteria andVersionNumIn(List<String> values) {
            addCriterion("version_num in", values, "versionNum");
            return (Criteria) this;
        }

        public Criteria andVersionNumNotIn(List<String> values) {
            addCriterion("version_num not in", values, "versionNum");
            return (Criteria) this;
        }

        public Criteria andVersionNumBetween(String value1, String value2) {
            addCriterion("version_num between", value1, value2, "versionNum");
            return (Criteria) this;
        }

        public Criteria andVersionNumNotBetween(String value1, String value2) {
            addCriterion("version_num not between", value1, value2, "versionNum");
            return (Criteria) this;
        }

        public Criteria andFillingStartIsNull() {
            addCriterion("filling_start is null");
            return (Criteria) this;
        }

        public Criteria andFillingStartIsNotNull() {
            addCriterion("filling_start is not null");
            return (Criteria) this;
        }

        public Criteria andFillingStartEqualTo(Date value) {
            addCriterion("filling_start =", value, "fillingStart");
            return (Criteria) this;
        }

        public Criteria andFillingStartNotEqualTo(Date value) {
            addCriterion("filling_start <>", value, "fillingStart");
            return (Criteria) this;
        }

        public Criteria andFillingStartGreaterThan(Date value) {
            addCriterion("filling_start >", value, "fillingStart");
            return (Criteria) this;
        }

        public Criteria andFillingStartGreaterThanOrEqualTo(Date value) {
            addCriterion("filling_start >=", value, "fillingStart");
            return (Criteria) this;
        }

        public Criteria andFillingStartLessThan(Date value) {
            addCriterion("filling_start <", value, "fillingStart");
            return (Criteria) this;
        }

        public Criteria andFillingStartLessThanOrEqualTo(Date value) {
            addCriterion("filling_start <=", value, "fillingStart");
            return (Criteria) this;
        }

        public Criteria andFillingStartIn(List<Date> values) {
            addCriterion("filling_start in", values, "fillingStart");
            return (Criteria) this;
        }

        public Criteria andFillingStartNotIn(List<Date> values) {
            addCriterion("filling_start not in", values, "fillingStart");
            return (Criteria) this;
        }

        public Criteria andFillingStartBetween(Date value1, Date value2) {
            addCriterion("filling_start between", value1, value2, "fillingStart");
            return (Criteria) this;
        }

        public Criteria andFillingStartNotBetween(Date value1, Date value2) {
            addCriterion("filling_start not between", value1, value2, "fillingStart");
            return (Criteria) this;
        }

        public Criteria andFillingEndIsNull() {
            addCriterion("filling_end is null");
            return (Criteria) this;
        }

        public Criteria andFillingEndIsNotNull() {
            addCriterion("filling_end is not null");
            return (Criteria) this;
        }

        public Criteria andFillingEndEqualTo(Date value) {
            addCriterion("filling_end =", value, "fillingEnd");
            return (Criteria) this;
        }

        public Criteria andFillingEndNotEqualTo(Date value) {
            addCriterion("filling_end <>", value, "fillingEnd");
            return (Criteria) this;
        }

        public Criteria andFillingEndGreaterThan(Date value) {
            addCriterion("filling_end >", value, "fillingEnd");
            return (Criteria) this;
        }

        public Criteria andFillingEndGreaterThanOrEqualTo(Date value) {
            addCriterion("filling_end >=", value, "fillingEnd");
            return (Criteria) this;
        }

        public Criteria andFillingEndLessThan(Date value) {
            addCriterion("filling_end <", value, "fillingEnd");
            return (Criteria) this;
        }

        public Criteria andFillingEndLessThanOrEqualTo(Date value) {
            addCriterion("filling_end <=", value, "fillingEnd");
            return (Criteria) this;
        }

        public Criteria andFillingEndIn(List<Date> values) {
            addCriterion("filling_end in", values, "fillingEnd");
            return (Criteria) this;
        }

        public Criteria andFillingEndNotIn(List<Date> values) {
            addCriterion("filling_end not in", values, "fillingEnd");
            return (Criteria) this;
        }

        public Criteria andFillingEndBetween(Date value1, Date value2) {
            addCriterion("filling_end between", value1, value2, "fillingEnd");
            return (Criteria) this;
        }

        public Criteria andFillingEndNotBetween(Date value1, Date value2) {
            addCriterion("filling_end not between", value1, value2, "fillingEnd");
            return (Criteria) this;
        }

        public Criteria andMaduoProdcountIsNull() {
            addCriterion("maduo_prodcount is null");
            return (Criteria) this;
        }

        public Criteria andMaduoProdcountIsNotNull() {
            addCriterion("maduo_prodcount is not null");
            return (Criteria) this;
        }

        public Criteria andMaduoProdcountEqualTo(Integer value) {
            addCriterion("maduo_prodcount =", value, "maduoProdcount");
            return (Criteria) this;
        }

        public Criteria andMaduoProdcountNotEqualTo(Integer value) {
            addCriterion("maduo_prodcount <>", value, "maduoProdcount");
            return (Criteria) this;
        }

        public Criteria andMaduoProdcountGreaterThan(Integer value) {
            addCriterion("maduo_prodcount >", value, "maduoProdcount");
            return (Criteria) this;
        }

        public Criteria andMaduoProdcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("maduo_prodcount >=", value, "maduoProdcount");
            return (Criteria) this;
        }

        public Criteria andMaduoProdcountLessThan(Integer value) {
            addCriterion("maduo_prodcount <", value, "maduoProdcount");
            return (Criteria) this;
        }

        public Criteria andMaduoProdcountLessThanOrEqualTo(Integer value) {
            addCriterion("maduo_prodcount <=", value, "maduoProdcount");
            return (Criteria) this;
        }

        public Criteria andMaduoProdcountIn(List<Integer> values) {
            addCriterion("maduo_prodcount in", values, "maduoProdcount");
            return (Criteria) this;
        }

        public Criteria andMaduoProdcountNotIn(List<Integer> values) {
            addCriterion("maduo_prodcount not in", values, "maduoProdcount");
            return (Criteria) this;
        }

        public Criteria andMaduoProdcountBetween(Integer value1, Integer value2) {
            addCriterion("maduo_prodcount between", value1, value2, "maduoProdcount");
            return (Criteria) this;
        }

        public Criteria andMaduoProdcountNotBetween(Integer value1, Integer value2) {
            addCriterion("maduo_prodcount not between", value1, value2, "maduoProdcount");
            return (Criteria) this;
        }

        public Criteria andCleaningTypeIsNull() {
            addCriterion("cleaning_type is null");
            return (Criteria) this;
        }

        public Criteria andCleaningTypeIsNotNull() {
            addCriterion("cleaning_type is not null");
            return (Criteria) this;
        }

        public Criteria andCleaningTypeEqualTo(String value) {
            addCriterion("cleaning_type =", value, "cleaningType");
            return (Criteria) this;
        }

        public Criteria andCleaningTypeNotEqualTo(String value) {
            addCriterion("cleaning_type <>", value, "cleaningType");
            return (Criteria) this;
        }

        public Criteria andCleaningTypeGreaterThan(String value) {
            addCriterion("cleaning_type >", value, "cleaningType");
            return (Criteria) this;
        }

        public Criteria andCleaningTypeGreaterThanOrEqualTo(String value) {
            addCriterion("cleaning_type >=", value, "cleaningType");
            return (Criteria) this;
        }

        public Criteria andCleaningTypeLessThan(String value) {
            addCriterion("cleaning_type <", value, "cleaningType");
            return (Criteria) this;
        }

        public Criteria andCleaningTypeLessThanOrEqualTo(String value) {
            addCriterion("cleaning_type <=", value, "cleaningType");
            return (Criteria) this;
        }

        public Criteria andCleaningTypeLike(String value) {
            addCriterion("cleaning_type like", value, "cleaningType");
            return (Criteria) this;
        }

        public Criteria andCleaningTypeNotLike(String value) {
            addCriterion("cleaning_type not like", value, "cleaningType");
            return (Criteria) this;
        }

        public Criteria andCleaningTypeIn(List<String> values) {
            addCriterion("cleaning_type in", values, "cleaningType");
            return (Criteria) this;
        }

        public Criteria andCleaningTypeNotIn(List<String> values) {
            addCriterion("cleaning_type not in", values, "cleaningType");
            return (Criteria) this;
        }

        public Criteria andCleaningTypeBetween(String value1, String value2) {
            addCriterion("cleaning_type between", value1, value2, "cleaningType");
            return (Criteria) this;
        }

        public Criteria andCleaningTypeNotBetween(String value1, String value2) {
            addCriterion("cleaning_type not between", value1, value2, "cleaningType");
            return (Criteria) this;
        }

        public Criteria andNeedCleanTimeIsNull() {
            addCriterion("need_clean_time is null");
            return (Criteria) this;
        }

        public Criteria andNeedCleanTimeIsNotNull() {
            addCriterion("need_clean_time is not null");
            return (Criteria) this;
        }

        public Criteria andNeedCleanTimeEqualTo(Date value) {
            addCriterion("need_clean_time =", value, "needCleanTime");
            return (Criteria) this;
        }

        public Criteria andNeedCleanTimeNotEqualTo(Date value) {
            addCriterion("need_clean_time <>", value, "needCleanTime");
            return (Criteria) this;
        }

        public Criteria andNeedCleanTimeGreaterThan(Date value) {
            addCriterion("need_clean_time >", value, "needCleanTime");
            return (Criteria) this;
        }

        public Criteria andNeedCleanTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("need_clean_time >=", value, "needCleanTime");
            return (Criteria) this;
        }

        public Criteria andNeedCleanTimeLessThan(Date value) {
            addCriterion("need_clean_time <", value, "needCleanTime");
            return (Criteria) this;
        }

        public Criteria andNeedCleanTimeLessThanOrEqualTo(Date value) {
            addCriterion("need_clean_time <=", value, "needCleanTime");
            return (Criteria) this;
        }

        public Criteria andNeedCleanTimeIn(List<Date> values) {
            addCriterion("need_clean_time in", values, "needCleanTime");
            return (Criteria) this;
        }

        public Criteria andNeedCleanTimeNotIn(List<Date> values) {
            addCriterion("need_clean_time not in", values, "needCleanTime");
            return (Criteria) this;
        }

        public Criteria andNeedCleanTimeBetween(Date value1, Date value2) {
            addCriterion("need_clean_time between", value1, value2, "needCleanTime");
            return (Criteria) this;
        }

        public Criteria andNeedCleanTimeNotBetween(Date value1, Date value2) {
            addCriterion("need_clean_time not between", value1, value2, "needCleanTime");
            return (Criteria) this;
        }

        public Criteria andTransferTypeIsNull() {
            addCriterion("transfer_type is null");
            return (Criteria) this;
        }

        public Criteria andTransferTypeIsNotNull() {
            addCriterion("transfer_type is not null");
            return (Criteria) this;
        }

        public Criteria andTransferTypeEqualTo(String value) {
            addCriterion("transfer_type =", value, "transferType");
            return (Criteria) this;
        }

        public Criteria andTransferTypeNotEqualTo(String value) {
            addCriterion("transfer_type <>", value, "transferType");
            return (Criteria) this;
        }

        public Criteria andTransferTypeGreaterThan(String value) {
            addCriterion("transfer_type >", value, "transferType");
            return (Criteria) this;
        }

        public Criteria andTransferTypeGreaterThanOrEqualTo(String value) {
            addCriterion("transfer_type >=", value, "transferType");
            return (Criteria) this;
        }

        public Criteria andTransferTypeLessThan(String value) {
            addCriterion("transfer_type <", value, "transferType");
            return (Criteria) this;
        }

        public Criteria andTransferTypeLessThanOrEqualTo(String value) {
            addCriterion("transfer_type <=", value, "transferType");
            return (Criteria) this;
        }

        public Criteria andTransferTypeLike(String value) {
            addCriterion("transfer_type like", value, "transferType");
            return (Criteria) this;
        }

        public Criteria andTransferTypeNotLike(String value) {
            addCriterion("transfer_type not like", value, "transferType");
            return (Criteria) this;
        }

        public Criteria andTransferTypeIn(List<String> values) {
            addCriterion("transfer_type in", values, "transferType");
            return (Criteria) this;
        }

        public Criteria andTransferTypeNotIn(List<String> values) {
            addCriterion("transfer_type not in", values, "transferType");
            return (Criteria) this;
        }

        public Criteria andTransferTypeBetween(String value1, String value2) {
            addCriterion("transfer_type between", value1, value2, "transferType");
            return (Criteria) this;
        }

        public Criteria andTransferTypeNotBetween(String value1, String value2) {
            addCriterion("transfer_type not between", value1, value2, "transferType");
            return (Criteria) this;
        }

        public Criteria andCalloffTimestampIsNull() {
            addCriterion("calloff_timestamp is null");
            return (Criteria) this;
        }

        public Criteria andCalloffTimestampIsNotNull() {
            addCriterion("calloff_timestamp is not null");
            return (Criteria) this;
        }

        public Criteria andCalloffTimestampEqualTo(Integer value) {
            addCriterion("calloff_timestamp =", value, "calloffTimestamp");
            return (Criteria) this;
        }

        public Criteria andCalloffTimestampNotEqualTo(Integer value) {
            addCriterion("calloff_timestamp <>", value, "calloffTimestamp");
            return (Criteria) this;
        }

        public Criteria andCalloffTimestampGreaterThan(Integer value) {
            addCriterion("calloff_timestamp >", value, "calloffTimestamp");
            return (Criteria) this;
        }

        public Criteria andCalloffTimestampGreaterThanOrEqualTo(Integer value) {
            addCriterion("calloff_timestamp >=", value, "calloffTimestamp");
            return (Criteria) this;
        }

        public Criteria andCalloffTimestampLessThan(Integer value) {
            addCriterion("calloff_timestamp <", value, "calloffTimestamp");
            return (Criteria) this;
        }

        public Criteria andCalloffTimestampLessThanOrEqualTo(Integer value) {
            addCriterion("calloff_timestamp <=", value, "calloffTimestamp");
            return (Criteria) this;
        }

        public Criteria andCalloffTimestampIn(List<Integer> values) {
            addCriterion("calloff_timestamp in", values, "calloffTimestamp");
            return (Criteria) this;
        }

        public Criteria andCalloffTimestampNotIn(List<Integer> values) {
            addCriterion("calloff_timestamp not in", values, "calloffTimestamp");
            return (Criteria) this;
        }

        public Criteria andCalloffTimestampBetween(Integer value1, Integer value2) {
            addCriterion("calloff_timestamp between", value1, value2, "calloffTimestamp");
            return (Criteria) this;
        }

        public Criteria andCalloffTimestampNotBetween(Integer value1, Integer value2) {
            addCriterion("calloff_timestamp not between", value1, value2, "calloffTimestamp");
            return (Criteria) this;
        }

        public Criteria andInnerResultIsNull() {
            addCriterion("inner_result is null");
            return (Criteria) this;
        }

        public Criteria andInnerResultIsNotNull() {
            addCriterion("inner_result is not null");
            return (Criteria) this;
        }

        public Criteria andInnerResultEqualTo(String value) {
            addCriterion("inner_result =", value, "innerResult");
            return (Criteria) this;
        }

        public Criteria andInnerResultNotEqualTo(String value) {
            addCriterion("inner_result <>", value, "innerResult");
            return (Criteria) this;
        }

        public Criteria andInnerResultGreaterThan(String value) {
            addCriterion("inner_result >", value, "innerResult");
            return (Criteria) this;
        }

        public Criteria andInnerResultGreaterThanOrEqualTo(String value) {
            addCriterion("inner_result >=", value, "innerResult");
            return (Criteria) this;
        }

        public Criteria andInnerResultLessThan(String value) {
            addCriterion("inner_result <", value, "innerResult");
            return (Criteria) this;
        }

        public Criteria andInnerResultLessThanOrEqualTo(String value) {
            addCriterion("inner_result <=", value, "innerResult");
            return (Criteria) this;
        }

        public Criteria andInnerResultLike(String value) {
            addCriterion("inner_result like", value, "innerResult");
            return (Criteria) this;
        }

        public Criteria andInnerResultNotLike(String value) {
            addCriterion("inner_result not like", value, "innerResult");
            return (Criteria) this;
        }

        public Criteria andInnerResultIn(List<String> values) {
            addCriterion("inner_result in", values, "innerResult");
            return (Criteria) this;
        }

        public Criteria andInnerResultNotIn(List<String> values) {
            addCriterion("inner_result not in", values, "innerResult");
            return (Criteria) this;
        }

        public Criteria andInnerResultBetween(String value1, String value2) {
            addCriterion("inner_result between", value1, value2, "innerResult");
            return (Criteria) this;
        }

        public Criteria andInnerResultNotBetween(String value1, String value2) {
            addCriterion("inner_result not between", value1, value2, "innerResult");
            return (Criteria) this;
        }

        public Criteria andOuterResultIsNull() {
            addCriterion("outer_result is null");
            return (Criteria) this;
        }

        public Criteria andOuterResultIsNotNull() {
            addCriterion("outer_result is not null");
            return (Criteria) this;
        }

        public Criteria andOuterResultEqualTo(String value) {
            addCriterion("outer_result =", value, "outerResult");
            return (Criteria) this;
        }

        public Criteria andOuterResultNotEqualTo(String value) {
            addCriterion("outer_result <>", value, "outerResult");
            return (Criteria) this;
        }

        public Criteria andOuterResultGreaterThan(String value) {
            addCriterion("outer_result >", value, "outerResult");
            return (Criteria) this;
        }

        public Criteria andOuterResultGreaterThanOrEqualTo(String value) {
            addCriterion("outer_result >=", value, "outerResult");
            return (Criteria) this;
        }

        public Criteria andOuterResultLessThan(String value) {
            addCriterion("outer_result <", value, "outerResult");
            return (Criteria) this;
        }

        public Criteria andOuterResultLessThanOrEqualTo(String value) {
            addCriterion("outer_result <=", value, "outerResult");
            return (Criteria) this;
        }

        public Criteria andOuterResultLike(String value) {
            addCriterion("outer_result like", value, "outerResult");
            return (Criteria) this;
        }

        public Criteria andOuterResultNotLike(String value) {
            addCriterion("outer_result not like", value, "outerResult");
            return (Criteria) this;
        }

        public Criteria andOuterResultIn(List<String> values) {
            addCriterion("outer_result in", values, "outerResult");
            return (Criteria) this;
        }

        public Criteria andOuterResultNotIn(List<String> values) {
            addCriterion("outer_result not in", values, "outerResult");
            return (Criteria) this;
        }

        public Criteria andOuterResultBetween(String value1, String value2) {
            addCriterion("outer_result between", value1, value2, "outerResult");
            return (Criteria) this;
        }

        public Criteria andOuterResultNotBetween(String value1, String value2) {
            addCriterion("outer_result not between", value1, value2, "outerResult");
            return (Criteria) this;
        }

        public Criteria andFirstTankIsNull() {
            addCriterion("first_tank is null");
            return (Criteria) this;
        }

        public Criteria andFirstTankIsNotNull() {
            addCriterion("first_tank is not null");
            return (Criteria) this;
        }

        public Criteria andFirstTankEqualTo(String value) {
            addCriterion("first_tank =", value, "firstTank");
            return (Criteria) this;
        }

        public Criteria andFirstTankNotEqualTo(String value) {
            addCriterion("first_tank <>", value, "firstTank");
            return (Criteria) this;
        }

        public Criteria andFirstTankGreaterThan(String value) {
            addCriterion("first_tank >", value, "firstTank");
            return (Criteria) this;
        }

        public Criteria andFirstTankGreaterThanOrEqualTo(String value) {
            addCriterion("first_tank >=", value, "firstTank");
            return (Criteria) this;
        }

        public Criteria andFirstTankLessThan(String value) {
            addCriterion("first_tank <", value, "firstTank");
            return (Criteria) this;
        }

        public Criteria andFirstTankLessThanOrEqualTo(String value) {
            addCriterion("first_tank <=", value, "firstTank");
            return (Criteria) this;
        }

        public Criteria andFirstTankLike(String value) {
            addCriterion("first_tank like", value, "firstTank");
            return (Criteria) this;
        }

        public Criteria andFirstTankNotLike(String value) {
            addCriterion("first_tank not like", value, "firstTank");
            return (Criteria) this;
        }

        public Criteria andFirstTankIn(List<String> values) {
            addCriterion("first_tank in", values, "firstTank");
            return (Criteria) this;
        }

        public Criteria andFirstTankNotIn(List<String> values) {
            addCriterion("first_tank not in", values, "firstTank");
            return (Criteria) this;
        }

        public Criteria andFirstTankBetween(String value1, String value2) {
            addCriterion("first_tank between", value1, value2, "firstTank");
            return (Criteria) this;
        }

        public Criteria andFirstTankNotBetween(String value1, String value2) {
            addCriterion("first_tank not between", value1, value2, "firstTank");
            return (Criteria) this;
        }

        public Criteria andSkipOrderChainIsNull() {
            addCriterion("skip_order_chain is null");
            return (Criteria) this;
        }

        public Criteria andSkipOrderChainIsNotNull() {
            addCriterion("skip_order_chain is not null");
            return (Criteria) this;
        }

        public Criteria andSkipOrderChainEqualTo(String value) {
            addCriterion("skip_order_chain =", value, "skipOrderChain");
            return (Criteria) this;
        }

        public Criteria andSkipOrderChainNotEqualTo(String value) {
            addCriterion("skip_order_chain <>", value, "skipOrderChain");
            return (Criteria) this;
        }

        public Criteria andSkipOrderChainGreaterThan(String value) {
            addCriterion("skip_order_chain >", value, "skipOrderChain");
            return (Criteria) this;
        }

        public Criteria andSkipOrderChainGreaterThanOrEqualTo(String value) {
            addCriterion("skip_order_chain >=", value, "skipOrderChain");
            return (Criteria) this;
        }

        public Criteria andSkipOrderChainLessThan(String value) {
            addCriterion("skip_order_chain <", value, "skipOrderChain");
            return (Criteria) this;
        }

        public Criteria andSkipOrderChainLessThanOrEqualTo(String value) {
            addCriterion("skip_order_chain <=", value, "skipOrderChain");
            return (Criteria) this;
        }

        public Criteria andSkipOrderChainLike(String value) {
            addCriterion("skip_order_chain like", value, "skipOrderChain");
            return (Criteria) this;
        }

        public Criteria andSkipOrderChainNotLike(String value) {
            addCriterion("skip_order_chain not like", value, "skipOrderChain");
            return (Criteria) this;
        }

        public Criteria andSkipOrderChainIn(List<String> values) {
            addCriterion("skip_order_chain in", values, "skipOrderChain");
            return (Criteria) this;
        }

        public Criteria andSkipOrderChainNotIn(List<String> values) {
            addCriterion("skip_order_chain not in", values, "skipOrderChain");
            return (Criteria) this;
        }

        public Criteria andSkipOrderChainBetween(String value1, String value2) {
            addCriterion("skip_order_chain between", value1, value2, "skipOrderChain");
            return (Criteria) this;
        }

        public Criteria andSkipOrderChainNotBetween(String value1, String value2) {
            addCriterion("skip_order_chain not between", value1, value2, "skipOrderChain");
            return (Criteria) this;
        }

        public Criteria andOuterLossOperationIsNull() {
            addCriterion("outer_loss_operation is null");
            return (Criteria) this;
        }

        public Criteria andOuterLossOperationIsNotNull() {
            addCriterion("outer_loss_operation is not null");
            return (Criteria) this;
        }

        public Criteria andOuterLossOperationEqualTo(String value) {
            addCriterion("outer_loss_operation =", value, "outerLossOperation");
            return (Criteria) this;
        }

        public Criteria andOuterLossOperationNotEqualTo(String value) {
            addCriterion("outer_loss_operation <>", value, "outerLossOperation");
            return (Criteria) this;
        }

        public Criteria andOuterLossOperationGreaterThan(String value) {
            addCriterion("outer_loss_operation >", value, "outerLossOperation");
            return (Criteria) this;
        }

        public Criteria andOuterLossOperationGreaterThanOrEqualTo(String value) {
            addCriterion("outer_loss_operation >=", value, "outerLossOperation");
            return (Criteria) this;
        }

        public Criteria andOuterLossOperationLessThan(String value) {
            addCriterion("outer_loss_operation <", value, "outerLossOperation");
            return (Criteria) this;
        }

        public Criteria andOuterLossOperationLessThanOrEqualTo(String value) {
            addCriterion("outer_loss_operation <=", value, "outerLossOperation");
            return (Criteria) this;
        }

        public Criteria andOuterLossOperationLike(String value) {
            addCriterion("outer_loss_operation like", value, "outerLossOperation");
            return (Criteria) this;
        }

        public Criteria andOuterLossOperationNotLike(String value) {
            addCriterion("outer_loss_operation not like", value, "outerLossOperation");
            return (Criteria) this;
        }

        public Criteria andOuterLossOperationIn(List<String> values) {
            addCriterion("outer_loss_operation in", values, "outerLossOperation");
            return (Criteria) this;
        }

        public Criteria andOuterLossOperationNotIn(List<String> values) {
            addCriterion("outer_loss_operation not in", values, "outerLossOperation");
            return (Criteria) this;
        }

        public Criteria andOuterLossOperationBetween(String value1, String value2) {
            addCriterion("outer_loss_operation between", value1, value2, "outerLossOperation");
            return (Criteria) this;
        }

        public Criteria andOuterLossOperationNotBetween(String value1, String value2) {
            addCriterion("outer_loss_operation not between", value1, value2, "outerLossOperation");
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