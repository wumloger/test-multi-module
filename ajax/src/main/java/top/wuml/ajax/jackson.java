package top.wuml.ajax;

import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/jackson")
public class jackson extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<String> lista = new ArrayList<>();
        lista.add("b");
        lista.add("c");
        Channel channela = new Channel("a",lista);

        List<String> list1 = new ArrayList<>();
        list1.add("2");
        list1.add("3");
        Channel channel1 = new Channel("1",list1);

        List<String> listLv1 = new ArrayList<>();
        listLv1.add("a");
        listLv1.add("1");
        String jsonString = JSON.toJSONString(listLv1);
        String param = req.getParameter("param");
        if ("lv1".equals(param)){
            PrintWriter writer = resp.getWriter();
            writer.write(jsonString);
        }else if("lv2".equals(param)){

        }



    }
}
