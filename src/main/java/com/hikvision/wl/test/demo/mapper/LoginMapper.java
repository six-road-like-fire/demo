package com.hikvision.wl.test.demo.mapper;

import com.hikvision.wl.test.demo.model.UserEntity;

public interface LoginMapper {
    UserEntity login(String userName, String password);

    UserEntity userVerify(String userName);
}
