package com.bosssoft.bes.user.permission.pojo.vo;

public class UserInfo {
    private String name;
    private String profilePicture;
    private Long roldId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public Long getRoldId() {
        return roldId;
    }

    public void setRoldId(Long roldId) {
        this.roldId = roldId;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "name='" + name + '\'' +
                ", profilePicture='" + profilePicture + '\'' +
                ", roldId=" + roldId +
                '}';
    }
}
