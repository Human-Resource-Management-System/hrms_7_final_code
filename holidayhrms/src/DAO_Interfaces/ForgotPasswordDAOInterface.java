package DAO_Interfaces;


import models.Employee;
import models.EntityForgotPassword;

public interface ForgotPasswordDAOInterface {
    boolean checkEmailExists(String email);
    
    boolean findEmail(String email);
    
    void save(EntityForgotPassword otpEntity);
    
    void update(EntityForgotPassword otpEntity);
    
    String validateOtp(String email);
    
    void updatePassword(Employee user);
}

