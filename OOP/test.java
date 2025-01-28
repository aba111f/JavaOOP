package OOP;
import OOP.employee;


public class test {
    public static void main(String[] args){
        employee first = new employee("fafa", "fjae", 14123.3);
        first.setEmpId(101);
        first.setName("Jane Smith");
        first.setSsn("012-34-5678");
        first.setSalary(120345.27);

        System.out.println("Employee id: "+first.getEmpId());
        System.out.println("Employee name: "+first.getName());
        System.out.println("Employee Soc Sec #: "+first.getSsn());
        System.out.println("Employee salary: "+first.getSalary());
    }
}