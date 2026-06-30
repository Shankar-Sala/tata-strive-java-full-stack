package Extra;/* A company wants to develop a simple Employee Management System to manage:

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
 class-----Employee,Company
 static---Company Name
 static block---some info ---that print before main()
 Final----country
 Instance variables----employee details
Switsh-case-------department
Static method ----company policy
 */

class Company {
    static String companyName="TATA STRIVE";
    final String country="INDIA";
    static {
        System.out.println("Employee Management System Started");
    }
    static void companyPolicy() {
        System.out.println("Company Policy Activated");
    }
    void displayCompany() {
        System.out.println("Company Name: "+companyName);
        System.out.println("Country Name: "+country);
    }
}

class Employee{
    int empId;
    String empName;
    int empSalary;

    public Employee(String name, double salary) {
        empName=name;
        empSalary= (int) salary;
    }

    void displayEmployee() {
        System.out.println("Emplyee ID: "+empId);
        System.out.println("Emplyee Name: "+empName);
        System.out.println("Salary: "+empSalary);
    }

    void bonusCheck() {
        if (empSalary>=5000) {
            System.out.println("Bonus Eligible");
        } else {
            System.out.println("Bonus not Eligible");
        }

    }
}

class Department{
    void departmentInfo(int choice){
        switch(choice) {
            case 1:
                System.out.println("Java Department");
                break;
            case 2:
                System.out.println("Python Department");
                break;
            case 3:
                System.out.println("Testing Department");
                break;
            case 4:
                System.out.println("Invalid Department");
                break;
        }
    }
    void departmentMessage(){
        System.out.println("Department Assigned");
    }
}

class Attendance{
    void showAttendance() {
        System.out.println("Employee Working days");
        for(int i=1;i<=5;i++) {
            System.out.println("Days"+i+"Present");
        }
    }
    void attendanceMessage() {
        System.out.println("Attendance Updated");
    }
}

public class CaseStudy1 {
    public static void main(String[] args) {
        Company.companyPolicy();
        Company c1 =new Company();
        c1.displayCompany();

        Employee e1 = new Employee("shabina",500000);
        e1.empId=101;
        e1.displayEmployee();
        e1.bonusCheck();

        Department d1 = new Department();
        d1.departmentInfo(1);
        d1.departmentMessage();

        Attendance a1 = new Attendance();
        a1.showAttendance();
        a1.attendanceMessage();
    }

}
