package com.bosssoft.bes.user.permission.pojo.vo;

import java.io.Serializable;

public class CompanyVO implements Serializable {
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
     * 所属机构
     */
    private String orgName;

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

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    @Override
    public String toString() {
        return "CompanyVO{" +
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
                ", orgName='" + orgName + '\'' +
                ", email='" + email + '\'' +
                ", website='" + website + '\'' +
                ", status=" + status +
                '}';
    }
}
