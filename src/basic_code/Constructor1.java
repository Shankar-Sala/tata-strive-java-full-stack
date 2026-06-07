package basic_code;

/*
 * Constructor3 in java---
 * it is special method
 * same name as class name
 * no return type
 * it calls automatically ---when object is intialised...
 * 2 types
 *
 * ----default
 * ----parameterised
 *
 *
 *
 *
 * syntax:---
 * Constructor1()
 * {
 *
 *
 * }
 *
 * void show()
 * {
 *
 *
 *
 * }
 *
 *
 *
 */

/*
public class Constructor1 {

	Constructor1() {
        System.out.println("I am a default constructor");
	}

	void show()

	{
        System.out.println("I am a normal method");
	}
	public static void main(String args[]) {
		Constructor1 c1 = new Constructor1();
		c1.show();

	}
}


*/

/*
class Student2 {
	// instance variables
	// actual parameter
	int studentId;
	String studentName;
	int marks;


	Student2()
	{
        System.out.println("Student Management System\n");
		System.out.println("--------------------------\n");


	}

	// parameterised Constructor3
	Student2(int sId, String sName, int sMarks) // formal parameter....
	{
		studentId = sId;
		studentName = sName;
		marks = sMarks;
	}

	void displayStudent() {
		System.out.println("Student ID : " + studentId);
		System.out.println("Student Name : " + studentName);
		System.out.println("Marks : " + marks);
	}

	// method---result check
	void checkResult() {
		if (marks >= 40) {
			System.out.println("Result : Pass");

		} else {

			System.out.println("Result : Fail");
		}
		System.out.println("--------------------------");

	}
}

public class Constructor1 {
	public static void main(String args[]) {
		//calls default cons....
		Student2 s111=new Student2();

		//calls parameterised Constructor3
		Student2 s1=new Student2(11,"Rohan",88);
		s1.displayStudent();
		s1.checkResult();

		Student2 s2=new Student2(22,"Rohan",88);
		s2.displayStudent();
		s2.checkResult();


		Student2 s3=new Student2(33,"Rohan",88);
		s3.displayStudent();
		s3.checkResult();

		Student2 s4=new Student2(44,"Rohan",88);
		s4.displayStudent();
		s4.checkResult();


		Student2 s5=new Student2(55,"Rohan",88);
		s5.displayStudent();
		s5.checkResult();


	}
}



*/
/*
class Student {

    int studentId;
    String studentName;
    int marks;

    // Constructor3
    Student(int id, String name, int m) {

        studentId = id;
        studentName = name;
        marks = m;
    }

    // Method
    void display() {

        System.out.println("Student ID : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Marks : " + marks);
    }
}

/////////////////////////////////////////////////////

public class Constructor1 {

    public static void main(String[] args) {

        Student s1 = new Student(101, "Sonam", 90);

        s1.display();
    }
}


*/
/*
Indian Railways wants to develop a simple Railway Management System using Java.------ok

The system should:

store passenger details----ok
manage coach selection------ok
display railway information------ok
calculate ticket prices----------ok
display train stations--------ok
categorize passengers based on age-----ok

The system should be beginner-friendly and use core Java concepts.


*/

class Railway {
    // Static variable
    static String railwayName = "Indian Railways";
    // Final variable
    final String country = "India";
    // Static block
    static {
        System.out.println("\nRailway System Started\n");
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");
        System.out.println("--------------------------------\n\n");


    }

    // Static method
    static void railwayRules() {
        System.out.println("Follow Railway Safety Rules");

    }

    // Method
    void displayRailway() {

        System.out.println("Railway Name : " + railwayName);
        System.out.println("Country : " + country);

        System.out.println("--------------------------------");
    }
}

class Passenger {
    int passengerId;// actual parameter....
    String passengerName;
    int age;

    // Constructor3
    Passenger(int id, String name, int a)// formal parameter...
    {

        passengerId = id;
        passengerName = name;
        age = a;
    }

    // Method---non-static method
    void displayPassenger() {

        System.out.println("Passenger ID : " + passengerId);
        System.out.println("Passenger Name : " + passengerName);
        System.out.println("Age : " + age);
    }

    void checkCategory() {
        if (age < 18) {
            System.out.println("Child Passenger");

        } else if (age >= 18 && age <= 59) {
            System.out.println("Adult Passenger");

        } else {
            System.out.println("Senior Citizen");

        }
        System.out.println("--------------------------------");

    }

}

class Ticket {
    int coachChoice;

    void selectCoach() {
        switch (coachChoice) {
            case 1:
                System.out.println("Sleeper Coach Selected");
                break;

            case 2:
                System.out.println("AC Coach Selected");
                break;

            case 3:
                System.out.println("First Class Selected");
                break;

            default:
                System.out.println("Invalid Coach");
        }
    }

    void ticketPrice() {

        if (coachChoice == 1) {
            System.out.println("Ticket Price : 500");

        } else if (coachChoice == 2) {
            System.out.println("Ticket Price : 1200");

        } else {
            System.out.println("Ticket Price : 2500");

        }
        System.out.println("--------------------------------");

    }
}

class Train {
    void displayStations() {
        String stations[] = { "Mumbai", "Pune", "Nagpur", "Delhi", "Bangalore" };
        System.out.println("Train Stops:");

        for (int i = 0; i < stations.length; i++) {
            System.out.println(stations[i]);

        }
        System.out.println("--------------------------------");

    }

    void trainMessage() {
        System.out.println("Train Running On Time");

    }
}


class Constructor1
{
    public static void main(String[] args) {
        Railway.railwayRules();
        Railway r1=new Railway();
        r1.displayRailway();

        Passenger p1 =new Passenger(11,"Hitesh",45);
        p1.displayPassenger();
        p1.checkCategory();

        Ticket tt1=new Ticket();
        tt1.coachChoice=2;
        tt1.selectCoach();
        tt1.ticketPrice();

        Train ttt1=new Train ();
        ttt1.displayStations();
        ttt1.trainMessage();





    }
}


/*
 *
 *
 *
 * class Student {

    Student() {

        System.out.println("Default Constructor3");
    }

    Student(int a) {

        System.out.println(a);
    }

    public static void main(String[] args) {

        Student s1 = new Student();

        Student s2 = new Student(100);
    }
}
---Default Constructor3
   100


 */



/*
 * class Demo {

    Demo() {

        System.out.println("A");
    }

    Demo(int a) {

        System.out.println("B");
    }

    public static void main(String[] args) {

        Demo d1 = new Demo(10);
    }
}

--------------   B
 */


/*
 *
 *
 * class Test {

    final int a;

    Test() {

        a = 100;
    }

    void display() {

        System.out.println(a);
    }

    public static void main(String[] args) {

        Test t1 = new Test();

        t1.display();
    }
}
 */
