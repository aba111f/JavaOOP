package practices;
import some.example1.business.EmployeesStockPlan;
import some.example1.domain_1.AdminNew;
import some.example1.domain_1.DirectorNew;
import some.example1.domain_1.EngineerNew;
import some.example_1.*;


public class EmployeeTestNew {

    


    public static void main(String[] args){
        EmployeeNew[] staff = new EmployeeNew[20];

        EngineerNew myEng = new EngineerNew(101, "Jane Smith", "012-34-5678", 120345.27);

        EmployeeNew myEmp = new EmployeeNew(0, "aba", "125566-5533", 0);
        
        ManagerNew myMang = new ManagerNew(207, "Barbara Johnson", "054-12-2367", 109501.36, "US Marketing", staff);

        AdminNew myAdm = new AdminNew(304, "Bill Monroe", "108-23-6509", 75002.34);

        DirectorNew myDir = new DirectorNew(12, "Susan Wheeler", "099-45-2340", 120567.36, "Global Marketing", staff , 1000000.00);

        
        // printEmployee(myEng);
        boolean isAdded = myMang.addEmployeeNew(myEmp);
        
        

        boolean isRemoved = myMang.removeEmployeeNew(myEmp);
        
     

        isAdded = myMang.addEmployeeNew(myEmp);
        EmployeesStockPlan empStock = new EmployeesStockPlan();

        printEmployeeNew(myDir, empStock);
        printEmployeeNew(myMang, empStock);
        printEmployeeNew(myEmp, empStock);

        
       
    }

    public static void printEmployeeNew(EmployeeNew myEmp){
        System.out.println("Employee type: " + myEmp.getClass().getSimpleName());
        System.out.println(myEmp.toString());
        
    }
    
    public static void printEmployeeNew(EmployeeNew myEmp, EmployeesStockPlan empStock){
        printEmployeeNew(myEmp);
        System.out.println("number of stock: " + empStock.grantStock(myEmp));


    }
}