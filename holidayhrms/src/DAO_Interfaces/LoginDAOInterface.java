package DAO_Interfaces;

import java.util.List;

import models.Admin;
import models.Employee;

public interface LoginDAOInterface {
    void persist(Employee emp);
    
    List<Employee> findAll();
    
    Employee findUpdatableEmployee(int emp_id);
    
    Employee getDetailsByEmail(String emailId);
    
    void updateEmployeeAddress(int empId, String newAddress);
    
    Admin getAdminDetailsById(int id);
}

