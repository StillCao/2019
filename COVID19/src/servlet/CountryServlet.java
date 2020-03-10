package servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import dao.QueryData;
import domain.Country;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/countryServlet")
public class CountryServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取查询结果集合
        List<Country> countryList = new QueryData().quaryCountry();
        //将结果集转换为json格式数据
        ObjectMapper mapper = new ObjectMapper();
        String jsonlist = mapper.writeValueAsString(countryList);
        //相应数据
        resp.setContentType("text/html;charset=utf-8");
        resp.setHeader("Access-Control-Allow-Origin","*");//解决跨域问题，开发完毕时应该关闭。
        resp.getWriter().append(jsonlist);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
