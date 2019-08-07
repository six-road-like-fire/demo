package com.hikvision.wl.test.demo.mapper;

import com.hikvision.wl.test.demo.model.UserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<UserEntity> getAll();

    UserEntity getOne(Long id);



    void insert(UserEntity user);

    void update(UserEntity user);

    void delete(Long id);
}
