package com.unilever.hefei.mes.scada.model;

import java.util.Date;

public class TbAlarm {
    private String id;

    private Date datetime;

    private String pairNo;

    private String line;

    private String machineCode;

    private String machineName;

    private String stopTime;

    private String startTime;

    private String alarmSource;

    private String alarmCode;

    private String alarmStatus;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public String getPairNo() {
        return pairNo;
    }

    public void setPairNo(String pairNo) {
        this.pairNo = pairNo == null ? null : pairNo.trim();
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line == null ? null : line.trim();
    }

    public String getMachineCode() {
        return machineCode;
    }

    public void setMachineCode(String machineCode) {
        this.machineCode = machineCode == null ? null : machineCode.trim();
    }

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName == null ? null : machineName.trim();
    }

    public String getStopTime() {
        return stopTime;
    }

    public void setStopTime(String stopTime) {
        this.stopTime = stopTime == null ? null : stopTime.trim();
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public String getAlarmSource() {
        return alarmSource;
    }

    public void setAlarmSource(String alarmSource) {
        this.alarmSource = alarmSource == null ? null : alarmSource.trim();
    }

    public String getAlarmCode() {
        return alarmCode;
    }

    public void setAlarmCode(String alarmCode) {
        this.alarmCode = alarmCode == null ? null : alarmCode.trim();
    }

    public String getAlarmStatus() {
        return alarmStatus;
    }

    public void setAlarmStatus(String alarmStatus) {
        this.alarmStatus = alarmStatus == null ? null : alarmStatus.trim();
    }
}