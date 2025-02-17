package com.example.domain;
import emp.Manager;


public class Director extends Manager{
    
    private double budget;
    public double getBudget(){
        return budget;
    }
    public Director(int empId, String name, String ssn, double salary, String deptName, double budget){
        super(empId, name, ssn, salary, deptName);
        this.budget = budget;
    }
}
