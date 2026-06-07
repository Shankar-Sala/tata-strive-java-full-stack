package hw_code;
//Create a Java program for an Employee Salary Management System using constructors.

class Employee {

    int employeeId;
    String employeeName;
    double salary;

    // Constructor3
    Employee(int id, String name, double sal) {

        employeeId = id;
        employeeName = name;
        salary = sal;
    }

    void displayEmployee() {

        System.out.println("Employee ID : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Salary : " + salary);
    }

    void salaryStatus() {

        if(salary > 50000) {

            System.out.println("High Salary Employee");
        }
        else {

            System.out.println("Normal Salary Employee");
        }

        System.out.println("-----------------------");
    }
}

public class Constructor2 {

    public static void main(String[] args) {

        Employee e1 = new Employee(1,"Shankar",65000);
        e1.displayEmployee();
        e1.salaryStatus();

        Employee e2 = new Employee(2,"Rahul",35000);
        e2.displayEmployee();
        e2.salaryStatus();
    }
}
