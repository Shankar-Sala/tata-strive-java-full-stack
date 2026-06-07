package basic_code;

//Types of variable

//3 types
//local ---inside a method
//instance--inside the class but outside the method
//static--inside the class but outside the method & attached with static keyword

//object --instance of a class
//How we can declare the object in java
/*
 * class A{
 *
 *
 * }
 *
 * className  objectName=new className();
 *
 */
/*
public class Datatype2 {
	//data member or instance variable
	String name;
	int age;

	public static void main(String args[]) {
		//object creation
		Datatype2 dd=new Datatype2();
		dd.name="Sonam";
		dd.age=12;
		int rollNo=121;//local Variable
		System.out.println(rollNo);
		System.out.println(dd.name);
		System.out.println(dd.age);

	}
}
*/
//---------------------------------------------------------------------

public class Datatype2 {
    ////instance--inside the class but outside the method
    String brand;
    void display()
    {
        System.out.println("Car brand is :"+brand);
    }


    public static void main(String args[]) {
        // object creation
        Datatype2 dd = new Datatype2();
        dd.brand = "BMW";
        dd.display();

    }
}
