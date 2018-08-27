package cn.mango.work.interview;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/user")
@Controller
public class UserController {


    public UserController() {
        System.out.println("==============================================================");
    }

    @RequestMapping("/get")
    @ResponseBody
    public String getUserName(){
        return "张三";
    }

}
