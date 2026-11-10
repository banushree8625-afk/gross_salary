import java.util.Scanner;
class Employee{
    int employeeID;
    String employeename;
    String department;
    double basicSalary;
    double grossSalary;
    double tax;
    double netSalary;
void assigndetails(int id,String name,String dept,double salary)
{
    employeeID=id;
    employeename=name;
    department=dept;
    basicSalary=salary;
}
void calculategrossSalary()
{
    double HRA=0.20*basicSalary;
    double DA=0.10*basicSalary;
    grossSalary=HRA+DA+basicSalary;
}
void deducttax()
{
    tax=0.10*grossSalary;
    netSalary=grossSalary-tax;
}
void display()
{
    System.out.println("\n------EMPLOYEE  PAYROLL-----\n");
    System.out.println("EmployeeID:"+employeeID);
    System.out.println("Employeename:"+employeename);
    System.out.println("Department:"+department);
    System.out.println("BasicSalary:"+basicSalary);
    System.out.println("grossSalary:"+grossSalary);
    System.out.println("tax:"+tax);
    System.out.println("netSalary:"+netSalary);
}
}
public class employeepayroll
{
    public static void main(String args[])
    {
        Employee emp=new Employee();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter employee id");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("enter employeee name");
        String name=sc.nextLine();
        System.out.println("enter employee department");
        String dept=sc.nextLine();
        System.out.println("enter employee basicsalary");
        double salary=sc.nextDouble();
        emp.assigndetails(id,name,dept,salary);
        emp.calculategrossSalary();
        emp.deducttax();
        emp.display();
        sc.close();
    }
}
