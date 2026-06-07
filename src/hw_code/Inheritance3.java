package hw_code;

class Company {

    String companyName = "TCS";

    void displayCompany() {

        System.out.println("Company Name : " + companyName);
    }
}

class Employee45 extends Company {

    int employeeId;
    String employeeName;
    double salary;

    Employee45(int id, String name, double sal) {

        employeeId = id;
        employeeName = name;
        salary = sal;
    }

    void displayEmployee() {

        System.out.println("Employee ID : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Salary : " + salary);
    }
}

public class Inheritance3 {

    public static void main(String[] args) {

        Employee45 e1 = new Employee45(1, "Rahul", 45000);

        e1.displayCompany();
        e1.displayEmployee();
    }
}