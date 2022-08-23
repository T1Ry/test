package service;

import DB.Manager;

public interface ManagerService {

    Manager select(String managerId);
    void update(String managerId);
    void delete(String managerId);
}
