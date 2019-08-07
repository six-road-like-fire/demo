package com.hikvision.wl.test.demo.controller;

import com.hikvision.wl.test.demo.dao.UserDao;
import com.hikvision.wl.test.demo.model.UserEntity;
import com.hikvision.wl.test.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import java.util.List;
@RestController
@RequestMapping("/user")
public class UserEntityControler {
    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String say(){
        return "just a test";
    }

    @RequestMapping("/hell4554")
    public String say1(){
        return "jusasdfasfdsdf1t a test";
    }

    @RequestMapping("/getUsers")
    public List<UserEntity> getUsers()
    {		List<UserEntity> users=userService.getAll();
            return users;
    }
    @RequestMapping("/getUser")
    public UserEntity getUser(Long id) {
        UserEntity user=userService.getOne(id);
        return user;
    }

    @RequestMapping("/add")
    public void save(UserEntity user) {
        userService.insert(user);
    }

    @RequestMapping(value="update")
    public void update(UserEntity user) {
        userService.update(user);
    }

    @RequestMapping(value="delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        userService.delete(id);    }



}
