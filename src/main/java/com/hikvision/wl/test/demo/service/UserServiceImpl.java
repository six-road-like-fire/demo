package com.hikvision.wl.test.demo.service;

import com.hikvision.wl.test.demo.dao.UserDao;
import com.hikvision.wl.test.demo.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service

public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<UserEntity> getAll(){
        return  userDao.getAll();
    }

    @Override
    public  UserEntity getOne(Long id){
        return userDao.getOne(id);
    }

    @Override
    public  void insert(UserEntity user){
        userDao.insert(user);
    }

    @Override
    public void update(UserEntity user){
        userDao.update(user);
    }

    @Override
    public   void delete(Long id){
        userDao.delete(id);
    }

}
