package top.wuml.requestdemo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/distinguish")
public class distinguish extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json;charset=utf-8");
        req.setCharacterEncoding("utf-8");
        String userAgent = req.getHeader("User-Agent");
        String password = req.getParameter("password");

        if ("123456".equals(password)) {
            System.out.println(userAgent);
            if (userAgent.contains("Mobile")) {
                req.getRequestDispatcher("mobile").forward(req, resp);

            } else {
                req.getRequestDispatcher("computer").forward(req, resp);
            }
        }else{
            resp.getWriter().write("密码错误");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
