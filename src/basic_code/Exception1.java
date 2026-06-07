package basic_code;

/*
* Exception Handling in Java
* Try-catch Mechanism
* Keyword--try--catch--finally--throw---throws
* what is Exception?
* An exception is an unexpected event that occurs
* during program execution and stops the normal flow of the program.
* --- some abnormal condition-- where your program stop execution.
*
* why Exception Handling?
* without Exception handling -------Program terminates Abnormally
* with exception handling --------Program Continues Execution
*
* Rules:
* Exception is a runtime error
* Exception handling--try--catch
* Risky code goes inside try block
* Error handling code goes inside catch block
* try block cannot exist alone
* One try Can have multiple catch blocks
* catch block cannot exist without try
*
*
* */
public class Exception1 {
    static void main(String[] args) {
        System.out.println("-------------------------");
        System.out.println("-------------------------");
        System.out.println("-------------------------");
        try{
            int a = 900000;
            int b = 0;
            int c = a / b;
            System.out.println("Value of c : "+c);
        }catch (ArithmeticException ee){
            System.out.println("Cannot Divide By Zero");
        }

        System.out.println("---------------------------");
        System.out.println("-------------------------");
        System.out.println("-------------------------");

    }
}
