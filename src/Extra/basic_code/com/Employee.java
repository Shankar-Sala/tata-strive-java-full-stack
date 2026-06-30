package Extra.basic_code.com;

import basic_code.com.Student;

public class Employee extends Student {
    Employee(){
        System.out.println("Employee Constructor....");
    }
    public void display(){
        super.display();
        System.out.println("Welcome to TATA Company");
    }
}
