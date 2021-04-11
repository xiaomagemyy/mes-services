package com.unilever.hefei.mes.order.model;

import java.util.Date;

public class MspDailyPlan {
    private Integer id;

    private String name;

    private String lineNum;

    private Integer actualProduceOrder;

    private String autoCleaningStatus;

    private String personCleaningStatus;

    private String autoDisinfection;

    private String personDisinfection;

    private String team;

    private String productionState;

    private String planDate;

    private String productionClass;

    private String projectId;

    private String planDescribe;

    private String actualNumBox;

    private Date planProduceStart;

    private Date planProduceEnd;

    private String pot;

    private String materialNum;

    private String materialDescribe;

    private String materialActualNum;

    private Date planStart;

    private Date planEnd;

    private Date actualStart;

    private Date actualEnd;

    private String remarks;

    private String creater;

    private String updater;

    private Date makedate;

    private Date maketime;

    private Date updatedate;

    private Date updatetime;

    private Integer deleted;

    private Integer forcedStart;

    private String forcedStartReason;

    private Integer packagingStandardId;

    private String versionNum;

    private Date fillingStart;

    private Date fillingEnd;

    private Integer maduoProdcount;

    private String cleaningType;

    private Date needCleanTime;

    private String transferType;

    private Integer calloffTimestamp;

    private String innerResult;

    private String outerResult;

    private String firstTank;

    private String skipOrderChain;

    private String outerLossOperation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getLineNum() {
        return lineNum;
    }

    public void setLineNum(String lineNum) {
        this.lineNum = lineNum == null ? null : lineNum.trim();
    }

    public Integer getActualProduceOrder() {
        return actualProduceOrder;
    }

    public void setActualProduceOrder(Integer actualProduceOrder) {
        this.actualProduceOrder = actualProduceOrder;
    }

    public String getAutoCleaningStatus() {
        return autoCleaningStatus;
    }

    public void setAutoCleaningStatus(String autoCleaningStatus) {
        this.autoCleaningStatus = autoCleaningStatus == null ? null : autoCleaningStatus.trim();
    }

    public String getPersonCleaningStatus() {
        return personCleaningStatus;
    }

    public void setPersonCleaningStatus(String personCleaningStatus) {
        this.personCleaningStatus = personCleaningStatus == null ? null : personCleaningStatus.trim();
    }

    public String getAutoDisinfection() {
        return autoDisinfection;
    }

    public void setAutoDisinfection(String autoDisinfection) {
        this.autoDisinfection = autoDisinfection == null ? null : autoDisinfection.trim();
    }

    public String getPersonDisinfection() {
        return personDisinfection;
    }

    public void setPersonDisinfection(String personDisinfection) {
        this.personDisinfection = personDisinfection == null ? null : personDisinfection.trim();
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team == null ? null : team.trim();
    }

    public String getProductionState() {
        return productionState;
    }

    public void setProductionState(String productionState) {
        this.productionState = productionState == null ? null : productionState.trim();
    }

    public String getPlanDate() {
        return planDate;
    }

    public void setPlanDate(String planDate) {
        this.planDate = planDate == null ? null : planDate.trim();
    }

    public String getProductionClass() {
        return productionClass;
    }

