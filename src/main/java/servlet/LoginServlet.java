package servlet;

import DB.Manager;
import mapper.ManagerMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import utils.SqlSessionFactoryUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.accept username and password
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println(username+password);
        //2.Query by Mybatis
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        ManagerMapper managerMapper = sqlSession.getMapper(ManagerMapper.class);

        Manager manager = managerMapper.selectByName(username,password);
        System.out.println(manager);
        HttpSession session = req.getSession();
//        boolean flag = true;
        if(manager != null){
//            manager.setPassword(null);
            session.setAttribute("Manager",manager);
//            System.out.println(manager);
            resp.sendRedirect("index.html");

        }else {
            resp.sendRedirect("user_error.html");
        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
