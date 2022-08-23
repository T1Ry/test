package service.impl;

import DB.Good;
import DB.Manager;
import mapper.GoodMapper;
import mapper.ManagerMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import service.ManagerService;
import utils.SqlSessionFactoryUtils;

import java.util.List;

public class ManagerServiceImpl implements ManagerService {
    SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
    @Override
    public Manager select(String managerId) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        ManagerMapper managerMapper = sqlSession.getMapper(ManagerMapper.class);
        Manager manager = managerMapper.select(managerId);
        sqlSession.commit();
        sqlSession.close();
        return manager;
    }

    @Override
    public void update(String managerId) {


    }

    @Override
    public void delete(String managerId) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        ManagerMapper managerMapper = sqlSession.getMapper(ManagerMapper.class);
        managerMapper.delete(managerId);
        sqlSession.commit();
        sqlSession.close();
    }
}
