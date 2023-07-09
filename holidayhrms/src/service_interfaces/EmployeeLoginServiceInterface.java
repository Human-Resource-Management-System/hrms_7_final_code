package service_interfaces;

import models.Employee;
import models.EntityForgotPassword;

public interface EmployeeLoginServiceInterface {
    Employee getByEmail(String email);
    
    boolean authenticateUser(String email, String password);
    
    boolean authenticateUser_admin(String email, String password);
    
    Employee getEmployee(String email);
    
    String hashPassword(String password);
    
    void saveOrUpdate(EntityForgotPassword otpEntity);
}

