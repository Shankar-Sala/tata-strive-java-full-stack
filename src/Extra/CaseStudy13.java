package Extra;

/*
Problem Statement
Tata Consultancy Services (TCS) wants to develop a Smart Employee Management System.
The system should:
1.	Store employee details (ID, Name, Salary).--ok
2.	Generate employee IDs automatically using a static variable.--ok
3.	Use a final variable for company name.--ok
4.	Create different employee types:--ok
o	Developer
o	Tester
5.	Display role-specific information using method overriding.--ok
6.	Define company policies using an interface.--ok
7.	Use abstraction for common employee operations.--ok
8.	Validate salary before processing.--ok
9.	Throw an exception if salary is negative.--ok
10.	Use protected access for employee details.--ok
 */
interface CompanyPolicy {
    void workHours();
}

// Abstract Class
abstract class Employee5 {
    protected int empId;
    protected String name;
    protected double salary;

    static int counter = 1001; // static variable
    final String companyName = "TCS"; // final variable

    // Parameterized Constructor
    Employee5(String name, double salary) throws Exception {
        empId = counter++;
        this.name = name;
        this.salary = salary;

        if (salary < 0) {
            throw new Exception("Salary cannot be negative");
        }
    }

    abstract void displayRole();

    void displayDetails() {
        System.out.println("\nCompany Name : " + companyName);
        System.out.println("Employee ID  : " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Salary       : " + salary);
    }
}

// Developer Class
class Developer extends Employee5 implements CompanyPolicy {

    Developer(String name, double salary) throws Exception {
        super(name, salary);
    }

    @Override
    void displayRole() {
        System.out.println("Role : Developer");
    }

    @Override
    public void workHours() {
        System.out.println("Working Hours : 9 Hours per Day");
    }
}

// Tester Class
class Tester extends Employee5 implements CompanyPolicy {

    Tester(String name, double salary) throws Exception {
        super(name, salary);
    }

    @Override
    void displayRole() {
        System.out.println("Role : Tester");
    }

    @Override
    public void workHours() {
        System.out.println("Working Hours : 8 Hours per Day");
    }
}

// Main Class
public class CaseStudy13 {
    public static void main(String[] args) {

        try {
            Developer d1 = new Developer("Shabina", 50000);
            Tester t1 = new Tester("Ayesha", 40000);

            d1.displayDetails();
            d1.displayRole();
            d1.workHours();

            t1.displayDetails();
            t1.displayRole();
            t1.workHours();

            // Exception Example
            Developer d2 = new Developer("Ali", -5000);

        } catch (Exception e) {
            System.out.println("\nException : " + e.getMessage());
        } finally {
            System.out.println("\nProgram Ended");
        }
    }
}