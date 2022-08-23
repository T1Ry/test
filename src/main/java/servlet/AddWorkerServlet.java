package servlet;

import DB.Warehouse;
import DB.Worker;
import com.alibaba.fastjson.JSON;
import service.WarehouseService;
import service.WorkerService;
import service.impl.WarehouseServiceImpl;
import service.impl.WorkerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/addWorkerServlet")
public class AddWorkerServlet extends HttpServlet {
    private WorkerService workerService = new WorkerServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedReader br = req.getReader();
        String params = br.readLine();
        Warehouse warehouse  = JSON.parseObject(params,Warehouse.class);
        Worker worker = JSON.parseObject(params,Worker.class);
        System.out.println(params);
        System.out.println(worker);
//        resp.getWriter().write(warehouse);
        workerService.add(worker);
        resp.getWriter().write("success");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
