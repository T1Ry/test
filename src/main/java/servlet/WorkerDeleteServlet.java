package servlet;

import DB.Warehouse;
import com.alibaba.fastjson.JSON;
import service.GoodService;
import service.WarehouseService;
import service.WorkerService;
import service.impl.GoodServiceImpl;
import service.impl.WarehouseServiceImpl;
import service.impl.WorkerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/workerDeleteServlet")
public class WorkerDeleteServlet extends HttpServlet {
    private WorkerService workService = new WorkerServiceImpl();
    private WarehouseService warehouseService = new WarehouseServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedReader br = req.getReader();
        String params = br.readLine();
        String workId = params.substring(11,15);
        System.out.println(workId);
        //service
        workService.delete(workId);
        //response
        resp.getWriter().write("success");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
