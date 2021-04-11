package com.unilever.hefei.mes.basic.model;

import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

@TableName("msp_equipment_management_detail")
public class EquipmentInfo {

    private Integer id;

    private Integer productionLineManagementId;

    private String innerOuter;

    private String equipmentNumber;

    private String equipmentName;

    private String code;

    private String model;

    private String fixedAssetNumber;

    private String workingProcedure;

    private String equipmentDirector;

    private String phoneNumber;

    private String ratedPower;

    private String unit;

    private String factoryNumber;

    private String factoryName;

    private String factoryLinkman;

    private String factoryLinkmanPhoneNumber;

    private String factoryLinkmanMail;

    private String locationOfInstallation;

    private String dateOfProduction;

    private String remark;

    private String creater;

    private String updater;

    private Date makedate;

    private Date maketime;

    private Date updatedate;

    private Date updatetime;

    private String picture;

    private Integer pmSpotX;

    private Integer pmSpotY;

    private String pmTitle;

    private Integer amSpotX;

    private Integer amSpotY;

    private String amTitle;

    private Double equipmentValue;

    private Date buyDate;

    private Integer designPeriod;

    private Double endValue;

    private String equipmentType;

    private Integer enableOee;

    private Integer enableElectric;

    private Integer enableGas;

    private Integer equipmentOrder;

    private String pmUsed;

    private Integer bottleLossOrder;

    private Integer coverLossOrder;

    private Integer boxLossOrder;

    private String lossUnit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductionLineManagementId() {
        return productionLineManagementId;
    }

    public void setProductionLineManagementId(Integer productionLineManagementId) {
        this.productionLineManagementId = productionLineManagementId;
    }

    public String getInnerOuter() {
        return innerOuter;
    }

    public void setInnerOuter(String innerOuter) {
        this.innerOuter = innerOuter == null ? null : innerOuter.trim();
    }

    public String getEquipmentNumber() {
        return equipmentNumber;
    }

