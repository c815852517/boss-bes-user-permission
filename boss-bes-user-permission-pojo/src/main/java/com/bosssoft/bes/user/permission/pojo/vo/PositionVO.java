package com.bosssoft.bes.user.permission.pojo.vo;

import java.io.Serializable;

public class PositionVO implements Serializable {
    /**
     * 职位ID
     */
    private Long id;

    /**
     * 资源ID
     */
    private Long resourceId;

    /**
     * 公司ID
     */
    private Long companyId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 职位名称
     */
    private String name;

    /**
     * 职位编号
     */
    private String code;

    /**
     * 备注
     */
    private String remark;

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

    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PositionVO{" +
                "id=" + id +
                ", resourceId=" + resourceId +
                ", companyId=" + companyId +
                ", userId=" + userId +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", remark='" + remark + '\'' +
                ", status=" + status +
                '}';
    }
}
