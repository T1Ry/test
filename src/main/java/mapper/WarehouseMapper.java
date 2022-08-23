package mapper;

import DB.Manager;
import DB.Warehouse;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WarehouseMapper {
    List<Warehouse> selectAll(@Param("managerId")String managerId);
    List<Warehouse> orderByVolume(@Param("managerId")String managerId);
    void add(@Param("warehouse")Warehouse warehouse);
}
