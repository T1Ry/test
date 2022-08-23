package service.impl;

import DB.Warehouse;
import DB.Worker;
import mapper.WarehouseMapper;
import mapper.WorkerMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import service.WorkerService;
import utils.SqlSessionFactoryUtils;

import java.util.List;

public class WorkerServiceImpl implements WorkerService {
    SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
    @Override
    public List<Worker> selectAll(String managerId) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        WorkerMapper workerMapper =sqlSession.getMapper(WorkerMapper.class);
        List<Worker> workers= workerMapper.selectAll(managerId);

        sqlSession.close();
        return workers;
    }

    @Override
    public void delete(String workId) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        WorkerMapper workerMapper =sqlSession.getMapper(WorkerMapper.class);
        workerMapper.delete(workId);

        sqlSession.close();
    }

    @Override
    public void add(Worker worker) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        WorkerMapper workerMapper =sqlSession.getMapper(WorkerMapper.class);
        workerMapper.add(worker);

        sqlSession.commit();
        sqlSession.close();
    }


}
