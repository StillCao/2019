package servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import dao.QueryData;
import domain.Features;
import domain.HeatMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/heapMapServlet2")
public class HeapMapServlet2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.设置编码格式
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        //2.获取请求参数
        String time = req.getParameter("DateTime");
        String num = req.getParameter("num");
        //3.调用方法
        List<Features> lf = new QueryData().quaryType( time, num);

        //4.将结果集转换为json格式数据
        ObjectMapper mapper = new ObjectMapper();
        String features = mapper.writeValueAsString(lf);
        //5.相应数据
        resp.setHeader("Access-Control-Allow-Origin","*");//解决跨域问题，开发完毕时应该关闭
        resp.getWriter().append(features);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
