package com.hikvision.wl.test.demo.controller;

import com.hikvision.wl.test.demo.mapper.UserMapper;
import com.hikvision.wl.test.demo.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired  UserMapper userMapper;

    @RequestMapping("/loginHtml")
    public String loginHtml(){
        return "userLogin";
    }

    @RequestMapping("/userLogin")
    public String userLogin(@RequestParam("userName") String username, @RequestParam("password") String password, HttpRequest request){
        UserEntity user=userMapper.login(username,password);
        if(user!=null){
            return "index";
        }else{
            return "LoginError";
        }
    }

    @RequestMapping("/regist")
    public String regist(){
        return "regist";
    }

    @ResponseBody
    @RequestMapping("/usergister")
    public String usergister(@RequestParam("userName") String userName,
                             @RequestParam("password") String password,
                             @RequestParam("userSex") String userSex,
                             @RequestParam("nickName") String nickName
                        ){
        UserEntity user=userMapper.userVerify(userName);
        if(user!=null){
            return "该用户已存在";
        }else{
            userMapper.insert(new UserEntity(userName,password,userSex,nickName));
            return "注册成功";
        }
    }


}
