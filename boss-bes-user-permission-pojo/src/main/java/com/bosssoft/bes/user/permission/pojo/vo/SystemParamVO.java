package com.bosssoft.bes.user.permission.pojo.vo;

import java.io.Serializable;

public class SystemParamVO implements Serializable {
    /**
     * 系统参数ID
     */
    private Long id;

    /**
     * 组织机构ID
     */
    private Long orgId;

    /**
     * 参数类型
     */
    private String paramType;

    /**
     * 参数项
     */
    private String param;

    /**
     * 参数值
     */
    private String value;

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

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getParamType() {
        return paramType;
    }

    public void setParamType(String paramType) {
        this.paramType = paramType;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SystemParamVO{" +
                "id=" + id +
                ", orgId=" + orgId +
                ", paramType='" + paramType + '\'' +
                ", param='" + param + '\'' +
                ", value='" + value + '\'' +
                ", status=" + status +
                '}';
    }
}
