package servlet;

import DB.Warehouse;
import com.alibaba.fastjson.JSON;
import service.WarehouseService;
import service.impl.WarehouseServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@WebServlet("/addWarehouseServlet")
public class AddWarehouseServlet extends HttpServlet {
    private WarehouseService warehouseService = new WarehouseServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedReader br = req.getReader();
        String params = br.readLine();
        Warehouse warehouse  = JSON.parseObject(params,Warehouse.class);
        System.out.println(params);
        System.out.println(warehouse);
//        resp.getWriter().write(warehouse);
        warehouseService.add(warehouse);
        resp.getWriter().write("success");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
