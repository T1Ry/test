package mapper;


import DB.Worker;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WorkerMapper {
    List<Worker> selectAll(@Param("managerId")String managerId);
    void delete(@Param("workId")String workId);
    void add(@Param("worker")Worker worker);
}
