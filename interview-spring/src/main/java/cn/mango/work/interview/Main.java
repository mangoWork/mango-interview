package cn.mango.work.interview;

import cn.mango.work.interview.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-bean.xml");
        UserController userController = (UserController) ctx.getBean("userController");
        String userName = userController.getUserName();
    }
}
