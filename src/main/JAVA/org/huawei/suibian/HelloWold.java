package org.huawei.suibian; /**
 * Created by godfrey on 16/7/11.
 */

import org.huawei.singleLogin.User;
import org.huawei.singleLogin.UserService;
import org.jasig.cas.client.session.SingleSignOutFilter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;

public class HelloWold {
    //采用构造器创建一个实例
    private void makeUser(){
        ApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
        UserService userService=context.getBean("userService",UserService.class);
        System.out.println( userService.findRoles("godfrey").toString());

    }

    //通过工厂方法创建一个实例
    private void makeCalender(){
        ApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
        Calendar calendar=context.getBean("calendar",Calendar.class);
        System.out.println(calendar.getTime());
    }


    public static void main(String[] args) {
        HelloWold helloWold =new HelloWold();
        helloWold.makeUser();
        helloWold.makeCalender();
    }

}
