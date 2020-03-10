package servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import dao.QueryData;
import domain.Province;
import domain.Province_Today;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/provinceTodayServlet")
public class ProvinceTodayServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.设置编码格式
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        //2.获取请求参数
        String province = req.getParameter("province");
        //3.调用方法，查询数据库
        List<Province_Today> province_todays = new QueryData().quaryProvinceToday(province);
        //利用ObjectMapper将对象转换成json格式
        ObjectMapper mapper = new ObjectMapper();
        String jsonlist = mapper.writeValueAsString(province_todays);
        //响应数据
        resp.setHeader("Access-Control-Allow-Origin","*");//解决跨域问题，开发完毕时应该关闭
        resp.getWriter().append(jsonlist);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
