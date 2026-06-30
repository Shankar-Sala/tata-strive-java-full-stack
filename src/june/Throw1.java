package june;
/*
* throw is used to create an exception  manually.
* throw new ArithmeticException();
*
* --Only one exception object can be thrown at a time
* -- throw new ArithmeticException(), new NullPointerException -- wrong
* throw -- used inside the try block.....
*
* try{
*
* throw new ArithmeticException();
* }
*
* catch(Exception e)
* {
*
* }
*
* -------------------------------------------
* after throw, remaining statements are skipped.
*
* try
* {
* throw new ArithmeticException();
* System.out.println("Java");
* System.out.println("Java");
*
* }
*
* Exception object can contain custom  message
*
* try
* {
*         throw new ArthmeticException("Be Negative .....!");
*
*
* }
*
* ----------------------------------------------
* throw works with predefined exceptions.
* throw new NullPointerException();
* throw new ArithmeticException();
* throw new ArrayIndexOutOfBoundsException();
* --------------------------------------------------
*
* throw can be used with if condition.
* if(age<18)
* {
* throw new ArithmeticException{
* if(age<18)
* {
* throw new ArithmeticException("not Eligible");
* }*
* ---------------------------
* throw transfer control to catch block immdiately.
*
*  */
public class Throw1 {
    static void main() {
        int age = 15;
        try{
            if(age<18){
                throw  new ArithmeticException("Not Eligible for voting");
            }
            System.out.println("Eligible");
        }catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
