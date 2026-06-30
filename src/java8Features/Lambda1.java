package java8Features;
/*
* Lambda Expression
* -- to reduce the code
* -- implements functional interface easily
*--- Lambda expressions were introduced in Java 8.
* --- it works only with a functional interface.
* interface Demo
* {
*  void show();
* }
* ---A functional interface contains only one abstract method.
* ()-> {
* }
*
* -- No return type is required.
* (int a, int b )-> a+b;
----------------
Parameter data types are optional.
* (a,b) -> a+b;
*
* -------If there is only one statement, braces are optionl.
* ()-> System.out.println("Hello");
*
*
* --
* (x) -> x*x;
*
*
* --lambda reduces boilerplate code.
*
* --lambda creates anonymous implementations.
*
*
* --lambda supports Method References.
* list.forEach(System.out::println);
*
*
* --lambda is heavily used with stream API.
* --Lambda can return values.
* (a,b) -> a+b;
*
* ---Lambda cannot be used with normal classes.
*
*
*
*
*
*
*
* *
* Syntax:
* ()-> System.out.println("Hello");
*
* (parameters)-> {
* System.out.println("Hello");
* System.out.println("Hello");
* System.out.println("Hello");
*
* }
*
*
* -------------------------------------
* before Java 8
*
* interface Demo
* {
*  void show();
* }
* class Test implements Demo{
*   public void show(){
* System.out.println("Hello");
*   }
* }
*
* public class Main{
* public static void main(String[] args){
* Demo d = new Test();
* d.show();
* }
* }
* */
//----------------------------------------------
//with Lambda Expression
//Functional interface

/*interface Demo{
    void show();
}

public class Lambda1 {
    public static void main(String args[]) {
   Demo d = ()-> System.out.println("hello");
   d.show();
    }
}*/

//-----------------------------------------

/*
interface  Notification
{
    void send(String name);
}

public class Lambda1{
    public static  void main(String[] args)
    {
        Notification n1 =(name)->{
            System.out.println("Hello "+name+ " Join the session regularly");
        };
        n1.send("Rahul");
    }
}*/

//---------------------------------

interface  Notification
{
    void send();
}

public class Lambda1{
    public static  void main(String[] args)
    {
        Notification n1 =()->{
            System.out.println("Hello all, Join the session regularly");
        };
        n1.send();
    }
}
