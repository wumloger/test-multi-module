package top.wuml.requestdemo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/computer")
public class computer extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String name = req.getParameter("name");
        System.out.println(name);
        System.out.println("hello");
        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf-8");

        resp.getWriter().write("<b>姓名：</b>" + name + "</br>");
        resp.getWriter().write("界面为电脑界面");
    }
}
