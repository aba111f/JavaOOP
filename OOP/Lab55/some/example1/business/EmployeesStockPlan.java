package some.example1.business;
import practices.*;
import some.example1.domain_1.DirectorNew;

public class EmployeesStockPlan {

    private final int employeeShares = 10;
    private final int managerShares = 100;
    private final int directorShares = 1000;

    public int grantStock(EmployeeNew myEmp){
        if(myEmp instanceof DirectorNew){
            return directorShares;
        }
        else if(myEmp instanceof ManagerNew){
            return managerShares;
        }
        else{
            return employeeShares;
        }   
    }
    public static void main(String[] args) {
        
    }
}
