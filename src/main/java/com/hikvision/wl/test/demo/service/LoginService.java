package com.hikvision.wl.test.demo.service;

import com.hikvision.wl.test.demo.model.UserEntity;

public interface LoginService {
    UserEntity login(String username, String password);

    UserEntity userVerify(String username);
}
