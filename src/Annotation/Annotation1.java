package Annotation;
/*
 An Annotation is metadata
 information about the program
 provides additional information to the compiler, JVM, or framework.
 Annotations do not directly change the program logic but provide instructions.
 Used by frameworks (spring, Hibernate)

 Types of Annotation
 Marker -----@override
 Single value Annotation -------- @SuperWarnings("unchecked")
 Full Annotation ---------------- Custom Annotation

 */

/*
class Parent{
void display() {
   System.out.println("Parent");
   }
   }

   class Child extends Parent{
   @Override
   void display(){
     System.out.println("Parent");
     }
   }

   public class Annotation1{
      public static void main(String[] args) {
          Child c = new Child();
          c.display();
          }
       }
 */

class Demo33{
    @Deprecated
    void oldMethod(){
        System.out.println("oldMethod");
    }

    void newMethod(){
        System.out.println("newMethod");
    }
}


public class Annotation1 {
    static void main(String[] args) {
        Demo33 d = new Demo33();
        d.oldMethod();
    }
}
