package mapper;

import DB.Employee;
//import DB.Manager;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper {
    List<Good> select(@Param("user_id") int user_id);
}
