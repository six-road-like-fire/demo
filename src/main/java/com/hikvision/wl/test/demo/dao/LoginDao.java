package com.hikvision.wl.test.demo.dao;

import com.hikvision.wl.test.demo.model.UserEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginDao {
    UserEntity login(String userName, String password);

    UserEntity userVerify(String userName);
}
