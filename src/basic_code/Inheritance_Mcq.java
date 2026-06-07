package basic_code;


// * //STATIC VARIABLES INHERITED BY CHILD CLASS

class Company3 {

    String companyName = "TCS";
}

class Employee3 extends Company3 {

    void display() {

        System.out.println(companyName);
    }
}

public class Inheritance_Mcq {

    public static void main(String[] args) {

        Employee3 e1 = new Employee3();

        e1.display();
    }
}

/*
 *
 *
 * class Parent {
 *
 * void show() {
 *
 * System.out.println("Parent Class"); } }
 *
 * class Child extends Parent {
 *
 * }
 *
 * public class Main {
 *
 * public static void main(String[] args) {
 *
 * Child c1 = new Child();
 *
 * c1.show(); } }
 *
 * ---Parent Class ----------------------------------------------------
 *
 *
 * class A {
 *
 * int a = 10; }
 *
 * class B extends A {
 *
 * int a = 20;
 *
 * void display() {
 *
 * System.out.println(a); } }
 *
 * public class Main {
 *
 * public static void main(String[] args) {
 *
 * B b1 = new B();
 *
 * b1.display(); } } --------20 CHILD CLASS VARIABLE HIDE THE PARENT CLASS
 * VARIABLE
 *
 *
 *
 *
 * class Company {
 *
 * static String companyName = "TCS"; }
 *
 * class Employee extends Company {
 *
 * void display() {
 *
 * System.out.println(companyName); } }
 *
 * public class Main {
 *
 * public static void main(String[] args) {
 *
 * Employee e1 = new Employee();
 *
 * e1.display(); } }
 *
 * //STATIC VARIABLES INHERITED BY CHILD CLASS
 *
 *---------------------------------------------------------------------------------------
 *
 * class Parent {

    Parent() {

        System.out.println("Parent Constructor3");
    }
}

class Child extends Parent {

    Child() {

        System.out.println("Child Constructor3");
    }
}

public class Main {

    public static void main(String[] args) {

        Child c1 = new Child();
    }
}

----Parent Constructor3
----Child Constructor3
//PARENT CLASS CONSTRUCTOR EXECUTES FIRST...
///
class Parent {

    void display() {

        System.out.println("Java");
    }
}

class Child extends Parent {

    void show() {

        System.out.println("Python");
    }
}

public class Main {

    public static void main(String[] args) {

//REFERENCE OF PARENT CLASS & OBJECT OF CHILD CLASS-------------UPCASTING...............
/////CHILD CLASS OBJECT
        Parent p1 = new Child();

        p1.display();
    }
}

//Reference type is Parent → only parent methods accessible.
 */
