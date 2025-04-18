package EmployeeMemoryDAO.src.com.example.dao;

import EmployeeMemoryDAO.src.com.example.model.Employee;

public interface EmployeeDAO {
    public void add (Employee emp);
    public void update (Employee emp);
    public void delete (int id);
    public Employee findById(int id);
    public Employee [] getAllEmployees();
    
}