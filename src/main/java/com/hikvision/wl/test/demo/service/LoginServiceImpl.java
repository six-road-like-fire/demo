package com.hikvision.wl.test.demo.service;

import com.hikvision.wl.test.demo.dao.LoginDao;
import com.hikvision.wl.test.demo.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class LoginServiceImpl  implements LoginService {
    @Autowired
    private LoginDao loginDao;

    @Override
    public UserEntity login(String userName, String password){
        return loginDao.login(userName,password);
    }

    @Override
    public UserEntity userVerify(String userName){
        return loginDao.userVerify(userName);
    }
}
