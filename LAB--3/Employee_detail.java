import java.util.Scanner;

class Employee_Detail {
    int Employee_id;
    String Name;
    String Designation;
    double Salary;

    public void readDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        Employee_id = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Name: ");
        Name = sc.nextLine();
        System.out.print("Enter Designation: ");
        Designation = sc.nextLine();
        System.out.print("Enter Salary: ");
        Salary = sc.nextDouble();
        sc.close();
    }

    public void printDetails() {
        System.out.println("Employee ID: " + Employee_id);
        System.out.println("Name: " + Name);
        System.out.println("Designation: " + Designation);
        System.out.println("Salary: " + Salary);
    }
}

public class EmployeeDetailTest {
    public static void main(String[] args) {
        Employee_Detail emp = new Employee_Detail();
        emp.readDetails();
        emp.printDetails();
    }
}