    public void setEquipmentNumber(String equipmentNumber) {
        this.equipmentNumber = equipmentNumber == null ? null : equipmentNumber.trim();
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName == null ? null : equipmentName.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public String getFixedAssetNumber() {
        return fixedAssetNumber;
    }

    public void setFixedAssetNumber(String fixedAssetNumber) {
        this.fixedAssetNumber = fixedAssetNumber == null ? null : fixedAssetNumber.trim();
    }

    public String getWorkingProcedure() {
        return workingProcedure;
    }

    public void setWorkingProcedure(String workingProcedure) {
        this.workingProcedure = workingProcedure == null ? null : workingProcedure.trim();
    }

    public String getEquipmentDirector() {
        return equipmentDirector;
    }

    public void setEquipmentDirector(String equipmentDirector) {
        this.equipmentDirector = equipmentDirector == null ? null : equipmentDirector.trim();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public String getRatedPower() {
        return ratedPower;
    }

    public void setRatedPower(String ratedPower) {
        this.ratedPower = ratedPower == null ? null : ratedPower.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getFactoryNumber() {
        return factoryNumber;
    }

    public void setFactoryNumber(String factoryNumber) {
        this.factoryNumber = factoryNumber == null ? null : factoryNumber.trim();
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName == null ? null : factoryName.trim();
    }

    public String getFactoryLinkman() {
        return factoryLinkman;
    }

    public void setFactoryLinkman(String factoryLinkman) {
        this.factoryLinkman = factoryLinkman == null ? null : factoryLinkman.trim();
    }

    public String getFactoryLinkmanPhoneNumber() {
        return factoryLinkmanPhoneNumber;
    }

    public void setFactoryLinkmanPhoneNumber(String factoryLinkmanPhoneNumber) {
        this.factoryLinkmanPhoneNumber = factoryLinkmanPhoneNumber == null ? null : factoryLinkmanPhoneNumber.trim();
    }

    public String getFactoryLinkmanMail() {
        return factoryLinkmanMail;
    }

    public void setFactoryLinkmanMail(String factoryLinkmanMail) {
        this.factoryLinkmanMail = factoryLinkmanMail == null ? null : factoryLinkmanMail.trim();
    }

    public String getLocationOfInstallation() {
        return locationOfInstallation;
    }

    public void setLocationOfInstallation(String locationOfInstallation) {
        this.locationOfInstallation = locationOfInstallation == null ? null : locationOfInstallation.trim();
    }

    public String getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(String dateOfProduction) {
        this.dateOfProduction = dateOfProduction == null ? null : dateOfProduction.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public Integer getPmSpotX() {
        return pmSpotX;
    }

    public void setPmSpotX(Integer pmSpotX) {
        this.pmSpotX = pmSpotX;
    }

    public Integer getPmSpotY() {
        return pmSpotY;
    }

    public void setPmSpotY(Integer pmSpotY) {
        this.pmSpotY = pmSpotY;
    }

    public String getPmTitle() {
        return pmTitle;
    }

    public void setPmTitle(String pmTitle) {
        this.pmTitle = pmTitle == null ? null : pmTitle.trim();
    }

    public Integer getAmSpotX() {
        return amSpotX;
    }

    public void setAmSpotX(Integer amSpotX) {
        this.amSpotX = amSpotX;
    }

    public Integer getAmSpotY() {
        return amSpotY;
    }

    public void setAmSpotY(Integer amSpotY) {
        this.amSpotY = amSpotY;
    }

    public String getAmTitle() {
        return amTitle;
    }

    public void setAmTitle(String amTitle) {
        this.amTitle = amTitle == null ? null : amTitle.trim();
    }

    public Double getEquipmentValue() {
        return equipmentValue;
    }

    public void setEquipmentValue(Double equipmentValue) {
        this.equipmentValue = equipmentValue;
    }

    public Date getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(Date buyDate) {
        this.buyDate = buyDate;
    }

    public Integer getDesignPeriod() {
        return designPeriod;
    }

    public void setDesignPeriod(Integer designPeriod) {
        this.designPeriod = designPeriod;
    }

    public Double getEndValue() {
        return endValue;
    }

    public void setEndValue(Double endValue) {
        this.endValue = endValue;
    }

    public String getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType == null ? null : equipmentType.trim();
    }

    public Integer getEnableOee() {
        return enableOee;
    }

    public void setEnableOee(Integer enableOee) {
        this.enableOee = enableOee;
    }

    public Integer getEnableElectric() {
        return enableElectric;
    }

    public void setEnableElectric(Integer enableElectric) {
        this.enableElectric = enableElectric;
    }

    public Integer getEnableGas() {
        return enableGas;
    }

    public void setEnableGas(Integer enableGas) {
        this.enableGas = enableGas;
    }

    public Integer getEquipmentOrder() {
        return equipmentOrder;
    }

    public void setEquipmentOrder(Integer equipmentOrder) {
        this.equipmentOrder = equipmentOrder;
    }

    public String getPmUsed() {
        return pmUsed;
    }

    public void setPmUsed(String pmUsed) {
        this.pmUsed = pmUsed == null ? null : pmUsed.trim();
    }

    public Integer getBottleLossOrder() {
        return bottleLossOrder;
    }

    public void setBottleLossOrder(Integer bottleLossOrder) {
        this.bottleLossOrder = bottleLossOrder;
    }

    public Integer getCoverLossOrder() {
        return coverLossOrder;
    }

    public void setCoverLossOrder(Integer coverLossOrder) {
        this.coverLossOrder = coverLossOrder;
    }

    public Integer getBoxLossOrder() {
        return boxLossOrder;
    }

    public void setBoxLossOrder(Integer boxLossOrder) {
        this.boxLossOrder = boxLossOrder;
    }

    public String getLossUnit() {
        return lossUnit;
    }

    public void setLossUnit(String lossUnit) {
        this.lossUnit = lossUnit == null ? null : lossUnit.trim();
    }
}