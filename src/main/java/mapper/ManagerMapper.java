package mapper;

import DB.Manager;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ManagerMapper {

    List<Manager> selectAll();
    Manager selectByName(@Param("username")String username,@Param("password")String password);
    Manager select(@Param("managerId")String managerId);
    void update(@Param("managerId") String managerId);
    void delete(@Param("managerId")String managerId);
}
