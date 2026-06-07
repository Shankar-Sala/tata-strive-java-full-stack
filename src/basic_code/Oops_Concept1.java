package basic_code;

/*
 * OOPS---Object oriented Programming...
 * object
 * class
 * inheritance---extends
 * polymorphisms---
 * Abstraction--abstract
 * Encapsulation
 *
 * inheritance---One class derive the features of its exiting class...
 * parent --child relationship..
 * extends----it is a keyword---used to inherit parent class
 *
 * class Parent
 * {
 * }
 * class child extends Parent
 * {
 *
 * }
 *
 *
 * Types of inheritance---
 *
 * single level
 *
 *    A
 *    |
 *    B
 * Multilevel
 *    A
 *    |
 *    B
 *    |
 *    c
 * Hierarchical/Tree
 *
 *   A
 *  / \
 *  B  C
 *
 * Hybrid-----Diamond Problem..-------Interface
 *   A
 *  / \
 *  B  C
 *   \ /
 *    D
 * Multiple-----------Interface
 *
 *  B  C
 *   \ /
 *    D
 *
 *
 *
 */

//parent class
/*
class Company1 {

	String companyName = "TataStrive";

	void companyDetails() {
		System.out.println("Follw company rules...!");

	}

}

//child class
class Employee1 extends Company1 {
	int employeeId = 101;
	String employeeName = "Sonam";

	void employeeDetails() {
		System.out.println("Employee ID : " + employeeId);
		System.out.println("Employee Name : " + employeeName);
	}
}

public class Oops_Concept1 {
	public static void main(String args[]) {
		// object 1
		Employee1 e1 = new Employee1();
		// parent class method
		e1.companyDetails();

		// Parent class variable
		System.out.println("Company Name: " + e1.companyName);
		//child class method
		e1.employeeDetails();
	}
}


*/

//-----------------------------------------------------------------------

//Parent Class
class Hospital2 {
    String hospitalName = "Tata STRIVE Hospital";
    String city = "Mumbai";

    void hospitalRules() {
        System.out.println("Follow Hospital Rules");

    }

    void displayHospital() {
        System.out.println("Hospital Name " + hospitalName);
        System.out.println("City : " + city);
        System.out.println("--------------------------------");
    }
}

//Child Class
class Doctor2 extends Hospital2 {
    int doctorId = 101;
    String doctorName = "Rahul";
    String specialization = "Cardiologist";

    void displayDoctor() {
        System.out.println("Doctor ID : " + doctorId);
        System.out.println("Doctor Name : " + doctorName);
        System.out.println("Specialization : " + specialization);
    }

    void dutyTiming() {
        System.out.println("Duty Timing : 10 AM to 6 PM");
        System.out.println("--------------------------------");
    }
}

public class Oops_Concept1 {
    public static void main(String args[]) {
        Doctor2 d1 = new Doctor2();
        // Parent class method
        d1.hospitalRules();

        // Parent class method
        d1.displayHospital();

        // Child class method
        d1.displayDoctor();

        // Child class method
        d1.dutyTiming();

    }
}

/*
 *
 * class Demo {

    static int a = 10;

    Demo() {

        a++;
    }

    public static void main(String[] args) {

        Demo d1 = new Demo();

        Demo d2 = new Demo();

        System.out.println(a);
    }
}




 *
 */
