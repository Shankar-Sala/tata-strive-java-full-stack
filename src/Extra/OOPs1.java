package Extra;/*
OOPs --- object-oriented programming
1. object
2. class
3. inheritance
4. encapsulation
5. polymorphism
6. abstraction
 */
/*
Inheritance -- one class derive feature of its existing class
use parent-child relationship
extends - it is a keyword --- used to inherit class

Types :-
1. Single Level :
    A
    |
    B
2. Multilevel :
    A
    |
    B
    |
    C
3. Hierarchical / Tree :
     A
   /   \
   B    C
4. Hybrid: -- use interface
     A
   /   \
  B     C
  \     /
     D
5. Multiple: -- use interface
  B     C
  \     /
     D
 */
/*
//parent class
class Company1{
    void companyDetail(){
        System.out.println("Tata Strive");
    }
}

//child class
class Employee1 extends Company1{
    void employeeDetail(){
        System.out.println("Java Developer");
    }
}
public class OOPs1 {
    public static void main(String args[]){
    Employee1 e1 = new Employee1();
    e1.companyDetail();
    e1.employeeDetail();
    }
}
*/
/*
class Company1{
    String companyName = "Tata Strive";
    void companyDetail(){
        System.out.println("Follow Company Rule...");
    }
}

//child class
class Employee1 extends Company1{
    int employeeId = 05;
    String employeeName = "Shabina";
    void employeeDetail(){
        System.out.println("Employee ID: "+employeeId);
        System.out.println("Employee Name: "+employeeName);
    }
}
public class OOPs1 {
    public static void main(String args[]){
        Employee1 e1 = new Employee1();
        e1.companyDetail();
        System.out.println("Company Name: "+e1.companyName);
        e1.employeeDetail();
    }
}
*/

class Hospital2{
    String hospitalName="Tata Strive";
    String city ="Mumbai";
    void hospitalRule(){
        System.out.println("Follow Hospital Rule...");
    }
    void displayHospital(){
        System.out.println("Hospital Name: "+hospitalName);
        System.out.println("City : "+city);
        System.out.println("--------------------------");
    }
}
class Doctor2 extends Hospital2{
    int doctorId=101;
    String doctorName="Dr Harshad";
    String specalization="Gasterology";
    void display(){
        System.out.println("Doctor ID: "+doctorId);
        System.out.println("Doctor Name: "+doctorName);
        System.out.println("Specialization : "+specalization);
    }
    void displayTiming(){
        System.out.println("Duty Timing: 10 AM to 6 PM");
        System.out.println("--------------------------");
    }
}
public class OOPs1 {
    public static void main(String args[]){
        Doctor2 d2 = new Doctor2();
        d2.hospitalRule();
        d2.displayHospital();
        d2.display();
        d2.displayTiming();
    }
}
// Reference of Parent Class and Object of Child Class --- called as "Upcasting"
// Parent p1 = new Child();