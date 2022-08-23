package service.impl;

import DB.Good;
import DB.Worker;
import mapper.GoodMapper;
import mapper.WorkerMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import service.GoodService;
import utils.SqlSessionFactoryUtils;

import java.util.List;

public class GoodServiceImpl implements GoodService{
    SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
    @Override
    public List<Good> selectAll(String warehouseId) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        GoodMapper goodMapper =sqlSession.getMapper(GoodMapper.class);
        List<Good> goods= goodMapper.selectAll(warehouseId);
        return goods;
    }
}
