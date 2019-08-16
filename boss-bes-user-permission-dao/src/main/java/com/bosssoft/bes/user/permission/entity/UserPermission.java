package com.bosssoft.bes.user.permission.entity;

public class UserPermission {
    private Long userId;
    private String code;
    private String name;
    private Long roleId;
    private Long orgId;
    private Long commpanyId;

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

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public Long getCommpanyId() {
        return commpanyId;
    }

    public void setCommpanyId(Long commpanyId) {
        this.commpanyId = commpanyId;
    }

    @Override
    public String toString() {
        return "UserPermission{" +
                "userId=" + userId +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", roleId=" + roleId +
                ", orgId=" + orgId +
                ", commpanyId=" + commpanyId +
                '}';
    }
}
