package com.bosssoft.bes.user.permission.pojo.vo;

import java.io.Serializable;
import java.util.Date;

public class UserVO implements Serializable {
    /**
     * 用户ID
     */
    private Long id;

    /**
     * 职位ID
     */
    private Long positionId;

    /**
     * 部门ID
     */
    private Long departmentId;

    /**
     * 工号
     */
    private String code;

    /**
     * 密码
     */
    private String password;

    /**
     * 姓名
     */
    private String name;

    /**
     * 头像
     */
    private String profilePicture;

    /**
     * 角色名
     */
    private String roleName;

    /**
     * 性别
     */
    private Byte sex;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 职位名
     */
    private String positionName;

    /**
     * 电话
     */
    private String tel;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 其他联系
     */
    private String other;

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

    public Long getPositionId() {
        return positionId;
    }

    public void setPositionId(Long positionId) {
        this.positionId = positionId;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
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

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "id=" + id +
                ", positionId=" + positionId +
                ", departmentId=" + departmentId +
                ", code='" + code + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", profilePicture='" + profilePicture + '\'' +
                ", roleName='" + roleName + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", positionName='" + positionName + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", other='" + other + '\'' +
                ", remark='" + remark + '\'' +
                ", status=" + status +
                '}';
    }
}
