package basic_code;
/*
 * final --it is a keyword
 * variable---cannot change the value
 * method ----can not override
 * class ---can not extends class
 */

/*
 class A11
{
	A11()
	{
		System.out.println("I am a Parent class....!");
	}
}
public class Final1 extends A11 {
	final String name;

	Final1()
	{
		name="Sonam";
		System.out.println("I am a default constructor...& my name is : "+name);

	}
	public static void main(String args[]) {
		Final1 f11=new Final1();
		final int age = 67;
		System.out.println(age);

	}
}
*/
//parent class
class Company5 {
    static int employeeCount = 100;
    final String companyName = "Tata STRIVE";
    static {
        System.out.println("Static Block Executed");
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");

    }

    Company5() {
        employeeCount++;
        System.out.println("Parent Constructor3");

    }

    void displayCompany() {

        System.out.println("Company : " + companyName);
        System.out.println("Employee Count : " + employeeCount);
        System.out.println("--------------------------------");

    }
}

//Child class
class Employee5 extends Company5 {
    int salary = 5000;

    Employee5() {
        salary++;
        System.out.println("Child Constructor3");

    }

    void calculateSalary() {
        int a = 10;
        int b = ++a + a++ + --a + a--;
        System.out.println("Salary Variable : " + salary);
        System.out.println("Value of b : " + b);
        System.out.println("Final value of a : " + a);
        System.out.println("--------------------------------");

    }
}

public class Final1 {
    public static void main(String args[]) {
        Employee5 e1 = new Employee5();
        e1.displayCompany();
        e1.calculateSalary();
        System.out.println("--------------------------------");
        Employee5 e2 = new Employee5();
        e2.displayCompany();

    }
}