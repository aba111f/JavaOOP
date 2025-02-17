package emp;


public class NewEmployee {
    
    private int empId;
    private String name;
    private String ssn;
    private double salary;

    public NewEmployee(int empId,String newname, String newssn, double newsalary){
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

    public static void main(String[] args){
        NewEmployee obj = new NewEmployee(1,"abay", "fsef341", 3242.34);
        System.out.println(obj.getName() + " " + obj.getSsn());


    }
    

}
