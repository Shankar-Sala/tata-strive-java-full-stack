package Instance_Of_Operator;
//instance operator...

//instanceof always returns a boolean value:
/* true or flase
it is work with inheritance
checks Actual Object Type
check the object not the reference variable
No inheritance ---- compile time error
----inheritances
  upcasting
  Downcasting
  Polymorphism


  class Student21{

  }

  public class Code1 extends Student21{
   public static void main(String args[]){
   Code1 O1 = new Code1();
   Student21 ss1 = new Student21();

   System.out.println(ss1 instanceof Code1);
   System.out.println(O1 instanceof Student21);
   }
  }
*
* */

class Emp1{
    void work(){
        System.out.println("Employee Working");
    }
}

class Manager2 extends Emp1{
    void work(){
        System.out.println("Manager Managing Team");
    }
    void approveLeave(){
        System.out.println("Leave Approved");
    }
}

public class Code1 {
    static void main(String[] args) {
        //Parent reference + object child class..
        // reference ----> Emp1
        // Object ------- Manager
        Emp1 ee1 = new Manager2();
        ee1.work();
        System.out.println(ee1 instanceof Emp1);
        System.out.println(ee1 instanceof  Manager2);

        if(ee1 instanceof  Manager2){
            //Downcasting
            //now Manager -- specific methods can be called.
            Manager2 m1 = (Manager2) ee1;
            m1.approveLeave();
        }
    }
}
