package com.example.javawebdemo.servlet;

import com.example.javawebdemo.entity.student;
import com.example.javawebdemo.util.CheckCodeServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "myServlet" ,value = "/myServlet")
public class myServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    String keyAndValue = req.getQueryString();
    String value = keyAndValue.substring(keyAndValue.indexOf('=') + 1);
        System.out.println(value);
        String code = (String) req.getSession().getAttribute("CHECKCODE_SERVER");
        System.out.println(code);
    if (code.equalsIgnoreCase(value)){
    resp.setContentType("application/json;charset=utf-8");
    resp.getWriter().write("myJson:");
    student s = new student("吴明龙",22,"南京");
    resp.getWriter().write("{ \"姓名\" : \"" + s.getName() + "\",\"年龄\" : " + s.getAge() +",\"住址\" :" + "\"" + s.getAddress() + "\"}");
    }else{
        resp.getWriter().write("<h1>WRONG</h1>");
    }


    }
}
