package top.wuml.overall.controller;

import top.wuml.overall.entity.User;
import top.wuml.overall.service.UserService;
import top.wuml.overall.service.impl.UserServiceImpl;
import top.wuml.overall.util.Md5Util;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
private UserService userService = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String account = req.getParameter("account");
        String password = req.getParameter("password");
        User user = userService.loginIn(account, password);
        resp.setCharacterEncoding("utf-8");
        if (user!=null){
            HttpSession session = req.getSession();
            session.setAttribute("user",user);
            resp.sendRedirect("mainPage.html");
        }else{
            PrintWriter writer = resp.getWriter();
            writer.print("<script>alert('账号或密码错误');location.href='/'</script>");
            writer.close();
        }

    }
}
