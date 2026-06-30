package java8Features;
/*
* Method Reference
* -- Method Reference was introduced in java 8
* --- short form of lambda Expressin
* --A method Reference is a short form of a lambda Expression.
* ---it uses the operator
* ::
*
* --Method reference works with fuctional Interfaces.
* --It is commonly used with Stream API.
* ---It reduces unnecessary Lambda Code.
* ----Method Reference Supports both static and instance methods.
*
*
* --static method ---- classname:: methodname
* -- instance method ---------object :: methodname
* ----constructor reference -----classname:: new
*
* Lambda Expression --------x -> System.out.println(x)
* Method Reference -----------------------System.out::println
* :: ------is called method reference operator.
*
*
* before Method Reference
* l1.forEach(x-> System.out.println(x));
* ------------------------------------------------------
*
* After Method Reference
* l1.forEach(System.out::println);
*
*
* */

interface Demo{
    void show();
}

class Test{
    public static  void display(){
        System.out.println("welcome Learners");
    }
}

public class MethodReference1 {
    static void main() {
        Demo d = Test::display;
        d.show();
    }

}
