
package practices;

import java.util.Locale;
import java.text.NumberFormat;

public class EmployeeNew {


    
    private int empId;
    private String name;
    private String ssn;
    private double salary;

    public EmployeeNew(int empId,String newname, String newssn, double newsalary){
        this.empId = empId;
        name = newname;
        ssn = newssn;
        salary = newsalary;
    }

    
    public int getEmpId(){
        return empId;
    }
    
    public void setName(String data){
        name = data;
    }   



    public String getName(){    
        
        return name;
    }  

   
    public String getSsn(){
        return ssn;
    }

    
    public double getSalary(){
        return salary;
    }
    
    public double raiseSalary(double increase){
        this.salary += increase;
        return salary;
    }   

    @Override
    public String toString() {
        return String.format("empID:   %20s\nName:    %20s\nSSN:     %20s\nSalary:  %20s",
                empId, name, ssn, NumberFormat.getCurrencyInstance(Locale.US).format(salary));
    }
    

    public static void main(String[] args){
        EmployeeNew obj = new EmployeeNew(1,"abay", "fsef341", 3242.34);
        EmployeeNew obj1 = new EmployeeNew(2,"egor", "141341351", 1254.23);
        // System.out.println(obj.getName() + " " + obj.getSsn());
        System.out.println(obj.toString());
        System.out.println();
        System.out.println(obj1.toString());
    }
    

    
    

}

