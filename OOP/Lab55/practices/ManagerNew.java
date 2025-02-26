package practices;

public class ManagerNew extends EmployeeNew{

    private String deptName;
    private EmployeeNew[] staff;
    private int employeeNewCount = 0;

    public ManagerNew(int empId, String name,String ssn, double salary, String deptName, EmployeeNew[] staff){
        super(empId, name, ssn, salary);
        this.deptName = deptName;
        this.staff = new EmployeeNew[20];
    } 


    

    public String getDeptName(){
        return deptName;
    }

    public int findEmployeeNew(EmployeeNew emp){
        int i=0;
        while(staff[i]!= emp){
            
            i++;
            if(i==staff.length) return -1;

        }
        
        return i;
    }

    public boolean addEmployeeNew(EmployeeNew myEmp){
        int isExist = 0;

        isExist = findEmployeeNew(myEmp);
        if(isExist==-1) {
            staff[employeeNewCount] = myEmp;
            employeeNewCount++;

            return true;
        }

        

        return false;
    }

      public boolean removeEmployeeNew(EmployeeNew chel) {
        int i = findEmployeeNew(chel);
        int j=0;
        int c=0;

        EmployeeNew newStaff[]=new EmployeeNew[this.staff.length-1];

        if(i == -1){
            return false;
        }
        employeeNewCount--;
        while (true) {
            if(j == this.staff.length){
                break;
            }
            if (j==i) {
                j++;
                continue;
            }
            newStaff[c] = this.staff[j];
            c++;
            j++;
        }
        this.staff=newStaff;
        
        return true;
      }


    public void printStaff(){
        System.out.println(this.getName());
        System.out.println(getDeptName());
        for(int i=0;i<staff.length;i++){
            if(staff[i]!=null){
                System.out.println("name: " + staff[i].getName());
                System.out.println("ID: " + staff[i].getEmpId());
                System.out.println("SSN: " + staff[i].getSsn());
                System.out.println("Salary: " + staff[i].getSalary());
            }
        }
    }

    @Override
    public String toString(){
        return super.toString() + String.format("DeptName: %20s\n", getDeptName());
    }
    
}