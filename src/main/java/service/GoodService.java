package service;

import DB.Good;
import DB.Warehouse;

import java.util.List;

public interface GoodService {
    List<Good> selectAll(String warehouseId);
}
