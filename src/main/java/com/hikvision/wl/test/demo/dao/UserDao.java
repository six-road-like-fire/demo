package com.hikvision.wl.test.demo.dao;

import com.hikvision.wl.test.demo.model.UserEntity;
import org.springframework.stereotype.Repository;


import java.util.List;


public interface UserDao {
    List<UserEntity> getAll();

    UserEntity getOne(Long id);



    void insert(UserEntity user);

    void update(UserEntity user);

    void delete(Long id);
}
