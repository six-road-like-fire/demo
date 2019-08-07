package com.hikvision.wl.test.demo.service;

import com.hikvision.wl.test.demo.mapper.UserMapper;
import com.hikvision.wl.test.demo.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserMapperImpl implements UserMapper {

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<UserEntity> getAll(){
        return  userMapper.getAll();
    }

    @Override
    public  UserEntity getOne(Long id){
        return userMapper.getOne(id);
    }

    @Override
    public UserEntity login(String userName,String password){
        return userMapper.login(userName,password);
    }

    @Override
    public int userVerify(String userName){
        return userMapper.userVerify(userName);
    }

    @Override
    public  void insert(UserEntity user){
        userMapper.insert(user);
    }

    @Override
    public void update(UserEntity user){
        userMapper.update(user);
    }

    @Override
    public   void delete(Long id){
        userMapper.delete(id);
    }
}
