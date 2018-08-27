package cn.mango.work.interview.service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    public UserServiceImpl() {
        System.out.println("我是UserServiceImpl的构造器！");
    }

    @Override
    public String getUserName() {
        return "My name is Tony";
    }
}
