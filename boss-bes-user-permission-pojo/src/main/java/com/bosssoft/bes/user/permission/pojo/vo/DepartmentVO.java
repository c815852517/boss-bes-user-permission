package com.bosssoft.bes.user.permission.pojo.vo;

import java.io.Serializable;

public class DepartmentVO implements Serializable {
    /**
     * 部门ID
     */
    private Long id;

    /**
     * 公司ID
     */
    private Long companyId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 部门名称
     */
    private String name;

    /**
     * 上级部门名
     */
    private String parentDepartment;

    /**
     * 助记码
     */
    private String mnemonicCode;

    /**
     * 部门编号
     */
    private String code;

    /**
     * 部门等级
     */
    private String level;

    /**
     * 上级部门
     */
    private Long parentId;

    /**
     * 负责人
     */
    private String master;

    /**
     * 部门描述
     */
    private String descript;

    /**
     * 状态
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

    public String getMnemonicCode() {
        return mnemonicCode;
    }

    public void setMnemonicCode(String mnemonicCode) {
        this.mnemonicCode = mnemonicCode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getParentDepartment() {
        return parentDepartment;
    }

    public void setParentDepartment(String parentDepartment) {
        this.parentDepartment = parentDepartment;
    }

    @Override
    public String toString() {
        return "DepartmentVO{" +
                "id=" + id +
                ", companyId=" + companyId +
                ", userId=" + userId +
                ", name='" + name + '\'' +
                ", parentDepartment='" + parentDepartment + '\'' +
                ", mnemonicCode='" + mnemonicCode + '\'' +
                ", code='" + code + '\'' +
                ", level='" + level + '\'' +
                ", parentId=" + parentId +
                ", master='" + master + '\'' +
                ", descript='" + descript + '\'' +
                ", status=" + status +
                '}';
    }
}
