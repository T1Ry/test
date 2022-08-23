package servlet;

import DB.Manager;
import DB.Warehouse;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import service.WarehouseService;
import service.impl.WarehouseServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/orderByVolumeServlet")
public class OrderByVolumeServlet extends HttpServlet {
    private WarehouseService warehouseService = new WarehouseServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Manager manager = (Manager) session.getAttribute("Manager");
        List<Warehouse> warehouses = warehouseService.orderByVolume(manager.getManagerId());
        String jsonString = JSON.toJSONString(warehouses, SerializerFeature.WriteMapNullValue);
        System.out.println(jsonString);
        resp.getWriter().write(jsonString);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
