package basic_code;

/*
 * A company wants to develop a simple Employee Management System to manage:

employee details
department allocation
salary processing
attendance
company information

The system should:

store common company information
store employee-specific information
display attendance records
show department using switch-case
check salary bonus eligibility using if-else
display working days using for-loop
 *
 * class-----Employee,Company
 * static---Company Name
 * static block---some info ---that print before main()
 * Final----country
 * Instance variables----employee details
   Switsh-case-------department
   Static method ----company policy
 *
 */
class Company {
    static String companyName = "Tata STRIVE Technologies";
    final String country = "India";

    // Static block
    static {
        System.out.println("---------------------------------------");
        System.out.println("Employee Management System Started");
        System.out.println("---------------------------------------");

    }

    static void companyPolicy() {

        System.out.println("Company Policy Activated");
    }

    void displayCompany() {

        System.out.println("Company : " + companyName);
        System.out.println("Country : " + country);
        System.out.println("----------------------------");
    }

}

class Employee {
    // instance variables
    int empId;
    String empName;
    int salary;

    void displayEmployee() {

        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary : " + salary);
    }

    void bonusCheck() {
        // if-else
        if (salary >= 50000) {
            System.out.println("Bonus Eligible");

        } else {
            System.out.println("Bonus Not Eligible");

        }
        System.out.println("----------------------------");
        System.out.println("----------------------------");

    }
}

class Department {
    void departmentInfo(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Java Department");
                break;

            case 2:
                System.out.println("Python Department");
                break;

            case 3:
                System.out.println("Testing Department");
                break;

            default:
                System.out.println("Invalid Department");
        }
    }

    void departmentMessage() {
        System.out.println("Department Assigned");
        System.out.println("----------------------------");
    }
}

class Attendance {
    void showAttendance() {
        System.out.println("Employee Working days");
        // for loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("Day " + i + " Present");
        }
    }

    void attendanceMessage() {
        System.out.println("Attendance Updated");
        System.out.println("----------------------------");
    }
}

public class CaseStudy1 {
    public static void main(String args[]) {
        Company.companyPolicy();
        Company c1 = new Company();
        c1.displayCompany();

        Employee e1 = new Employee();
        e1.empName = "Sona";
        e1.empId = 101;
        e1.salary = 25000;
        e1.displayEmployee();
        e1.bonusCheck();

        Department d1 = new Department();
        d1.departmentInfo(2);
        d1.departmentMessage();

        Attendance a1 = new Attendance();
        a1.showAttendance();
        a1.attendanceMessage();
    }

}
