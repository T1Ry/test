package servlet;

import DB.Manager;
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
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/workerServlet")
public class WorkerServlet extends HttpServlet {
    private WorkerService workerService = new WorkerServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Manager manager = (Manager) session.getAttribute("Manager");
        System.out.println(manager.getManagerId());
        List<Worker> workers = workerService.selectAll(manager.getManagerId());
        String jsonString = JSON.toJSONString(workers);
//        System.out.println(workers);
        resp.getWriter().write(jsonString);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
