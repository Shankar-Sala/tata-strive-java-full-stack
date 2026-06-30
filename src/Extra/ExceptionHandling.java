package Extra;

/*
Exception Handling in java
Try-catch Mechanism
Keyword--try-catch-finally-throw-throws
What is Exception?
An exception is an unexpected event that occurs
- during program execution and stops the normal flow of the program.
---some abnormal condition-whrer, your program stop execution
Why Exception Handling?
without Exception handling-Program Terminates Abnormally
With exception handling:Program Continues Execution
- Rules:
Exception is a runtime error
Exception handling---try-catch
Risky code goes inside try block
Error handling code goes inside catch block
 try block cannot exist alone
 One try can have multiple
 catch blocks catch block cannot exist without try
 */
/*
public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        try {
            int a = 90000;
            int b = 0;
            int c = a / b;
            System.out.println("Value of c : " + c);
        } catch (ArithmeticException ee) {
            System.out.println("Cannot Divide By Zero");
        }

        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
    }

}
*/
/*
public class ExceptionHandling {
    public static void main(String[] args) {
        // length--2---0---1
        try {
            int arr[] = new int[2];
            arr[5] = 10;
            int a = 10 / 0;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Error");
        }
        catch (ArithmeticException e) {
            System.out.println("Math Error");
        }
    }
}
 */
/*
public class ExceptionHandling {
    public static void main(String[] args) {
        // length--2---0---1
        try {
            int arr[] = new int[2];
            arr[5] = 10;
            int a = 10 / 0;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Error");
        }
        catch (ArithmeticException e) {
            System.out.println("Math Error");
        }
        System.out.println("-------------------------");
        System.out.println("-------------------------");
        System.out.println("-------------------------");
    }
}
*/
/*
public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            try {
                int a = 10 / 0;
            }
            catch (ArithmeticException e) {
                System.out.println("Inner Catch : Math Error");
            }
            System.out.println("Outer Try End");
            System.out.println("Outer Try End");
        }
        catch (Exception e) {
            System.out.println("Outer Catch");
        }
        System.out.println("Program Continued");
        System.out.println("Program Continued");
    }
}
*/
/*
public class ExceptionHandling {
    public static void main(String[] args) {

        //length---3
        //index----0-----1----2
        //element--10----20---30
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        int arr[] = { 10, 20, 30 };
        System.out.println("--------------------------------------");

        try {

            System.out.println(arr[5]);

        } catch (NullPointerException e) {

            System.out.println("Invalid Array Index");
        }
        finally
        {
            System.out.println("-------------finally block------------------");
            System.out.println("--------------------------------------");
            System.out.println("--------------------------------------");
            System.out.println("--------------------------------------");
            System.out.println("Program Running Successfully");
        }
    }
}
*/
/*
public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("*****************************");
        System.out.println("*****************************");

        try {
            int a = 10 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("Inner Catch : Math Error");
        }
        finally {
            System.out.println("******Password*******");
            System.out.println("********END**********");
        }
    }
}
*/
public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("Program Started...");
        try {
            System.out.println("Outer Try Started");

            try {
                System.out.println("Inner try started...");
                int arr[] = new int[2];
                arr[6] = 6999;
                System.out.println("This line will not be executed..");

            } catch (ArrayIndexOutOfBoundsException ee2) {
                System.out.println("Inner Catch");
                System.out.println("Array Error : " + ee2.getMessage());
            } finally {
                System.out.println("Inner Finally");
            }

            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println(result);

        } catch (ArithmeticException e1) {
            System.out.println("Parent Exception");

        } finally {
            System.out.println("Outer Finally");
        }
        System.out.println("Program Continued");
        System.out.println("--------------------");
        try {
            String name = null;
            System.out.println(name.length());
        } catch (NullPointerException e) {
            System.out.println("Null Error");
        } finally {
            System.out.println("Second Finally");
        }
        System.out.println("Program END.....!!!");
        System.out.println("--------------------");

    }
}