    public void setProductionClass(String productionClass) {
        this.productionClass = productionClass == null ? null : productionClass.trim();
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    public String getPlanDescribe() {
        return planDescribe;
    }

    public void setPlanDescribe(String planDescribe) {
        this.planDescribe = planDescribe == null ? null : planDescribe.trim();
    }

    public String getActualNumBox() {
        return actualNumBox;
    }

    public void setActualNumBox(String actualNumBox) {
        this.actualNumBox = actualNumBox == null ? null : actualNumBox.trim();
    }

    public Date getPlanProduceStart() {
        return planProduceStart;
    }

    public void setPlanProduceStart(Date planProduceStart) {
        this.planProduceStart = planProduceStart;
    }

    public Date getPlanProduceEnd() {
        return planProduceEnd;
    }

    public void setPlanProduceEnd(Date planProduceEnd) {
        this.planProduceEnd = planProduceEnd;
    }

    public String getPot() {
        return pot;
    }

    public void setPot(String pot) {
        this.pot = pot == null ? null : pot.trim();
    }

    public String getMaterialNum() {
        return materialNum;
    }

    public void setMaterialNum(String materialNum) {
        this.materialNum = materialNum == null ? null : materialNum.trim();
    }

    public String getMaterialDescribe() {
        return materialDescribe;
    }

    public void setMaterialDescribe(String materialDescribe) {
        this.materialDescribe = materialDescribe == null ? null : materialDescribe.trim();
    }

    public String getMaterialActualNum() {
        return materialActualNum;
    }

    public void setMaterialActualNum(String materialActualNum) {
        this.materialActualNum = materialActualNum == null ? null : materialActualNum.trim();
    }

    public Date getPlanStart() {
        return planStart;
    }

    public void setPlanStart(Date planStart) {
        this.planStart = planStart;
    }

    public Date getPlanEnd() {
        return planEnd;
    }

    public void setPlanEnd(Date planEnd) {
        this.planEnd = planEnd;
    }

    public Date getActualStart() {
        return actualStart;
    }

    public void setActualStart(Date actualStart) {
        this.actualStart = actualStart;
    }

    public Date getActualEnd() {
        return actualEnd;
    }

    public void setActualEnd(Date actualEnd) {
        this.actualEnd = actualEnd;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater == null ? null : updater.trim();
    }

    public Date getMakedate() {
        return makedate;
    }

    public void setMakedate(Date makedate) {
        this.makedate = makedate;
    }

    public Date getMaketime() {
        return maketime;
    }

    public void setMaketime(Date maketime) {
        this.maketime = maketime;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Integer getForcedStart() {
        return forcedStart;
    }

    public void setForcedStart(Integer forcedStart) {
        this.forcedStart = forcedStart;
    }

    public String getForcedStartReason() {
        return forcedStartReason;
    }

    public void setForcedStartReason(String forcedStartReason) {
        this.forcedStartReason = forcedStartReason == null ? null : forcedStartReason.trim();
    }

    public Integer getPackagingStandardId() {
        return packagingStandardId;
    }

    public void setPackagingStandardId(Integer packagingStandardId) {
        this.packagingStandardId = packagingStandardId;
    }

    public String getVersionNum() {
        return versionNum;
    }

    public void setVersionNum(String versionNum) {
        this.versionNum = versionNum == null ? null : versionNum.trim();
    }

    public Date getFillingStart() {
        return fillingStart;
    }

    public void setFillingStart(Date fillingStart) {
        this.fillingStart = fillingStart;
    }

    public Date getFillingEnd() {
        return fillingEnd;
    }

    public void setFillingEnd(Date fillingEnd) {
        this.fillingEnd = fillingEnd;
    }

    public Integer getMaduoProdcount() {
        return maduoProdcount;
    }

    public void setMaduoProdcount(Integer maduoProdcount) {
        this.maduoProdcount = maduoProdcount;
    }

    public String getCleaningType() {
        return cleaningType;
    }

    public void setCleaningType(String cleaningType) {
        this.cleaningType = cleaningType == null ? null : cleaningType.trim();
    }

    public Date getNeedCleanTime() {
        return needCleanTime;
    }

    public void setNeedCleanTime(Date needCleanTime) {
        this.needCleanTime = needCleanTime;
    }

    public String getTransferType() {
        return transferType;
    }

    public void setTransferType(String transferType) {
        this.transferType = transferType == null ? null : transferType.trim();
    }

    public Integer getCalloffTimestamp() {
        return calloffTimestamp;
    }

    public void setCalloffTimestamp(Integer calloffTimestamp) {
        this.calloffTimestamp = calloffTimestamp;
    }

    public String getInnerResult() {
        return innerResult;
    }

    public void setInnerResult(String innerResult) {
        this.innerResult = innerResult == null ? null : innerResult.trim();
    }

    public String getOuterResult() {
        return outerResult;
    }

    public void setOuterResult(String outerResult) {
        this.outerResult = outerResult == null ? null : outerResult.trim();
    }

    public String getFirstTank() {
        return firstTank;
    }

    public void setFirstTank(String firstTank) {
        this.firstTank = firstTank == null ? null : firstTank.trim();
    }

    public String getSkipOrderChain() {
        return skipOrderChain;
    }

    public void setSkipOrderChain(String skipOrderChain) {
        this.skipOrderChain = skipOrderChain == null ? null : skipOrderChain.trim();
    }

    public String getOuterLossOperation() {
        return outerLossOperation;
    }

    public void setOuterLossOperation(String outerLossOperation) {
        this.outerLossOperation = outerLossOperation == null ? null : outerLossOperation.trim();
    }
}