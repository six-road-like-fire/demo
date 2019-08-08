package com.hikvision.wl.test.demo.model;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import java.io.Serializable;


public class UserEntity implements  Serializable {
    private static final long serialVersionUID=1L;
    private Long id;
    private String username;
    private String password;
    private String userSex;
    private String nickName;

    public UserEntity() {
        super();
    }

    public UserEntity(String username, String password, String userSex, String nickName) {
        this.username = username;
        this.password = password;
        this.userSex = userSex;
        this.nickName = nickName;
    }

    public UserEntity(Long id, String username, String password, String userSex, String nickName) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.userSex = userSex;
        this.nickName = nickName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getusername() {
        return username;
    }

    public void setusername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", userSex='" + userSex + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
