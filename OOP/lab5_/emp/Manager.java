package emp;

public class Manager extends NewEmployee{
    private String deptName;
    private NewEmployee[] staff;
    private int NewemployeeCount = 0;

    public Manager(int empId, String name,String ssn, double salary, String deptName, NewEmployee[] staff){
        super(empId, name, ssn, salary);
        this.deptName = deptName;
        this.staff = new NewEmployee[20];
    } 


    

    public String getDeptName(){
        return deptName;
    }

    public int findNewEmployee(NewEmployee emp){
        int i=0;
        while(staff[i]!= emp){
            
            i++;
            if(i==staff.length) return -1;

        }
        
        return i;
    }

    public boolean addEmployee(NewEmployee myEmp){
        int isExist = 0;

        isExist = findNewEmployee(myEmp);
        if(isExist==-1) {
            staff[NewemployeeCount] = myEmp;
            NewemployeeCount++;

            return true;
        }

        

        return false;
    }

      public boolean removeEmployee(NewEmployee chel) {
        int i = findNewEmployee(chel);
        int j=0;
        int c=0;

        NewEmployee newStaff[]=new NewEmployee[this.staff.length-1];

        if(i == -1){
            return false;
        }
        NewemployeeCount--;
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

    

}