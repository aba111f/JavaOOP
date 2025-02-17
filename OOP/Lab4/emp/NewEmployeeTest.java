package emp;

import com.example.domain.Admin;
import com.example.domain.Director;
import com.example.domain.Engineer;
import emp.NewEmployee;
public class NewEmployeeTest {

    

    public static void main(String[] args){
        Engineer myEng = new Engineer(101, "Jane Smith", "012-34-5678", 120345.27);
        // NewEmployee myEmp = new NewEmployee(0, null, null, 0);
        Manager myMang = new Manager(207, "Barbara Johnson", "054-12-2367", 109501.36, "US Marketing");

        Admin myAdm = new Admin(304, "Bill Monroe", "108-23-6509", 75002.34);

        Director myDir = new Director(12, "Susan Wheeler", "099-45-2340", 120567.36, "Global Marketing", 1000000.00);

        
        printEmployee(myEng);
        
    }
    public static void printEmployee(NewEmployee myEmp){
        System.out.println(myEmp.getEmpId());
        System.out.println(myEmp.getName());
        System.out.println(myEmp.getSalary());
        System.out.println(myEmp.getSsn());
        
    }
}