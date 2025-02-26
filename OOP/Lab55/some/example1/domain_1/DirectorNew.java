package some.example1.domain_1;
import practices.ManagerNew;
import practices.EmployeeNew;

public class DirectorNew extends ManagerNew{
    
    private double budget;
    public double getBudget(){
        return budget;
    }
    public DirectorNew(int empId, String name, String ssn, double salary, String deptName, EmployeeNew[] staff, double budget){
        super(empId, name, ssn, salary, deptName, staff);
        this.budget = budget;
    }
}
