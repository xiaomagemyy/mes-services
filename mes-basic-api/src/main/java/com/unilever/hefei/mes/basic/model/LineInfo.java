package com.unilever.hefei.mes.basic.model;

import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

@TableName("msp_production_line_management")
public class LineInfo {
    private Integer id;

    private String factory;

    private String workshop;

    private String productionLineNum;

    private String productionLineName;

    private String amPictureNd;

    private String amPictureWd;

    private Double amProportionWd;

    private Double amProportionNd;

    private String remark;

    private String creater;

    private String updater;

    private Date makedate;

    private Date maketime;

    private Date updatedate;

    private Date updatetime;

    private String picture;

    private String abbreviation;

    private String securitymapImg;

    private String eventmapImg;

    private String batchNum;

    private String type;

    private Date pmStarttime;

    private Integer pmTimeCount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory == null ? null : factory.trim();
    }

    public String getWorkshop() {
        return workshop;
    }

    public void setWorkshop(String workshop) {
        this.workshop = workshop == null ? null : workshop.trim();
    }

    public String getProductionLineNum() {
        return productionLineNum;
    }

    public void setProductionLineNum(String productionLineNum) {
        this.productionLineNum = productionLineNum == null ? null : productionLineNum.trim();
    }

    public String getProductionLineName() {
        return productionLineName;
    }

    public void setProductionLineName(String productionLineName) {
        this.productionLineName = productionLineName == null ? null : productionLineName.trim();
    }

    public String getAmPictureNd() {
        return amPictureNd;
    }

    public void setAmPictureNd(String amPictureNd) {
        this.amPictureNd = amPictureNd == null ? null : amPictureNd.trim();
    }

    public String getAmPictureWd() {
        return amPictureWd;
    }

    public void setAmPictureWd(String amPictureWd) {
        this.amPictureWd = amPictureWd == null ? null : amPictureWd.trim();
    }

    public Double getAmProportionWd() {
        return amProportionWd;
    }

    public void setAmProportionWd(Double amProportionWd) {
        this.amProportionWd = amProportionWd;
    }

    public Double getAmProportionNd() {
        return amProportionNd;
    }

    public void setAmProportionNd(Double amProportionNd) {
        this.amProportionNd = amProportionNd;
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

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation == null ? null : abbreviation.trim();
    }

    public String getSecuritymapImg() {
        return securitymapImg;
    }

    public void setSecuritymapImg(String securitymapImg) {
        this.securitymapImg = securitymapImg == null ? null : securitymapImg.trim();
    }

    public String getEventmapImg() {
        return eventmapImg;
    }

    public void setEventmapImg(String eventmapImg) {
        this.eventmapImg = eventmapImg == null ? null : eventmapImg.trim();
    }

    public String getBatchNum() {
        return batchNum;
    }

    public void setBatchNum(String batchNum) {
        this.batchNum = batchNum == null ? null : batchNum.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Date getPmStarttime() {
        return pmStarttime;
    }

    public void setPmStarttime(Date pmStarttime) {
        this.pmStarttime = pmStarttime;
    }

    public Integer getPmTimeCount() {
        return pmTimeCount;
    }

    public void setPmTimeCount(Integer pmTimeCount) {
        this.pmTimeCount = pmTimeCount;
    }
}