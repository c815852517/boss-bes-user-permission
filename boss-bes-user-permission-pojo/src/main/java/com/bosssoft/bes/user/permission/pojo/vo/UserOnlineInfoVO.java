package com.bosssoft.bes.user.permission.pojo.vo;

import java.io.Serializable;
import java.util.Date;

public class UserOnlineInfoVO implements Serializable {
    /**
     * 在线ID
     */
    private Long id;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 工号
     */
    private String code;

    /**
     * 用户名
     */
    private String name;

    /**
     * IP
     */
    private String ip;

    /**
     * 上线时间
     */
    private Date onlineTime;

    /**
     * 下线时间
     */
    private Date offlineTime;

    /**
     * 在线时长
     */
    private Integer stopTime;

    /**
     * 状态位
     */
    private Byte status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getOnlineTime() {
        return onlineTime;
    }

    public void setOnlineTime(Date onlineTime) {
        this.onlineTime = onlineTime;
    }

    public Date getOfflineTime() {
        return offlineTime;
    }

    public void setOfflineTime(Date offlineTime) {
        this.offlineTime = offlineTime;
    }

    public Integer getStopTime() {
        return stopTime;
    }

    public void setStopTime(Integer stopTime) {
        this.stopTime = stopTime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "UserOnlineInfoVO{" +
                "id=" + id +
                ", userId=" + userId +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", ip='" + ip + '\'' +
                ", onlineTime=" + onlineTime +
                ", offlineTime=" + offlineTime +
                ", stopTime=" + stopTime +
                ", status=" + status +
                '}';
    }
}
