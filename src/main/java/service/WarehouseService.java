package service;

import DB.Warehouse;
import mapper.ManagerMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import utils.SqlSessionFactoryUtils;

import java.util.List;

public interface WarehouseService {
    List<Warehouse> selectAll(String managerId);
    List<Warehouse> orderByVolume(String managerId);
    void add(Warehouse warehouse);
}
