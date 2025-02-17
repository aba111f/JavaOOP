package OOP.Lab1;


public class employee {
    public int empId;
    public String name;
    public String ssn;
    public double salary;

    public employee(String newname, String newssn, double newsalary){
        empId = 0;
        name = newname;
        ssn = newssn;
        salary = newsalary;
    }

    public void setEmpId(int data){
        empId = data;
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

    public void setSsn(String data){
        ssn = data;
    }   
    public String getSsn(){
        return ssn;
    }

    public void setSalary(double data){
        salary = data;
    }
    public double getSalary(){
        return salary;
    }
    
    public static void main(String[] args){
        employee obj = new employee("abay", "fsef341", 3242.34);
        System.out.println(obj.getName() + " " + obj.getSsn());

                
    }
    
}