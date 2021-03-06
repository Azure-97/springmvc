package com.itheima.web;
import com.itheima.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService=app.getBean(UserService.class);
        userService.save();

    }
}
