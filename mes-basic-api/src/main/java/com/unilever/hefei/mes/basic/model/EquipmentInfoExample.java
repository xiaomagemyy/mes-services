package com.unilever.hefei.mes.basic.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EquipmentInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EquipmentInfoExample() {
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

        public Criteria andProductionLineManagementIdIsNull() {
            addCriterion("production_line_management_id is null");
            return (Criteria) this;
        }

        public Criteria andProductionLineManagementIdIsNotNull() {
            addCriterion("production_line_management_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductionLineManagementIdEqualTo(Integer value) {
            addCriterion("production_line_management_id =", value, "productionLineManagementId");
            return (Criteria) this;
        }

        public Criteria andProductionLineManagementIdNotEqualTo(Integer value) {
            addCriterion("production_line_management_id <>", value, "productionLineManagementId");
            return (Criteria) this;
        }

        public Criteria andProductionLineManagementIdGreaterThan(Integer value) {
            addCriterion("production_line_management_id >", value, "productionLineManagementId");
            return (Criteria) this;
        }

        public Criteria andProductionLineManagementIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("production_line_management_id >=", value, "productionLineManagementId");
            return (Criteria) this;
        }

        public Criteria andProductionLineManagementIdLessThan(Integer value) {
            addCriterion("production_line_management_id <", value, "productionLineManagementId");
            return (Criteria) this;
        }

        public Criteria andProductionLineManagementIdLessThanOrEqualTo(Integer value) {
            addCriterion("production_line_management_id <=", value, "productionLineManagementId");
            return (Criteria) this;
        }

        public Criteria andProductionLineManagementIdIn(List<Integer> values) {
            addCriterion("production_line_management_id in", values, "productionLineManagementId");
            return (Criteria) this;
        }

        public Criteria andProductionLineManagementIdNotIn(List<Integer> values) {
            addCriterion("production_line_management_id not in", values, "productionLineManagementId");
            return (Criteria) this;
        }

        public Criteria andProductionLineManagementIdBetween(Integer value1, Integer value2) {
            addCriterion("production_line_management_id between", value1, value2, "productionLineManagementId");
            return (Criteria) this;
        }

        public Criteria andProductionLineManagementIdNotBetween(Integer value1, Integer value2) {
            addCriterion("production_line_management_id not between", value1, value2, "productionLineManagementId");
            return (Criteria) this;
        }

        public Criteria andInnerOuterIsNull() {
            addCriterion("inner_outer is null");
            return (Criteria) this;
        }

        public Criteria andInnerOuterIsNotNull() {
            addCriterion("inner_outer is not null");
            return (Criteria) this;
        }

        public Criteria andInnerOuterEqualTo(String value) {
            addCriterion("inner_outer =", value, "innerOuter");
            return (Criteria) this;
        }

        public Criteria andInnerOuterNotEqualTo(String value) {
            addCriterion("inner_outer <>", value, "innerOuter");
            return (Criteria) this;
        }

        public Criteria andInnerOuterGreaterThan(String value) {
            addCriterion("inner_outer >", value, "innerOuter");
            return (Criteria) this;
        }

        public Criteria andInnerOuterGreaterThanOrEqualTo(String value) {
            addCriterion("inner_outer >=", value, "innerOuter");
            return (Criteria) this;
        }

        public Criteria andInnerOuterLessThan(String value) {
            addCriterion("inner_outer <", value, "innerOuter");
            return (Criteria) this;
        }

        public Criteria andInnerOuterLessThanOrEqualTo(String value) {
            addCriterion("inner_outer <=", value, "innerOuter");
            return (Criteria) this;
        }

        public Criteria andInnerOuterLike(String value) {
            addCriterion("inner_outer like", value, "innerOuter");
            return (Criteria) this;
        }

        public Criteria andInnerOuterNotLike(String value) {
            addCriterion("inner_outer not like", value, "innerOuter");
            return (Criteria) this;
        }

        public Criteria andInnerOuterIn(List<String> values) {
            addCriterion("inner_outer in", values, "innerOuter");
            return (Criteria) this;
        }

        public Criteria andInnerOuterNotIn(List<String> values) {
            addCriterion("inner_outer not in", values, "innerOuter");
            return (Criteria) this;
        }

        public Criteria andInnerOuterBetween(String value1, String value2) {
            addCriterion("inner_outer between", value1, value2, "innerOuter");
            return (Criteria) this;
        }

        public Criteria andInnerOuterNotBetween(String value1, String value2) {
            addCriterion("inner_outer not between", value1, value2, "innerOuter");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberIsNull() {
            addCriterion("equipment_number is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberIsNotNull() {
            addCriterion("equipment_number is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberEqualTo(String value) {
            addCriterion("equipment_number =", value, "equipmentNumber");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberNotEqualTo(String value) {
            addCriterion("equipment_number <>", value, "equipmentNumber");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberGreaterThan(String value) {
            addCriterion("equipment_number >", value, "equipmentNumber");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberGreaterThanOrEqualTo(String value) {
            addCriterion("equipment_number >=", value, "equipmentNumber");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberLessThan(String value) {
            addCriterion("equipment_number <", value, "equipmentNumber");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberLessThanOrEqualTo(String value) {
            addCriterion("equipment_number <=", value, "equipmentNumber");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberLike(String value) {
            addCriterion("equipment_number like", value, "equipmentNumber");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberNotLike(String value) {
            addCriterion("equipment_number not like", value, "equipmentNumber");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberIn(List<String> values) {
            addCriterion("equipment_number in", values, "equipmentNumber");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberNotIn(List<String> values) {
            addCriterion("equipment_number not in", values, "equipmentNumber");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberBetween(String value1, String value2) {
            addCriterion("equipment_number between", value1, value2, "equipmentNumber");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberNotBetween(String value1, String value2) {
            addCriterion("equipment_number not between", value1, value2, "equipmentNumber");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameIsNull() {
            addCriterion("equipment_name is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameIsNotNull() {
            addCriterion("equipment_name is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameEqualTo(String value) {
            addCriterion("equipment_name =", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameNotEqualTo(String value) {
            addCriterion("equipment_name <>", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameGreaterThan(String value) {
            addCriterion("equipment_name >", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("equipment_name >=", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameLessThan(String value) {
            addCriterion("equipment_name <", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameLessThanOrEqualTo(String value) {
            addCriterion("equipment_name <=", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameLike(String value) {
            addCriterion("equipment_name like", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameNotLike(String value) {
            addCriterion("equipment_name not like", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameIn(List<String> values) {
            addCriterion("equipment_name in", values, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameNotIn(List<String> values) {
            addCriterion("equipment_name not in", values, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameBetween(String value1, String value2) {
            addCriterion("equipment_name between", value1, value2, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameNotBetween(String value1, String value2) {
            addCriterion("equipment_name not between", value1, value2, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("model not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andFixedAssetNumberIsNull() {
            addCriterion("fixed_asset_number is null");
            return (Criteria) this;
        }

        public Criteria andFixedAssetNumberIsNotNull() {
            addCriterion("fixed_asset_number is not null");
            return (Criteria) this;
        }

        public Criteria andFixedAssetNumberEqualTo(String value) {
            addCriterion("fixed_asset_number =", value, "fixedAssetNumber");
            return (Criteria) this;
        }

        public Criteria andFixedAssetNumberNotEqualTo(String value) {
            addCriterion("fixed_asset_number <>", value, "fixedAssetNumber");
            return (Criteria) this;
        }

        public Criteria andFixedAssetNumberGreaterThan(String value) {
            addCriterion("fixed_asset_number >", value, "fixedAssetNumber");
            return (Criteria) this;
        }

        public Criteria andFixedAssetNumberGreaterThanOrEqualTo(String value) {
            addCriterion("fixed_asset_number >=", value, "fixedAssetNumber");
            return (Criteria) this;
        }

        public Criteria andFixedAssetNumberLessThan(String value) {
            addCriterion("fixed_asset_number <", value, "fixedAssetNumber");
            return (Criteria) this;
        }

        public Criteria andFixedAssetNumberLessThanOrEqualTo(String value) {
            addCriterion("fixed_asset_number <=", value, "fixedAssetNumber");
            return (Criteria) this;
        }

        public Criteria andFixedAssetNumberLike(String value) {
            addCriterion("fixed_asset_number like", value, "fixedAssetNumber");
            return (Criteria) this;
        }

        public Criteria andFixedAssetNumberNotLike(String value) {
            addCriterion("fixed_asset_number not like", value, "fixedAssetNumber");
            return (Criteria) this;
        }

        public Criteria andFixedAssetNumberIn(List<String> values) {
            addCriterion("fixed_asset_number in", values, "fixedAssetNumber");
            return (Criteria) this;
        }

        public Criteria andFixedAssetNumberNotIn(List<String> values) {
            addCriterion("fixed_asset_number not in", values, "fixedAssetNumber");
            return (Criteria) this;
        }

        public Criteria andFixedAssetNumberBetween(String value1, String value2) {
            addCriterion("fixed_asset_number between", value1, value2, "fixedAssetNumber");
            return (Criteria) this;
        }

        public Criteria andFixedAssetNumberNotBetween(String value1, String value2) {
            addCriterion("fixed_asset_number not between", value1, value2, "fixedAssetNumber");
            return (Criteria) this;
        }

        public Criteria andWorkingProcedureIsNull() {
            addCriterion("working_procedure is null");
            return (Criteria) this;
        }

        public Criteria andWorkingProcedureIsNotNull() {
            addCriterion("working_procedure is not null");
            return (Criteria) this;
        }

        public Criteria andWorkingProcedureEqualTo(String value) {
            addCriterion("working_procedure =", value, "workingProcedure");
            return (Criteria) this;
        }

        public Criteria andWorkingProcedureNotEqualTo(String value) {
            addCriterion("working_procedure <>", value, "workingProcedure");
            return (Criteria) this;
        }

        public Criteria andWorkingProcedureGreaterThan(String value) {
            addCriterion("working_procedure >", value, "workingProcedure");
            return (Criteria) this;
        }

        public Criteria andWorkingProcedureGreaterThanOrEqualTo(String value) {
            addCriterion("working_procedure >=", value, "workingProcedure");
            return (Criteria) this;
        }

        public Criteria andWorkingProcedureLessThan(String value) {
            addCriterion("working_procedure <", value, "workingProcedure");
            return (Criteria) this;
        }

        public Criteria andWorkingProcedureLessThanOrEqualTo(String value) {
            addCriterion("working_procedure <=", value, "workingProcedure");
            return (Criteria) this;
        }

        public Criteria andWorkingProcedureLike(String value) {
            addCriterion("working_procedure like", value, "workingProcedure");
            return (Criteria) this;
        }

        public Criteria andWorkingProcedureNotLike(String value) {
            addCriterion("working_procedure not like", value, "workingProcedure");
            return (Criteria) this;
        }

        public Criteria andWorkingProcedureIn(List<String> values) {
            addCriterion("working_procedure in", values, "workingProcedure");
            return (Criteria) this;
        }

        public Criteria andWorkingProcedureNotIn(List<String> values) {
            addCriterion("working_procedure not in", values, "workingProcedure");
            return (Criteria) this;
        }

        public Criteria andWorkingProcedureBetween(String value1, String value2) {
            addCriterion("working_procedure between", value1, value2, "workingProcedure");
            return (Criteria) this;
        }

        public Criteria andWorkingProcedureNotBetween(String value1, String value2) {
            addCriterion("working_procedure not between", value1, value2, "workingProcedure");
            return (Criteria) this;
        }

        public Criteria andEquipmentDirectorIsNull() {
            addCriterion("equipment_director is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentDirectorIsNotNull() {
            addCriterion("equipment_director is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentDirectorEqualTo(String value) {
            addCriterion("equipment_director =", value, "equipmentDirector");
            return (Criteria) this;
        }

        public Criteria andEquipmentDirectorNotEqualTo(String value) {
            addCriterion("equipment_director <>", value, "equipmentDirector");
            return (Criteria) this;
        }

        public Criteria andEquipmentDirectorGreaterThan(String value) {
            addCriterion("equipment_director >", value, "equipmentDirector");
            return (Criteria) this;
        }

        public Criteria andEquipmentDirectorGreaterThanOrEqualTo(String value) {
            addCriterion("equipment_director >=", value, "equipmentDirector");
            return (Criteria) this;
        }

        public Criteria andEquipmentDirectorLessThan(String value) {
            addCriterion("equipment_director <", value, "equipmentDirector");
            return (Criteria) this;
        }

        public Criteria andEquipmentDirectorLessThanOrEqualTo(String value) {
            addCriterion("equipment_director <=", value, "equipmentDirector");
            return (Criteria) this;
        }

        public Criteria andEquipmentDirectorLike(String value) {
            addCriterion("equipment_director like", value, "equipmentDirector");
            return (Criteria) this;
        }

        public Criteria andEquipmentDirectorNotLike(String value) {
            addCriterion("equipment_director not like", value, "equipmentDirector");
            return (Criteria) this;
        }

        public Criteria andEquipmentDirectorIn(List<String> values) {
            addCriterion("equipment_director in", values, "equipmentDirector");
            return (Criteria) this;
        }

        public Criteria andEquipmentDirectorNotIn(List<String> values) {
            addCriterion("equipment_director not in", values, "equipmentDirector");
            return (Criteria) this;
        }

        public Criteria andEquipmentDirectorBetween(String value1, String value2) {
            addCriterion("equipment_director between", value1, value2, "equipmentDirector");
            return (Criteria) this;
        }

        public Criteria andEquipmentDirectorNotBetween(String value1, String value2) {
            addCriterion("equipment_director not between", value1, value2, "equipmentDirector");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNull() {
            addCriterion("phone_number is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNotNull() {
            addCriterion("phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberEqualTo(String value) {
            addCriterion("phone_number =", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotEqualTo(String value) {
            addCriterion("phone_number <>", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThan(String value) {
            addCriterion("phone_number >", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("phone_number >=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThan(String value) {
            addCriterion("phone_number <", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("phone_number <=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLike(String value) {
            addCriterion("phone_number like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotLike(String value) {
            addCriterion("phone_number not like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIn(List<String> values) {
            addCriterion("phone_number in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotIn(List<String> values) {
            addCriterion("phone_number not in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBetween(String value1, String value2) {
            addCriterion("phone_number between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("phone_number not between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andRatedPowerIsNull() {
            addCriterion("rated_power is null");
            return (Criteria) this;
        }

        public Criteria andRatedPowerIsNotNull() {
            addCriterion("rated_power is not null");
            return (Criteria) this;
        }

        public Criteria andRatedPowerEqualTo(String value) {
            addCriterion("rated_power =", value, "ratedPower");
            return (Criteria) this;
        }

        public Criteria andRatedPowerNotEqualTo(String value) {
            addCriterion("rated_power <>", value, "ratedPower");
            return (Criteria) this;
        }

        public Criteria andRatedPowerGreaterThan(String value) {
            addCriterion("rated_power >", value, "ratedPower");
            return (Criteria) this;
        }

        public Criteria andRatedPowerGreaterThanOrEqualTo(String value) {
            addCriterion("rated_power >=", value, "ratedPower");
            return (Criteria) this;
        }

        public Criteria andRatedPowerLessThan(String value) {
            addCriterion("rated_power <", value, "ratedPower");
            return (Criteria) this;
        }

        public Criteria andRatedPowerLessThanOrEqualTo(String value) {
            addCriterion("rated_power <=", value, "ratedPower");
            return (Criteria) this;
        }

        public Criteria andRatedPowerLike(String value) {
            addCriterion("rated_power like", value, "ratedPower");
            return (Criteria) this;
        }

        public Criteria andRatedPowerNotLike(String value) {
            addCriterion("rated_power not like", value, "ratedPower");
            return (Criteria) this;
        }

        public Criteria andRatedPowerIn(List<String> values) {
            addCriterion("rated_power in", values, "ratedPower");
            return (Criteria) this;
        }

        public Criteria andRatedPowerNotIn(List<String> values) {
            addCriterion("rated_power not in", values, "ratedPower");
            return (Criteria) this;
        }

        public Criteria andRatedPowerBetween(String value1, String value2) {
            addCriterion("rated_power between", value1, value2, "ratedPower");
            return (Criteria) this;
        }

        public Criteria andRatedPowerNotBetween(String value1, String value2) {
            addCriterion("rated_power not between", value1, value2, "ratedPower");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andFactoryNumberIsNull() {
            addCriterion("factory_number is null");
            return (Criteria) this;
        }

        public Criteria andFactoryNumberIsNotNull() {
            addCriterion("factory_number is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryNumberEqualTo(String value) {
            addCriterion("factory_number =", value, "factoryNumber");
            return (Criteria) this;
        }

        public Criteria andFactoryNumberNotEqualTo(String value) {
            addCriterion("factory_number <>", value, "factoryNumber");
            return (Criteria) this;
        }

        public Criteria andFactoryNumberGreaterThan(String value) {
            addCriterion("factory_number >", value, "factoryNumber");
            return (Criteria) this;
        }

        public Criteria andFactoryNumberGreaterThanOrEqualTo(String value) {
            addCriterion("factory_number >=", value, "factoryNumber");
            return (Criteria) this;
        }

        public Criteria andFactoryNumberLessThan(String value) {
            addCriterion("factory_number <", value, "factoryNumber");
            return (Criteria) this;
        }

        public Criteria andFactoryNumberLessThanOrEqualTo(String value) {
            addCriterion("factory_number <=", value, "factoryNumber");
            return (Criteria) this;
        }

        public Criteria andFactoryNumberLike(String value) {
            addCriterion("factory_number like", value, "factoryNumber");
            return (Criteria) this;
        }

        public Criteria andFactoryNumberNotLike(String value) {
            addCriterion("factory_number not like", value, "factoryNumber");
            return (Criteria) this;
        }

        public Criteria andFactoryNumberIn(List<String> values) {
            addCriterion("factory_number in", values, "factoryNumber");
            return (Criteria) this;
        }

        public Criteria andFactoryNumberNotIn(List<String> values) {
            addCriterion("factory_number not in", values, "factoryNumber");
            return (Criteria) this;
        }

        public Criteria andFactoryNumberBetween(String value1, String value2) {
            addCriterion("factory_number between", value1, value2, "factoryNumber");
            return (Criteria) this;
        }

        public Criteria andFactoryNumberNotBetween(String value1, String value2) {
            addCriterion("factory_number not between", value1, value2, "factoryNumber");
            return (Criteria) this;
        }

        public Criteria andFactoryNameIsNull() {
            addCriterion("factory_name is null");
            return (Criteria) this;
        }

        public Criteria andFactoryNameIsNotNull() {
            addCriterion("factory_name is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryNameEqualTo(String value) {
            addCriterion("factory_name =", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameNotEqualTo(String value) {
            addCriterion("factory_name <>", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameGreaterThan(String value) {
            addCriterion("factory_name >", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("factory_name >=", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameLessThan(String value) {
            addCriterion("factory_name <", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameLessThanOrEqualTo(String value) {
            addCriterion("factory_name <=", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameLike(String value) {
            addCriterion("factory_name like", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameNotLike(String value) {
            addCriterion("factory_name not like", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameIn(List<String> values) {
            addCriterion("factory_name in", values, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameNotIn(List<String> values) {
            addCriterion("factory_name not in", values, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameBetween(String value1, String value2) {
            addCriterion("factory_name between", value1, value2, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameNotBetween(String value1, String value2) {
            addCriterion("factory_name not between", value1, value2, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryLinkmanIsNull() {
            addCriterion("factory_linkman is null");
            return (Criteria) this;
        }

        public Criteria andFactoryLinkmanIsNotNull() {
            addCriterion("factory_linkman is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryLinkmanEqualTo(String value) {
            addCriterion("factory_linkman =", value, "factoryLinkman");
            return (Criteria) this;
        }

        public Criteria andFactoryLinkmanNotEqualTo(String value) {
            addCriterion("factory_linkman <>", value, "factoryLinkman");
            return (Criteria) this;
        }

        public Criteria andFactoryLinkmanGreaterThan(String value) {
            addCriterion("factory_linkman >", value, "factoryLinkman");
            return (Criteria) this;
        }

        public Criteria andFactoryLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("factory_linkman >=", value, "factoryLinkman");
            return (Criteria) this;
        }

        public Criteria andFactoryLinkmanLessThan(String value) {
            addCriterion("factory_linkman <", value, "factoryLinkman");
            return (Criteria) this;
        }

        public Criteria andFactoryLinkmanLessThanOrEqualTo(String value) {
            addCriterion("factory_linkman <=", value, "factoryLinkman");
            return (Criteria) this;
        }

        public Criteria andFactoryLinkmanLike(String value) {
            addCriterion("factory_linkman like", value, "factoryLinkman");
            return (Criteria) this;
        }

        public Criteria andFactoryLinkmanNotLike(String value) {
            addCriterion("factory_linkman not like", value, "factoryLinkman");
            return (Criteria) this;
        }

        public Criteria andFactoryLinkmanIn(List<String> values) {
            addCriterion("factory_linkman in", values, "factoryLinkman");
            return (Criteria) this;
        }

        public Criteria andFactoryLinkmanNotIn(List<String> values) {
            addCriterion("factory_linkman not in", values, "factoryLinkman");
            return (Criteria) this;
        }

        public Criteria andFactoryLinkmanBetween(String value1, String value2) {
            addCriterion("factory_linkman between", value1, value2, "factoryLinkman");
            return (Criteria) this;
        }

        public Criteria andFactoryLinkmanNotBetween(String value1, String value2) {
            addCriterion("factory_linkman not between", value1, value2, "factoryLinkman");
            return (Criteria) this;
        }

        public Criteria andFactoryLinkmanPhoneNumberIsNull() {
            addCriterion("factory_linkman_phone_number is null");
            return (Criteria) this;
        }

        public Criteria andFactoryLinkmanPhoneNumberIsNotNull() {
            addCriterion("factory_linkman_phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryLinkmanPhoneNumberEqualTo(String value) {
            addCriterion("factory_linkman_phone_number =", value, "factoryLinkmanPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andFactoryLinkmanPhoneNumberNotEqualTo(String value) {
            addCriterion("factory_linkman_phone_number <>", value, "factoryLinkmanPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andFactoryLinkmanPhoneNumberGreaterThan(String value) {
            addCriterion("factory_linkman_phone_number >", value, "factoryLinkmanPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andFactoryLinkmanPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("factory_linkman_phone_number >=", value, "factoryLinkmanPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andFactoryLinkmanPhoneNumberLessThan(String value) {
            addCriterion("factory_linkman_phone_number <", value, "factoryLinkmanPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andFactoryLinkmanPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("factory_linkman_phone_number <=", value, "factoryLinkmanPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andFactoryLinkmanPhoneNumberLike(String value) {
            addCriterion("factory_linkman_phone_number like", value, "factoryLinkmanPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andFactoryLinkmanPhoneNumberNotLike(String value) {
            addCriterion("factory_linkman_phone_number not like", value, "factoryLinkmanPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andFactoryLinkmanPhoneNumberIn(List<String> values) {
            addCriterion("factory_linkman_phone_number in", values, "factoryLinkmanPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andFactoryLinkmanPhoneNumberNotIn(List<String> values) {
            addCriterion("factory_linkman_phone_number not in", values, "factoryLinkmanPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andFactoryLinkmanPhoneNumberBetween(String value1, String value2) {
            addCriterion("factory_linkman_phone_number between", value1, value2, "factoryLinkmanPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andFactoryLinkmanPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("factory_linkman_phone_number not between", value1, value2, "factoryLinkmanPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andFactoryLinkmanMailIsNull() {
            addCriterion("factory_linkman_mail is null");
            return (Criteria) this;
        }

        public Criteria andFactoryLinkmanMailIsNotNull() {
            addCriterion("factory_linkman_mail is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryLinkmanMailEqualTo(String value) {
            addCriterion("factory_linkman_mail =", value, "factoryLinkmanMail");
            return (Criteria) this;
        }

        public Criteria andFactoryLinkmanMailNotEqualTo(String value) {
            addCriterion("factory_linkman_mail <>", value, "factoryLinkmanMail");
            return (Criteria) this;
        }

        public Criteria andFactoryLinkmanMailGreaterThan(String value) {
            addCriterion("factory_linkman_mail >", value, "factoryLinkmanMail");
            return (Criteria) this;
        }

        public Criteria andFactoryLinkmanMailGreaterThanOrEqualTo(String value) {
            addCriterion("factory_linkman_mail >=", value, "factoryLinkmanMail");
            return (Criteria) this;
        }

        public Criteria andFactoryLinkmanMailLessThan(String value) {
            addCriterion("factory_linkman_mail <", value, "factoryLinkmanMail");
            return (Criteria) this;
        }

        public Criteria andFactoryLinkmanMailLessThanOrEqualTo(String value) {
            addCriterion("factory_linkman_mail <=", value, "factoryLinkmanMail");
            return (Criteria) this;
        }

        public Criteria andFactoryLinkmanMailLike(String value) {
            addCriterion("factory_linkman_mail like", value, "factoryLinkmanMail");
            return (Criteria) this;
        }

        public Criteria andFactoryLinkmanMailNotLike(String value) {
            addCriterion("factory_linkman_mail not like", value, "factoryLinkmanMail");
            return (Criteria) this;
        }

        public Criteria andFactoryLinkmanMailIn(List<String> values) {
            addCriterion("factory_linkman_mail in", values, "factoryLinkmanMail");
            return (Criteria) this;
        }

        public Criteria andFactoryLinkmanMailNotIn(List<String> values) {
            addCriterion("factory_linkman_mail not in", values, "factoryLinkmanMail");
            return (Criteria) this;
        }

        public Criteria andFactoryLinkmanMailBetween(String value1, String value2) {
            addCriterion("factory_linkman_mail between", value1, value2, "factoryLinkmanMail");
            return (Criteria) this;
        }

        public Criteria andFactoryLinkmanMailNotBetween(String value1, String value2) {
            addCriterion("factory_linkman_mail not between", value1, value2, "factoryLinkmanMail");
            return (Criteria) this;
        }

        public Criteria andLocationOfInstallationIsNull() {
            addCriterion("location_of_installation is null");
            return (Criteria) this;
        }

        public Criteria andLocationOfInstallationIsNotNull() {
            addCriterion("location_of_installation is not null");
            return (Criteria) this;
        }

        public Criteria andLocationOfInstallationEqualTo(String value) {
            addCriterion("location_of_installation =", value, "locationOfInstallation");
            return (Criteria) this;
        }

        public Criteria andLocationOfInstallationNotEqualTo(String value) {
            addCriterion("location_of_installation <>", value, "locationOfInstallation");
            return (Criteria) this;
        }

        public Criteria andLocationOfInstallationGreaterThan(String value) {
            addCriterion("location_of_installation >", value, "locationOfInstallation");
            return (Criteria) this;
        }

        public Criteria andLocationOfInstallationGreaterThanOrEqualTo(String value) {
            addCriterion("location_of_installation >=", value, "locationOfInstallation");
            return (Criteria) this;
        }

        public Criteria andLocationOfInstallationLessThan(String value) {
            addCriterion("location_of_installation <", value, "locationOfInstallation");
            return (Criteria) this;
        }

        public Criteria andLocationOfInstallationLessThanOrEqualTo(String value) {
            addCriterion("location_of_installation <=", value, "locationOfInstallation");
            return (Criteria) this;
        }

        public Criteria andLocationOfInstallationLike(String value) {
            addCriterion("location_of_installation like", value, "locationOfInstallation");
            return (Criteria) this;
        }

        public Criteria andLocationOfInstallationNotLike(String value) {
            addCriterion("location_of_installation not like", value, "locationOfInstallation");
            return (Criteria) this;
        }

        public Criteria andLocationOfInstallationIn(List<String> values) {
            addCriterion("location_of_installation in", values, "locationOfInstallation");
            return (Criteria) this;
        }

        public Criteria andLocationOfInstallationNotIn(List<String> values) {
            addCriterion("location_of_installation not in", values, "locationOfInstallation");
            return (Criteria) this;
        }

        public Criteria andLocationOfInstallationBetween(String value1, String value2) {
            addCriterion("location_of_installation between", value1, value2, "locationOfInstallation");
            return (Criteria) this;
        }

        public Criteria andLocationOfInstallationNotBetween(String value1, String value2) {
            addCriterion("location_of_installation not between", value1, value2, "locationOfInstallation");
            return (Criteria) this;
        }

        public Criteria andDateOfProductionIsNull() {
            addCriterion("date_of_production is null");
            return (Criteria) this;
        }

        public Criteria andDateOfProductionIsNotNull() {
            addCriterion("date_of_production is not null");
            return (Criteria) this;
        }

        public Criteria andDateOfProductionEqualTo(String value) {
            addCriterion("date_of_production =", value, "dateOfProduction");
            return (Criteria) this;
        }

        public Criteria andDateOfProductionNotEqualTo(String value) {
            addCriterion("date_of_production <>", value, "dateOfProduction");
            return (Criteria) this;
        }

        public Criteria andDateOfProductionGreaterThan(String value) {
            addCriterion("date_of_production >", value, "dateOfProduction");
            return (Criteria) this;
        }

        public Criteria andDateOfProductionGreaterThanOrEqualTo(String value) {
            addCriterion("date_of_production >=", value, "dateOfProduction");
            return (Criteria) this;
        }

        public Criteria andDateOfProductionLessThan(String value) {
            addCriterion("date_of_production <", value, "dateOfProduction");
            return (Criteria) this;
        }

        public Criteria andDateOfProductionLessThanOrEqualTo(String value) {
            addCriterion("date_of_production <=", value, "dateOfProduction");
            return (Criteria) this;
        }

        public Criteria andDateOfProductionLike(String value) {
            addCriterion("date_of_production like", value, "dateOfProduction");
            return (Criteria) this;
        }

        public Criteria andDateOfProductionNotLike(String value) {
            addCriterion("date_of_production not like", value, "dateOfProduction");
            return (Criteria) this;
        }

        public Criteria andDateOfProductionIn(List<String> values) {
            addCriterion("date_of_production in", values, "dateOfProduction");
            return (Criteria) this;
        }

        public Criteria andDateOfProductionNotIn(List<String> values) {
            addCriterion("date_of_production not in", values, "dateOfProduction");
            return (Criteria) this;
        }

        public Criteria andDateOfProductionBetween(String value1, String value2) {
            addCriterion("date_of_production between", value1, value2, "dateOfProduction");
            return (Criteria) this;
        }

        public Criteria andDateOfProductionNotBetween(String value1, String value2) {
            addCriterion("date_of_production not between", value1, value2, "dateOfProduction");
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

        public Criteria andPmSpotXIsNull() {
            addCriterion("pm_spot_x is null");
            return (Criteria) this;
        }

        public Criteria andPmSpotXIsNotNull() {
            addCriterion("pm_spot_x is not null");
            return (Criteria) this;
        }

        public Criteria andPmSpotXEqualTo(Integer value) {
            addCriterion("pm_spot_x =", value, "pmSpotX");
            return (Criteria) this;
        }

        public Criteria andPmSpotXNotEqualTo(Integer value) {
            addCriterion("pm_spot_x <>", value, "pmSpotX");
            return (Criteria) this;
        }

        public Criteria andPmSpotXGreaterThan(Integer value) {
            addCriterion("pm_spot_x >", value, "pmSpotX");
            return (Criteria) this;
        }

        public Criteria andPmSpotXGreaterThanOrEqualTo(Integer value) {
            addCriterion("pm_spot_x >=", value, "pmSpotX");
            return (Criteria) this;
        }

        public Criteria andPmSpotXLessThan(Integer value) {
            addCriterion("pm_spot_x <", value, "pmSpotX");
            return (Criteria) this;
        }

        public Criteria andPmSpotXLessThanOrEqualTo(Integer value) {
            addCriterion("pm_spot_x <=", value, "pmSpotX");
            return (Criteria) this;
        }

        public Criteria andPmSpotXIn(List<Integer> values) {
            addCriterion("pm_spot_x in", values, "pmSpotX");
            return (Criteria) this;
        }

        public Criteria andPmSpotXNotIn(List<Integer> values) {
            addCriterion("pm_spot_x not in", values, "pmSpotX");
            return (Criteria) this;
        }

        public Criteria andPmSpotXBetween(Integer value1, Integer value2) {
            addCriterion("pm_spot_x between", value1, value2, "pmSpotX");
            return (Criteria) this;
        }

        public Criteria andPmSpotXNotBetween(Integer value1, Integer value2) {
            addCriterion("pm_spot_x not between", value1, value2, "pmSpotX");
            return (Criteria) this;
        }

        public Criteria andPmSpotYIsNull() {
            addCriterion("pm_spot_y is null");
            return (Criteria) this;
        }

        public Criteria andPmSpotYIsNotNull() {
            addCriterion("pm_spot_y is not null");
            return (Criteria) this;
        }

        public Criteria andPmSpotYEqualTo(Integer value) {
            addCriterion("pm_spot_y =", value, "pmSpotY");
            return (Criteria) this;
        }

        public Criteria andPmSpotYNotEqualTo(Integer value) {
            addCriterion("pm_spot_y <>", value, "pmSpotY");
            return (Criteria) this;
        }

        public Criteria andPmSpotYGreaterThan(Integer value) {
            addCriterion("pm_spot_y >", value, "pmSpotY");
            return (Criteria) this;
        }

        public Criteria andPmSpotYGreaterThanOrEqualTo(Integer value) {
            addCriterion("pm_spot_y >=", value, "pmSpotY");
            return (Criteria) this;
        }

        public Criteria andPmSpotYLessThan(Integer value) {
            addCriterion("pm_spot_y <", value, "pmSpotY");
            return (Criteria) this;
        }

        public Criteria andPmSpotYLessThanOrEqualTo(Integer value) {
            addCriterion("pm_spot_y <=", value, "pmSpotY");
            return (Criteria) this;
        }

        public Criteria andPmSpotYIn(List<Integer> values) {
            addCriterion("pm_spot_y in", values, "pmSpotY");
            return (Criteria) this;
        }

        public Criteria andPmSpotYNotIn(List<Integer> values) {
            addCriterion("pm_spot_y not in", values, "pmSpotY");
            return (Criteria) this;
        }

        public Criteria andPmSpotYBetween(Integer value1, Integer value2) {
            addCriterion("pm_spot_y between", value1, value2, "pmSpotY");
            return (Criteria) this;
        }

        public Criteria andPmSpotYNotBetween(Integer value1, Integer value2) {
            addCriterion("pm_spot_y not between", value1, value2, "pmSpotY");
            return (Criteria) this;
        }

        public Criteria andPmTitleIsNull() {
            addCriterion("pm_title is null");
            return (Criteria) this;
        }

        public Criteria andPmTitleIsNotNull() {
            addCriterion("pm_title is not null");
            return (Criteria) this;
        }

        public Criteria andPmTitleEqualTo(String value) {
            addCriterion("pm_title =", value, "pmTitle");
            return (Criteria) this;
        }

        public Criteria andPmTitleNotEqualTo(String value) {
            addCriterion("pm_title <>", value, "pmTitle");
            return (Criteria) this;
        }

        public Criteria andPmTitleGreaterThan(String value) {
            addCriterion("pm_title >", value, "pmTitle");
            return (Criteria) this;
        }

        public Criteria andPmTitleGreaterThanOrEqualTo(String value) {
            addCriterion("pm_title >=", value, "pmTitle");
            return (Criteria) this;
        }

        public Criteria andPmTitleLessThan(String value) {
            addCriterion("pm_title <", value, "pmTitle");
            return (Criteria) this;
        }

        public Criteria andPmTitleLessThanOrEqualTo(String value) {
            addCriterion("pm_title <=", value, "pmTitle");
            return (Criteria) this;
        }

        public Criteria andPmTitleLike(String value) {
            addCriterion("pm_title like", value, "pmTitle");
            return (Criteria) this;
        }

        public Criteria andPmTitleNotLike(String value) {
            addCriterion("pm_title not like", value, "pmTitle");
            return (Criteria) this;
        }

        public Criteria andPmTitleIn(List<String> values) {
            addCriterion("pm_title in", values, "pmTitle");
            return (Criteria) this;
        }

        public Criteria andPmTitleNotIn(List<String> values) {
            addCriterion("pm_title not in", values, "pmTitle");
            return (Criteria) this;
        }

        public Criteria andPmTitleBetween(String value1, String value2) {
            addCriterion("pm_title between", value1, value2, "pmTitle");
            return (Criteria) this;
        }

        public Criteria andPmTitleNotBetween(String value1, String value2) {
            addCriterion("pm_title not between", value1, value2, "pmTitle");
            return (Criteria) this;
        }

        public Criteria andAmSpotXIsNull() {
            addCriterion("am_spot_x is null");
            return (Criteria) this;
        }

        public Criteria andAmSpotXIsNotNull() {
            addCriterion("am_spot_x is not null");
            return (Criteria) this;
        }

        public Criteria andAmSpotXEqualTo(Integer value) {
            addCriterion("am_spot_x =", value, "amSpotX");
            return (Criteria) this;
        }

        public Criteria andAmSpotXNotEqualTo(Integer value) {
            addCriterion("am_spot_x <>", value, "amSpotX");
            return (Criteria) this;
        }

        public Criteria andAmSpotXGreaterThan(Integer value) {
            addCriterion("am_spot_x >", value, "amSpotX");
            return (Criteria) this;
        }

        public Criteria andAmSpotXGreaterThanOrEqualTo(Integer value) {
            addCriterion("am_spot_x >=", value, "amSpotX");
            return (Criteria) this;
        }

        public Criteria andAmSpotXLessThan(Integer value) {
            addCriterion("am_spot_x <", value, "amSpotX");
            return (Criteria) this;
        }

        public Criteria andAmSpotXLessThanOrEqualTo(Integer value) {
            addCriterion("am_spot_x <=", value, "amSpotX");
            return (Criteria) this;
        }

        public Criteria andAmSpotXIn(List<Integer> values) {
            addCriterion("am_spot_x in", values, "amSpotX");
            return (Criteria) this;
        }

        public Criteria andAmSpotXNotIn(List<Integer> values) {
            addCriterion("am_spot_x not in", values, "amSpotX");
            return (Criteria) this;
        }

        public Criteria andAmSpotXBetween(Integer value1, Integer value2) {
            addCriterion("am_spot_x between", value1, value2, "amSpotX");
            return (Criteria) this;
        }

        public Criteria andAmSpotXNotBetween(Integer value1, Integer value2) {
            addCriterion("am_spot_x not between", value1, value2, "amSpotX");
            return (Criteria) this;
        }

        public Criteria andAmSpotYIsNull() {
            addCriterion("am_spot_y is null");
            return (Criteria) this;
        }

        public Criteria andAmSpotYIsNotNull() {
            addCriterion("am_spot_y is not null");
            return (Criteria) this;
        }

        public Criteria andAmSpotYEqualTo(Integer value) {
            addCriterion("am_spot_y =", value, "amSpotY");
            return (Criteria) this;
        }

        public Criteria andAmSpotYNotEqualTo(Integer value) {
            addCriterion("am_spot_y <>", value, "amSpotY");
            return (Criteria) this;
        }

        public Criteria andAmSpotYGreaterThan(Integer value) {
            addCriterion("am_spot_y >", value, "amSpotY");
            return (Criteria) this;
        }

        public Criteria andAmSpotYGreaterThanOrEqualTo(Integer value) {
            addCriterion("am_spot_y >=", value, "amSpotY");
            return (Criteria) this;
        }

        public Criteria andAmSpotYLessThan(Integer value) {
            addCriterion("am_spot_y <", value, "amSpotY");
            return (Criteria) this;
        }

        public Criteria andAmSpotYLessThanOrEqualTo(Integer value) {
            addCriterion("am_spot_y <=", value, "amSpotY");
            return (Criteria) this;
        }

        public Criteria andAmSpotYIn(List<Integer> values) {
            addCriterion("am_spot_y in", values, "amSpotY");
            return (Criteria) this;
        }

        public Criteria andAmSpotYNotIn(List<Integer> values) {
            addCriterion("am_spot_y not in", values, "amSpotY");
            return (Criteria) this;
        }

        public Criteria andAmSpotYBetween(Integer value1, Integer value2) {
            addCriterion("am_spot_y between", value1, value2, "amSpotY");
            return (Criteria) this;
        }

        public Criteria andAmSpotYNotBetween(Integer value1, Integer value2) {
            addCriterion("am_spot_y not between", value1, value2, "amSpotY");
            return (Criteria) this;
        }

        public Criteria andAmTitleIsNull() {
            addCriterion("am_title is null");
            return (Criteria) this;
        }

        public Criteria andAmTitleIsNotNull() {
            addCriterion("am_title is not null");
            return (Criteria) this;
        }

        public Criteria andAmTitleEqualTo(String value) {
            addCriterion("am_title =", value, "amTitle");
            return (Criteria) this;
        }

        public Criteria andAmTitleNotEqualTo(String value) {
            addCriterion("am_title <>", value, "amTitle");
            return (Criteria) this;
        }

        public Criteria andAmTitleGreaterThan(String value) {
            addCriterion("am_title >", value, "amTitle");
            return (Criteria) this;
        }

        public Criteria andAmTitleGreaterThanOrEqualTo(String value) {
            addCriterion("am_title >=", value, "amTitle");
            return (Criteria) this;
        }

        public Criteria andAmTitleLessThan(String value) {
            addCriterion("am_title <", value, "amTitle");
            return (Criteria) this;
        }

        public Criteria andAmTitleLessThanOrEqualTo(String value) {
            addCriterion("am_title <=", value, "amTitle");
            return (Criteria) this;
        }

        public Criteria andAmTitleLike(String value) {
            addCriterion("am_title like", value, "amTitle");
            return (Criteria) this;
        }

        public Criteria andAmTitleNotLike(String value) {
            addCriterion("am_title not like", value, "amTitle");
            return (Criteria) this;
        }

        public Criteria andAmTitleIn(List<String> values) {
            addCriterion("am_title in", values, "amTitle");
            return (Criteria) this;
        }

        public Criteria andAmTitleNotIn(List<String> values) {
            addCriterion("am_title not in", values, "amTitle");
            return (Criteria) this;
        }

        public Criteria andAmTitleBetween(String value1, String value2) {
            addCriterion("am_title between", value1, value2, "amTitle");
            return (Criteria) this;
        }

        public Criteria andAmTitleNotBetween(String value1, String value2) {
            addCriterion("am_title not between", value1, value2, "amTitle");
            return (Criteria) this;
        }

        public Criteria andEquipmentValueIsNull() {
            addCriterion("equipment_value is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentValueIsNotNull() {
            addCriterion("equipment_value is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentValueEqualTo(Double value) {
            addCriterion("equipment_value =", value, "equipmentValue");
            return (Criteria) this;
        }

        public Criteria andEquipmentValueNotEqualTo(Double value) {
            addCriterion("equipment_value <>", value, "equipmentValue");
            return (Criteria) this;
        }

        public Criteria andEquipmentValueGreaterThan(Double value) {
            addCriterion("equipment_value >", value, "equipmentValue");
            return (Criteria) this;
        }

        public Criteria andEquipmentValueGreaterThanOrEqualTo(Double value) {
            addCriterion("equipment_value >=", value, "equipmentValue");
            return (Criteria) this;
        }

        public Criteria andEquipmentValueLessThan(Double value) {
            addCriterion("equipment_value <", value, "equipmentValue");
            return (Criteria) this;
        }

        public Criteria andEquipmentValueLessThanOrEqualTo(Double value) {
            addCriterion("equipment_value <=", value, "equipmentValue");
            return (Criteria) this;
        }

        public Criteria andEquipmentValueIn(List<Double> values) {
            addCriterion("equipment_value in", values, "equipmentValue");
            return (Criteria) this;
        }

        public Criteria andEquipmentValueNotIn(List<Double> values) {
            addCriterion("equipment_value not in", values, "equipmentValue");
            return (Criteria) this;
        }

        public Criteria andEquipmentValueBetween(Double value1, Double value2) {
            addCriterion("equipment_value between", value1, value2, "equipmentValue");
            return (Criteria) this;
        }

        public Criteria andEquipmentValueNotBetween(Double value1, Double value2) {
            addCriterion("equipment_value not between", value1, value2, "equipmentValue");
            return (Criteria) this;
        }

        public Criteria andBuyDateIsNull() {
            addCriterion("buy_date is null");
            return (Criteria) this;
        }

        public Criteria andBuyDateIsNotNull() {
            addCriterion("buy_date is not null");
            return (Criteria) this;
        }

        public Criteria andBuyDateEqualTo(Date value) {
            addCriterion("buy_date =", value, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateNotEqualTo(Date value) {
            addCriterion("buy_date <>", value, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateGreaterThan(Date value) {
            addCriterion("buy_date >", value, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("buy_date >=", value, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateLessThan(Date value) {
            addCriterion("buy_date <", value, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateLessThanOrEqualTo(Date value) {
            addCriterion("buy_date <=", value, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateIn(List<Date> values) {
            addCriterion("buy_date in", values, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateNotIn(List<Date> values) {
            addCriterion("buy_date not in", values, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateBetween(Date value1, Date value2) {
            addCriterion("buy_date between", value1, value2, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateNotBetween(Date value1, Date value2) {
            addCriterion("buy_date not between", value1, value2, "buyDate");
            return (Criteria) this;
        }

        public Criteria andDesignPeriodIsNull() {
            addCriterion("design_period is null");
            return (Criteria) this;
        }

        public Criteria andDesignPeriodIsNotNull() {
            addCriterion("design_period is not null");
            return (Criteria) this;
        }

        public Criteria andDesignPeriodEqualTo(Integer value) {
            addCriterion("design_period =", value, "designPeriod");
            return (Criteria) this;
        }

        public Criteria andDesignPeriodNotEqualTo(Integer value) {
            addCriterion("design_period <>", value, "designPeriod");
            return (Criteria) this;
        }

        public Criteria andDesignPeriodGreaterThan(Integer value) {
            addCriterion("design_period >", value, "designPeriod");
            return (Criteria) this;
        }

        public Criteria andDesignPeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("design_period >=", value, "designPeriod");
            return (Criteria) this;
        }

        public Criteria andDesignPeriodLessThan(Integer value) {
            addCriterion("design_period <", value, "designPeriod");
            return (Criteria) this;
        }

        public Criteria andDesignPeriodLessThanOrEqualTo(Integer value) {
            addCriterion("design_period <=", value, "designPeriod");
            return (Criteria) this;
        }

        public Criteria andDesignPeriodIn(List<Integer> values) {
            addCriterion("design_period in", values, "designPeriod");
            return (Criteria) this;
        }

        public Criteria andDesignPeriodNotIn(List<Integer> values) {
            addCriterion("design_period not in", values, "designPeriod");
            return (Criteria) this;
        }

        public Criteria andDesignPeriodBetween(Integer value1, Integer value2) {
            addCriterion("design_period between", value1, value2, "designPeriod");
            return (Criteria) this;
        }

        public Criteria andDesignPeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("design_period not between", value1, value2, "designPeriod");
            return (Criteria) this;
        }

        public Criteria andEndValueIsNull() {
            addCriterion("end_value is null");
            return (Criteria) this;
        }

        public Criteria andEndValueIsNotNull() {
            addCriterion("end_value is not null");
            return (Criteria) this;
        }

        public Criteria andEndValueEqualTo(Double value) {
            addCriterion("end_value =", value, "endValue");
            return (Criteria) this;
        }

        public Criteria andEndValueNotEqualTo(Double value) {
            addCriterion("end_value <>", value, "endValue");
            return (Criteria) this;
        }

        public Criteria andEndValueGreaterThan(Double value) {
            addCriterion("end_value >", value, "endValue");
            return (Criteria) this;
        }

        public Criteria andEndValueGreaterThanOrEqualTo(Double value) {
            addCriterion("end_value >=", value, "endValue");
            return (Criteria) this;
        }

        public Criteria andEndValueLessThan(Double value) {
            addCriterion("end_value <", value, "endValue");
            return (Criteria) this;
        }

        public Criteria andEndValueLessThanOrEqualTo(Double value) {
            addCriterion("end_value <=", value, "endValue");
            return (Criteria) this;
        }

        public Criteria andEndValueIn(List<Double> values) {
            addCriterion("end_value in", values, "endValue");
            return (Criteria) this;
        }

        public Criteria andEndValueNotIn(List<Double> values) {
            addCriterion("end_value not in", values, "endValue");
            return (Criteria) this;
        }

        public Criteria andEndValueBetween(Double value1, Double value2) {
            addCriterion("end_value between", value1, value2, "endValue");
            return (Criteria) this;
        }

        public Criteria andEndValueNotBetween(Double value1, Double value2) {
            addCriterion("end_value not between", value1, value2, "endValue");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeIsNull() {
            addCriterion("equipment_type is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeIsNotNull() {
            addCriterion("equipment_type is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeEqualTo(String value) {
            addCriterion("equipment_type =", value, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeNotEqualTo(String value) {
            addCriterion("equipment_type <>", value, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeGreaterThan(String value) {
            addCriterion("equipment_type >", value, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("equipment_type >=", value, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeLessThan(String value) {
            addCriterion("equipment_type <", value, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeLessThanOrEqualTo(String value) {
            addCriterion("equipment_type <=", value, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeLike(String value) {
            addCriterion("equipment_type like", value, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeNotLike(String value) {
            addCriterion("equipment_type not like", value, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeIn(List<String> values) {
            addCriterion("equipment_type in", values, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeNotIn(List<String> values) {
            addCriterion("equipment_type not in", values, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeBetween(String value1, String value2) {
            addCriterion("equipment_type between", value1, value2, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeNotBetween(String value1, String value2) {
            addCriterion("equipment_type not between", value1, value2, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEnableOeeIsNull() {
            addCriterion("enable_oee is null");
            return (Criteria) this;
        }

        public Criteria andEnableOeeIsNotNull() {
            addCriterion("enable_oee is not null");
            return (Criteria) this;
        }

        public Criteria andEnableOeeEqualTo(Integer value) {
            addCriterion("enable_oee =", value, "enableOee");
            return (Criteria) this;
        }

        public Criteria andEnableOeeNotEqualTo(Integer value) {
            addCriterion("enable_oee <>", value, "enableOee");
            return (Criteria) this;
        }

        public Criteria andEnableOeeGreaterThan(Integer value) {
            addCriterion("enable_oee >", value, "enableOee");
            return (Criteria) this;
        }

        public Criteria andEnableOeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("enable_oee >=", value, "enableOee");
            return (Criteria) this;
        }

        public Criteria andEnableOeeLessThan(Integer value) {
            addCriterion("enable_oee <", value, "enableOee");
            return (Criteria) this;
        }

        public Criteria andEnableOeeLessThanOrEqualTo(Integer value) {
            addCriterion("enable_oee <=", value, "enableOee");
            return (Criteria) this;
        }

        public Criteria andEnableOeeIn(List<Integer> values) {
            addCriterion("enable_oee in", values, "enableOee");
            return (Criteria) this;
        }

        public Criteria andEnableOeeNotIn(List<Integer> values) {
            addCriterion("enable_oee not in", values, "enableOee");
            return (Criteria) this;
        }

        public Criteria andEnableOeeBetween(Integer value1, Integer value2) {
            addCriterion("enable_oee between", value1, value2, "enableOee");
            return (Criteria) this;
        }

        public Criteria andEnableOeeNotBetween(Integer value1, Integer value2) {
            addCriterion("enable_oee not between", value1, value2, "enableOee");
            return (Criteria) this;
        }

        public Criteria andEnableElectricIsNull() {
            addCriterion("enable_electric is null");
            return (Criteria) this;
        }

        public Criteria andEnableElectricIsNotNull() {
            addCriterion("enable_electric is not null");
            return (Criteria) this;
        }

        public Criteria andEnableElectricEqualTo(Integer value) {
            addCriterion("enable_electric =", value, "enableElectric");
            return (Criteria) this;
        }

        public Criteria andEnableElectricNotEqualTo(Integer value) {
            addCriterion("enable_electric <>", value, "enableElectric");
            return (Criteria) this;
        }

        public Criteria andEnableElectricGreaterThan(Integer value) {
            addCriterion("enable_electric >", value, "enableElectric");
            return (Criteria) this;
        }

        public Criteria andEnableElectricGreaterThanOrEqualTo(Integer value) {
            addCriterion("enable_electric >=", value, "enableElectric");
            return (Criteria) this;
        }

        public Criteria andEnableElectricLessThan(Integer value) {
            addCriterion("enable_electric <", value, "enableElectric");
            return (Criteria) this;
        }

        public Criteria andEnableElectricLessThanOrEqualTo(Integer value) {
            addCriterion("enable_electric <=", value, "enableElectric");
            return (Criteria) this;
        }

        public Criteria andEnableElectricIn(List<Integer> values) {
            addCriterion("enable_electric in", values, "enableElectric");
            return (Criteria) this;
        }

        public Criteria andEnableElectricNotIn(List<Integer> values) {
            addCriterion("enable_electric not in", values, "enableElectric");
            return (Criteria) this;
        }

        public Criteria andEnableElectricBetween(Integer value1, Integer value2) {
            addCriterion("enable_electric between", value1, value2, "enableElectric");
            return (Criteria) this;
        }

        public Criteria andEnableElectricNotBetween(Integer value1, Integer value2) {
            addCriterion("enable_electric not between", value1, value2, "enableElectric");
            return (Criteria) this;
        }

        public Criteria andEnableGasIsNull() {
            addCriterion("enable_gas is null");
            return (Criteria) this;
        }

        public Criteria andEnableGasIsNotNull() {
            addCriterion("enable_gas is not null");
            return (Criteria) this;
        }

        public Criteria andEnableGasEqualTo(Integer value) {
            addCriterion("enable_gas =", value, "enableGas");
            return (Criteria) this;
        }

        public Criteria andEnableGasNotEqualTo(Integer value) {
            addCriterion("enable_gas <>", value, "enableGas");
            return (Criteria) this;
        }

        public Criteria andEnableGasGreaterThan(Integer value) {
            addCriterion("enable_gas >", value, "enableGas");
            return (Criteria) this;
        }

        public Criteria andEnableGasGreaterThanOrEqualTo(Integer value) {
            addCriterion("enable_gas >=", value, "enableGas");
            return (Criteria) this;
        }

        public Criteria andEnableGasLessThan(Integer value) {
            addCriterion("enable_gas <", value, "enableGas");
            return (Criteria) this;
        }

        public Criteria andEnableGasLessThanOrEqualTo(Integer value) {
            addCriterion("enable_gas <=", value, "enableGas");
            return (Criteria) this;
        }

        public Criteria andEnableGasIn(List<Integer> values) {
            addCriterion("enable_gas in", values, "enableGas");
            return (Criteria) this;
        }

        public Criteria andEnableGasNotIn(List<Integer> values) {
            addCriterion("enable_gas not in", values, "enableGas");
            return (Criteria) this;
        }

        public Criteria andEnableGasBetween(Integer value1, Integer value2) {
            addCriterion("enable_gas between", value1, value2, "enableGas");
            return (Criteria) this;
        }

        public Criteria andEnableGasNotBetween(Integer value1, Integer value2) {
            addCriterion("enable_gas not between", value1, value2, "enableGas");
            return (Criteria) this;
        }

        public Criteria andEquipmentOrderIsNull() {
            addCriterion("equipment_order is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentOrderIsNotNull() {
            addCriterion("equipment_order is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentOrderEqualTo(Integer value) {
            addCriterion("equipment_order =", value, "equipmentOrder");
            return (Criteria) this;
        }

        public Criteria andEquipmentOrderNotEqualTo(Integer value) {
            addCriterion("equipment_order <>", value, "equipmentOrder");
            return (Criteria) this;
        }

        public Criteria andEquipmentOrderGreaterThan(Integer value) {
            addCriterion("equipment_order >", value, "equipmentOrder");
            return (Criteria) this;
        }

        public Criteria andEquipmentOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("equipment_order >=", value, "equipmentOrder");
            return (Criteria) this;
        }

        public Criteria andEquipmentOrderLessThan(Integer value) {
            addCriterion("equipment_order <", value, "equipmentOrder");
            return (Criteria) this;
        }

        public Criteria andEquipmentOrderLessThanOrEqualTo(Integer value) {
            addCriterion("equipment_order <=", value, "equipmentOrder");
            return (Criteria) this;
        }

        public Criteria andEquipmentOrderIn(List<Integer> values) {
            addCriterion("equipment_order in", values, "equipmentOrder");
            return (Criteria) this;
        }

        public Criteria andEquipmentOrderNotIn(List<Integer> values) {
            addCriterion("equipment_order not in", values, "equipmentOrder");
            return (Criteria) this;
        }

        public Criteria andEquipmentOrderBetween(Integer value1, Integer value2) {
            addCriterion("equipment_order between", value1, value2, "equipmentOrder");
            return (Criteria) this;
        }

        public Criteria andEquipmentOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("equipment_order not between", value1, value2, "equipmentOrder");
            return (Criteria) this;
        }

        public Criteria andPmUsedIsNull() {
            addCriterion("pm_used is null");
            return (Criteria) this;
        }

        public Criteria andPmUsedIsNotNull() {
            addCriterion("pm_used is not null");
            return (Criteria) this;
        }

        public Criteria andPmUsedEqualTo(String value) {
            addCriterion("pm_used =", value, "pmUsed");
            return (Criteria) this;
        }

        public Criteria andPmUsedNotEqualTo(String value) {
            addCriterion("pm_used <>", value, "pmUsed");
            return (Criteria) this;
        }

        public Criteria andPmUsedGreaterThan(String value) {
            addCriterion("pm_used >", value, "pmUsed");
            return (Criteria) this;
        }

        public Criteria andPmUsedGreaterThanOrEqualTo(String value) {
            addCriterion("pm_used >=", value, "pmUsed");
            return (Criteria) this;
        }

        public Criteria andPmUsedLessThan(String value) {
            addCriterion("pm_used <", value, "pmUsed");
            return (Criteria) this;
        }

        public Criteria andPmUsedLessThanOrEqualTo(String value) {
            addCriterion("pm_used <=", value, "pmUsed");
            return (Criteria) this;
        }

        public Criteria andPmUsedLike(String value) {
            addCriterion("pm_used like", value, "pmUsed");
            return (Criteria) this;
        }

        public Criteria andPmUsedNotLike(String value) {
            addCriterion("pm_used not like", value, "pmUsed");
            return (Criteria) this;
        }

        public Criteria andPmUsedIn(List<String> values) {
            addCriterion("pm_used in", values, "pmUsed");
            return (Criteria) this;
        }

        public Criteria andPmUsedNotIn(List<String> values) {
            addCriterion("pm_used not in", values, "pmUsed");
            return (Criteria) this;
        }

        public Criteria andPmUsedBetween(String value1, String value2) {
            addCriterion("pm_used between", value1, value2, "pmUsed");
            return (Criteria) this;
        }

        public Criteria andPmUsedNotBetween(String value1, String value2) {
            addCriterion("pm_used not between", value1, value2, "pmUsed");
            return (Criteria) this;
        }

        public Criteria andBottleLossOrderIsNull() {
            addCriterion("bottle_loss_order is null");
            return (Criteria) this;
        }

        public Criteria andBottleLossOrderIsNotNull() {
            addCriterion("bottle_loss_order is not null");
            return (Criteria) this;
        }

        public Criteria andBottleLossOrderEqualTo(Integer value) {
            addCriterion("bottle_loss_order =", value, "bottleLossOrder");
            return (Criteria) this;
        }

        public Criteria andBottleLossOrderNotEqualTo(Integer value) {
            addCriterion("bottle_loss_order <>", value, "bottleLossOrder");
            return (Criteria) this;
        }

        public Criteria andBottleLossOrderGreaterThan(Integer value) {
            addCriterion("bottle_loss_order >", value, "bottleLossOrder");
            return (Criteria) this;
        }

        public Criteria andBottleLossOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("bottle_loss_order >=", value, "bottleLossOrder");
            return (Criteria) this;
        }

        public Criteria andBottleLossOrderLessThan(Integer value) {
            addCriterion("bottle_loss_order <", value, "bottleLossOrder");
            return (Criteria) this;
        }

        public Criteria andBottleLossOrderLessThanOrEqualTo(Integer value) {
            addCriterion("bottle_loss_order <=", value, "bottleLossOrder");
            return (Criteria) this;
        }

        public Criteria andBottleLossOrderIn(List<Integer> values) {
            addCriterion("bottle_loss_order in", values, "bottleLossOrder");
            return (Criteria) this;
        }

        public Criteria andBottleLossOrderNotIn(List<Integer> values) {
            addCriterion("bottle_loss_order not in", values, "bottleLossOrder");
            return (Criteria) this;
        }

        public Criteria andBottleLossOrderBetween(Integer value1, Integer value2) {
            addCriterion("bottle_loss_order between", value1, value2, "bottleLossOrder");
            return (Criteria) this;
        }

        public Criteria andBottleLossOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("bottle_loss_order not between", value1, value2, "bottleLossOrder");
            return (Criteria) this;
        }

        public Criteria andCoverLossOrderIsNull() {
            addCriterion("cover_loss_order is null");
            return (Criteria) this;
        }

        public Criteria andCoverLossOrderIsNotNull() {
            addCriterion("cover_loss_order is not null");
            return (Criteria) this;
        }

        public Criteria andCoverLossOrderEqualTo(Integer value) {
            addCriterion("cover_loss_order =", value, "coverLossOrder");
            return (Criteria) this;
        }

        public Criteria andCoverLossOrderNotEqualTo(Integer value) {
            addCriterion("cover_loss_order <>", value, "coverLossOrder");
            return (Criteria) this;
        }

        public Criteria andCoverLossOrderGreaterThan(Integer value) {
            addCriterion("cover_loss_order >", value, "coverLossOrder");
            return (Criteria) this;
        }

        public Criteria andCoverLossOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("cover_loss_order >=", value, "coverLossOrder");
            return (Criteria) this;
        }

        public Criteria andCoverLossOrderLessThan(Integer value) {
            addCriterion("cover_loss_order <", value, "coverLossOrder");
            return (Criteria) this;
        }

        public Criteria andCoverLossOrderLessThanOrEqualTo(Integer value) {
            addCriterion("cover_loss_order <=", value, "coverLossOrder");
            return (Criteria) this;
        }

        public Criteria andCoverLossOrderIn(List<Integer> values) {
            addCriterion("cover_loss_order in", values, "coverLossOrder");
            return (Criteria) this;
        }

        public Criteria andCoverLossOrderNotIn(List<Integer> values) {
            addCriterion("cover_loss_order not in", values, "coverLossOrder");
            return (Criteria) this;
        }

        public Criteria andCoverLossOrderBetween(Integer value1, Integer value2) {
            addCriterion("cover_loss_order between", value1, value2, "coverLossOrder");
            return (Criteria) this;
        }

        public Criteria andCoverLossOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("cover_loss_order not between", value1, value2, "coverLossOrder");
            return (Criteria) this;
        }

        public Criteria andBoxLossOrderIsNull() {
            addCriterion("box_loss_order is null");
            return (Criteria) this;
        }

        public Criteria andBoxLossOrderIsNotNull() {
            addCriterion("box_loss_order is not null");
            return (Criteria) this;
        }

        public Criteria andBoxLossOrderEqualTo(Integer value) {
            addCriterion("box_loss_order =", value, "boxLossOrder");
            return (Criteria) this;
        }

        public Criteria andBoxLossOrderNotEqualTo(Integer value) {
            addCriterion("box_loss_order <>", value, "boxLossOrder");
            return (Criteria) this;
        }

        public Criteria andBoxLossOrderGreaterThan(Integer value) {
            addCriterion("box_loss_order >", value, "boxLossOrder");
            return (Criteria) this;
        }

        public Criteria andBoxLossOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("box_loss_order >=", value, "boxLossOrder");
            return (Criteria) this;
        }

        public Criteria andBoxLossOrderLessThan(Integer value) {
            addCriterion("box_loss_order <", value, "boxLossOrder");
            return (Criteria) this;
        }

        public Criteria andBoxLossOrderLessThanOrEqualTo(Integer value) {
            addCriterion("box_loss_order <=", value, "boxLossOrder");
            return (Criteria) this;
        }

        public Criteria andBoxLossOrderIn(List<Integer> values) {
            addCriterion("box_loss_order in", values, "boxLossOrder");
            return (Criteria) this;
        }

        public Criteria andBoxLossOrderNotIn(List<Integer> values) {
            addCriterion("box_loss_order not in", values, "boxLossOrder");
            return (Criteria) this;
        }

        public Criteria andBoxLossOrderBetween(Integer value1, Integer value2) {
            addCriterion("box_loss_order between", value1, value2, "boxLossOrder");
            return (Criteria) this;
        }

        public Criteria andBoxLossOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("box_loss_order not between", value1, value2, "boxLossOrder");
            return (Criteria) this;
        }

        public Criteria andLossUnitIsNull() {
            addCriterion("loss_unit is null");
            return (Criteria) this;
        }

        public Criteria andLossUnitIsNotNull() {
            addCriterion("loss_unit is not null");
            return (Criteria) this;
        }

        public Criteria andLossUnitEqualTo(String value) {
            addCriterion("loss_unit =", value, "lossUnit");
            return (Criteria) this;
        }

        public Criteria andLossUnitNotEqualTo(String value) {
            addCriterion("loss_unit <>", value, "lossUnit");
            return (Criteria) this;
        }

        public Criteria andLossUnitGreaterThan(String value) {
            addCriterion("loss_unit >", value, "lossUnit");
            return (Criteria) this;
        }

        public Criteria andLossUnitGreaterThanOrEqualTo(String value) {
            addCriterion("loss_unit >=", value, "lossUnit");
            return (Criteria) this;
        }

        public Criteria andLossUnitLessThan(String value) {
            addCriterion("loss_unit <", value, "lossUnit");
            return (Criteria) this;
        }

        public Criteria andLossUnitLessThanOrEqualTo(String value) {
            addCriterion("loss_unit <=", value, "lossUnit");
            return (Criteria) this;
        }

        public Criteria andLossUnitLike(String value) {
            addCriterion("loss_unit like", value, "lossUnit");
            return (Criteria) this;
        }

        public Criteria andLossUnitNotLike(String value) {
            addCriterion("loss_unit not like", value, "lossUnit");
            return (Criteria) this;
        }

        public Criteria andLossUnitIn(List<String> values) {
            addCriterion("loss_unit in", values, "lossUnit");
            return (Criteria) this;
        }

        public Criteria andLossUnitNotIn(List<String> values) {
            addCriterion("loss_unit not in", values, "lossUnit");
            return (Criteria) this;
        }

        public Criteria andLossUnitBetween(String value1, String value2) {
            addCriterion("loss_unit between", value1, value2, "lossUnit");
            return (Criteria) this;
        }

        public Criteria andLossUnitNotBetween(String value1, String value2) {
            addCriterion("loss_unit not between", value1, value2, "lossUnit");
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