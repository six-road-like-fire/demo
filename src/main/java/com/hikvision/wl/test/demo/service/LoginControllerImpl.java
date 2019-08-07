package com.hikvision.wl.test.demo.service;

import com.hikvision.wl.test.demo.mapper.LoginMapper;
import com.hikvision.wl.test.demo.mapper.UserMapper;
import com.hikvision.wl.test.demo.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginControllerImpl  implements LoginMapper {
    @Autowired
    private LoginMapper loginMapper;

    @Override
    public UserEntity login(String userName, String password){
        return loginMapper.login(userName,password);
    }

    @Override
    public UserEntity userVerify(String userName){
        return loginMapper.userVerify(userName);
    }
}
