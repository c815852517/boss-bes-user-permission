package com.bosssoft.bes.user.permission.pojo.vo;

/**
 * @author CJF
 * @version V1.0.0
 * @date 2019/8/22
 */
import java.io.Serializable;
import java.util.Date;

/**
 * t_organization
 * @author
 */
public class OrganizationVO implements Serializable {
    /**
     * 组织机构ID
     */
    private Long id;

    /**
     * 机构名
     */
    private String name;

    /**
     * 机构代码
     */
    private String code;

    /**
     * 负责人
     */
    private String master;

    /**
     * 电话
     */
    private String tel;

    /**
     * 地址
     */
    private String address;

    /**
     * 状态位
     */
    private Byte status;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
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

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "OrganizationVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", master='" + master + '\'' +
                ", tel='" + tel + '\'' +
                ", address='" + address + '\'' +
                ", status=" + status +
                '}';
    }
}
