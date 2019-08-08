package com.hikvision.wl.test.demo.service;

import com.hikvision.wl.test.demo.dao.LoginDao;
import com.hikvision.wl.test.demo.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LoginServiceImpl  implements LoginService {
    @Autowired
    private LoginDao loginDao;

    @Override
    public UserEntity login(String username, String password){
        return loginDao.login(username,password);
    }

    @Override
    public UserEntity userVerify(String username) {
        return loginDao.userVerify(username);
    }
}
