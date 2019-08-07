package com.hikvision.wl.test.demo.mapper;

import com.hikvision.wl.test.demo.model.UserEntity;

import java.util.List;

public interface UserMapper {
    List<UserEntity> getAll();

    UserEntity getOne(Long id);

    UserEntity login(String userName,String password);

    UserEntity userVerify(String userName);

    void insert(UserEntity user);

    void update(UserEntity user);

    void delete(Long id);
}
