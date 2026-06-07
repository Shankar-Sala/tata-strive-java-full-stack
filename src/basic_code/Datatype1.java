package basic_code;

/*
 * Java Datatypes
 * what kind of data you are using
 * how much memory --it will take
 * int a=900;
 *
 *
 * major two types
 * Primitive datatypes--Basic--Primary
 *
 * 8 bits----1 byte
 *
 * byte---1 byte
 * short---2
 * int---4
 * long---8 bytes
 * float----4 bytes
 * boolean---1 bit
 * char--- 2
 * double-----8
 *
 * Non-Primitive datatypes---Secondary--
 * String
 * Array
 * Class
 * Interfaces
 *
 */
/*
public class Datatype1 {
	public static void main(String args[]) {
		byte b = 100;
		short s = 20000;
		int i = 100000;
		long l = 10000000000L;
		float f = 10.7888f;
		double d = 20.788;
		char c = 'Q';
		boolean flag = true;
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(flag);

	}
}

*/
/*
public class Datatype1 {
	public static void main(String args[]) {
		int a=10;
		double b=a;// automatic--implicit way
		System.out.println(b);
	}
}

*/
/*
public class Datatype1 {
	public static void main(String args[]) {
		double d=1067.7865;
		float f=90.8999f;
		int aa=1000;
		int bb=20;
		int cc=aa/bb;
		System.out.println(cc);
		int i=(int)d;//manual way or Explicit Casting (Narrowing)
		System.out.println(i);

	}
}
*/
/*
public class Datatype1 {
	public static void main(String args[]) {
		String name = "Sonam";
		int age = 34;
		double marks = 70.7888;
		char grade = 'C';
		boolean passed = true;
		System.out.println("Name :" + name);
		System.out.println("Age : " + age);
		System.out.println("Marks: " + marks);
		System.out.println("Grade: " + grade);
		System.out.println("Passed: " + passed);

	}
}
*/

/*
Q1. Which of the following is NOT a primitive data type?

A. int
B. float
C. String
D. char



Which data type is used to store decimal values?

A. int
B. boolean
C. double
D. char


What is the size of int in Java?

A. 2 bytes
B. 4 bytes
C. 8 bytes
D. 1 byte


Which data type is used for a single character?

A. String
B. char
C. character
D. byte


Which of the following is a correct declaration?

A. float f = 10.5;
B. float f = 10.5f;
C. float f = "10.5";
D. float f = '10.5';

Which data type is used to store true/false values?

A. int
B. boolean
C. char
D. double
----------------------------------------------
What will be the output?
int a = 10;
double b = a;
System.out.println(b);

A. 10
B. 10.0
C. Error
D. Undefined

Which of the following is NOT a valid char value?

A. 'A'
B. '1'
C. "A"
D. '@'


*/

/*
public class Datatype1 {
	public static void main(String args[]) {
		int a=10;//4 bytes
		double b=a;// automatic--implicit way---8 bytes
		System.out.println(b);
	}
}
*/

public class Datatype1 {
    public static void main(String args[]) {
        double d=1067.7865;//8 bytes

        int i=(int)d;//manual way or Explicit Casting (Narrowing)
        System.out.println(i);

    }
}