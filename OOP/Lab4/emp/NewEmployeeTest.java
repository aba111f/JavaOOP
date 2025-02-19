package emp;

import com.example.domain.Admin;
import com.example.domain.Director;
import com.example.domain.Engineer;

public class NewEmployeeTest {

    

    public static void main(String[] args){
        NewEmployee[] staff = new NewEmployee[20];

        Engineer myEng = new Engineer(101, "Jane Smith", "012-34-5678", 120345.27);

        NewEmployee myEmp = new NewEmployee(0, "aba", "125566-5533", 0);
        
        Manager myMang = new Manager(207, "Barbara Johnson", "054-12-2367", 109501.36, "US Marketing", staff);

        Admin myAdm = new Admin(304, "Bill Monroe", "108-23-6509", 75002.34);

        Director myDir = new Director(12, "Susan Wheeler", "099-45-2340", 120567.36, "Global Marketing", staff,1000000.00);

        
        // printEmployee(myEng);
        boolean isAdded = myMang.addEmployee(myEmp);
        
        

        boolean isRemoved = myMang.removeEmployee(myEmp);
        
     

        isAdded = myMang.addEmployee(myEmp);
        myMang.printStaff();
       
    }

    public static void printEmployee(NewEmployee myEmp){
        System.out.println(myEmp.getEmpId());
        System.out.println(myEmp.getName());
        System.out.println(myEmp.getSalary());
        System.out.println(myEmp.getSsn());
        
    }
}