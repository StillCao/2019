package servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import dao.QueryData;
import domain.Community_Wuhan;
import domain.Total;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/communityServlet")
public class CommunityServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
//        String lon = req.getParameter("lon");
//        String lat = req.getParameter("lat");
//        float lon_ = Float.parseFloat(lon);
//        float lat_ = Float.parseFloat(lat);

        List<Community_Wuhan> community_wuhans = new QueryData().quaryCommunity();

        //利用ObjectMapper将对象转换成json格式
        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(community_wuhans);
        //响应数据
        resp.setContentType("text/html;charset=utf-8");
        resp.setHeader("Access-Control-Allow-Origin","*");//解决跨域问题，开发完毕时应该关闭。
        resp.getWriter().append(s);

    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
