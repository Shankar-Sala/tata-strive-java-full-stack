package basic_code;

/*
 * Topics:
 *
Variables
Data Types
Object & Class
Static Keyword
Final Variable
Static Block
Methods
if-else
switch case
for loop
JDK/JRE/JVM
OOP Basics


class Demo {
	static int a = 10;

	public static void main(String args[]) {
		System.out.println(a);

	}
}


----- Error----0----10-----null

10
is static variable and accessed directly inside static method.

//---------------------------------------------------------------------------------



//Identify instance variable.
class student {

	int marks;

	public static void main(String args[]) {
		int a=90;

	}
}
---marks

//----------------------------------------------------------------------------------------


What is the output?
class Test {
	final int a = 1000;

	public static void main(String[] args) {

		{
			Test tt1 = new Test();
			System.out.println(tt1.a);

		}
	}
------1000
//------------------------------------------------------------------------------------------

What is the output?
class Demo {

    static {

        System.out.println("Static Block");
    }

    public static void main(String[] args) {

        System.out.println("Main Method");
    }
}

//--------------------------------------------------------------------------------------------
///
///What will be the output?
class Demo {

    void show() {

        System.out.println("Java");
    }

    public static void main(String[] args) {

        Demo d1 = new Demo();

        d1.show();
    }
}

//-----------------------------------------------------------------------------------------------------
///
///What is the output?
class Demo {

    static int a = 50;

    public static void main(String[] args) {

        Demo d1 = new Demo();
        Demo d2 = new Demo();

        d1.a = 100;

        System.out.println(d2.a);
    }
}
-------------100

//-----------------------------------------------------------------------------------------------------------
///
class Demo {

    static int a = 10;

    void change() {

        a = a + 20;
    }

    public static void main(String[] args) {

        Demo d1 = new Demo();
        Demo d2 = new Demo();

        d1.change();

        System.out.println(d2.a);
    }
}
//is static variable → shared among all objects.
///-------30

------------------------------------------------------------------------------------------------

class Test {

    final int a = 100;

    void display() {

        System.out.println(a);
    }

    public static void main(String[] args) {

        Test t1 = new Test();

        t1.display();
    }
}
Final variable value cannot change.
-----100
-----------------------------------------------------------------------------------------------
class Demo {

    static int a = 10;

    Demo() {

        a++;
    }

    public static void main(String[] args) {

        Demo d1 = new Demo();
        Demo d2 = new Demo();
        Demo d3 = new Demo();

        System.out.println(a);
    }
}

--------------13
//a++---------post increment----print---increment


------------------------------------------------------------------------------------------


class Test {

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
//Final variable can be initialized inside constructor.
///
///----100



 *
 *
 */

public class McqRound1 {

    static  int a = 50;

    public static void main(String[] args) {

        McqRound1 d1 = new McqRound1();
        McqRound1 d2 = new McqRound1();

        d1.a = 100;

        System.out.println(d1.a);


        System.out.println(d2.a);
    }
}
