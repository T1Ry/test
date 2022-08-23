package service.impl;

import DB.Warehouse;
import mapper.ManagerMapper;
import mapper.WarehouseMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import service.WarehouseService;
import utils.SqlSessionFactoryUtils;

import java.util.List;

public class WarehouseServiceImpl implements WarehouseService {

    SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
    @Override
    public List<Warehouse> selectAll(String managerId) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        WarehouseMapper warehouseMapper = sqlSession.getMapper(WarehouseMapper.class);
        List<Warehouse> warehouses= warehouseMapper.selectAll(managerId);


        sqlSession.close();
        return warehouses;
    }

    @Override
    public List<Warehouse> orderByVolume(String managerId) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        WarehouseMapper warehouseMapper = sqlSession.getMapper(WarehouseMapper.class);
        List<Warehouse> warehouses= warehouseMapper.orderByVolume(managerId);

        sqlSession.close();
        return warehouses;
    }

    @Override
    public void add(Warehouse warehouse) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        WarehouseMapper warehouseMapper = sqlSession.getMapper(WarehouseMapper.class);
        warehouseMapper.add(warehouse);
        sqlSession.commit();
        sqlSession.close();

    }
}
