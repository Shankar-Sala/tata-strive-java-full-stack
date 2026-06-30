package java8Features;

/*
* java8feature functional programming
*
*
* Functional Interface
* StreamAPI
* Default Method
* Data & Time API
* Annotation
* Lambda Expression
* Method Reference
*
* Functional Interface
* Functional Interfaces are introduced in Java 8.
* They work closely with Lambda Expressions.
* A Functional Interface must contain only one abstract method.
*
* interface Demo
* {
* void show();
* }
*
* It Can Contain multiple default methods.
* interface demo{
* void show();
* default void display()
* {
* }
* }
*
*
* ----------------------------
* It can contain multiple static methods.
* interface Demo
* {
* void show();
* default void display()
* {
* }
*
* static void test()
* {
* }
* }
* ==========================================
*
* @functionalInterface annotation
* ----------------------------------------
*
* If a second abstract method is added, it is no longer a functional Interface.
* --wrong
*
* interface Demo
* {
* void show();
* void display();
* }
*
* popular buil-in functional Interfaces:
*
* Runnable
* Callable
* Predicate
* Consumer
* Supplier
* Function
* Comparator
*
*
* */

public class Function1 {

    // Functional Interface
    interface Functional1_name {

        void Welcome();

        default void centerName() {
            System.out.println("Tata Strive Mumbai");
        }

        static void batchInfo() {
            System.out.println("Batch : Full Stack Java");
        }
    }

    // Implementing interface
    public void Welcome() {
        System.out.println("Welcome all learners...");
    }

    public static void main(String[] args) {

        Function1 f1 = new Function1();

        f1.Welcome();            // abstract method
//        f1.centerName();         // default method
        Functional1_name.batchInfo(); // static method
    }
}