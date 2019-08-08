package com.hikvision.wl.test.demo.dao;

import com.hikvision.wl.test.demo.model.UserEntity;



public interface LoginDao {
    UserEntity login(String username, String password);

    UserEntity userVerify(String username);
}
