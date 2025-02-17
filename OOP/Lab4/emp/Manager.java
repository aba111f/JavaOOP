package emp;
// package OOP.Lab4;

public class Manager extends NewEmployee{
    private String deptName;
    private NewEmployee[] staff;
    private int employeeCount = 0;


    public String getDeptName(){
        return deptName;
    }

    public boolean findEmployee(NewEmployee myEmp, int position){
        if(staff[position] == myEmp) return false;
        return true;
    }

    public boolean addEmployee(NewEmployee myEmp){
        boolean isExist = false;
        for(int i = 0; i < employeeCount; i++){
            isExist = findEmployee(myEmp, i);
            if(!isExist) return false;
        }
        staff[employeeCount] = myEmp;
        employeeCount++;

        return true;
    }

    public Manager(int empId, String name,String ssn, double salary, String deptName, NewEmployee[] staff){
        super(empId, name, ssn, salary);
        this.deptName = deptName;
        this.staff[20] = staff[20];
    }

}
