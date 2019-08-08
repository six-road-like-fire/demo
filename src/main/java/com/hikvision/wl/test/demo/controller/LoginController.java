package com.hikvision.wl.test.demo.controller;

import com.hikvision.wl.test.demo.dao.LoginDao;
import com.hikvision.wl.test.demo.dao.UserDao;
import com.hikvision.wl.test.demo.model.UserEntity;
import com.hikvision.wl.test.demo.service.LoginService;
import com.hikvision.wl.test.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
/*test*/
@Controller
@RequestMapping("/login")
public class LoginController {
  //  private static final Logger logger = LoggerFactory.getLogger(UserControler.class);
    @Autowired
    private UserService userService;
    @Autowired
    private LoginService loginService;

    @RequestMapping("/loginHtml")
    public String loginHtml(){
        return "userLogin";
    }

    @RequestMapping("/userLogin")
    public String userLogin(@RequestParam("username") String username, @RequestParam("password") String password){
        UserEntity user=loginService.login(username,password);
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
    public String usergister(@RequestParam("username") String username,
                             @RequestParam("password") String password,
                             @RequestParam("userSex") String userSex,
                             @RequestParam("nickName") String nickName
                        ){
        UserEntity user=loginService.userVerify(username);
        if(user!=null){
            return "该用户已存在";
        }else{
            userService.insert(new UserEntity(username,password,userSex,nickName));
            return "注册成功";
        }
    }


}
