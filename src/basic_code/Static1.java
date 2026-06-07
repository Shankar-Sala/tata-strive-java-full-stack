package basic_code;
/*
 * static--it is a keyword.
 * variable
 * method
 * blocks
 * nested classes
 *
 * static --it is belong to class ---not object
 *
 *
 * why--??
 * ---memory management...
 * ---it takes memory only one time
 * ---shared among all objects
 *
 *
 * how to declare
 *
 *   static String institudeName="Tata";
 *    *
 *
 */

/*
class Student {
	static String instituteName = "Tata";
	String studentName;

	void display() {
		System.out.println(studentName);
		System.out.println(instituteName);
	}
}

public class Static1 {
	public static void main(String args[]) {
		Student s1 = new Student();
		Student s2 = new Student();
		s1.studentName="Rajesh";
		s2.studentName="Rajendra";
		s1.display();
		s2.display();

	}
}


*/
/*
class Demo
{
	//static method
	static void showMessage()
	{
        System.out.println("Welcome to Java.............!");

	}
	//normal method
	void show()
	{
        System.out.println("I am normal method...!");

	}
}

class Static1
{
	public static void main(String args[])
	{
		Demo.showMessage();
		Demo d1=new Demo();
		d1.show();
	}
}
*/

//JVM--java virtual machines --calls the main()
//no object require...

//------------------------------------------------------------
//static block runs automatically
//before main method---static block runs
//it run only one time....
/*
class Static1
{
	//static block
	static
	{
        System.out.println("I am a static block.....");

	}

	public static void main(String args[])
	{
        System.out.println("I am a main method.....");

	}
}

*/

class Student {
    static String instituteName = "Tata";
    String studentName;
    static
    {
        System.out.println("Student Mangement System started....");

    }

    Student() {

        System.out.println("I am a default Constructor3...!");
    }

    void display() {
        System.out.println(studentName);
        System.out.println(instituteName);
        System.out.println("*************************");

    }
}

public class Static1 {
    public static void main(String args[]) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();
        Student s6 = new Student();
        s1.studentName = "Rajesh";
        s2.studentName = "Rajendra";
        s3.studentName = "Nisha";
        s4.studentName = "Snehal";
        s5.studentName = "Shabina";
        s6.studentName = "Roy";
        s1.display();
        s2.display();
        s3.display();
        s4.display();
        s5.display();
        s6.display();

    }
}
