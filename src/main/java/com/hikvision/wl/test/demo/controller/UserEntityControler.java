package com.hikvision.wl.test.demo.controller;

import com.hikvision.wl.test.demo.mapper.UserMapper;
import com.hikvision.wl.test.demo.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import java.util.List;
@RestController
@RequestMapping("/user")
public class UserEntityControler {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/hello")
    public String say(){
        return "just a test";
    }

    @RequestMapping("/hell1")
    public String say1(){
        return "jus1t a test";
    }

    @RequestMapping("/getUsers")
    public List<UserEntity> getUsers()
    {		List<UserEntity> users=userMapper.getAll();
            return users;
    }
    @RequestMapping("/getUser")
    public UserEntity getUser(Long id) {
        UserEntity user=userMapper.getOne(id);
        return user;
    }

    @RequestMapping("/add")
    public void save(UserEntity user) {
        userMapper.insert(user);
    }

    @RequestMapping(value="update")
    public void update(UserEntity user) {
        userMapper.update(user);
    }

    @RequestMapping(value="delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        userMapper.delete(id);    }



}
