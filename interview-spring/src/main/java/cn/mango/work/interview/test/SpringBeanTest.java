package cn.mango.work.interview.test;

import cn.mango.work.interview.controller.UserController;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanTest extends TestCase {

    /**
     * 用于测试理解Spring Bean中的IOC以及懒加载
     */
    public void testSpringBean(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-bean.xml");
        UserController userController = (UserController) ctx.getBean("userController");
        String userName = userController.getUserName();
    }


}
