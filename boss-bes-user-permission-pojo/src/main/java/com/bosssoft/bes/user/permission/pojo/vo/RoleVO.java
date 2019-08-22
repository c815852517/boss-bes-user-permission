package com.bosssoft.bes.user.permission.pojo.vo;

import java.io.Serializable;

public class RoleVO implements Serializable {
    /**
     * 角色ID
     */
    private Long id;

    /**
     * 公司ID
     */
    private Long companyId;

    /**
     * 组织机构ID
     */
    private Long orgId;

    /**
     * 角色名
     */
    private String name;

    /**
     * 角色代码
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

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
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
        return "RoleVO{" +
                "id=" + id +
                ", companyId=" + companyId +
                ", orgId=" + orgId +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", remark='" + remark + '\'' +
                ", status=" + status +
                '}';
    }
}
