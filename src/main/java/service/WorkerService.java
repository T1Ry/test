package service;

import DB.Warehouse;
import DB.Worker;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WorkerService {
    List<Worker> selectAll(String managerId);
    void delete(String workId);
    void add(Worker worker);
}
