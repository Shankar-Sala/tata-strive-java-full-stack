package hw_code;


class Employee11 {

    int employeeId;
    String employeeName;

    Employee11(int id, String name) {

        employeeId = id;
        employeeName = name;
    }

    void displayEmployee() {

        System.out.println("Employee ID : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
    }
}

class TaxCalculator extends Employee11 {

    double salary;
    double tax;

    TaxCalculator(int id, String name, double sal) {

        super(id, name);

        salary = sal;
    }

    void calculateTax() {

        System.out.println("Salary : " + salary);

        if(salary > 50000) {

            tax = salary * 0.20;
        }
        else {

            tax = salary * 0.10;
        }

        System.out.println("Tax Amount : " + tax);
    }
}

public class Inheritance6 {

    public static void main(String[] args) {

        TaxCalculator t1 =
                new TaxCalculator(1, "Shankar", 65000);

        t1.displayEmployee();

        t1.calculateTax();
    }
}
