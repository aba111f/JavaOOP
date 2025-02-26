package com.example.domain;
import emp.Manager;
import emp.NewEmployee;


public class Director extends Manager{
    
    private double budget;
    public double getBudget(){
        return budget;
    }
    public Director(int empId, String name, String ssn, double salary, String deptName, NewEmployee[] staff, double budget){
        super(empId, name, ssn, salary, deptName, staff);
        this.budget = budget;
    }
}
