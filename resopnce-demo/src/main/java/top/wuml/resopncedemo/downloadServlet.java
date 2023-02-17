package top.wuml.resopncedemo;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet("/download")
public class downloadServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("开始下载");
        String filename = req.getParameter("file");
        ServletContext servletContext = this.getServletContext();
        String realPath = servletContext.getRealPath("/img/" + filename);
        System.out.println(realPath);
        FileInputStream inputStream = new FileInputStream(realPath);
        String mimeType = servletContext.getMimeType(filename);
        resp.setHeader("content-type",mimeType);
        resp.setHeader("content-disposition","attachment;filename="+filename);
        byte[] buffer = new byte[1024 * 8];

        ServletOutputStream outputStream = resp.getOutputStream();
        int len;
        while((len = inputStream.read(buffer)) != -1){
            outputStream.write(buffer);
        }
        inputStream.close();
        outputStream.close();


    }
}
