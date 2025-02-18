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

      public boolean removeEmployee(NewEmployee chel, Manager man) {
        int i = man.findNewEmployee(chel);
        int j=0;
        int c=0;

        NewEmployee newStaff[]=new NewEmployee[man.staff.length-1];

        if(i == -1){
            return false;
        }
        NewemployeeCount--;
        while (true) {
            if(j==man.staff.length){
                break;
            }
            if (j==i) {
                j++;
                continue;
            }
            newStaff[c] =man.staff[j];
            c++;
            j++;
        }
        man.staff=newStaff;
        
        return true;
      }
    public void len(){
        for(int i=0;i<staff.length;i++){
            if(staff[i]!=null){
                System.out.println(staff[i].getName());
            }
        }
    }
    public void printLenStaff(){
        System.out.println(staff.length);
    }

}