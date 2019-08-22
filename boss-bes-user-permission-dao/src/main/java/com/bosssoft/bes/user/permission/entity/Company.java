package com.bosssoft.bes.user.permission.entity;

import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * t_company
 * @author
 */
@Table(name = "t_company")
public class Company implements Serializable {
    /**
     * 公司ID
     */
    private Long id;

    /**
     * 组织机构ID
     */
    private Long orgId;

    /**
     * 职位ID
     */
    private Long positionId;

    /**
     * 公司名
     */
    private String name;

    /**
     * 公司编号
     */
    private String code;

    /**
     * 助记码
     */
    private String mnemonicCode;

    /**
     * 法人
     */
    private String master;

    /**
     * 税号
     */
    private String tax;

    /**
     * 传真
     */
    private String fax;

    /**
     * 电话
     */
    private String tel;

    /**
     * 地址
     */
    private String address;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 网址
     */
    private String website;

    /**
     * 状态位
     */
    private Byte status;

    /**
     * 创建人
     */
    private Long createdBy;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 修改人
     */
    private Long updatedBy;

    /**
     * 修改时间
     */
    private Date updatedTime;

    /**
     * 版本
     */
    private Long version;

    private static final long serialVersionUID = 1L;

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

    public Long getPositionId() {
        return positionId;
    }

    public void setPositionId(Long positionId) {
        this.positionId = positionId;
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

    public String getMnemonicCode() {
        return mnemonicCode;
    }

    public void setMnemonicCode(String mnemonicCode) {
        this.mnemonicCode = mnemonicCode;
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Long getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", orgId=" + orgId +
                ", positionId=" + positionId +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", mnemonicCode='" + mnemonicCode + '\'' +
                ", master='" + master + '\'' +
                ", tax='" + tax + '\'' +
                ", fax='" + fax + '\'' +
                ", tel='" + tel + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", website='" + website + '\'' +
                ", status=" + status +
                ", createdBy=" + createdBy +
                ", createdTime=" + createdTime +
                ", updatedBy=" + updatedBy +
                ", updatedTime=" + updatedTime +
                ", version=" + version +
                '}';
    }
}
