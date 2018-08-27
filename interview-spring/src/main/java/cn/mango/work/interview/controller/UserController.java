package cn.mango.work.interview.controller;

import cn.mango.work.interview.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;

@Controller
@Lazy
public class UserController {

    public UserController() {
        System.out.println("我是UserController的构造器");
    }

    @Autowired
    private UserService userService;

    public String getUserName(){
        return userService.getUserName();
    }

}
