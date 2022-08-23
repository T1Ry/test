package servlet;

import DB.Good;
import DB.Worker;
import com.alibaba.fastjson.JSON;
import service.GoodService;
import service.WorkerService;
import service.impl.GoodServiceImpl;
import service.impl.WorkerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/goodServlet")
public class GoodServlet extends HttpServlet {
    private GoodService goodService = new GoodServiceImpl();
    private String jsonString;

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String warehouseId = req.getParameter("warehouseId");
        HttpSession session = req.getSession();
        if(warehouseId!=null){
            List<Good> goods = goodService.selectAll(warehouseId);
            jsonString = JSON.toJSONString(goods);
        }
        System.out.println(jsonString);
        session.setAttribute("jsonString",jsonString);
        resp.sendRedirect("good.html");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
