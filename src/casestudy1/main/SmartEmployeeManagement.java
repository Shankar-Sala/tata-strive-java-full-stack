package casestudy1.main;

import casestudy1.employee.Developer;
import casestudy1.employee.Tester;

public class SmartEmployeeManagement {

    public static void main(String[] args) {

        try {

            Developer d1 = new Developer("Shankar", 50000);

            d1.displayEmployee();
            d1.displayRole();
            d1.workHours();
            d1.leavePolicy();

            System.out.println();

            Tester t1 = new Tester("Ram", 45000);

            t1.displayEmployee();
            t1.displayRole();
            t1.workHours();
            t1.leavePolicy();

            Tester t2 = new Tester("Amit", -10000);

        } catch (Exception e) {
            System.out.println("----------------------------------------");
            System.out.println("----------------------------------------");
            System.out.println("Exception Caught: " + e.getMessage());

        } finally {
            System.out.println("----------------------------------------");
            System.out.println("----------------------------------------");
            System.out.println("Employee Processing Completed.");

        }
    }
}