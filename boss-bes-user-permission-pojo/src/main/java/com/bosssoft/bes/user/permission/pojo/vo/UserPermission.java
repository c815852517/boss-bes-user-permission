package com.bosssoft.bes.user.permission.pojo.vo;

public class UserPermission {
    private Long Id;
    private String name;
    private Long roleId;
    private Long orgId;
    private Long companyId;

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
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

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    @Override
    public String toString() {
        return "UserPermission{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", roleId=" + roleId +
                ", orgId=" + orgId +
                ", companyId=" + companyId +
                '}';
    }
}
