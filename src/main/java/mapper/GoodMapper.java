package mapper;

import DB.Good;
import DB.Manager;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodMapper {
    List<Good> selectAll(@Param("warehouseId")String warehouseId);

}
